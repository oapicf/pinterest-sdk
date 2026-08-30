package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Resource create operation model.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkDownloadCreate   {
  
  private BulkDownloadCampaignFilter campaignFilter;
  private List<@Pattern(regexp = "^\\d+$")String> entityIds = new ArrayList<>();
  private List<BulkEntityType> entityTypes = new ArrayList<>();
  private BulkOutputFormat outputFormat;
  private String updatedSince;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("campaign_filter")
  public BulkDownloadCampaignFilter getCampaignFilter() {
    return campaignFilter;
  }
  public void setCampaignFilter(BulkDownloadCampaignFilter campaignFilter) {
    this.campaignFilter = campaignFilter;
  }

  /**
   * All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
   **/
  
  @ApiModelProperty(value = "All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.")
  @JsonProperty("entity_ids")
  public List<@Pattern(regexp = "^\\d+$")String> getEntityIds() {
    return entityIds;
  }
  public void setEntityIds(List<@Pattern(regexp = "^\\d+$")String> entityIds) {
    this.entityIds = entityIds;
  }

  /**
   * All entity types specified will be downloaded. Fewer types result in faster downloads.
   **/
  
  @ApiModelProperty(example = "[\"CAMPAIGN\",\"AD_GROUP\"]", value = "All entity types specified will be downloaded. Fewer types result in faster downloads.")
  @JsonProperty("entity_types")
 @Size(min=1,max=6)  public List<BulkEntityType> getEntityTypes() {
    return entityTypes;
  }
  public void setEntityTypes(List<BulkEntityType> entityTypes) {
    this.entityTypes = entityTypes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("output_format")
  public BulkOutputFormat getOutputFormat() {
    return outputFormat;
  }
  public void setOutputFormat(BulkOutputFormat outputFormat) {
    this.outputFormat = outputFormat;
  }

  /**
   * Unix UTC timestamp to retrieve all entities that have changed since this time.
   **/
  
  @ApiModelProperty(example = "1622848072", value = "Unix UTC timestamp to retrieve all entities that have changed since this time.")
  @JsonProperty("updated_since")
 @Pattern(regexp="^\\d+$")  public String getUpdatedSince() {
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

