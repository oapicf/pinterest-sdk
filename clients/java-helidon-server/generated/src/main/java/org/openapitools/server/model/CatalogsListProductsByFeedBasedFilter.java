package org.openapitools.server.model;

import org.openapitools.server.model.CatalogsProductGroupFilters;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Request object to list products for a given feed_id and product group filter.
 */
public class CatalogsListProductsByFeedBasedFilter   {

    private String feedId;
    private CatalogsProductGroupFilters filters;

    /**
     * Default constructor.
     */
    public CatalogsListProductsByFeedBasedFilter() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsListProductsByFeedBasedFilter.
     *
     * @param feedId Catalog Feed id pertaining to the catalog product group filter.
     * @param filters filters
     */
    public CatalogsListProductsByFeedBasedFilter(
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
        sb.append("class CatalogsListProductsByFeedBasedFilter {\n");
        
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

