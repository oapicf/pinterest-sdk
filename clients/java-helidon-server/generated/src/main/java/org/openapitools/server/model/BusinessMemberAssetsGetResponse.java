package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AssetIdPermissions;
import org.openapitools.server.model.TotalCountByEntityStatus;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Paginated response for business member assets with total count metadata.
 */
public class BusinessMemberAssetsGetResponse   {

    private String bookmark;
    private List<@Valid AssetIdPermissions> items = new ArrayList<>();
    private Integer totalDataCount;
    private TotalCountByEntityStatus totalDataCountByStatus;

    /**
     * Default constructor.
     */
    public BusinessMemberAssetsGetResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create BusinessMemberAssetsGetResponse.
     *
     * @param bookmark bookmark
     * @param items items
     * @param totalDataCount Total number of assets matching the query
     * @param totalDataCountByStatus Breakdown of asset counts by entity status (ad accounts only)
     */
    public BusinessMemberAssetsGetResponse(
        String bookmark, 
        List<@Valid AssetIdPermissions> items, 
        Integer totalDataCount, 
        TotalCountByEntityStatus totalDataCountByStatus
    ) {
        this.bookmark = bookmark;
        this.items = items;
        this.totalDataCount = totalDataCount;
        this.totalDataCountByStatus = totalDataCountByStatus;
    }



    /**
     * Get bookmark
     * @return bookmark
     */
    public String getBookmark() {
        return bookmark;
    }

    public void setBookmark(String bookmark) {
        this.bookmark = bookmark;
    }

    /**
     * Get items
     * @return items
     */
    public List<@Valid AssetIdPermissions> getItems() {
        return items;
    }

    public void setItems(List<@Valid AssetIdPermissions> items) {
        this.items = items;
    }

    /**
     * Total number of assets matching the query
     * @return totalDataCount
     */
    public Integer getTotalDataCount() {
        return totalDataCount;
    }

    public void setTotalDataCount(Integer totalDataCount) {
        this.totalDataCount = totalDataCount;
    }

    /**
     * Breakdown of asset counts by entity status (ad accounts only)
     * @return totalDataCountByStatus
     */
    public TotalCountByEntityStatus getTotalDataCountByStatus() {
        return totalDataCountByStatus;
    }

    public void setTotalDataCountByStatus(TotalCountByEntityStatus totalDataCountByStatus) {
        this.totalDataCountByStatus = totalDataCountByStatus;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessMemberAssetsGetResponse {\n");
        
        sb.append("    bookmark: ").append(toIndentedString(bookmark)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    totalDataCount: ").append(toIndentedString(totalDataCount)).append("\n");
        sb.append("    totalDataCountByStatus: ").append(toIndentedString(totalDataCountByStatus)).append("\n");
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

