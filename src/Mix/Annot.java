package First;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Annot {

    public static void main(String[] args) {
        MyAnnotation annotation = (MyAnnotation)new Temporary().getClass().getAnnotation(MyAnnotation.class);
        System.out.println(annotation.num());
        System.out.println(annotation.str());
    }

    @MyAnnotation()
    public static class Temporary {
        public Temporary() {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @interface MyAnnotation {
        String str() default "qwertyu";

        int num() default 20;
    }

}
