package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //this annotation has runtime visibility
@Target(ElementType.TYPE) //we can apply it to types (classes)
//this annotation has no methods : it'll be user up to the class to mark it as can be serialized into JSON
public @interface JsonSerializable {
}
