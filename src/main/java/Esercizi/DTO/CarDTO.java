package Esercizi.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record CarDTO(@NotNull String id, @NotNull String modelName, double price){

    public CarDTO(@JsonProperty("id") @NotNull String id, @JsonProperty("name") @NotBlank String modelName, @JsonProperty("price") double price) {
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }

}
