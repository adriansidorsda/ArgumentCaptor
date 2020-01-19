import java.util.List;

public class CaptorService {

    private BookService bookService;
    private ListService listService;
    private NumberService numberService;
    private StringService stringService;

    public CaptorService(BookService bookService, ListService listService, NumberService numberService, StringService stringService) {
        this.bookService = bookService;
        this.listService = listService;
        this.numberService = numberService;
        this.stringService = stringService;
    }

    public void captorTest(Book book, int number, String text, List<Integer> list) {
        bookService.doSomethingWithBook(book);
        listService.doSomethingWithList(list);
        numberService.doSomethingWithNumber(number);
        stringService.doSomethingWithText(text);
    }
}
