package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.TrendingKeywordsResponseTrendsInnerTimeSeries;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TrendingKeywordsResponseTrendsInner  {
  
  @ApiModelProperty(example = "couples halloween costumes", value = "The keyword that is trending.")
 /**
   * The keyword that is trending.
  **/
  private String keyword;

  @ApiModelProperty(example = "50", value = "The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.")
 /**
   * The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
  **/
  private Integer pctGrowthWow;

  @ApiModelProperty(example = "400", value = "The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.")
 /**
   * The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
  **/
  private Integer pctGrowthMom;

  @ApiModelProperty(example = "-5", value = "The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.")
 /**
   * The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
  **/
  private Integer pctGrowthYoy;

  @ApiModelProperty(value = "")
  @Valid
  private TrendingKeywordsResponseTrendsInnerTimeSeries timeSeries;
 /**
   * The keyword that is trending.
   * @return keyword
  **/
  @JsonProperty("keyword")
 @Size(min=1)  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public TrendingKeywordsResponseTrendsInner keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

 /**
   * The week-over-week percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;50\&quot; would represent a 50% increase in searches in the last seven days compared to the week prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% week-over-week growth.
   * @return pctGrowthWow
  **/
  @JsonProperty("pct_growth_wow")
  public Integer getPctGrowthWow() {
    return pctGrowthWow;
  }

  public void setPctGrowthWow(Integer pctGrowthWow) {
    this.pctGrowthWow = pctGrowthWow;
  }

  public TrendingKeywordsResponseTrendsInner pctGrowthWow(Integer pctGrowthWow) {
    this.pctGrowthWow = pctGrowthWow;
    return this;
  }

 /**
   * The month-over-month percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;400\&quot; would represent a 400% increase in searches in the last 30 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% month-over-month growth.
   * @return pctGrowthMom
  **/
  @JsonProperty("pct_growth_mom")
  public Integer getPctGrowthMom() {
    return pctGrowthMom;
  }

  public void setPctGrowthMom(Integer pctGrowthMom) {
    this.pctGrowthMom = pctGrowthMom;
  }

  public TrendingKeywordsResponseTrendsInner pctGrowthMom(Integer pctGrowthMom) {
    this.pctGrowthMom = pctGrowthMom;
    return this;
  }

 /**
   * The year-over-year percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;-5\&quot; would represent a 5% decrease in searches in the last 365 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% year-over-year growth.
   * @return pctGrowthYoy
  **/
  @JsonProperty("pct_growth_yoy")
  public Integer getPctGrowthYoy() {
    return pctGrowthYoy;
  }

  public void setPctGrowthYoy(Integer pctGrowthYoy) {
    this.pctGrowthYoy = pctGrowthYoy;
  }

  public TrendingKeywordsResponseTrendsInner pctGrowthYoy(Integer pctGrowthYoy) {
    this.pctGrowthYoy = pctGrowthYoy;
    return this;
  }

 /**
   * Get timeSeries
   * @return timeSeries
  **/
  @JsonProperty("time_series")
  public TrendingKeywordsResponseTrendsInnerTimeSeries getTimeSeries() {
    return timeSeries;
  }

  public void setTimeSeries(TrendingKeywordsResponseTrendsInnerTimeSeries timeSeries) {
    this.timeSeries = timeSeries;
  }

  public TrendingKeywordsResponseTrendsInner timeSeries(TrendingKeywordsResponseTrendsInnerTimeSeries timeSeries) {
    this.timeSeries = timeSeries;
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
    TrendingKeywordsResponseTrendsInner trendingKeywordsResponseTrendsInner = (TrendingKeywordsResponseTrendsInner) o;
    return Objects.equals(this.keyword, trendingKeywordsResponseTrendsInner.keyword) &&
        Objects.equals(this.pctGrowthWow, trendingKeywordsResponseTrendsInner.pctGrowthWow) &&
        Objects.equals(this.pctGrowthMom, trendingKeywordsResponseTrendsInner.pctGrowthMom) &&
        Objects.equals(this.pctGrowthYoy, trendingKeywordsResponseTrendsInner.pctGrowthYoy) &&
        Objects.equals(this.timeSeries, trendingKeywordsResponseTrendsInner.timeSeries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keyword, pctGrowthWow, pctGrowthMom, pctGrowthYoy, timeSeries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingKeywordsResponseTrendsInner {\n");
    
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    pctGrowthWow: ").append(toIndentedString(pctGrowthWow)).append("\n");
    sb.append("    pctGrowthMom: ").append(toIndentedString(pctGrowthMom)).append("\n");
    sb.append("    pctGrowthYoy: ").append(toIndentedString(pctGrowthYoy)).append("\n");
    sb.append("    timeSeries: ").append(toIndentedString(timeSeries)).append("\n");
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

