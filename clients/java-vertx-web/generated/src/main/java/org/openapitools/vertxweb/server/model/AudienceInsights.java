package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AudienceCategory;
import org.openapitools.vertxweb.server.model.AudienceDemographics;
import org.openapitools.vertxweb.server.model.AudienceInsightType;

/**
 * Audience interests and demographics.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AudienceInsights   {
  
  private List<AudienceCategory> categories = new ArrayList<>();
  private String date;
  private AudienceDemographics demographics;
  private Integer size;
  private Boolean sizeIsUpperBound;
  private AudienceInsightType type;

  public AudienceInsights () {

  }

  public AudienceInsights (List<AudienceCategory> categories, String date, AudienceDemographics demographics, Integer size, Boolean sizeIsUpperBound, AudienceInsightType type) {
    this.categories = categories;
    this.date = date;
    this.demographics = demographics;
    this.size = size;
    this.sizeIsUpperBound = sizeIsUpperBound;
    this.type = type;
  }

    
  @JsonProperty("categories")
  public List<AudienceCategory> getCategories() {
    return categories;
  }
  public void setCategories(List<AudienceCategory> categories) {
    this.categories = categories;
  }

    
  @JsonProperty("date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

    
  @JsonProperty("demographics")
  public AudienceDemographics getDemographics() {
    return demographics;
  }
  public void setDemographics(AudienceDemographics demographics) {
    this.demographics = demographics;
  }

    
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

    
  @JsonProperty("size_is_upper_bound")
  public Boolean getSizeIsUpperBound() {
    return sizeIsUpperBound;
  }
  public void setSizeIsUpperBound(Boolean sizeIsUpperBound) {
    this.sizeIsUpperBound = sizeIsUpperBound;
  }

    
  @JsonProperty("type")
  public AudienceInsightType getType() {
    return type;
  }
  public void setType(AudienceInsightType type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceInsights audienceInsights = (AudienceInsights) o;
    return Objects.equals(categories, audienceInsights.categories) &&
        Objects.equals(date, audienceInsights.date) &&
        Objects.equals(demographics, audienceInsights.demographics) &&
        Objects.equals(size, audienceInsights.size) &&
        Objects.equals(sizeIsUpperBound, audienceInsights.sizeIsUpperBound) &&
        Objects.equals(type, audienceInsights.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, date, demographics, size, sizeIsUpperBound, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceInsights {\n");
    
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sizeIsUpperBound: ").append(toIndentedString(sizeIsUpperBound)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
