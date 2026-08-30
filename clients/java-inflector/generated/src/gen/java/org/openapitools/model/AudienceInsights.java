package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AudienceCategory;
import org.openapitools.model.AudienceDemographics;
import org.openapitools.model.AudienceInsightType;



/**
 * Audience interests and demographics.
 **/

@ApiModel(description = "Audience interests and demographics.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AudienceInsights   {
  @JsonProperty("categories")
  private List<AudienceCategory> categories = null;

  @JsonProperty("date")
  private String date;

  @JsonProperty("demographics")
  private AudienceDemographics demographics;

  @JsonProperty("size")
  private Integer size;

  @JsonProperty("size_is_upper_bound")
  private Boolean sizeIsUpperBound;

  @JsonProperty("type")
  private AudienceInsightType type;

  /**
   * Category interest distribution
   **/
  public AudienceInsights categories(List<AudienceCategory> categories) {
    this.categories = categories;
    return this;
  }

  
  @ApiModelProperty(value = "Category interest distribution")
  @JsonProperty("categories")
  public List<AudienceCategory> getCategories() {
    return categories;
  }
  public void setCategories(List<AudienceCategory> categories) {
    this.categories = categories;
  }

  /**
   * Generation date
   **/
  public AudienceInsights date(String date) {
    this.date = date;
    return this;
  }

  
  @ApiModelProperty(example = "2022-10-09", value = "Generation date")
  @JsonProperty("date")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  /**
   **/
  public AudienceInsights demographics(AudienceDemographics demographics) {
    this.demographics = demographics;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("demographics")
  public AudienceDemographics getDemographics() {
    return demographics;
  }
  public void setDemographics(AudienceDemographics demographics) {
    this.demographics = demographics;
  }

  /**
   * Population count.
   **/
  public AudienceInsights size(Integer size) {
    this.size = size;
    return this;
  }

  
  @ApiModelProperty(example = "10000", value = "Population count.")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   * Indicates whether the audience size has been rounded up to the next highest upper boundary.
   **/
  public AudienceInsights sizeIsUpperBound(Boolean sizeIsUpperBound) {
    this.sizeIsUpperBound = sizeIsUpperBound;
    return this;
  }

  
  @ApiModelProperty(example = "true", value = "Indicates whether the audience size has been rounded up to the next highest upper boundary.")
  @JsonProperty("size_is_upper_bound")
  public Boolean getSizeIsUpperBound() {
    return sizeIsUpperBound;
  }
  public void setSizeIsUpperBound(Boolean sizeIsUpperBound) {
    this.sizeIsUpperBound = sizeIsUpperBound;
  }

  /**
   **/
  public AudienceInsights type(AudienceInsightType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

