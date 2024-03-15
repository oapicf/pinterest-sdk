package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BulkDownloadRequestCampaignFilter;
import org.openapitools.model.BulkEntityType;
import org.openapitools.model.BulkOutputFormat;

/**
 * Ad entities to get in bulk request.
 */
@ApiModel(description = "Ad entities to get in bulk request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BulkDownloadRequest   {
  @JsonProperty("entity_types")
  private List<BulkEntityType> entityTypes = null;

  @JsonProperty("entity_ids")
  private List<@Pattern(regexp = "^\\d+$")String> entityIds = null;

  @JsonProperty("updated_since")
  private String updatedSince;

  @JsonProperty("campaign_filter")
  private BulkDownloadRequestCampaignFilter campaignFilter;

  @JsonProperty("output_format")
  private BulkOutputFormat outputFormat = "JSON";

  public BulkDownloadRequest entityTypes(List<BulkEntityType> entityTypes) {
    this.entityTypes = entityTypes;
    return this;
  }

  public BulkDownloadRequest addEntityTypesItem(BulkEntityType entityTypesItem) {
    if (this.entityTypes == null) {
      this.entityTypes = ;
    }
    this.entityTypes.add(entityTypesItem);
    return this;
  }

   /**
   * All entity types specified will be downloaded. Fewer types result in faster downloads.
   * @return entityTypes
  **/
  @ApiModelProperty(example = "[\"CAMPAIGN\",\"AD_GROUP\"]", value = "All entity types specified will be downloaded. Fewer types result in faster downloads.")
  public List<BulkEntityType> getEntityTypes() {
    return entityTypes;
  }

  public void setEntityTypes(List<BulkEntityType> entityTypes) {
    this.entityTypes = entityTypes;
  }

  public BulkDownloadRequest entityIds(List<@Pattern(regexp = "^\\d+$")String> entityIds) {
    this.entityIds = entityIds;
    return this;
  }

  public BulkDownloadRequest addEntityIdsItem(String entityIdsItem) {
    if (this.entityIds == null) {
      this.entityIds = ;
    }
    this.entityIds.add(entityIdsItem);
    return this;
  }

   /**
   * All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
   * @return entityIds
  **/
  @ApiModelProperty(value = "All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.")
  public List<@Pattern(regexp = "^\\d+$")String> getEntityIds() {
    return entityIds;
  }

  public void setEntityIds(List<@Pattern(regexp = "^\\d+$")String> entityIds) {
    this.entityIds = entityIds;
  }

  public BulkDownloadRequest updatedSince(String updatedSince) {
    this.updatedSince = updatedSince;
    return this;
  }

   /**
   * Unix UTC timestamp to retrieve all entities that have changed since this time.
   * @return updatedSince
  **/
  @ApiModelProperty(example = "1622848072", value = "Unix UTC timestamp to retrieve all entities that have changed since this time.")
  public String getUpdatedSince() {
    return updatedSince;
  }

  public void setUpdatedSince(String updatedSince) {
    this.updatedSince = updatedSince;
  }

  public BulkDownloadRequest campaignFilter(BulkDownloadRequestCampaignFilter campaignFilter) {
    this.campaignFilter = campaignFilter;
    return this;
  }

   /**
   * Get campaignFilter
   * @return campaignFilter
  **/
  @ApiModelProperty(value = "")
  public BulkDownloadRequestCampaignFilter getCampaignFilter() {
    return campaignFilter;
  }

  public void setCampaignFilter(BulkDownloadRequestCampaignFilter campaignFilter) {
    this.campaignFilter = campaignFilter;
  }

  public BulkDownloadRequest outputFormat(BulkOutputFormat outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

   /**
   * Get outputFormat
   * @return outputFormat
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.entityTypes, bulkDownloadRequest.entityTypes) &&
        Objects.equals(this.entityIds, bulkDownloadRequest.entityIds) &&
        Objects.equals(this.updatedSince, bulkDownloadRequest.updatedSince) &&
        Objects.equals(this.campaignFilter, bulkDownloadRequest.campaignFilter) &&
        Objects.equals(this.outputFormat, bulkDownloadRequest.outputFormat);
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

