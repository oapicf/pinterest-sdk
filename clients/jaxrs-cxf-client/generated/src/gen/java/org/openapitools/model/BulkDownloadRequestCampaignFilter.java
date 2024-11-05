package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignSummaryStatus;
import org.openapitools.model.ObjectiveType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BulkDownloadRequestCampaignFilter  {
  
  @ApiModelProperty(example = "1622848072", value = "Unix UTC timestamp.")
 /**
   * Unix UTC timestamp.
  **/
  private String startTime;

  @ApiModelProperty(example = "1622848072", value = "Unix UTC timestamp.")
 /**
   * Unix UTC timestamp.
  **/
  private String endTime;

  @ApiModelProperty(example = "campaign name", value = "Campaign name")
 /**
   * Campaign name
  **/
  private String name;

  @ApiModelProperty(value = "")
  private List<CampaignSummaryStatus> campaignStatus = new ArrayList<>();

  @ApiModelProperty(value = "")
  private List<ObjectiveType> objectiveType = new ArrayList<>();
 /**
   * Unix UTC timestamp.
   * @return startTime
  **/
  @JsonProperty("start_time")
  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public BulkDownloadRequestCampaignFilter startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

 /**
   * Unix UTC timestamp.
   * @return endTime
  **/
  @JsonProperty("end_time")
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public BulkDownloadRequestCampaignFilter endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

 /**
   * Campaign name
   * @return name
  **/
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BulkDownloadRequestCampaignFilter name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get campaignStatus
   * @return campaignStatus
  **/
  @JsonProperty("campaign_status")
  public List<CampaignSummaryStatus> getCampaignStatus() {
    return campaignStatus;
  }

  public void setCampaignStatus(List<CampaignSummaryStatus> campaignStatus) {
    this.campaignStatus = campaignStatus;
  }

  public BulkDownloadRequestCampaignFilter campaignStatus(List<CampaignSummaryStatus> campaignStatus) {
    this.campaignStatus = campaignStatus;
    return this;
  }

  public BulkDownloadRequestCampaignFilter addCampaignStatusItem(CampaignSummaryStatus campaignStatusItem) {
    this.campaignStatus.add(campaignStatusItem);
    return this;
  }

 /**
   * Get objectiveType
   * @return objectiveType
  **/
  @JsonProperty("objective_type")
  public List<ObjectiveType> getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(List<ObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
  }

  public BulkDownloadRequestCampaignFilter objectiveType(List<ObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  public BulkDownloadRequestCampaignFilter addObjectiveTypeItem(ObjectiveType objectiveTypeItem) {
    this.objectiveType.add(objectiveTypeItem);
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
    BulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter = (BulkDownloadRequestCampaignFilter) o;
    return Objects.equals(this.startTime, bulkDownloadRequestCampaignFilter.startTime) &&
        Objects.equals(this.endTime, bulkDownloadRequestCampaignFilter.endTime) &&
        Objects.equals(this.name, bulkDownloadRequestCampaignFilter.name) &&
        Objects.equals(this.campaignStatus, bulkDownloadRequestCampaignFilter.campaignStatus) &&
        Objects.equals(this.objectiveType, bulkDownloadRequestCampaignFilter.objectiveType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, name, campaignStatus, objectiveType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkDownloadRequestCampaignFilter {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    campaignStatus: ").append(toIndentedString(campaignStatus)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
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

