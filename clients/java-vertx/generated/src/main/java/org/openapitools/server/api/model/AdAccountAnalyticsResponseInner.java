package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdAccountAnalyticsResponseInner extends HashMap<String, Object>  {
  
  private String AD_ACCOUNT_ID;
  private LocalDate DATE;

  public AdAccountAnalyticsResponseInner () {

  }

  public AdAccountAnalyticsResponseInner (String AD_ACCOUNT_ID, LocalDate DATE) {
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
    AdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner = (AdAccountAnalyticsResponseInner) o;
    return super.equals(o) && Objects.equals(AD_ACCOUNT_ID, adAccountAnalyticsResponseInner.AD_ACCOUNT_ID) &&
        Objects.equals(DATE, adAccountAnalyticsResponseInner.DATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), AD_ACCOUNT_ID, super.hashCode(), DATE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountAnalyticsResponseInner {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
