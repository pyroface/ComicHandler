
public class Comic {

  int price;
  String isbn;
  String publisher;
  String title;
  String date;

  public Comic(int price, String isbn, String publisher, String title, String date) {
    this.price = price;
    this.isbn = isbn;
    this.publisher = publisher;
    this.title = title;
    this.date = date;
  }

  public int getPrice() {
    return price;
  }
  public void setPrice(int price) {
    this.price = price;
  }

  public String getIsbn() {
    return isbn;
  }
  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getPublisher() {
    return publisher;
  }
  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  public static Comic createComic(int price, String isbn, String publisher, String title, String date) {
    return new Comic(price, isbn, publisher, title, date);
  }

  @Override
  public String toString() {
    return
      "\nISBN: " + isbn +
      "\nTitle: " + title +
      "\nPublisher: " + publisher +
      "\nDate: " + date +
      "\nPrice: $" + price +
      "\n---------------------\n";
  }
}
