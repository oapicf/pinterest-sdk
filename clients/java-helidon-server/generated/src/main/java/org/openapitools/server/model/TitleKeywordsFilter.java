package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupMultipleStringCriteria;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TitleKeywordsFilter   {

    private CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS;

    /**
     * Default constructor.
     */
    public TitleKeywordsFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create TitleKeywordsFilter.
     *
     * @param TITLE_KEYWORDS TITLE_KEYWORDS
     */
    public TitleKeywordsFilter(
        CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS
    ) {
        this.TITLE_KEYWORDS = TITLE_KEYWORDS;
    }



    /**
     * Get TITLE_KEYWORDS
     * @return TITLE_KEYWORDS
     */
    public CatalogsProductGroupMultipleStringCriteria getTITLEKEYWORDS() {
        return TITLE_KEYWORDS;
    }

    public void setTITLEKEYWORDS(CatalogsProductGroupMultipleStringCriteria TITLE_KEYWORDS) {
        this.TITLE_KEYWORDS = TITLE_KEYWORDS;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TitleKeywordsFilter {\n");
        
        sb.append("    TITLE_KEYWORDS: ").append(toIndentedString(TITLE_KEYWORDS)).append("\n");
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

