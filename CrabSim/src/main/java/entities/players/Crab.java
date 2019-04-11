package entities.players;

import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;

public class Crab extends Player {

    Crab(Image crabSprite) {
        this.setImage(crabSprite);
    }

    @Override
    public void init() {
        health = 150;
    }

    @Override
    public void takeDamage(int damageAmount) {
        vulnerable = false;
        health -= damageAmount;
    }

    @Override
    protected Rectangle getBoundingBox() {
        return new Rectangle(this.getLayoutX(), this.getLayoutY(),100, 50);
    }

    @Override
    public void update() {

    }

    @Override
    protected boolean isVulnerable() {
        return vulnerable;
    }

    @Override
    public int getDamageAmount() {
        return 0;
    }
}
