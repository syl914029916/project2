package syl;

import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemOptimizationContext;

import javax.swing.text.html.parser.Element;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class helloworld {

    private static int num;

    public helloworld() {

    }

    public static void main(String[] args) {
        //region Description
        extracted();
        num = 10;
    }

    private static void extracted() {
        System.out.println("hello");
        ArrayList list1 = new ArrayList();
        System.out.println("HELLO");
        System.out.println();
        //endregion
        new Date();
        list1.add( 0, 123);
        method1();

    }

    public static void method1(){
        try (FileInputStream fis = new FileInputStream("hello.txt")) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

