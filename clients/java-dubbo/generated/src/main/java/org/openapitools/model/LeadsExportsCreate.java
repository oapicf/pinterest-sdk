package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create operation model.
 */
public class LeadsExportsCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * ID for the ad collecting leads.
   */
  @JsonProperty("ad_id")
  private String adId;

  /**
   * Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.
   */
  @JsonProperty("end_date")
  private String endDate;

  /**
   * Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.
   */
  @JsonProperty("start_date")
  private String startDate;

  /**
   * ID for the ad collecting leads.
   * @return adId
   */
  public String getAdId() {
    return adId;
  }

  public void setAdId(String adId) {
    this.adId = adId;
  }

  /**
   * Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.
   * @return endDate
   */
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.
   * @return startDate
   */
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
