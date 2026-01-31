package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PredictedTimeSeries;
import org.openapitools.model.TimeSeries;
import org.openapitools.model.TrendingKeywordDemographics;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-01-31T04:55:11.834541491Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TrendingKeyword   {
  
  private TrendingKeywordDemographics demographics;
  private Boolean hasPrediction;
  private String keyword;
  private Integer pctGrowthMom;
  private Integer pctGrowthWow;
  private Integer pctGrowthYoy;
  private PredictedTimeSeries predictedTimeSeries;
  private TimeSeries timeSeries;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("demographics")
  public TrendingKeywordDemographics getDemographics() {
    return demographics;
  }
  public void setDemographics(TrendingKeywordDemographics demographics) {
    this.demographics = demographics;
  }

  /**
   * Indicates whether the keyword has a prediction available for the next 90 days.&lt;br /&gt; This field is only applicable when &#x60;include_prediction&#x60; query parameter is set to &#x60;true&#x60;. &lt;br /&gt; By default, the value is &#x60;false&#x60; and no prediction data is included in the response.
   **/
  
  @ApiModelProperty(example = "false", value = "Indicates whether the keyword has a prediction available for the next 90 days.<br /> This field is only applicable when `include_prediction` query parameter is set to `true`. <br /> By default, the value is `false` and no prediction data is included in the response.")
  @JsonProperty("has_prediction")
  public Boolean getHasPrediction() {
    return hasPrediction;
  }
  public void setHasPrediction(Boolean hasPrediction) {
    this.hasPrediction = hasPrediction;
  }

  /**
   * The keyword that is trending.
   **/
  
  @ApiModelProperty(example = "couples halloween costumes", value = "The keyword that is trending.")
  @JsonProperty("keyword")
 @Size(min=1)  public String getKeyword() {
    return keyword;
  }
  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  /**
   * The month-over-month percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;400\&quot; would represent a 400% increase in searches in the last 30 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% month-over-month growth.
   **/
  
  @ApiModelProperty(example = "400", value = "The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.")
  @JsonProperty("pct_growth_mom")
  public Integer getPctGrowthMom() {
    return pctGrowthMom;
  }
  public void setPctGrowthMom(Integer pctGrowthMom) {
    this.pctGrowthMom = pctGrowthMom;
  }

  /**
   * The week-over-week percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;50\&quot; would represent a 50% increase in searches in the last seven days compared to the week prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% week-over-week growth.
   **/
  
  @ApiModelProperty(example = "50", value = "The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.")
  @JsonProperty("pct_growth_wow")
  public Integer getPctGrowthWow() {
    return pctGrowthWow;
  }
  public void setPctGrowthWow(Integer pctGrowthWow) {
    this.pctGrowthWow = pctGrowthWow;
  }

  /**
   * The year-over-year percent change in search volume for this keyword.&lt;br /&gt; For example, a value of \&quot;-5\&quot; would represent a 5% decrease in searches in the last 365 days compared to the month prior.&lt;br /&gt; **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced &gt; 10000% year-over-year growth.
   **/
  
  @ApiModelProperty(example = "-5", value = "The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.")
  @JsonProperty("pct_growth_yoy")
  public Integer getPctGrowthYoy() {
    return pctGrowthYoy;
  }
  public void setPctGrowthYoy(Integer pctGrowthYoy) {
    this.pctGrowthYoy = pctGrowthYoy;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("predicted_time_series")
  public PredictedTimeSeries getPredictedTimeSeries() {
    return predictedTimeSeries;
  }
  public void setPredictedTimeSeries(PredictedTimeSeries predictedTimeSeries) {
    this.predictedTimeSeries = predictedTimeSeries;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("time_series")
  public TimeSeries getTimeSeries() {
    return timeSeries;
  }
  public void setTimeSeries(TimeSeries timeSeries) {
    this.timeSeries = timeSeries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendingKeyword trendingKeyword = (TrendingKeyword) o;
    return Objects.equals(this.demographics, trendingKeyword.demographics) &&
        Objects.equals(this.hasPrediction, trendingKeyword.hasPrediction) &&
        Objects.equals(this.keyword, trendingKeyword.keyword) &&
        Objects.equals(this.pctGrowthMom, trendingKeyword.pctGrowthMom) &&
        Objects.equals(this.pctGrowthWow, trendingKeyword.pctGrowthWow) &&
        Objects.equals(this.pctGrowthYoy, trendingKeyword.pctGrowthYoy) &&
        Objects.equals(this.predictedTimeSeries, trendingKeyword.predictedTimeSeries) &&
        Objects.equals(this.timeSeries, trendingKeyword.timeSeries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(demographics, hasPrediction, keyword, pctGrowthMom, pctGrowthWow, pctGrowthYoy, predictedTimeSeries, timeSeries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingKeyword {\n");
    
    sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
    sb.append("    hasPrediction: ").append(toIndentedString(hasPrediction)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    pctGrowthMom: ").append(toIndentedString(pctGrowthMom)).append("\n");
    sb.append("    pctGrowthWow: ").append(toIndentedString(pctGrowthWow)).append("\n");
    sb.append("    pctGrowthYoy: ").append(toIndentedString(pctGrowthYoy)).append("\n");
    sb.append("    predictedTimeSeries: ").append(toIndentedString(predictedTimeSeries)).append("\n");
    sb.append("    timeSeries: ").append(toIndentedString(timeSeries)).append("\n");
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

