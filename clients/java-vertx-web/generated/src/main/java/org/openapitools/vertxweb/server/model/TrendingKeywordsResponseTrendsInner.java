package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.TrendingKeywordsResponseTrendsInnerTimeSeries;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrendingKeywordsResponseTrendsInner   {
  
  private String keyword;
  private Integer pctGrowthWow;
  private Integer pctGrowthMom;
  private Integer pctGrowthYoy;
  private TrendingKeywordsResponseTrendsInnerTimeSeries timeSeries;

  public TrendingKeywordsResponseTrendsInner () {

  }

  public TrendingKeywordsResponseTrendsInner (String keyword, Integer pctGrowthWow, Integer pctGrowthMom, Integer pctGrowthYoy, TrendingKeywordsResponseTrendsInnerTimeSeries timeSeries) {
    this.keyword = keyword;
    this.pctGrowthWow = pctGrowthWow;
    this.pctGrowthMom = pctGrowthMom;
    this.pctGrowthYoy = pctGrowthYoy;
    this.timeSeries = timeSeries;
  }

    
  @JsonProperty("keyword")
  public String getKeyword() {
    return keyword;
  }
  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

    
  @JsonProperty("pct_growth_wow")
  public Integer getPctGrowthWow() {
    return pctGrowthWow;
  }
  public void setPctGrowthWow(Integer pctGrowthWow) {
    this.pctGrowthWow = pctGrowthWow;
  }

    
  @JsonProperty("pct_growth_mom")
  public Integer getPctGrowthMom() {
    return pctGrowthMom;
  }
  public void setPctGrowthMom(Integer pctGrowthMom) {
    this.pctGrowthMom = pctGrowthMom;
  }

    
  @JsonProperty("pct_growth_yoy")
  public Integer getPctGrowthYoy() {
    return pctGrowthYoy;
  }
  public void setPctGrowthYoy(Integer pctGrowthYoy) {
    this.pctGrowthYoy = pctGrowthYoy;
  }

    
  @JsonProperty("time_series")
  public TrendingKeywordsResponseTrendsInnerTimeSeries getTimeSeries() {
    return timeSeries;
  }
  public void setTimeSeries(TrendingKeywordsResponseTrendsInnerTimeSeries timeSeries) {
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
    TrendingKeywordsResponseTrendsInner trendingKeywordsResponseTrendsInner = (TrendingKeywordsResponseTrendsInner) o;
    return Objects.equals(keyword, trendingKeywordsResponseTrendsInner.keyword) &&
        Objects.equals(pctGrowthWow, trendingKeywordsResponseTrendsInner.pctGrowthWow) &&
        Objects.equals(pctGrowthMom, trendingKeywordsResponseTrendsInner.pctGrowthMom) &&
        Objects.equals(pctGrowthYoy, trendingKeywordsResponseTrendsInner.pctGrowthYoy) &&
        Objects.equals(timeSeries, trendingKeywordsResponseTrendsInner.timeSeries);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
