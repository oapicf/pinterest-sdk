package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Audience interests and demographics.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AudienceInsights   {
  
  private List<@Valid AudienceCategory> categories = new ArrayList<>();
  private String date;
  private AudienceDemographics demographics;
  private Integer size;
  private Boolean sizeIsUpperBound;
  private AudienceInsightType type;

  /**
   * Category interest distribution
   **/
  
  @ApiModelProperty(value = "Category interest distribution")
  @JsonProperty("categories")
  @Valid
  public List<@Valid AudienceCategory> getCategories() {
    return categories;
  }
  public void setCategories(List<@Valid AudienceCategory> categories) {
    this.categories = categories;
  }

  /**
   * Generation date
   **/
  
  @ApiModelProperty(example = "2022-10-09", value = "Generation date")
  @JsonProperty("date")
 @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("demographics")
  @Valid
  public AudienceDemographics getDemographics() {
    return demographics;
  }
  public void setDemographics(AudienceDemographics demographics) {
    this.demographics = demographics;
  }

  /**
   * Population count.
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  @Valid
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
    return Objects.equals(this.categories, audienceInsights.categories) &&
        Objects.equals(this.date, audienceInsights.date) &&
        Objects.equals(this.demographics, audienceInsights.demographics) &&
        Objects.equals(this.size, audienceInsights.size) &&
        Objects.equals(this.sizeIsUpperBound, audienceInsights.sizeIsUpperBound) &&
        Objects.equals(this.type, audienceInsights.type);
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

