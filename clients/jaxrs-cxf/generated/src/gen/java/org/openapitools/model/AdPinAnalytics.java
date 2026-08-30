package org.openapitools.model;

import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdPinAnalytics  {
  
 /**
  * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  */
  @ApiModelProperty(value = "Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)")

  private LocalDate DATE;

 /**
  * The ID of the pin that the metric belongs to.
  */
  @ApiModelProperty(required = true, value = "The ID of the pin that the metric belongs to.")

  private String PIN_ID;
 /**
   * Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
   * @return DATE
  **/
  @JsonProperty("DATE")
  public LocalDate getDATE() {
    return DATE;
  }

  public void setDATE(LocalDate DATE) {
    this.DATE = DATE;
  }

  public AdPinAnalytics DATE(LocalDate DATE) {
    this.DATE = DATE;
    return this;
  }

 /**
   * The ID of the pin that the metric belongs to.
   * @return PIN_ID
  **/
  @JsonProperty("PIN_ID")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getPINID() {
    return PIN_ID;
  }

  public void setPINID(String PIN_ID) {
    this.PIN_ID = PIN_ID;
  }

  public AdPinAnalytics PIN_ID(String PIN_ID) {
    this.PIN_ID = PIN_ID;
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
    AdPinAnalytics adPinAnalytics = (AdPinAnalytics) o;
    return Objects.equals(this.DATE, adPinAnalytics.DATE) &&
        Objects.equals(this.PIN_ID, adPinAnalytics.PIN_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(DATE, PIN_ID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdPinAnalytics {\n");
    
    sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
    sb.append("    PIN_ID: ").append(toIndentedString(PIN_ID)).append("\n");
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

