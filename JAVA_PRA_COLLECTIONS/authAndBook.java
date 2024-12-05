import java.util.*;

public class authAndBook {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        ArrayList<Author> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int authorId = s.nextInt();
            s.nextLine();
            String authorName = s.nextLine();
            String nationality = s.nextLine();
            int bookCount = s.nextInt();

            ArrayList<Book> bl = new ArrayList<>();

            for (int j = 0; j < bookCount; j++) {
                int bookId = s.nextInt();
                s.nextLine();
                String bookTitle = s.nextLine();
                int publishedYear = s.nextInt();
                bl.add(new Book(bookId, bookTitle, publishedYear));
            }
            al.add(new Author(authorId, authorName, nationality, bl));
        }
        int givenAuthId = s.nextInt();
        s.nextLine();
        String givenNationality = s.nextLine();
        TreeSet<Integer> uniquePublishedYear = getUniquePublishedYear(al, givenAuthId);
        if (uniquePublishedYear.isEmpty()) {
            System.out.println("Author Not Found");
        } else {
            for (int i : uniquePublishedYear) {
                System.out.println(i);
            }
        }

        ArrayList<String> ans2 = findAuthorBookName(al, givenNationality);
        if (ans2.isEmpty()) {
            System.out.println("Books Not Found");
        } else {
            for (String i : ans2) {
                System.out.println(i);
            }
        }
    }

    public static TreeSet<Integer> getUniquePublishedYear(ArrayList<Author> al, int givenAuthId) {

        TreeSet<Integer> ts = new TreeSet<>();

        for (Author i : al) {
            if (i.getAuthorId() == givenAuthId) {
                for (Book j : i.getBookList()) {
                    ts.add(j.getPublishedYear());
                }
                break;
            }
        }

        return ts;
    }

    public static ArrayList<String> findAuthorBookName(ArrayList<Author> al, String givenNationality) {

        ArrayList<String> ans = new ArrayList<>();

        for (Author i : al) {
            if (i.getNationality().equalsIgnoreCase(givenNationality)) {
                for (Book j : i.getBookList()) {
                    ans.add(j.getTitle());
                }
            }
        }
        return ans;
    }

}

class Author {

    private int authorId;
    private String authorName;
    private String nationality;
    private ArrayList<Book> bookList;

    public Author(int authorId, String authorName, String nationality, ArrayList<Book> bookList) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.nationality = nationality;
        this.bookList = bookList;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

}

class Book {
    private int bookId;
    private String title;
    private int publishedYear;

    public Book(int bookId, String title, int publishedYear) {
        this.bookId = bookId;
        this.title = title;
        this.publishedYear = publishedYear;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

}