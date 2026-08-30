package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdsAnalytics   {
  
  private String AD_ID;
  private LocalDate DATE;

  public AdsAnalytics () {

  }

  public AdsAnalytics (String AD_ID, LocalDate DATE) {
    this.AD_ID = AD_ID;
    this.DATE = DATE;
  }

    
  @JsonProperty("AD_ID")
  public String getADID() {
    return AD_ID;
  }
  public void setADID(String AD_ID) {
    this.AD_ID = AD_ID;
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
    AdsAnalytics adsAnalytics = (AdsAnalytics) o;
    return Objects.equals(AD_ID, adsAnalytics.AD_ID) &&
        Objects.equals(DATE, adsAnalytics.DATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AD_ID, DATE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsAnalytics {\n");
    
    sb.append("    AD_ID: ").append(toIndentedString(AD_ID)).append("\n");
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
