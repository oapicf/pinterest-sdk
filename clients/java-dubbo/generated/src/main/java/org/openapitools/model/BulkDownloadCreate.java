package org.openapitools.model;

import org.openapitools.model.BulkDownloadCampaignFilter;
import org.openapitools.model.BulkEntityType;
import org.openapitools.model.BulkOutputFormat;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create operation model.
 */
public class BulkDownloadCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("campaign_filter")
  private BulkDownloadCampaignFilter campaignFilter;

  /**
   * All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
   */
  @JsonProperty("entity_ids")
  private List<String> entityIds = new ArrayList<>();

  /**
   * All entity types specified will be downloaded. Fewer types result in faster downloads.
   */
  @JsonProperty("entity_types")
  private List<BulkEntityType> entityTypes = new ArrayList<>();

  @JsonProperty("output_format")
  private BulkOutputFormat outputFormat;

  /**
   * Unix UTC timestamp to retrieve all entities that have changed since this time.
   */
  @JsonProperty("updated_since")
  private String updatedSince;

  /**
   * 
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
  public List<String> getEntityIds() {
    return entityIds;
  }

  public void setEntityIds(List<String> entityIds) {
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
   * 
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
