package org.example;

public class Library {

    private String author;
    private String title;
    private String isbn;

    public Library(String author, String title, String isbn) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public void setIsbn(String newIsbn) {
        isbn = newIsbn;
    }

    @Override
    public String toString() {
        return "Library{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
