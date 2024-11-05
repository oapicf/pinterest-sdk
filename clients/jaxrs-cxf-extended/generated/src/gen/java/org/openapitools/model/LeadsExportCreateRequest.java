package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LeadsExportCreateRequest  {
  
 /**
  * Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
  */
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Export leads collected on and after start date (UTC). Format: YYYY-MM-DD")
  private String startDate;

 /**
  * Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
  */
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Export leads collected on and before end date (UTC). Format: YYYY-MM-DD")
  private String endDate;

 /**
  * ID for the ad collecting leads
  */
  @ApiModelProperty(example = "687201361754", required = true, value = "ID for the ad collecting leads")
  private String adId;
 /**
  * Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
  * @return startDate
  */
  @JsonProperty("start_date")
  @NotNull
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getStartDate() {
    return startDate;
  }

  /**
   * Sets the <code>startDate</code> property.
   */
 public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  /**
   * Sets the <code>startDate</code> property.
   */
  public LeadsExportCreateRequest startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

 /**
  * Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
  * @return endDate
  */
  @JsonProperty("end_date")
  @NotNull
 @Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")  public String getEndDate() {
    return endDate;
  }

  /**
   * Sets the <code>endDate</code> property.
   */
 public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * Sets the <code>endDate</code> property.
   */
  public LeadsExportCreateRequest endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
  * ID for the ad collecting leads
  * @return adId
  */
  @JsonProperty("ad_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getAdId() {
    return adId;
  }

  /**
   * Sets the <code>adId</code> property.
   */
 public void setAdId(String adId) {
    this.adId = adId;
  }

  /**
   * Sets the <code>adId</code> property.
   */
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

