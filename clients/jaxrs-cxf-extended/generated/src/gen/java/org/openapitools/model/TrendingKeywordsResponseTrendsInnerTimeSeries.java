package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.LocalDate;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A sequence of weekly observations of the relative search volume for this keyword over the past year.<br /> These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative volume between keywords.<br /> **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week.  For example, a value of `2023-10-31` would include searches that happened between `2023-10-25` and `2023-10-31`.
 */
@ApiModel(description="A sequence of weekly observations of the relative search volume for this keyword over the past year.<br /> These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative volume between keywords.<br /> **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week.  For example, a value of `2023-10-31` would include searches that happened between `2023-10-25` and `2023-10-31`.")

public class TrendingKeywordsResponseTrendsInnerTimeSeries extends HashMap<String, Integer> {
  
  @ApiModelProperty(value = "")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate date;
 /**
  * Get date
  * @return date
  */
  @JsonProperty("date")
  public LocalDate getDate() {
    return date;
  }

  /**
   * Sets the <code>date</code> property.
   */
 public void setDate(LocalDate date) {
    this.date = date;
  }

  /**
   * Sets the <code>date</code> property.
   */
  public TrendingKeywordsResponseTrendsInnerTimeSeries date(LocalDate date) {
    this.date = date;
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
    TrendingKeywordsResponseTrendsInnerTimeSeries trendingKeywordsResponseTrendsInnerTimeSeries = (TrendingKeywordsResponseTrendsInnerTimeSeries) o;
    return super.equals(o) && Objects.equals(this.date, trendingKeywordsResponseTrendsInnerTimeSeries.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingKeywordsResponseTrendsInnerTimeSeries {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

