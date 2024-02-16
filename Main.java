public class Main {
    public static void main(String[] args) {
        Author j0nKing = new Author("Jon", "King");
        Book firstBook = new Book("Ocean",2005, j0nKing);
        System.out.println(firstBook.getAuthor()+ " " + firstBook.getName());
        System.out.println(firstBook);
        Book secondBook = new Book("Java", 2015, new Author("Anton","Ivanov"));
        firstBook.setYear(2020);
        System.out.println(firstBook.toString());



    }
}