package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.CampaignSummaryStatus;
import org.openapitools.server.api.model.ObjectiveType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BulkDownloadRequestCampaignFilter   {
  
  private String startTime;
  private String endTime;
  private String name;
  private List<CampaignSummaryStatus> campaignStatus = new ArrayList<>();
  private List<ObjectiveType> objectiveType = new ArrayList<>();

  public BulkDownloadRequestCampaignFilter () {

  }

  public BulkDownloadRequestCampaignFilter (String startTime, String endTime, String name, List<CampaignSummaryStatus> campaignStatus, List<ObjectiveType> objectiveType) {
    this.startTime = startTime;
    this.endTime = endTime;
    this.name = name;
    this.campaignStatus = campaignStatus;
    this.objectiveType = objectiveType;
  }

    
  @JsonProperty("start_time")
  public String getStartTime() {
    return startTime;
  }
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

    
  @JsonProperty("end_time")
  public String getEndTime() {
    return endTime;
  }
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("campaign_status")
  public List<CampaignSummaryStatus> getCampaignStatus() {
    return campaignStatus;
  }
  public void setCampaignStatus(List<CampaignSummaryStatus> campaignStatus) {
    this.campaignStatus = campaignStatus;
  }

    
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
