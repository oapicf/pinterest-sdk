/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.23.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.TrendingPin;



/**
 * Individual trending topic within an interest category
 */

@ApiModel(description = "Individual trending topic within an interest category")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-31T04:53:14.867699604Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TrendingTopic   {
  
  private String description;
  private Integer percentGrowthMom;
  private List<TrendingPin> pins = new ArrayList<>();
  private List<String> relatedInterests = new ArrayList<>();
  private List<String> relatedSearches = new ArrayList<>();
  private Map<String, BigDecimal> timeSeries = new HashMap<>();
  private String title;

  /**
   * Description of the trending topic
   */
  public TrendingTopic description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Description of the trending topic")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Month-over-month growth percentage
   */
  public TrendingTopic percentGrowthMom(Integer percentGrowthMom) {
    this.percentGrowthMom = percentGrowthMom;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Month-over-month growth percentage")
  @JsonProperty("percent_growth_mom")
  public Integer getPercentGrowthMom() {
    return percentGrowthMom;
  }
  public void setPercentGrowthMom(Integer percentGrowthMom) {
    this.percentGrowthMom = percentGrowthMom;
  }

  /**
   * Array of pin images related to this trend (up to 6)
   */
  public TrendingTopic pins(List<TrendingPin> pins) {
    this.pins = pins;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array of pin images related to this trend (up to 6)")
  @JsonProperty("pins")
  public List<TrendingPin> getPins() {
    return pins;
  }
  public void setPins(List<TrendingPin> pins) {
    this.pins = pins;
  }

  /**
   * List of related interest categories
   */
  public TrendingTopic relatedInterests(List<String> relatedInterests) {
    this.relatedInterests = relatedInterests;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of related interest categories")
  @JsonProperty("related_interests")
  public List<String> getRelatedInterests() {
    return relatedInterests;
  }
  public void setRelatedInterests(List<String> relatedInterests) {
    this.relatedInterests = relatedInterests;
  }

  /**
   * List of related search terms
   */
  public TrendingTopic relatedSearches(List<String> relatedSearches) {
    this.relatedSearches = relatedSearches;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of related search terms")
  @JsonProperty("related_searches")
  public List<String> getRelatedSearches() {
    return relatedSearches;
  }
  public void setRelatedSearches(List<String> relatedSearches) {
    this.relatedSearches = relatedSearches;
  }

  /**
   * Time series data showing trend values over time, with dates as keys and values as numeric
   */
  public TrendingTopic timeSeries(Map<String, BigDecimal> timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Time series data showing trend values over time, with dates as keys and values as numeric")
  @JsonProperty("time_series")
  public Map<String, BigDecimal> getTimeSeries() {
    return timeSeries;
  }
  public void setTimeSeries(Map<String, BigDecimal> timeSeries) {
    this.timeSeries = timeSeries;
  }

  /**
   * Title of the trending topic
   */
  public TrendingTopic title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Title of the trending topic")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendingTopic trendingTopic = (TrendingTopic) o;
    return Objects.equals(description, trendingTopic.description) &&
        Objects.equals(percentGrowthMom, trendingTopic.percentGrowthMom) &&
        Objects.equals(pins, trendingTopic.pins) &&
        Objects.equals(relatedInterests, trendingTopic.relatedInterests) &&
        Objects.equals(relatedSearches, trendingTopic.relatedSearches) &&
        Objects.equals(timeSeries, trendingTopic.timeSeries) &&
        Objects.equals(title, trendingTopic.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, percentGrowthMom, pins, relatedInterests, relatedSearches, timeSeries, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingTopic {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    percentGrowthMom: ").append(toIndentedString(percentGrowthMom)).append("\n");
    sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
    sb.append("    relatedInterests: ").append(toIndentedString(relatedInterests)).append("\n");
    sb.append("    relatedSearches: ").append(toIndentedString(relatedSearches)).append("\n");
    sb.append("    timeSeries: ").append(toIndentedString(timeSeries)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

