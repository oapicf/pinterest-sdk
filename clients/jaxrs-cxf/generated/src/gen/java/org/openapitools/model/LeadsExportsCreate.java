package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class LeadsExportsCreate  {
  
 /**
  * ID for the ad collecting leads.
  */
  @ApiModelProperty(example = "687201361754", required = true, value = "ID for the ad collecting leads.")

  private String adId;

 /**
  * Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.
  */
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.")

  private String endDate;

 /**
  * Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.
  */
  @ApiModelProperty(example = "2020-12-20", required = true, value = "Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.")

  private String startDate;
 /**
   * ID for the ad collecting leads.
   * @return adId
  **/
  @JsonProperty("ad_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getAdId() {
    return adId;
  }

  public void setAdId(String adId) {
    this.adId = adId;
  }

  public LeadsExportsCreate adId(String adId) {
    this.adId = adId;
    return this;
  }

 /**
   * Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.
   * @return endDate
  **/
  @JsonProperty("end_date")
  @NotNull
 @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public LeadsExportsCreate endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.
   * @return startDate
  **/
  @JsonProperty("start_date")
  @NotNull
 @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public LeadsExportsCreate startDate(String startDate) {
    this.startDate = startDate;
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
    LeadsExportsCreate leadsExportsCreate = (LeadsExportsCreate) o;
    return Objects.equals(this.adId, leadsExportsCreate.adId) &&
        Objects.equals(this.endDate, leadsExportsCreate.endDate) &&
        Objects.equals(this.startDate, leadsExportsCreate.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, endDate, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeadsExportsCreate {\n");
    
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

