package w2;

// import java.lang.StringBuffer.*;
// import java.lang.StringBuilder.*;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle DVD title: " + jungleDVD.getTitle());
        System.out.println("cinderella DVD title: " + cinderellaDVD.getTitle());
        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle DVD title: " + jungleDVD.getTitle());

    }

    public static void swap(Object o1, Object o2) { // cai swap nay khong dung duoc muon dung thi phai dung cais 
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}
