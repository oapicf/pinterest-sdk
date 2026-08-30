package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CatalogsListProductsByFeedBasedFilter;
import org.openapitools.server.model.CatalogsLocale;
import org.openapitools.server.model.CatalogsProductGroupFilters;
import org.openapitools.server.model.CatalogsVerticalsListProductsByCatalogBasedFilterRequest;
import org.openapitools.server.model.Country;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Request object to list products for a given product group filter.
 */
public class CatalogsListProductsByFilterRequest   {

    private String feedId;
    private CatalogsProductGroupFilters filters;

    /**
     * Default constructor.
     */
    public CatalogsListProductsByFilterRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsListProductsByFilterRequest.
     *
     * @param feedId Catalog Feed id pertaining to the catalog product group filter.
     * @param filters filters
     */
    public CatalogsListProductsByFilterRequest(
        String feedId, 
        CatalogsProductGroupFilters filters
    ) {
        this.feedId = feedId;
        this.filters = filters;
    }



    /**
     * Catalog Feed id pertaining to the catalog product group filter.
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
    public CatalogsProductGroupFilters getFilters() {
        return filters;
    }

    public void setFilters(CatalogsProductGroupFilters filters) {
        this.filters = filters;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsListProductsByFilterRequest {\n");
        
        sb.append("    feedId: ").append(toIndentedString(feedId)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

