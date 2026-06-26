/** @author <Tatia Idukashvili> */
package homework10;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(METHOD)
@interface Author {

    String name();

    String date() default "unknown";
}