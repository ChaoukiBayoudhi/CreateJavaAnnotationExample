package Classes;

import annotations.Init;
import annotations.JsonElement;
import annotations.JsonSerializable;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@JsonSerializable
public class Product {
    @JsonElement
    private String name;
    @JsonElement(key = "productBrand")
    private String brand;
    @JsonElement
    private BigDecimal price;
    @JsonElement
    private LocalDate fabricationDate;
    @JsonElement
    private LocalDate expirationDate;
    private String description;
    //we suppose that before serializing the product object to JSON
    //we should capitalize the first letter of the product name and
    //the brand name
    //this method is called before serialisation
    @Init
    private void initNameAndBrand(){
        this.name=this.name.substring(0,1).toUpperCase()+this.name.substring(1);
        this.brand=this.brand.toUpperCase();
    }
}
