package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AudienceCategory;
import org.openapitools.model.AudienceDemographics;
import org.openapitools.model.AudienceInsightType;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Audience interests and demographics.
 */

@Schema(name = "AudienceInsightsResponse", description = "Audience interests and demographics.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class AudienceInsightsResponse {

  @Valid
  private List<@Valid AudienceCategory> categories = new ArrayList<>();

  private JsonNullable<@Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$") String> date = JsonNullable.<String>undefined();

  private @Nullable AudienceDemographics demographics;

  private @Nullable Integer size;

  private @Nullable Boolean sizeIsUpperBound;

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
   */
  @Valid 
  @Schema(name = "categories", description = "Category interest distribution", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categories")
  public List<@Valid AudienceCategory> getCategories() {
    return categories;
  }

  public void setCategories(List<@Valid AudienceCategory> categories) {
    this.categories = categories;
  }

  public AudienceInsightsResponse date(String date) {
    this.date = JsonNullable.of(date);
    return this;
  }

  /**
   * Generation date
   * @return date
   */
  @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$") 
  @Schema(name = "date", example = "2022-10-09", description = "Generation date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("date")
  public JsonNullable<@Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$") String> getDate() {
    return date;
  }

  public void setDate(JsonNullable<String> date) {
    this.date = date;
  }

  public AudienceInsightsResponse demographics(@Nullable AudienceDemographics demographics) {
    this.demographics = demographics;
    return this;
  }

  /**
   * Get demographics
   * @return demographics
   */
  @Valid 
  @Schema(name = "demographics", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("demographics")
  public @Nullable AudienceDemographics getDemographics() {
    return demographics;
  }

  public void setDemographics(@Nullable AudienceDemographics demographics) {
    this.demographics = demographics;
  }

  public AudienceInsightsResponse size(@Nullable Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Population count.
   * @return size
   */
  
  @Schema(name = "size", example = "10000", description = "Population count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public @Nullable Integer getSize() {
    return size;
  }

  public void setSize(@Nullable Integer size) {
    this.size = size;
  }

  public AudienceInsightsResponse sizeIsUpperBound(@Nullable Boolean sizeIsUpperBound) {
    this.sizeIsUpperBound = sizeIsUpperBound;
    return this;
  }

  /**
   * Indicates whether the audience size has been rounded up to the next highest upper boundary.
   * @return sizeIsUpperBound
   */
  
  @Schema(name = "size_is_upper_bound", example = "true", description = "Indicates whether the audience size has been rounded up to the next highest upper boundary.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size_is_upper_bound")
  public @Nullable Boolean getSizeIsUpperBound() {
    return sizeIsUpperBound;
  }

  public void setSizeIsUpperBound(@Nullable Boolean sizeIsUpperBound) {
    this.sizeIsUpperBound = sizeIsUpperBound;
  }

  public AudienceInsightsResponse type(AudienceInsightType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    AudienceInsightsResponse audienceInsightsResponse = (AudienceInsightsResponse) o;
    return Objects.equals(this.categories, audienceInsightsResponse.categories) &&
        equalsNullable(this.date, audienceInsightsResponse.date) &&
        Objects.equals(this.demographics, audienceInsightsResponse.demographics) &&
        Objects.equals(this.size, audienceInsightsResponse.size) &&
        Objects.equals(this.sizeIsUpperBound, audienceInsightsResponse.sizeIsUpperBound) &&
        Objects.equals(this.type, audienceInsightsResponse.type);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(categories, hashCodeNullable(date), demographics, size, sizeIsUpperBound, type);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

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

