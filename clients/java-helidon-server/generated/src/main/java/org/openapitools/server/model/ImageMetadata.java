package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ImageSize;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ImageMetadata   {

    private String description;
    private ImageSize images;

    /**
    * Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload.
    */
    public enum ItemTypeEnum {
        IMAGE("image");

        private String value;

        ItemTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static ItemTypeEnum fromValue(String text) {
            for (ItemTypeEnum b : ItemTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ItemTypeEnum itemType;
    private String link;
    private String title;

    /**
     * Default constructor.
     */
    public ImageMetadata() {
    // JSON-B / Jackson
    }

    /**
     * Create ImageMetadata.
     *
     * @param description description
     * @param images images
     * @param itemType Discriminator literal identifying this as image metadata inside a &#x60;PinMediaMetadata&#x60; payload.
     * @param link link
     * @param title title
     */
    public ImageMetadata(
        String description, 
        ImageSize images, 
        ItemTypeEnum itemType, 
        String link, 
        String title
    ) {
        this.description = description;
        this.images = images;
        this.itemType = itemType;
        this.link = link;
        this.title = title;
    }



    /**
     * Get description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get images
     * @return images
     */
    public ImageSize getImages() {
        return images;
    }

    public void setImages(ImageSize images) {
        this.images = images;
    }

    /**
     * Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload.
     * @return itemType
     */
    public ItemTypeEnum getItemType() {
        return itemType;
    }

    public void setItemType(ItemTypeEnum itemType) {
        this.itemType = itemType;
    }

    /**
     * Get link
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Get title
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageMetadata {\n");
        
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
        sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

