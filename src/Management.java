import java.util.ArrayList;

public class Management {

  private static ArrayList<Comic> comicList = new ArrayList<Comic>();

  public void addNewComic(Comic comic) {
    comicList.add(comic);
  }

  public static void showIssues(){
    for(Comic c : comicList){
      if(c instanceof ComicIssue){
        System.out.println(c);
      }
    }
  }

  public static void showComics(){
    for(Comic c : comicList){
      if(c instanceof ComicIssue){
        System.out.println(c);
      }
    }
    for (Comic x : comicList){
      if(x instanceof ComicGraphicNovel){
        System.out.println(x);
      }
    }
  }

  public static void removeItem(String isbn){
    for (int i = comicList.size() - 1; i >= 0 ; i--) {
      if(comicList.get(i).getIsbn().equalsIgnoreCase(isbn)){
        comicList.remove(i);
      }
    }
  }

  public static void showPrice(){
    int result = 0;

    for (int i = comicList.size() - 1 ; i >= 0 ; i--) {
      int a = comicList.get(i).getPrice();
      result = result + a;
      System.out.println( comicList.get(i).getTitle() + " $" + a);
    }

    System.out.println("Total value: $" + result);
  }

  public static void changeDate(String isbn, String newDate){
    for(Comic c : comicList){
      if (c.getIsbn().equalsIgnoreCase(isbn)){
        c.setDate(newDate);
      }
    }
  }
  public static void changePrice(String isbn, int newPrice){
    for(Comic c : comicList){
      if (c.getIsbn().equalsIgnoreCase(isbn)){
        c.setPrice(newPrice);
      }
    }
  }


}
