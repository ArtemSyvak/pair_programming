package pack.editor;

import org.springframework.stereotype.Component;
import pack.entity.Product;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;

/**
 * Created by Artem on 10.07.2017.
 */

@Component
public class ProductEditor extends PropertyEditorSupport {


    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        Product product = new Product(text);
        setValue(product);
    }
}
