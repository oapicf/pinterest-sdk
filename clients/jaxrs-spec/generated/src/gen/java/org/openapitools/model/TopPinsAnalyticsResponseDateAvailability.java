package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("TopPinsAnalyticsResponse_date_availability")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TopPinsAnalyticsResponseDateAvailability   {
  private @Valid BigDecimal latestAvailableTimestamp;
  private @Valid Boolean isRealtime;

  /**
   **/
  public TopPinsAnalyticsResponseDateAvailability latestAvailableTimestamp(BigDecimal latestAvailableTimestamp) {
    this.latestAvailableTimestamp = latestAvailableTimestamp;
    return this;
  }

  
  @ApiModelProperty(example = "1649116799000", value = "")
  @JsonProperty("latest_available_timestamp")
  public BigDecimal getLatestAvailableTimestamp() {
    return latestAvailableTimestamp;
  }

  @JsonProperty("latest_available_timestamp")
  public void setLatestAvailableTimestamp(BigDecimal latestAvailableTimestamp) {
    this.latestAvailableTimestamp = latestAvailableTimestamp;
  }

  /**
   **/
  public TopPinsAnalyticsResponseDateAvailability isRealtime(Boolean isRealtime) {
    this.isRealtime = isRealtime;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "")
  @JsonProperty("is_realtime")
  public Boolean getIsRealtime() {
    return isRealtime;
  }

  @JsonProperty("is_realtime")
  public void setIsRealtime(Boolean isRealtime) {
    this.isRealtime = isRealtime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopPinsAnalyticsResponseDateAvailability topPinsAnalyticsResponseDateAvailability = (TopPinsAnalyticsResponseDateAvailability) o;
    return Objects.equals(this.latestAvailableTimestamp, topPinsAnalyticsResponseDateAvailability.latestAvailableTimestamp) &&
        Objects.equals(this.isRealtime, topPinsAnalyticsResponseDateAvailability.isRealtime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latestAvailableTimestamp, isRealtime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopPinsAnalyticsResponseDateAvailability {\n");
    
    sb.append("    latestAvailableTimestamp: ").append(toIndentedString(latestAvailableTimestamp)).append("\n");
    sb.append("    isRealtime: ").append(toIndentedString(isRealtime)).append("\n");
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

