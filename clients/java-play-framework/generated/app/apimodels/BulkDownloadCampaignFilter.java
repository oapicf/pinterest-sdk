package apimodels;

import apimodels.ConversionObjectiveType;
import apimodels.SummaryStatus;
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
 * BulkDownloadCampaignFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BulkDownloadCampaignFilter   {
  @JsonProperty("campaign_status")
  @Valid

  private List<SummaryStatus> campaignStatus = null;

  @JsonProperty("end_time")
  @Pattern(regexp="^\\d+$")

  private String endTime;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("objective_type")
  @Valid

  private List<ConversionObjectiveType> objectiveType = null;

  @JsonProperty("start_time")
  @Pattern(regexp="^\\d+$")

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
  **/
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
  **/
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
  **/
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
  **/
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
    BulkDownloadCampaignFilter bulkDownloadCampaignFilter = (BulkDownloadCampaignFilter) o;
    return Objects.equals(campaignStatus, bulkDownloadCampaignFilter.campaignStatus) &&
        Objects.equals(endTime, bulkDownloadCampaignFilter.endTime) &&
        Objects.equals(name, bulkDownloadCampaignFilter.name) &&
        Objects.equals(objectiveType, bulkDownloadCampaignFilter.objectiveType) &&
        Objects.equals(startTime, bulkDownloadCampaignFilter.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignStatus, endTime, name, objectiveType, startTime);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

