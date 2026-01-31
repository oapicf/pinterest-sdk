package apimodels;

import apimodels.CampaignSummaryStatus;
import apimodels.ObjectiveType;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * BulkDownloadRequestCampaignFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BulkDownloadRequestCampaignFilter   {
  @JsonProperty("campaign_status")
  @Valid

  private List<CampaignSummaryStatus> campaignStatus = null;

  @JsonProperty("end_time")
  @Pattern(regexp="^\\d+$")

  private String endTime;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("objective_type")
  @Valid

  private List<ObjectiveType> objectiveType = null;

  @JsonProperty("start_time")
  @Pattern(regexp="^\\d+$")

  private String startTime;

  public BulkDownloadRequestCampaignFilter campaignStatus(List<CampaignSummaryStatus> campaignStatus) {
    this.campaignStatus = campaignStatus;
    return this;
  }

  public BulkDownloadRequestCampaignFilter addCampaignStatusItem(CampaignSummaryStatus campaignStatusItem) {
    if (this.campaignStatus == null) {
      this.campaignStatus = new ArrayList<>();
    }
    this.campaignStatus.add(campaignStatusItem);
    return this;
  }

   /**
   * Get campaignStatus
   * @return campaignStatus
  **/
  public List<CampaignSummaryStatus> getCampaignStatus() {
    return campaignStatus;
  }

  public void setCampaignStatus(List<CampaignSummaryStatus> campaignStatus) {
    this.campaignStatus = campaignStatus;
  }

  public BulkDownloadRequestCampaignFilter endTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Unix UTC timestamp.
   * @return endTime
  **/
  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public BulkDownloadRequestCampaignFilter name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Campaign name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BulkDownloadRequestCampaignFilter objectiveType(List<ObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  public BulkDownloadRequestCampaignFilter addObjectiveTypeItem(ObjectiveType objectiveTypeItem) {
    if (this.objectiveType == null) {
      this.objectiveType = new ArrayList<>();
    }
    this.objectiveType.add(objectiveTypeItem);
    return this;
  }

   /**
   * Get objectiveType
   * @return objectiveType
  **/
  public List<ObjectiveType> getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(List<ObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
  }

  public BulkDownloadRequestCampaignFilter startTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Unix UTC timestamp.
   * @return startTime
  **/
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
    BulkDownloadRequestCampaignFilter bulkDownloadRequestCampaignFilter = (BulkDownloadRequestCampaignFilter) o;
    return Objects.equals(campaignStatus, bulkDownloadRequestCampaignFilter.campaignStatus) &&
        Objects.equals(endTime, bulkDownloadRequestCampaignFilter.endTime) &&
        Objects.equals(name, bulkDownloadRequestCampaignFilter.name) &&
        Objects.equals(objectiveType, bulkDownloadRequestCampaignFilter.objectiveType) &&
        Objects.equals(startTime, bulkDownloadRequestCampaignFilter.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignStatus, endTime, name, objectiveType, startTime);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkDownloadRequestCampaignFilter {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

