import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);
  private static Management comicList = new Management();

  public static void main(String[] args) {
    boolean quit = false;
    int choice = 0;

    printInstructions();
    while(!quit){
      System.out.print("\nInput your choice: ");
      choice = scanner.nextInt();
      scanner.nextLine();

      switch(choice){
        case 0:
          quit = true;
          break;
        case 1:
          addNewIssue();
          break;
        case 2:
          addNewGN();
          break;
        case 3:
          Management.showComics();
          break;
        case 4:
          changeDate();
          break;
        case 5:
          changePrice();
          break;
        case 6:
          removeItem();
          break;
        case 7:
          Management.showPrice();
          break;
      }
    }

  }
  // MENU
  public static void printInstructions() {
    System.out.println("\nMenu: ");
    System.out.println("\t 1 - Add an issue.");
    System.out.println("\t 2 - Add a graphic novel.");
    System.out.println("\t 3 - Show Comic books.");
    System.out.println("\t 4 - Change date.");
    System.out.println("\t 5 - Change price.");
    System.out.println("\t 6 - Remove Novel/Issue.");
    System.out.println("\t 7 - Show collection value.");
    System.out.println("\t 0 - Quit.");
  }

  private static void addNewIssue(){
    System.out.print("Input price: ");
    int price = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Input isbn: ");
    String isbn = scanner.nextLine();
    System.out.print("Input publisher: ");
    String publisher = scanner.nextLine();
    System.out.print("Input title: ");
    String title = scanner.nextLine();
    System.out.print("Input datum: ");
    String date = scanner.nextLine();

    System.out.print("Input issue number: ");
    int number = scanner.nextInt();
    scanner.nextLine();

    //TODO make try catch
    //now only true and false input works
    System.out.print("Annual?: ");
    boolean annual = scanner.nextBoolean();

    System.out.println("Done!");

    ComicIssue i = new ComicIssue(price, isbn, publisher, title, date, number, annual);
    comicList.addNewComic(i);
  }

  private static void addNewGN(){
    System.out.print("Input price: ");
    int price = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Input isbn: ");
    String isbn = scanner.nextLine();
    System.out.print("Input publisher: ");
    String publisher = scanner.nextLine();
    System.out.print("Input title: ");
    String title = scanner.nextLine();
    System.out.print("Input datum: ");
    String date = scanner.nextLine();

    System.out.print("Number of pages?: ");
    int pages = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Format: ");
    String format = scanner.nextLine();

    System.out.println("Done!");

    ComicGraphicNovel gn = new ComicGraphicNovel(price, isbn, publisher, title, date, format, pages);
    comicList.addNewComic(gn);
  }

  public static void changePrice() {
    System.out.print("Which ISBN?:");
    String isbn = scanner.nextLine();
    System.out.print("Input the new price: ");
    int price = scanner.nextInt();
    scanner.nextLine();

    Management.changePrice(isbn, price);
  }

  public static void changeDate() {
    System.out.print("Which ISBN?: ");
    String isbn = scanner.nextLine();
    System.out.print("Input the new date: ");
    String date = scanner.nextLine();

    Management.changeDate(isbn, date);
  }

  public static void removeItem(){
    System.out.print("Which ISBN?: ");
    String isbn = scanner.nextLine();

    Management.removeItem(isbn);
  }

}
