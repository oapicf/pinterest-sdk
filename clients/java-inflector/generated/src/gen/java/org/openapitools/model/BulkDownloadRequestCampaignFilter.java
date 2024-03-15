package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignSummaryStatus;
import org.openapitools.model.ObjectiveType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-03-14T23:01:39.171456580Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BulkDownloadRequestCampaignFilter   {
  @JsonProperty("start_time")
  private String startTime;

  @JsonProperty("end_time")
  private String endTime;

  @JsonProperty("name")
  private String name;

  @JsonProperty("campaign_status")
  private List<CampaignSummaryStatus> campaignStatus = null;

  @JsonProperty("objective_type")
  private List<ObjectiveType> objectiveType = null;

  /**
   * Unix UTC timestamp.
   **/
  public BulkDownloadRequestCampaignFilter startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  
  @ApiModelProperty(example = "1622848072", value = "Unix UTC timestamp.")
  @JsonProperty("start_time")
  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  /**
   * Unix UTC timestamp.
   **/
  public BulkDownloadRequestCampaignFilter endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  
  @ApiModelProperty(example = "1622848072", value = "Unix UTC timestamp.")
  @JsonProperty("end_time")
  public String getEndTime() {
    return endTime;
  }
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  /**
   * Campaign name
   **/
  public BulkDownloadRequestCampaignFilter name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "campaign name", value = "Campaign name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public BulkDownloadRequestCampaignFilter campaignStatus(List<CampaignSummaryStatus> campaignStatus) {
    this.campaignStatus = campaignStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("campaign_status")
  public List<CampaignSummaryStatus> getCampaignStatus() {
    return campaignStatus;
  }
  public void setCampaignStatus(List<CampaignSummaryStatus> campaignStatus) {
    this.campaignStatus = campaignStatus;
  }

  /**
   **/
  public BulkDownloadRequestCampaignFilter objectiveType(List<ObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("objective_type")
  public List<ObjectiveType> getObjectiveType() {
    return objectiveType;
  }
  public void setObjectiveType(List<ObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
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
    return Objects.equals(startTime, bulkDownloadRequestCampaignFilter.startTime) &&
        Objects.equals(endTime, bulkDownloadRequestCampaignFilter.endTime) &&
        Objects.equals(name, bulkDownloadRequestCampaignFilter.name) &&
        Objects.equals(campaignStatus, bulkDownloadRequestCampaignFilter.campaignStatus) &&
        Objects.equals(objectiveType, bulkDownloadRequestCampaignFilter.objectiveType);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

