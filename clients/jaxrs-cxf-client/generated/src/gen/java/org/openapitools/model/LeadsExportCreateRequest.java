package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LeadsExportCreateRequest  {
  
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Export leads collected on and after start date (UTC). Format: YYYY-MM-DD")
 /**
   * Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
  **/
  private String startDate;

  @ApiModelProperty(example = "2020-12-20", required = true, value = "Export leads collected on and before end date (UTC). Format: YYYY-MM-DD")
 /**
   * Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
  **/
  private String endDate;

  @ApiModelProperty(example = "687201361754", required = true, value = "ID for the ad collecting leads")
 /**
   * ID for the ad collecting leads
  **/
  private String adId;
 /**
   * Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
   * @return startDate
  **/
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public LeadsExportCreateRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
   * Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
   * @return endDate
  **/
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public LeadsExportCreateRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * ID for the ad collecting leads
   * @return adId
  **/
  @JsonProperty("ad_id")
  public String getAdId() {
    return adId;
  }

  public void setAdId(String adId) {
    this.adId = adId;
  }

  public LeadsExportCreateRequest adId(String adId) {
    this.adId = adId;
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
    LeadsExportCreateRequest leadsExportCreateRequest = (LeadsExportCreateRequest) o;
    return Objects.equals(this.startDate, leadsExportCreateRequest.startDate) &&
        Objects.equals(this.endDate, leadsExportCreateRequest.endDate) &&
        Objects.equals(this.adId, leadsExportCreateRequest.adId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate, adId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadsExportCreateRequest {\n");
    
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
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

