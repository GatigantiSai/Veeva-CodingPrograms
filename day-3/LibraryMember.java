
import java.util.Scanner;

abstract class Member {
    abstract int getLoanLimit();
}

class StudentMember extends Member {
    int getLoanLimit() {
        return 3;
    }
}

class FacultyMember extends Member {
    int getLoanLimit() {
        return 10;
    }
}

public class LibraryMember {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        int books = sc.nextInt();

        Member m;

        if (type.equals("S")) {
            m = new StudentMember();
        } else {
            m = new FacultyMember();
        }

        if (books >= 0 && books <= m.getLoanLimit()) {
            System.out.println("Allowed");
        } else {
            System.out.println("Denied");
        }

        sc.close();
    }
}
