package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.vertxweb.server.model.TrendingPin;

/**
 * Individual trending topic within an interest category
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrendingTopic   {
  
  private String description;
  private String id;
  private Integer percentGrowthMom;
  private List<TrendingPin> pins = new ArrayList<>();
  private List<String> relatedInterests = new ArrayList<>();
  private List<String> relatedSearches = new ArrayList<>();
  private Map<String, BigDecimal> timeSeries = new HashMap<>();
  private String title;

  public TrendingTopic () {

  }

  public TrendingTopic (String description, String id, Integer percentGrowthMom, List<TrendingPin> pins, List<String> relatedInterests, List<String> relatedSearches, Map<String, BigDecimal> timeSeries, String title) {
    this.description = description;
    this.id = id;
    this.percentGrowthMom = percentGrowthMom;
    this.pins = pins;
    this.relatedInterests = relatedInterests;
    this.relatedSearches = relatedSearches;
    this.timeSeries = timeSeries;
    this.title = title;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("percent_growth_mom")
  public Integer getPercentGrowthMom() {
    return percentGrowthMom;
  }
  public void setPercentGrowthMom(Integer percentGrowthMom) {
    this.percentGrowthMom = percentGrowthMom;
  }

    
  @JsonProperty("pins")
  public List<TrendingPin> getPins() {
    return pins;
  }
  public void setPins(List<TrendingPin> pins) {
    this.pins = pins;
  }

    
  @JsonProperty("related_interests")
  public List<String> getRelatedInterests() {
    return relatedInterests;
  }
  public void setRelatedInterests(List<String> relatedInterests) {
    this.relatedInterests = relatedInterests;
  }

    
  @JsonProperty("related_searches")
  public List<String> getRelatedSearches() {
    return relatedSearches;
  }
  public void setRelatedSearches(List<String> relatedSearches) {
    this.relatedSearches = relatedSearches;
  }

    
  @JsonProperty("time_series")
  public Map<String, BigDecimal> getTimeSeries() {
    return timeSeries;
  }
  public void setTimeSeries(Map<String, BigDecimal> timeSeries) {
    this.timeSeries = timeSeries;
  }

    
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
        Objects.equals(id, trendingTopic.id) &&
        Objects.equals(percentGrowthMom, trendingTopic.percentGrowthMom) &&
        Objects.equals(pins, trendingTopic.pins) &&
        Objects.equals(relatedInterests, trendingTopic.relatedInterests) &&
        Objects.equals(relatedSearches, trendingTopic.relatedSearches) &&
        Objects.equals(timeSeries, trendingTopic.timeSeries) &&
        Objects.equals(title, trendingTopic.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, percentGrowthMom, pins, relatedInterests, relatedSearches, timeSeries, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingTopic {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
