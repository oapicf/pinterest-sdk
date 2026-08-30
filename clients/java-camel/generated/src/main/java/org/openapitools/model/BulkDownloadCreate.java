package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BulkDownloadCampaignFilter;
import org.openapitools.model.BulkEntityType;
import org.openapitools.model.BulkOutputFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "BulkDownloadCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkDownloadCreate {

  private BulkDownloadCampaignFilter campaignFilter;

  @Valid
  private List<@Pattern(regexp = "^\\d+$")String> entityIds = new ArrayList<>();

  @Valid
  private List<BulkEntityType> entityTypes = new ArrayList<>();

  private BulkOutputFormat outputFormat;

  private String updatedSince;

  public BulkDownloadCreate campaignFilter(BulkDownloadCampaignFilter campaignFilter) {
    this.campaignFilter = campaignFilter;
    return this;
  }

  /**
   * Get campaignFilter
   * @return campaignFilter
   */
  @Valid 
  @Schema(name = "campaign_filter", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campaign_filter")
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
   */
  
  @Schema(name = "entity_ids", description = "All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entity_ids")
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
   */
  @Valid @Size(min = 1, max = 6) 
  @Schema(name = "entity_types", example = "[\"CAMPAIGN\",\"AD_GROUP\"]", description = "All entity types specified will be downloaded. Fewer types result in faster downloads.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("entity_types")
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
   */
  @Valid 
  @Schema(name = "output_format", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("output_format")
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
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "updated_since", example = "1622848072", description = "Unix UTC timestamp to retrieve all entities that have changed since this time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_since")
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

