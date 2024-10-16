package CardapioApi.APi.mapper;

import CardapioApi.APi.domainModel.Food;
import CardapioApi.APi.dtos.FoodDTO;

public class FoodMapper {

    public static FoodDTO toDTO(Food food) {

        return new FoodDTO(food.getId(), food.getTitle(), food.getImage_path(), food.getPrice(), food.getQuantidade_estoque());

    }

}
