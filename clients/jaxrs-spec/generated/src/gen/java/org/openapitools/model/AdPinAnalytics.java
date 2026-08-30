package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("AdPinAnalytics")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdPinAnalytics   {
  private LocalDate DATE;
  private String PIN_ID;

  public AdPinAnalytics() {
  }

  @JsonCreator
  public AdPinAnalytics(
    @JsonProperty(required = true, value = "PIN_ID") String PIN_ID
  ) {
    this.PIN_ID = PIN_ID;
  }

  /**
   * Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
   **/
  public AdPinAnalytics DATE(LocalDate DATE) {
    this.DATE = DATE;
    return this;
  }

  
  @ApiModelProperty(value = "Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)")
  @JsonProperty("DATE")
  public LocalDate getDATE() {
    return DATE;
  }

  @JsonProperty("DATE")
  public void setDATE(LocalDate DATE) {
    this.DATE = DATE;
  }

  /**
   * The ID of the pin that the metric belongs to.
   **/
  public AdPinAnalytics PIN_ID(String PIN_ID) {
    this.PIN_ID = PIN_ID;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the pin that the metric belongs to.")
  @JsonProperty(required = true, value = "PIN_ID")
  @NotNull  @Pattern(regexp="^\\d+$")public String getPINID() {
    return PIN_ID;
  }

  @JsonProperty(required = true, value = "PIN_ID")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
