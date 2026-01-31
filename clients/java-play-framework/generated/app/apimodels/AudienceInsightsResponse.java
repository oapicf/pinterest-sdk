package apimodels;

import apimodels.AudienceCategory;
import apimodels.AudienceDemographics;
import apimodels.AudienceInsightType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Audience interests and demographics.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AudienceInsightsResponse   {
  @JsonProperty("categories")
  @Valid

  private List<@Valid AudienceCategory> categories = null;

  @JsonProperty("date")
  @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")

  private String date;

  @JsonProperty("demographics")
  @Valid

  private AudienceDemographics demographics;

  @JsonProperty("size")
  
  private Integer size;

  @JsonProperty("size_is_upper_bound")
  
  private Boolean sizeIsUpperBound;

  @JsonProperty("type")
  @Valid

  private AudienceInsightType type = AudienceInsightType.YOUR_TOTAL_AUDIENCE;

  public AudienceInsightsResponse categories(List<@Valid AudienceCategory> categories) {
    this.categories = categories;
    return this;
  }

  public AudienceInsightsResponse addCategoriesItem(AudienceCategory categoriesItem) {
    if (this.categories == null) {
      this.categories = new ArrayList<>();
    }
    this.categories.add(categoriesItem);
    return this;
  }

   /**
   * Category interest distribution
   * @return categories
  **/
  public List<@Valid AudienceCategory> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid AudienceCategory> categories) {
    this.categories = categories;
  }

  public AudienceInsightsResponse date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Generation date
   * @return date
  **/
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public AudienceInsightsResponse demographics(AudienceDemographics demographics) {
    this.demographics = demographics;
    return this;
  }

   /**
   * Get demographics
   * @return demographics
  **/
  public AudienceDemographics getDemographics() {
    return demographics;
  }

  public void setDemographics(AudienceDemographics demographics) {
    this.demographics = demographics;
  }

  public AudienceInsightsResponse size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Population count.
   * @return size
  **/
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public AudienceInsightsResponse sizeIsUpperBound(Boolean sizeIsUpperBound) {
    this.sizeIsUpperBound = sizeIsUpperBound;
    return this;
  }

   /**
   * Indicates whether the audience size has been rounded up to the next highest upper boundary.
   * @return sizeIsUpperBound
  **/
  public Boolean getSizeIsUpperBound() {
    return sizeIsUpperBound;
  }

  public void setSizeIsUpperBound(Boolean sizeIsUpperBound) {
    this.sizeIsUpperBound = sizeIsUpperBound;
  }

  public AudienceInsightsResponse type(AudienceInsightType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
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
    AudienceInsightsResponse audienceInsightsResponse = (AudienceInsightsResponse) o;
    return Objects.equals(categories, audienceInsightsResponse.categories) &&
        Objects.equals(date, audienceInsightsResponse.date) &&
        Objects.equals(demographics, audienceInsightsResponse.demographics) &&
        Objects.equals(size, audienceInsightsResponse.size) &&
        Objects.equals(sizeIsUpperBound, audienceInsightsResponse.sizeIsUpperBound) &&
        Objects.equals(type, audienceInsightsResponse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, date, demographics, size, sizeIsUpperBound, type);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceInsightsResponse {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

