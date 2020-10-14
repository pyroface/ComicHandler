
public class ComicIssue extends Comic{

  private int number;
  private boolean annual;


  public ComicIssue(int price, String isbn, String publisher, String title, String date, int number, boolean annual) {
    super(price, isbn, publisher, title, date);
    this.number = number;
    this.annual = annual;
  }

  public int getNumber() {
    return number;
  }
  public void setNumber(int number) {
    this.number = number;
  }

  public boolean isAnnual() {
    return annual;
  }
  public void setAnnual(boolean annual) {
    this.annual = annual;
  }

  @Override
  public String toString() {
    return " - Issue - " + "\nAnnual: " + annual +
            "\nNumber: " + number + " " +
            super.toString();
  }
}
