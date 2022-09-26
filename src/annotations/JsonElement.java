package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Field Level Annotation Example
//One single parameter annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD) //can mark the fields that we'll include in the generated JSON
public @interface JsonElement {
    public String key() default"" ;
    //these methods must have no parameter, cannot throw an exception
    //the return types are restricted to primitive types, String, Class,
    //enumerations, annotations and arrays of these types.
    // The default value cannot be null.
}
