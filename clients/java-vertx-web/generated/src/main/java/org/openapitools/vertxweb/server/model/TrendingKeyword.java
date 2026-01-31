package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.PredictedTimeSeries;
import org.openapitools.vertxweb.server.model.TimeSeries;
import org.openapitools.vertxweb.server.model.TrendingKeywordDemographics;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrendingKeyword   {
  
  private TrendingKeywordDemographics demographics;
  private Boolean hasPrediction;
  private String keyword;
  private Integer pctGrowthMom;
  private Integer pctGrowthWow;
  private Integer pctGrowthYoy;
  private PredictedTimeSeries predictedTimeSeries;
  private TimeSeries timeSeries;

  public TrendingKeyword () {

  }

  public TrendingKeyword (TrendingKeywordDemographics demographics, Boolean hasPrediction, String keyword, Integer pctGrowthMom, Integer pctGrowthWow, Integer pctGrowthYoy, PredictedTimeSeries predictedTimeSeries, TimeSeries timeSeries) {
    this.demographics = demographics;
    this.hasPrediction = hasPrediction;
    this.keyword = keyword;
    this.pctGrowthMom = pctGrowthMom;
    this.pctGrowthWow = pctGrowthWow;
    this.pctGrowthYoy = pctGrowthYoy;
    this.predictedTimeSeries = predictedTimeSeries;
    this.timeSeries = timeSeries;
  }

    
  @JsonProperty("demographics")
  public TrendingKeywordDemographics getDemographics() {
    return demographics;
  }
  public void setDemographics(TrendingKeywordDemographics demographics) {
    this.demographics = demographics;
  }

    
  @JsonProperty("has_prediction")
  public Boolean getHasPrediction() {
    return hasPrediction;
  }
  public void setHasPrediction(Boolean hasPrediction) {
    this.hasPrediction = hasPrediction;
  }

    
  @JsonProperty("keyword")
  public String getKeyword() {
    return keyword;
  }
  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

    
  @JsonProperty("pct_growth_mom")
  public Integer getPctGrowthMom() {
    return pctGrowthMom;
  }
  public void setPctGrowthMom(Integer pctGrowthMom) {
    this.pctGrowthMom = pctGrowthMom;
  }

    
  @JsonProperty("pct_growth_wow")
  public Integer getPctGrowthWow() {
    return pctGrowthWow;
  }
  public void setPctGrowthWow(Integer pctGrowthWow) {
    this.pctGrowthWow = pctGrowthWow;
  }

    
  @JsonProperty("pct_growth_yoy")
  public Integer getPctGrowthYoy() {
    return pctGrowthYoy;
  }
  public void setPctGrowthYoy(Integer pctGrowthYoy) {
    this.pctGrowthYoy = pctGrowthYoy;
  }

    
  @JsonProperty("predicted_time_series")
  public PredictedTimeSeries getPredictedTimeSeries() {
    return predictedTimeSeries;
  }
  public void setPredictedTimeSeries(PredictedTimeSeries predictedTimeSeries) {
    this.predictedTimeSeries = predictedTimeSeries;
  }

    
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
    return Objects.equals(demographics, trendingKeyword.demographics) &&
        Objects.equals(hasPrediction, trendingKeyword.hasPrediction) &&
        Objects.equals(keyword, trendingKeyword.keyword) &&
        Objects.equals(pctGrowthMom, trendingKeyword.pctGrowthMom) &&
        Objects.equals(pctGrowthWow, trendingKeyword.pctGrowthWow) &&
        Objects.equals(pctGrowthYoy, trendingKeyword.pctGrowthYoy) &&
        Objects.equals(predictedTimeSeries, trendingKeyword.predictedTimeSeries) &&
        Objects.equals(timeSeries, trendingKeyword.timeSeries);
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
