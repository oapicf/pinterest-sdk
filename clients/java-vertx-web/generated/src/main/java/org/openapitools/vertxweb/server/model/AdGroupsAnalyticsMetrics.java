package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdGroupsAnalyticsMetrics   {
  
  private String AD_GROUP_ID;
  private LocalDate DATE;

  public AdGroupsAnalyticsMetrics () {

  }

  public AdGroupsAnalyticsMetrics (String AD_GROUP_ID, LocalDate DATE) {
    this.AD_GROUP_ID = AD_GROUP_ID;
    this.DATE = DATE;
  }

    
  @JsonProperty("AD_GROUP_ID")
  public String getADGROUPID() {
    return AD_GROUP_ID;
  }
  public void setADGROUPID(String AD_GROUP_ID) {
    this.AD_GROUP_ID = AD_GROUP_ID;
  }

    
  @JsonProperty("DATE")
  public LocalDate getDATE() {
    return DATE;
  }
  public void setDATE(LocalDate DATE) {
    this.DATE = DATE;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdGroupsAnalyticsMetrics adGroupsAnalyticsMetrics = (AdGroupsAnalyticsMetrics) o;
    return Objects.equals(AD_GROUP_ID, adGroupsAnalyticsMetrics.AD_GROUP_ID) &&
        Objects.equals(DATE, adGroupsAnalyticsMetrics.DATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AD_GROUP_ID, DATE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGroupsAnalyticsMetrics {\n");
    
    sb.append("    AD_GROUP_ID: ").append(toIndentedString(AD_GROUP_ID)).append("\n");
    sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
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
