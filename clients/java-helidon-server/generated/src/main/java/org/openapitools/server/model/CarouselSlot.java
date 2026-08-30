package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CarouselSlot   {

    private String description;
    private String link;
    private String title;

    /**
     * Default constructor.
     */
    public CarouselSlot() {
    // JSON-B / Jackson
    }

    /**
     * Create CarouselSlot.
     *
     * @param description Carousel Pin slot description.
     * @param link Carousel Pin slot link.
     * @param title Carousel Pin slot title.
     */
    public CarouselSlot(
        String description, 
        String link, 
        String title
    ) {
        this.description = description;
        this.link = link;
        this.title = title;
    }



    /**
     * Carousel Pin slot description.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Carousel Pin slot link.
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Carousel Pin slot title.
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
        sb.append("class CarouselSlot {\n");
        
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

