package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConversionObjectiveType;
import com.prokarma.pkmst.model.SummaryStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * BulkDownloadCampaignFilter
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkDownloadCampaignFilter   {
  @JsonProperty("campaign_status")
  
  private List<SummaryStatus> campaignStatus = null;

  @JsonProperty("end_time")
  private String endTime;

  @JsonProperty("name")
  private String name;

  @JsonProperty("objective_type")
  
  private List<ConversionObjectiveType> objectiveType = null;

  @JsonProperty("start_time")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(example = "1622848072", value = "Unix UTC timestamp.")
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
  @ApiModelProperty(example = "campaign name", value = "Campaign name")
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
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(example = "1622848072", value = "Unix UTC timestamp.")
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

