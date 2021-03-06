package main.View;
import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import main.Model.Mapping.Position;

public class FoodSupplyDisplay extends Parent{

    private Position position;

    public FoodSupplyDisplay(Position position){
        this.position = position;
        Rectangle foodSupply = new Rectangle();
        foodSupply.setHeight(ColonyDisplay.heightRectangle/1.5);
        foodSupply.setWidth(ColonyDisplay.widthRectangle/1.5);

        double offsetHeight = (ColonyDisplay.heightRectangle/1.5)/2;
        double offsetWidth = (ColonyDisplay.widthRectangle/1.5)/2;

        foodSupply.setX((position.getX()*ColonyDisplay.heightRectangle)+offsetHeight);
        foodSupply.setY((position.getY()*ColonyDisplay.widthRectangle)+offsetWidth);
        foodSupply.setFill(Color.STEELBLUE);
        this.getChildren().add(foodSupply);
    }

    public Position getPosition() {
        return position;
    }
}
