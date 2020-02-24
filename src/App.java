import Interfaces.Sort;
import Interfaces.SortFactory;

public class App {
    private Sort sf;

    public App(SortFactory sf, int[] unsortedArr) {
        this.sf = sf.sort(unsortedArr);
    }

    public int[] exec() {
        return this.sf.sortedArray();
    }
}
