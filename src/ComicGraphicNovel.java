
public class ComicGraphicNovel extends Comic{

  private String format;
  private int pages;

  public ComicGraphicNovel(int price, String isbn, String publisher, String title, String date, String format, int pages) {
    super(price, isbn, publisher, title, date);
    this.format = format;
    this.pages = pages;
  }

  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }

  public int getPages() {
    return pages;
  }
  public void setPages(int pages) {
    this.pages = pages;
  }

  @Override
  public String toString() {
    return " - Graphic Novel - " +
            "\nFormat: " + format +
            "\nPages: " + pages +
            super.toString();
  }
}
