package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ImageDetails   {

    private Integer height;
    private String url;
    private Integer width;

    /**
     * Default constructor.
     */
    public ImageDetails() {
    // JSON-B / Jackson
    }

    /**
     * Create ImageDetails.
     *
     * @param height height
     * @param url url
     * @param width width
     */
    public ImageDetails(
        Integer height, 
        String url, 
        Integer width
    ) {
        this.height = height;
        this.url = url;
        this.width = width;
    }



    /**
     * Get height
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * Get url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Get width
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
        sb.append("class ImageDetails {\n");
        
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

