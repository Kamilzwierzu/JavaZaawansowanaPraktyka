import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Students {
    public static List<String> main(String[] args) {
        private final List<String> names;

    public Students(List < String > names) {
            this.names = names;
        }

        public List<String> getSorted () {
            return names.stream().sorted().toList();
        }

        public List<String> getReverseSorted () {
            return names.stream().sorted(Comparator.reverseOrder()).toList();
        }

        public List<String> getOriginal () {
            return new ArrayList<>(names);
        }
    }
}

