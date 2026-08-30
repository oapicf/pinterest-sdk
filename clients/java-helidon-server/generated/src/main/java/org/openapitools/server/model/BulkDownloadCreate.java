package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.BulkDownloadCampaignFilter;
import org.openapitools.server.model.BulkEntityType;
import org.openapitools.server.model.BulkOutputFormat;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
public class BulkDownloadCreate   {

    private BulkDownloadCampaignFilter campaignFilter;
    private List<@Pattern(regexp = "^\\d+$")String> entityIds = new ArrayList<>();
    private List<BulkEntityType> entityTypes = new ArrayList<>();
    private BulkOutputFormat outputFormat;
    private String updatedSince;

    /**
     * Default constructor.
     */
    public BulkDownloadCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create BulkDownloadCreate.
     *
     * @param campaignFilter campaignFilter
     * @param entityIds All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
     * @param entityTypes All entity types specified will be downloaded. Fewer types result in faster downloads.
     * @param outputFormat outputFormat
     * @param updatedSince Unix UTC timestamp to retrieve all entities that have changed since this time.
     */
    public BulkDownloadCreate(
        BulkDownloadCampaignFilter campaignFilter, 
        List<@Pattern(regexp = "^\\d+$")String> entityIds, 
        List<BulkEntityType> entityTypes, 
        BulkOutputFormat outputFormat, 
        String updatedSince
    ) {
        this.campaignFilter = campaignFilter;
        this.entityIds = entityIds;
        this.entityTypes = entityTypes;
        this.outputFormat = outputFormat;
        this.updatedSince = updatedSince;
    }



    /**
     * Get campaignFilter
     * @return campaignFilter
     */
    public BulkDownloadCampaignFilter getCampaignFilter() {
        return campaignFilter;
    }

    public void setCampaignFilter(BulkDownloadCampaignFilter campaignFilter) {
        this.campaignFilter = campaignFilter;
    }

    /**
     * All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
     * @return entityIds
     */
    public List<@Pattern(regexp = "^\\d+$")String> getEntityIds() {
        return entityIds;
    }

    public void setEntityIds(List<@Pattern(regexp = "^\\d+$")String> entityIds) {
        this.entityIds = entityIds;
    }

    /**
     * All entity types specified will be downloaded. Fewer types result in faster downloads.
     * @return entityTypes
     */
    public List<BulkEntityType> getEntityTypes() {
        return entityTypes;
    }

    public void setEntityTypes(List<BulkEntityType> entityTypes) {
        this.entityTypes = entityTypes;
    }

    /**
     * Get outputFormat
     * @return outputFormat
     */
    public BulkOutputFormat getOutputFormat() {
        return outputFormat;
    }

    public void setOutputFormat(BulkOutputFormat outputFormat) {
        this.outputFormat = outputFormat;
    }

    /**
     * Unix UTC timestamp to retrieve all entities that have changed since this time.
     * @return updatedSince
     */
    public String getUpdatedSince() {
        return updatedSince;
    }

    public void setUpdatedSince(String updatedSince) {
        this.updatedSince = updatedSince;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BulkDownloadCreate {\n");
        
        sb.append("    campaignFilter: ").append(toIndentedString(campaignFilter)).append("\n");
        sb.append("    entityIds: ").append(toIndentedString(entityIds)).append("\n");
        sb.append("    entityTypes: ").append(toIndentedString(entityTypes)).append("\n");
        sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
        sb.append("    updatedSince: ").append(toIndentedString(updatedSince)).append("\n");
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

