/** @author <Tatia Idukashvili> */
package homework10;

import java.lang.reflect.Method;

public class AnnotationDemo {
    @Author(name = "Tatia")
    public void firstMethod() {

    }

    @Author(name = "Tatia", date = "2026")
    public void secondMethod() {

    }

    public static void main(String[] args) throws Exception {
        Method[] methods = AnnotationDemo.class.getDeclaredMethods();

        for (Method method : methods) {
            Author author = method.getAnnotation(Author.class);

            if (author != null) {
                System.out.println(method.getName() + " - " + author.name());
            }
        }
    }
}