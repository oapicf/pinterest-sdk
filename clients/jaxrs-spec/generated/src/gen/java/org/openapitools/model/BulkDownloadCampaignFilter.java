package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ConversionObjectiveType;
import org.openapitools.model.SummaryStatus;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("BulkDownloadCampaignFilter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BulkDownloadCampaignFilter   {
  private @Valid List<SummaryStatus> campaignStatus = new ArrayList<>();
  private String endTime;
  private String name;
  private @Valid List<ConversionObjectiveType> objectiveType = new ArrayList<>();
  private String startTime;

  public BulkDownloadCampaignFilter() {
  }

  /**
   **/
  public BulkDownloadCampaignFilter campaignStatus(List<SummaryStatus> campaignStatus) {
    this.campaignStatus = campaignStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("campaign_status")
  public List<SummaryStatus> getCampaignStatus() {
    return campaignStatus;
  }

  @JsonProperty("campaign_status")
  public void setCampaignStatus(List<SummaryStatus> campaignStatus) {
    this.campaignStatus = campaignStatus;
  }

  public BulkDownloadCampaignFilter addCampaignStatusItem(SummaryStatus campaignStatusItem) {
    if (this.campaignStatus == null) {
      this.campaignStatus = new ArrayList<>();
    }

    this.campaignStatus.add(campaignStatusItem);
    return this;
  }

  public BulkDownloadCampaignFilter removeCampaignStatusItem(SummaryStatus campaignStatusItem) {
    if (campaignStatusItem != null && this.campaignStatus != null) {
      this.campaignStatus.remove(campaignStatusItem);
    }

    return this;
  }
  /**
   * Unix UTC timestamp.
   **/
  public BulkDownloadCampaignFilter endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(example = "1622848072", value = "Unix UTC timestamp.")
  @JsonProperty("end_time")
   @Pattern(regexp="^\\d+$")public String getEndTime() {
    return endTime;
  }

  @JsonProperty("end_time")
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  /**
   * Campaign name
   **/
  public BulkDownloadCampaignFilter name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "campaign name", value = "Campaign name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public BulkDownloadCampaignFilter objectiveType(List<ConversionObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("objective_type")
  public List<ConversionObjectiveType> getObjectiveType() {
    return objectiveType;
  }

  @JsonProperty("objective_type")
  public void setObjectiveType(List<ConversionObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
  }

  public BulkDownloadCampaignFilter addObjectiveTypeItem(ConversionObjectiveType objectiveTypeItem) {
    if (this.objectiveType == null) {
      this.objectiveType = new ArrayList<>();
    }

    this.objectiveType.add(objectiveTypeItem);
    return this;
  }

  public BulkDownloadCampaignFilter removeObjectiveTypeItem(ConversionObjectiveType objectiveTypeItem) {
    if (objectiveTypeItem != null && this.objectiveType != null) {
      this.objectiveType.remove(objectiveTypeItem);
    }

    return this;
  }
  /**
   * Unix UTC timestamp.
   **/
  public BulkDownloadCampaignFilter startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(example = "1622848072", value = "Unix UTC timestamp.")
  @JsonProperty("start_time")
   @Pattern(regexp="^\\d+$")public String getStartTime() {
    return startTime;
  }

  @JsonProperty("start_time")
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
