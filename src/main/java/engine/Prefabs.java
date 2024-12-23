package engine;

import org.joml.Vector2f;
import renderer.Sprite;
import renderer.Transform;

public class Prefabs {

    public static GameObject generateSpriteObject(Sprite sprite, float sizeX,float sizeY){
        return new GameObject("Sprite_Object_Gen",sprite,
                new Transform(new Vector2f(0,0),new Vector2f(sizeX,sizeY)),1);
    }
}
