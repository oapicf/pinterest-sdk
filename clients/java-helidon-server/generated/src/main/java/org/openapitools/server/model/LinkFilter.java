package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupFilterOperatorTypeCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class LinkFilter   {

    private CatalogsProductGroupFilterOperatorTypeCriteria LINK;

    /**
     * Default constructor.
     */
    public LinkFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create LinkFilter.
     *
     * @param LINK LINK
     */
    public LinkFilter(
        CatalogsProductGroupFilterOperatorTypeCriteria LINK
    ) {
        this.LINK = LINK;
    }



    /**
     * Get LINK
     * @return LINK
     */
    public CatalogsProductGroupFilterOperatorTypeCriteria getLINK() {
        return LINK;
    }

    public void setLINK(CatalogsProductGroupFilterOperatorTypeCriteria LINK) {
        this.LINK = LINK;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LinkFilter {\n");
        
        sb.append("    LINK: ").append(toIndentedString(LINK)).append("\n");
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

