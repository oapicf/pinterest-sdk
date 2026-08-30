package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The main hotel image
 */
public class CatalogsHotelMainImage   {

    private String link;
    private List<String> tag;

    /**
     * Default constructor.
     */
    public CatalogsHotelMainImage() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsHotelMainImage.
     *
     * @param link &lt;&#x3D; 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.
     * @param tag Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
     */
    public CatalogsHotelMainImage(
        String link, 
        List<String> tag
    ) {
        this.link = link;
        this.tag = tag;
    }



    /**
     * <= 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
     * @return tag
     */
    public List<String> getTag() {
        return tag;
    }

    public void setTag(List<String> tag) {
        this.tag = tag;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsHotelMainImage {\n");
        
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

