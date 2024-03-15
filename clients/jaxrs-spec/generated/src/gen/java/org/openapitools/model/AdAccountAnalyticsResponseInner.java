package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("AdAccountAnalyticsResponse_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdAccountAnalyticsResponseInner extends HashMap<String, Object>  {
  private @Valid String AD_ACCOUNT_ID;
  private @Valid LocalDate DATE;

  /**
   * The ID of the advertiser that this metrics belongs to.
   **/
  public AdAccountAnalyticsResponseInner AD_ACCOUNT_ID(String AD_ACCOUNT_ID) {
    this.AD_ACCOUNT_ID = AD_ACCOUNT_ID;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The ID of the advertiser that this metrics belongs to.")
  @JsonProperty("AD_ACCOUNT_ID")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getADACCOUNTID() {
    return AD_ACCOUNT_ID;
  }

  @JsonProperty("AD_ACCOUNT_ID")
  public void setADACCOUNTID(String AD_ACCOUNT_ID) {
    this.AD_ACCOUNT_ID = AD_ACCOUNT_ID;
  }

  /**
   * Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;)
   **/
  public AdAccountAnalyticsResponseInner DATE(LocalDate DATE) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdAccountAnalyticsResponseInner adAccountAnalyticsResponseInner = (AdAccountAnalyticsResponseInner) o;
    return Objects.equals(this.AD_ACCOUNT_ID, adAccountAnalyticsResponseInner.AD_ACCOUNT_ID) &&
        Objects.equals(this.DATE, adAccountAnalyticsResponseInner.DATE) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(AD_ACCOUNT_ID, DATE, super.hashCode());
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

