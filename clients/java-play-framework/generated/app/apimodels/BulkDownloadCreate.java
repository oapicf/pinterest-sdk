package apimodels;

import apimodels.BulkDownloadCampaignFilter;
import apimodels.BulkEntityType;
import apimodels.BulkOutputFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Resource create operation model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BulkDownloadCreate   {
  @JsonProperty("campaign_filter")
  @Valid

  private BulkDownloadCampaignFilter campaignFilter;

  @JsonProperty("entity_ids")
  
  private List<@Pattern(regexp = "^\\d+$")String> entityIds = null;

  @JsonProperty("entity_types")
  @Size(min=1,max=6)
@Valid

  private List<BulkEntityType> entityTypes = null;

  @JsonProperty("output_format")
  @Valid

  private BulkOutputFormat outputFormat;

  @JsonProperty("updated_since")
  @Pattern(regexp="^\\d+$")

  private String updatedSince;

  public BulkDownloadCreate campaignFilter(BulkDownloadCampaignFilter campaignFilter) {
    this.campaignFilter = campaignFilter;
    return this;
  }

   /**
   * Get campaignFilter
   * @return campaignFilter
  **/
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
    return Objects.equals(campaignFilter, bulkDownloadCreate.campaignFilter) &&
        Objects.equals(entityIds, bulkDownloadCreate.entityIds) &&
        Objects.equals(entityTypes, bulkDownloadCreate.entityTypes) &&
        Objects.equals(outputFormat, bulkDownloadCreate.outputFormat) &&
        Objects.equals(updatedSince, bulkDownloadCreate.updatedSince);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignFilter, entityIds, entityTypes, outputFormat, updatedSince);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

