package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class PinMediaSourceImagesURLItem   {

    private String description;
    private String link;
    private String title;
    private String url;

    /**
     * Default constructor.
     */
    public PinMediaSourceImagesURLItem() {
    // JSON-B / Jackson
    }

    /**
     * Create PinMediaSourceImagesURLItem.
     *
     * @param description description
     * @param link link
     * @param title title
     * @param url url
     */
    public PinMediaSourceImagesURLItem(
        String description, 
        String link, 
        String title, 
        String url
    ) {
        this.description = description;
        this.link = link;
        this.title = title;
        this.url = url;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PinMediaSourceImagesURLItem {\n");
        
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

