package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-31T04:55:11.834541491Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AdPinAnalytics extends HashMap<String, Object>  {
  
  private Date DATE;
  private String PIN_ID;

  /**
   * Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
   **/
  
  @ApiModelProperty(value = "Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)")
  @JsonProperty("DATE")
  public Date getDATE() {
    return DATE;
  }
  public void setDATE(Date DATE) {
    this.DATE = DATE;
  }

  /**
   * The ID of the pin that the metric belongs to.
   **/
  
  @ApiModelProperty(required = true, value = "The ID of the pin that the metric belongs to.")
  @JsonProperty("PIN_ID")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getPINID() {
    return PIN_ID;
  }
  public void setPINID(String PIN_ID) {
    this.PIN_ID = PIN_ID;
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
    return super.equals(o) && Objects.equals(this.DATE, adPinAnalytics.DATE) &&
        Objects.equals(this.PIN_ID, adPinAnalytics.PIN_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), DATE, super.hashCode(), PIN_ID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdPinAnalytics {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
    sb.append("    PIN_ID: ").append(toIndentedString(PIN_ID)).append("\n");
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

