package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CatalogsProductGroupFiltersRequest;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Request object for creating a product group.
 */
public class CatalogsProductGroupCreateRequest   {

    private String description;
    private String feedId;
    private CatalogsProductGroupFiltersRequest filters;
    private Boolean isFeatured;
    private String name;

    /**
     * Default constructor.
     */
    public CatalogsProductGroupCreateRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsProductGroupCreateRequest.
     *
     * @param description description
     * @param feedId Catalog Feed id pertaining to the catalog product group.
     * @param filters filters
     * @param isFeatured boolean indicator of whether the product group is being featured or not
     * @param name name
     */
    public CatalogsProductGroupCreateRequest(
        String description, 
        String feedId, 
        CatalogsProductGroupFiltersRequest filters, 
        Boolean isFeatured, 
        String name
    ) {
        this.description = description;
        this.feedId = feedId;
        this.filters = filters;
        this.isFeatured = isFeatured;
        this.name = name;
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
     * Catalog Feed id pertaining to the catalog product group.
     * @return feedId
     */
    public String getFeedId() {
        return feedId;
    }

    public void setFeedId(String feedId) {
        this.feedId = feedId;
    }

    /**
     * Get filters
     * @return filters
     */
    public CatalogsProductGroupFiltersRequest getFilters() {
        return filters;
    }

    public void setFilters(CatalogsProductGroupFiltersRequest filters) {
        this.filters = filters;
    }

    /**
     * boolean indicator of whether the product group is being featured or not
     * @return isFeatured
     */
    public Boolean getIsFeatured() {
        return isFeatured;
    }

    public void setIsFeatured(Boolean isFeatured) {
        this.isFeatured = isFeatured;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsProductGroupCreateRequest {\n");
        
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
        sb.append("    isFeatured: ").append(toIndentedString(isFeatured)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

