package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Pin image data for trending topics
 */
public class TrendingPin   {

    private String color;
    private Integer height;
    private String id;
    private String src;
    private Double verticalOffset;
    private Integer width;

    /**
     * Default constructor.
     */
    public TrendingPin() {
    // JSON-B / Jackson
    }

    /**
     * Create TrendingPin.
     *
     * @param color Dominant color of the pin image in hex format
     * @param height Height of the pin image in pixels
     * @param id Unique identifier for the pin
     * @param src URL of the pin image
     * @param verticalOffset The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.
     * @param width Width of the pin image in pixels
     */
    public TrendingPin(
        String color, 
        Integer height, 
        String id, 
        String src, 
        Double verticalOffset, 
        Integer width
    ) {
        this.color = color;
        this.height = height;
        this.id = id;
        this.src = src;
        this.verticalOffset = verticalOffset;
        this.width = width;
    }



    /**
     * Dominant color of the pin image in hex format
     * @return color
     */
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Height of the pin image in pixels
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * Unique identifier for the pin
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * URL of the pin image
     * @return src
     */
    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    /**
     * The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.
     * @return verticalOffset
     */
    public Double getVerticalOffset() {
        return verticalOffset;
    }

    public void setVerticalOffset(Double verticalOffset) {
        this.verticalOffset = verticalOffset;
    }

    /**
     * Width of the pin image in pixels
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TrendingPin {\n");
        
        sb.append("    color: ").append(toIndentedString(color)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    src: ").append(toIndentedString(src)).append("\n");
        sb.append("    verticalOffset: ").append(toIndentedString(verticalOffset)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

