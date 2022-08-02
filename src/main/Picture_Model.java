
package main;

import javax.swing.Icon;


public class Picture_Model {

    /**
     * @return the image
     */
    public Icon getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Icon image) {
        this.image = image;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public Picture_Model(Icon image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }
    
    private Icon image;
    private String title;
    private String description;

    public Picture_Model() {
    }
    
}
