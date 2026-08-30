package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConversionObjectiveType;
import org.openapitools.model.SummaryStatus;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BulkDownloadCampaignFilter
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkDownloadCampaignFilter {

  @Valid
  private List<SummaryStatus> campaignStatus = new ArrayList<>();

  private String endTime;

  private String name;

  @Valid
  private List<ConversionObjectiveType> objectiveType = new ArrayList<>();

  private String startTime;

  public BulkDownloadCampaignFilter campaignStatus(List<SummaryStatus> campaignStatus) {
    this.campaignStatus = campaignStatus;
    return this;
  }

  public BulkDownloadCampaignFilter addCampaignStatusItem(SummaryStatus campaignStatusItem) {
    if (this.campaignStatus == null) {
      this.campaignStatus = new ArrayList<>();
    }
    this.campaignStatus.add(campaignStatusItem);
    return this;
  }

  /**
   * Get campaignStatus
   * @return campaignStatus
   */
  @Valid 
  @Schema(name = "campaign_status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campaign_status")
  public List<SummaryStatus> getCampaignStatus() {
    return campaignStatus;
  }

  public void setCampaignStatus(List<SummaryStatus> campaignStatus) {
    this.campaignStatus = campaignStatus;
  }

  public BulkDownloadCampaignFilter endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Unix UTC timestamp.
   * @return endTime
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "end_time", example = "1622848072", description = "Unix UTC timestamp.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_time")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public BulkDownloadCampaignFilter name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Campaign name
   * @return name
   */
  
  @Schema(name = "name", example = "campaign name", description = "Campaign name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BulkDownloadCampaignFilter objectiveType(List<ConversionObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  public BulkDownloadCampaignFilter addObjectiveTypeItem(ConversionObjectiveType objectiveTypeItem) {
    if (this.objectiveType == null) {
      this.objectiveType = new ArrayList<>();
    }
    this.objectiveType.add(objectiveTypeItem);
    return this;
  }

  /**
   * Get objectiveType
   * @return objectiveType
   */
  @Valid 
  @Schema(name = "objective_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("objective_type")
  public List<ConversionObjectiveType> getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(List<ConversionObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
  }

  public BulkDownloadCampaignFilter startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Unix UTC timestamp.
   * @return startTime
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "start_time", example = "1622848072", description = "Unix UTC timestamp.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_time")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkDownloadCampaignFilter bulkDownloadCampaignFilter = (BulkDownloadCampaignFilter) o;
    return Objects.equals(this.campaignStatus, bulkDownloadCampaignFilter.campaignStatus) &&
        Objects.equals(this.endTime, bulkDownloadCampaignFilter.endTime) &&
        Objects.equals(this.name, bulkDownloadCampaignFilter.name) &&
        Objects.equals(this.objectiveType, bulkDownloadCampaignFilter.objectiveType) &&
        Objects.equals(this.startTime, bulkDownloadCampaignFilter.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignStatus, endTime, name, objectiveType, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkDownloadCampaignFilter {\n");
    sb.append("    campaignStatus: ").append(toIndentedString(campaignStatus)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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

