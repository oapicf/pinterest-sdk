package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.PinMedia;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Summarized pin information
 */
public class SummaryPin   {

    private String altText;
    private String description;
    private String id;
    private String link;
    private PinMedia media;
    private String title;

    /**
     * Default constructor.
     */
    public SummaryPin() {
    // JSON-B / Jackson
    }

    /**
     * Create SummaryPin.
     *
     * @param altText altText
     * @param description description
     * @param id id
     * @param link link
     * @param media media
     * @param title title
     */
    public SummaryPin(
        String altText, 
        String description, 
        String id, 
        String link, 
        PinMedia media, 
        String title
    ) {
        this.altText = altText;
        this.description = description;
        this.id = id;
        this.link = link;
        this.media = media;
        this.title = title;
    }



    /**
     * Get altText
     * @return altText
     */
    public String getAltText() {
        return altText;
    }

    public void setAltText(String altText) {
        this.altText = altText;
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
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
     * Get media
     * @return media
     */
    public PinMedia getMedia() {
        return media;
    }

    public void setMedia(PinMedia media) {
        this.media = media;
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
        sb.append("class SummaryPin {\n");
        
        sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    media: ").append(toIndentedString(media)).append("\n");
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

