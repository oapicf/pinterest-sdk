package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BulkDownloadRequestCampaignFilter;
import org.openapitools.model.BulkEntityType;
import org.openapitools.model.BulkOutputFormat;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Ad entities to get in bulk request.
 **/
@ApiModel(description = "Ad entities to get in bulk request.")
@JsonTypeName("BulkDownloadRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BulkDownloadRequest   {
  private @Valid List<BulkEntityType> entityTypes;
  private @Valid List<@Pattern(regexp = "^\\d+$")String> entityIds;
  private @Valid String updatedSince;
  private @Valid BulkDownloadRequestCampaignFilter campaignFilter;
  private @Valid BulkOutputFormat outputFormat = "JSON";

  /**
   * All entity types specified will be downloaded. Fewer types result in faster downloads.
   **/
  public BulkDownloadRequest entityTypes(List<BulkEntityType> entityTypes) {
    this.entityTypes = entityTypes;
    return this;
  }

  
  @ApiModelProperty(example = "[\"CAMPAIGN\",\"AD_GROUP\"]", value = "All entity types specified will be downloaded. Fewer types result in faster downloads.")
  @JsonProperty("entity_types")
 @Size(min=1,max=5)  public List<BulkEntityType> getEntityTypes() {
    return entityTypes;
  }

  @JsonProperty("entity_types")
  public void setEntityTypes(List<BulkEntityType> entityTypes) {
    this.entityTypes = entityTypes;
  }

  public BulkDownloadRequest addEntityTypesItem(BulkEntityType entityTypesItem) {
    if (this.entityTypes == null) {
      this.entityTypes = new ArrayList<>();
    }

    this.entityTypes.add(entityTypesItem);
    return this;
  }

  public BulkDownloadRequest removeEntityTypesItem(BulkEntityType entityTypesItem) {
    if (entityTypesItem != null && this.entityTypes != null) {
      this.entityTypes.remove(entityTypesItem);
    }

    return this;
  }
  /**
   * All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
   **/
  public BulkDownloadRequest entityIds(List<@Pattern(regexp = "^\\d+$")String> entityIds) {
    this.entityIds = entityIds;
    return this;
  }

  
  @ApiModelProperty(value = "All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.")
  @JsonProperty("entity_ids")
  public List< @Pattern(regexp="^\\d+$")String> getEntityIds() {
    return entityIds;
  }

  @JsonProperty("entity_ids")
  public void setEntityIds(List<@Pattern(regexp = "^\\d+$")String> entityIds) {
    this.entityIds = entityIds;
  }

  public BulkDownloadRequest addEntityIdsItem(String entityIdsItem) {
    if (this.entityIds == null) {
      this.entityIds = new ArrayList<>();
    }

    this.entityIds.add(entityIdsItem);
    return this;
  }

  public BulkDownloadRequest removeEntityIdsItem(String entityIdsItem) {
    if (entityIdsItem != null && this.entityIds != null) {
      this.entityIds.remove(entityIdsItem);
    }

    return this;
  }
  /**
   * Unix UTC timestamp to retrieve all entities that have changed since this time.
   **/
  public BulkDownloadRequest updatedSince(String updatedSince) {
    this.updatedSince = updatedSince;
    return this;
  }

  
  @ApiModelProperty(example = "1622848072", value = "Unix UTC timestamp to retrieve all entities that have changed since this time.")
  @JsonProperty("updated_since")
 @Pattern(regexp="^\\d+$")  public String getUpdatedSince() {
    return updatedSince;
  }

  @JsonProperty("updated_since")
  public void setUpdatedSince(String updatedSince) {
    this.updatedSince = updatedSince;
  }

  /**
   **/
  public BulkDownloadRequest campaignFilter(BulkDownloadRequestCampaignFilter campaignFilter) {
    this.campaignFilter = campaignFilter;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("campaign_filter")
  public BulkDownloadRequestCampaignFilter getCampaignFilter() {
    return campaignFilter;
  }

  @JsonProperty("campaign_filter")
  public void setCampaignFilter(BulkDownloadRequestCampaignFilter campaignFilter) {
    this.campaignFilter = campaignFilter;
  }

  /**
   **/
  public BulkDownloadRequest outputFormat(BulkOutputFormat outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("output_format")
  public BulkOutputFormat getOutputFormat() {
    return outputFormat;
  }

  @JsonProperty("output_format")
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

