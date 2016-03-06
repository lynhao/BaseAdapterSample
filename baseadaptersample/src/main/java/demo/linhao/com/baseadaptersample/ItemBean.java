package demo.linhao.com.baseadaptersample;

/**
 * Created by linhao on 16/3/6.
 */
public class ItemBean {
    public int itemImageId;
    public String ImageTile;
    public String ImageContent;

    public ItemBean(String imageContent, String imageTile, int itemImageId) {
        ImageContent = imageContent;
        ImageTile = imageTile;
        this.itemImageId = itemImageId;

    }
}
