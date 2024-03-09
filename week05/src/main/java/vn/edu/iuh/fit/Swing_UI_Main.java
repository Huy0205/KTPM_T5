package vn.edu.iuh.fit;

import jdepend.swingui.JDepend;

import java.io.IOException;

public class Swing_UI_Main {
    public static void main(String[] args) throws IOException {
        JDepend depend = new JDepend();
        depend.addDirectory("T:\\KTPM_T5\\my_week05\\Library-Assistant");
        depend.analyze();
        System.out.println("DONE");
    }

}
