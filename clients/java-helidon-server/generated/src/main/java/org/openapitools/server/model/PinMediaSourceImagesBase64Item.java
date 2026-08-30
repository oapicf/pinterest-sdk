package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ContentType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PinMediaSourceImagesBase64Item   {

    private ContentType contentType;
    private String data;
    private String description;
    private String link;
    private String title;

    /**
     * Default constructor.
     */
    public PinMediaSourceImagesBase64Item() {
    // JSON-B / Jackson
    }

    /**
     * Create PinMediaSourceImagesBase64Item.
     *
     * @param contentType contentType
     * @param data data
     * @param description description
     * @param link link
     * @param title title
     */
    public PinMediaSourceImagesBase64Item(
        ContentType contentType, 
        String data, 
        String description, 
        String link, 
        String title
    ) {
        this.contentType = contentType;
        this.data = data;
        this.description = description;
        this.link = link;
        this.title = title;
    }



    /**
     * Get contentType
     * @return contentType
     */
    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    /**
     * Get data
     * @return data
     */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
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
        sb.append("class PinMediaSourceImagesBase64Item {\n");
        
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

