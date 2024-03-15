package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BulkDownloadRequestCampaignFilter;
import org.openapitools.model.BulkEntityType;
import org.openapitools.model.BulkOutputFormat;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Ad entities to get in bulk request.
 */
@ApiModel(description="Ad entities to get in bulk request.")

public class BulkDownloadRequest  {
  
 /**
  * All entity types specified will be downloaded. Fewer types result in faster downloads.
  */
  @ApiModelProperty(example = "[\"CAMPAIGN\",\"AD_GROUP\"]", value = "All entity types specified will be downloaded. Fewer types result in faster downloads.")
  @Valid
  private List<BulkEntityType> entityTypes;

 /**
  * All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
  */
  @ApiModelProperty(value = "All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.")
  private List<@Pattern(regexp = "^\\d+$")String> entityIds;

 /**
  * Unix UTC timestamp to retrieve all entities that have changed since this time.
  */
  @ApiModelProperty(example = "1622848072", value = "Unix UTC timestamp to retrieve all entities that have changed since this time.")
  private String updatedSince;

  @ApiModelProperty(value = "")
  @Valid
  private BulkDownloadRequestCampaignFilter campaignFilter;

  @ApiModelProperty(value = "")
  @Valid
  private BulkOutputFormat outputFormat = "JSON";
 /**
  * All entity types specified will be downloaded. Fewer types result in faster downloads.
  * @return entityTypes
  */
  @JsonProperty("entity_types")
 @Size(min=1,max=5)  public List<BulkEntityType> getEntityTypes() {
    return entityTypes;
  }

  /**
   * Sets the <code>entityTypes</code> property.
   */
 public void setEntityTypes(List<BulkEntityType> entityTypes) {
    this.entityTypes = entityTypes;
  }

  /**
   * Sets the <code>entityTypes</code> property.
   */
  public BulkDownloadRequest entityTypes(List<BulkEntityType> entityTypes) {
    this.entityTypes = entityTypes;
    return this;
  }

  /**
   * Adds a new item to the <code>entityTypes</code> list.
   */
  public BulkDownloadRequest addEntityTypesItem(BulkEntityType entityTypesItem) {
    this.entityTypes.add(entityTypesItem);
    return this;
  }

 /**
  * All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
  * @return entityIds
  */
  @JsonProperty("entity_ids")
  public List<@Pattern(regexp = "^\\d+$")String> getEntityIds() {
    return entityIds;
  }

  /**
   * Sets the <code>entityIds</code> property.
   */
 public void setEntityIds(List<@Pattern(regexp = "^\\d+$")String> entityIds) {
    this.entityIds = entityIds;
  }

  /**
   * Sets the <code>entityIds</code> property.
   */
  public BulkDownloadRequest entityIds(List<@Pattern(regexp = "^\\d+$")String> entityIds) {
    this.entityIds = entityIds;
    return this;
  }

  /**
   * Adds a new item to the <code>entityIds</code> list.
   */
  public BulkDownloadRequest addEntityIdsItem(String entityIdsItem) {
    this.entityIds.add(entityIdsItem);
    return this;
  }

 /**
  * Unix UTC timestamp to retrieve all entities that have changed since this time.
  * @return updatedSince
  */
  @JsonProperty("updated_since")
 @Pattern(regexp="^\\d+$")  public String getUpdatedSince() {
    return updatedSince;
  }

  /**
   * Sets the <code>updatedSince</code> property.
   */
 public void setUpdatedSince(String updatedSince) {
    this.updatedSince = updatedSince;
  }

  /**
   * Sets the <code>updatedSince</code> property.
   */
  public BulkDownloadRequest updatedSince(String updatedSince) {
    this.updatedSince = updatedSince;
    return this;
  }

 /**
  * Get campaignFilter
  * @return campaignFilter
  */
  @JsonProperty("campaign_filter")
  public BulkDownloadRequestCampaignFilter getCampaignFilter() {
    return campaignFilter;
  }

  /**
   * Sets the <code>campaignFilter</code> property.
   */
 public void setCampaignFilter(BulkDownloadRequestCampaignFilter campaignFilter) {
    this.campaignFilter = campaignFilter;
  }

  /**
   * Sets the <code>campaignFilter</code> property.
   */
  public BulkDownloadRequest campaignFilter(BulkDownloadRequestCampaignFilter campaignFilter) {
    this.campaignFilter = campaignFilter;
    return this;
  }

 /**
  * Get outputFormat
  * @return outputFormat
  */
  @JsonProperty("output_format")
  public BulkOutputFormat getOutputFormat() {
    return outputFormat;
  }

  /**
   * Sets the <code>outputFormat</code> property.
   */
 public void setOutputFormat(BulkOutputFormat outputFormat) {
    this.outputFormat = outputFormat;
  }

  /**
   * Sets the <code>outputFormat</code> property.
   */
  public BulkDownloadRequest outputFormat(BulkOutputFormat outputFormat) {
    this.outputFormat = outputFormat;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

