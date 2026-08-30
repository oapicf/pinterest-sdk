package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdAccountAnalyticsItems   {
  
  private String AD_ACCOUNT_ID;
  private LocalDate DATE;

  public AdAccountAnalyticsItems () {

  }

  public AdAccountAnalyticsItems (String AD_ACCOUNT_ID, LocalDate DATE) {
    this.AD_ACCOUNT_ID = AD_ACCOUNT_ID;
    this.DATE = DATE;
  }

    
  @JsonProperty("AD_ACCOUNT_ID")
  public String getADACCOUNTID() {
    return AD_ACCOUNT_ID;
  }
  public void setADACCOUNTID(String AD_ACCOUNT_ID) {
    this.AD_ACCOUNT_ID = AD_ACCOUNT_ID;
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
    AdAccountAnalyticsItems adAccountAnalyticsItems = (AdAccountAnalyticsItems) o;
    return Objects.equals(AD_ACCOUNT_ID, adAccountAnalyticsItems.AD_ACCOUNT_ID) &&
        Objects.equals(DATE, adAccountAnalyticsItems.DATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AD_ACCOUNT_ID, DATE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountAnalyticsItems {\n");
    
    sb.append("    AD_ACCOUNT_ID: ").append(toIndentedString(AD_ACCOUNT_ID)).append("\n");
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
