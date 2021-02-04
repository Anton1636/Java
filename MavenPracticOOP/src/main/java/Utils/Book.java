package Utils;

public class Book {
    public String bookName;
    public String authorFullName;
    public String yearOfIssue;
    public String publisher;
    public String genre;
    public String numberOfPages;

    public Book(String bookName, String authorFullName, String yearOfIssue, String publisher, String genre, String numberOfPages) {
        this.bookName = bookName;
        this.authorFullName = authorFullName;
        this.yearOfIssue = yearOfIssue;
        this.publisher = publisher;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    void displayInfo(){
        System.out.printf("Name: %s " +
                          "\tAuthor Name: %s\n " +
                          "\tYear of issue: %s\n " +
                          "\tPublisher: %s\n " +
                          "\tGenre: %s\n " +
                          "\tNumber of pages: %s\n", bookName, authorFullName,yearOfIssue,publisher,genre,numberOfPages);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorFullName() {
        return authorFullName;
    }

    public void setAuthorFullName(String authorFullName) {
        this.authorFullName = authorFullName;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
