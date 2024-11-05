package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.BulkDownloadRequestCampaignFilter;
import org.openapitools.vertxweb.server.model.BulkEntityType;
import org.openapitools.vertxweb.server.model.BulkOutputFormat;

/**
 * Ad entities to get in bulk request.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BulkDownloadRequest   {
  
  private List<BulkEntityType> entityTypes = new ArrayList<>();
  private List<String> entityIds = new ArrayList<>();
  private String updatedSince;
  private BulkDownloadRequestCampaignFilter campaignFilter;
  private BulkOutputFormat outputFormat = "JSON";

  public BulkDownloadRequest () {

  }

  public BulkDownloadRequest (List<BulkEntityType> entityTypes, List<String> entityIds, String updatedSince, BulkDownloadRequestCampaignFilter campaignFilter, BulkOutputFormat outputFormat) {
    this.entityTypes = entityTypes;
    this.entityIds = entityIds;
    this.updatedSince = updatedSince;
    this.campaignFilter = campaignFilter;
    this.outputFormat = outputFormat;
  }

    
  @JsonProperty("entity_types")
  public List<BulkEntityType> getEntityTypes() {
    return entityTypes;
  }
  public void setEntityTypes(List<BulkEntityType> entityTypes) {
    this.entityTypes = entityTypes;
  }

    
  @JsonProperty("entity_ids")
  public List<String> getEntityIds() {
    return entityIds;
  }
  public void setEntityIds(List<String> entityIds) {
    this.entityIds = entityIds;
  }

    
  @JsonProperty("updated_since")
  public String getUpdatedSince() {
    return updatedSince;
  }
  public void setUpdatedSince(String updatedSince) {
    this.updatedSince = updatedSince;
  }

    
  @JsonProperty("campaign_filter")
  public BulkDownloadRequestCampaignFilter getCampaignFilter() {
    return campaignFilter;
  }
  public void setCampaignFilter(BulkDownloadRequestCampaignFilter campaignFilter) {
    this.campaignFilter = campaignFilter;
  }

    
  @JsonProperty("output_format")
  public BulkOutputFormat getOutputFormat() {
    return outputFormat;
  }
  public void setOutputFormat(BulkOutputFormat outputFormat) {
    this.outputFormat = outputFormat;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkDownloadRequest bulkDownloadRequest = (BulkDownloadRequest) o;
    return Objects.equals(entityTypes, bulkDownloadRequest.entityTypes) &&
        Objects.equals(entityIds, bulkDownloadRequest.entityIds) &&
        Objects.equals(updatedSince, bulkDownloadRequest.updatedSince) &&
        Objects.equals(campaignFilter, bulkDownloadRequest.campaignFilter) &&
        Objects.equals(outputFormat, bulkDownloadRequest.outputFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityTypes, entityIds, updatedSince, campaignFilter, outputFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkDownloadRequest {\n");
    
    sb.append("    entityTypes: ").append(toIndentedString(entityTypes)).append("\n");
    sb.append("    entityIds: ").append(toIndentedString(entityIds)).append("\n");
    sb.append("    updatedSince: ").append(toIndentedString(updatedSince)).append("\n");
    sb.append("    campaignFilter: ").append(toIndentedString(campaignFilter)).append("\n");
    sb.append("    outputFormat: ").append(toIndentedString(outputFormat)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
