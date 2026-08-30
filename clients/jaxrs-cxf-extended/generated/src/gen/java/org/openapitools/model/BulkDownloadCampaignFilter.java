package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConversionObjectiveType;
import org.openapitools.model.SummaryStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BulkDownloadCampaignFilter  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<SummaryStatus> campaignStatus = new ArrayList<>();

 /**
  * Unix UTC timestamp.
  */
  @ApiModelProperty(example = "1622848072", value = "Unix UTC timestamp.")
  private String endTime;

 /**
  * Campaign name
  */
  @ApiModelProperty(example = "campaign name", value = "Campaign name")
  private String name;

  @ApiModelProperty(value = "")
  @Valid
  private List<ConversionObjectiveType> objectiveType = new ArrayList<>();

 /**
  * Unix UTC timestamp.
  */
  @ApiModelProperty(example = "1622848072", value = "Unix UTC timestamp.")
  private String startTime;
 /**
  * Get campaignStatus
  * @return campaignStatus
  */
  @JsonProperty("campaign_status")
  public List<SummaryStatus> getCampaignStatus() {
    return campaignStatus;
  }

  /**
   * Sets the <code>campaignStatus</code> property.
   */
 public void setCampaignStatus(List<SummaryStatus> campaignStatus) {
    this.campaignStatus = campaignStatus;
  }

  /**
   * Sets the <code>campaignStatus</code> property.
   */
  public BulkDownloadCampaignFilter campaignStatus(List<SummaryStatus> campaignStatus) {
    this.campaignStatus = campaignStatus;
    return this;
  }

  /**
   * Adds a new item to the <code>campaignStatus</code> list.
   */
  public BulkDownloadCampaignFilter addCampaignStatusItem(SummaryStatus campaignStatusItem) {
    this.campaignStatus.add(campaignStatusItem);
    return this;
  }

 /**
  * Unix UTC timestamp.
  * @return endTime
  */
  @JsonProperty("end_time")
 @Pattern(regexp="^\\d+$")  public String getEndTime() {
    return endTime;
  }

  /**
   * Sets the <code>endTime</code> property.
   */
 public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  /**
   * Sets the <code>endTime</code> property.
   */
  public BulkDownloadCampaignFilter endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

 /**
  * Campaign name
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public BulkDownloadCampaignFilter name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get objectiveType
  * @return objectiveType
  */
  @JsonProperty("objective_type")
  public List<ConversionObjectiveType> getObjectiveType() {
    return objectiveType;
  }

  /**
   * Sets the <code>objectiveType</code> property.
   */
 public void setObjectiveType(List<ConversionObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
  }

  /**
   * Sets the <code>objectiveType</code> property.
   */
  public BulkDownloadCampaignFilter objectiveType(List<ConversionObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  /**
   * Adds a new item to the <code>objectiveType</code> list.
   */
  public BulkDownloadCampaignFilter addObjectiveTypeItem(ConversionObjectiveType objectiveTypeItem) {
    this.objectiveType.add(objectiveTypeItem);
    return this;
  }

 /**
  * Unix UTC timestamp.
  * @return startTime
  */
  @JsonProperty("start_time")
 @Pattern(regexp="^\\d+$")  public String getStartTime() {
    return startTime;
  }

  /**
   * Sets the <code>startTime</code> property.
   */
 public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  /**
   * Sets the <code>startTime</code> property.
   */
  public BulkDownloadCampaignFilter startTime(String startTime) {
    this.startTime = startTime;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

