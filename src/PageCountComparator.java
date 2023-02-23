import java.util.Comparator;

public class PageCountComparator implements Comparator <Book>{
    @Override
    public int compare(Book o1, Book o2) {
        if(o1.getPageCount() == o2.getPageCount()){
            return 0;
        }
        else if(o1.getPageCount() > o2.getPageCount()) {
            return 1;
        }
        else{
            return -1;
        }
    }
}
