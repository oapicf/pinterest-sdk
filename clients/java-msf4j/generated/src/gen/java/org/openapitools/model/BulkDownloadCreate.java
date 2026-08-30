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
import org.openapitools.model.BulkDownloadCampaignFilter;
import org.openapitools.model.BulkEntityType;
import org.openapitools.model.BulkOutputFormat;

/**
 * Resource create operation model.
 */
@ApiModel(description = "Resource create operation model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkDownloadCreate   {
  @JsonProperty("campaign_filter")
  private BulkDownloadCampaignFilter campaignFilter;

  @JsonProperty("entity_ids")
  private List<@Pattern(regexp = "^\\d+$")String> entityIds = null;

  @JsonProperty("entity_types")
  private List<BulkEntityType> entityTypes = null;

  @JsonProperty("output_format")
  private BulkOutputFormat outputFormat;

  @JsonProperty("updated_since")
  private String updatedSince;

  public BulkDownloadCreate campaignFilter(BulkDownloadCampaignFilter campaignFilter) {
    this.campaignFilter = campaignFilter;
    return this;
  }

   /**
   * Get campaignFilter
   * @return campaignFilter
  **/
  @ApiModelProperty(value = "")
  public BulkDownloadCampaignFilter getCampaignFilter() {
    return campaignFilter;
  }

  public void setCampaignFilter(BulkDownloadCampaignFilter campaignFilter) {
    this.campaignFilter = campaignFilter;
  }

  public BulkDownloadCreate entityIds(List<@Pattern(regexp = "^\\d+$")String> entityIds) {
    this.entityIds = entityIds;
    return this;
  }

  public BulkDownloadCreate addEntityIdsItem(String entityIdsItem) {
    if (this.entityIds == null) {
      this.entityIds = new ArrayList<>();
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

  public BulkDownloadCreate entityTypes(List<BulkEntityType> entityTypes) {
    this.entityTypes = entityTypes;
    return this;
  }

  public BulkDownloadCreate addEntityTypesItem(BulkEntityType entityTypesItem) {
    if (this.entityTypes == null) {
      this.entityTypes = new ArrayList<>();
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

  public BulkDownloadCreate outputFormat(BulkOutputFormat outputFormat) {
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

  public BulkDownloadCreate updatedSince(String updatedSince) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkDownloadCreate bulkDownloadCreate = (BulkDownloadCreate) o;
    return Objects.equals(this.campaignFilter, bulkDownloadCreate.campaignFilter) &&
        Objects.equals(this.entityIds, bulkDownloadCreate.entityIds) &&
        Objects.equals(this.entityTypes, bulkDownloadCreate.entityTypes) &&
        Objects.equals(this.outputFormat, bulkDownloadCreate.outputFormat) &&
        Objects.equals(this.updatedSince, bulkDownloadCreate.updatedSince);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignFilter, entityIds, entityTypes, outputFormat, updatedSince);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

