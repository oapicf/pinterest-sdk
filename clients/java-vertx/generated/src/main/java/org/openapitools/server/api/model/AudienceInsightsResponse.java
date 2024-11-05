package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.AudienceCategory;
import org.openapitools.server.api.model.AudienceDemographics;
import org.openapitools.server.api.model.AudienceInsightType;

/**
 * Audience interests and demographics.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AudienceInsightsResponse   {
  
  private List<AudienceCategory> categories = new ArrayList<>();
  private AudienceDemographics demographics;
  private AudienceInsightType type = AudienceInsightType.YOUR_TOTAL_AUDIENCE;
  private String date;
  private Integer size;
  private Boolean sizeIsUpperBound;

  public AudienceInsightsResponse () {

  }

  public AudienceInsightsResponse (List<AudienceCategory> categories, AudienceDemographics demographics, AudienceInsightType type, String date, Integer size, Boolean sizeIsUpperBound) {
    this.categories = categories;
    this.demographics = demographics;
    this.type = type;
    this.date = date;
    this.size = size;
    this.sizeIsUpperBound = sizeIsUpperBound;
  }

    
  @JsonProperty("categories")
  public List<AudienceCategory> getCategories() {
    return categories;
  }
  public void setCategories(List<AudienceCategory> categories) {
    this.categories = categories;
  }

    
  @JsonProperty("demographics")
  public AudienceDemographics getDemographics() {
    return demographics;
  }
  public void setDemographics(AudienceDemographics demographics) {
    this.demographics = demographics;
  }

    
  @JsonProperty("type")
  public AudienceInsightType getType() {
    return type;
  }
  public void setType(AudienceInsightType type) {
    this.type = type;
  }

    
  @JsonProperty("date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AudienceInsightsResponse audienceInsightsResponse = (AudienceInsightsResponse) o;
    return Objects.equals(categories, audienceInsightsResponse.categories) &&
        Objects.equals(demographics, audienceInsightsResponse.demographics) &&
        Objects.equals(type, audienceInsightsResponse.type) &&
        Objects.equals(date, audienceInsightsResponse.date) &&
        Objects.equals(size, audienceInsightsResponse.size) &&
        Objects.equals(sizeIsUpperBound, audienceInsightsResponse.sizeIsUpperBound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, demographics, type, date, size, sizeIsUpperBound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceInsightsResponse {\n");
    
    sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
    sb.append("    demographics: ").append(toIndentedString(demographics)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sizeIsUpperBound: ").append(toIndentedString(sizeIsUpperBound)).append("\n");
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
