package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
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
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Audience interests and demographics.
 */

@Schema(name = "AudienceInsights", description = "Audience interests and demographics.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AudienceInsights {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid AudienceCategory> categories = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<@Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$") String> date = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable AudienceDemographics demographics;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer size;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean sizeIsUpperBound;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable AudienceInsightType type;

  public AudienceInsights categories(List<@Valid AudienceCategory> categories) {
    this.categories = categories;
    return this;
  }

  public AudienceInsights addCategoriesItem(AudienceCategory categoriesItem) {
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

  @JsonProperty("categories")
  public void setCategories(List<@Valid AudienceCategory> categories) {
    this.categories = categories;
  }

  public AudienceInsights date(String date) {
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

  public AudienceInsights demographics(@Nullable AudienceDemographics demographics) {
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

  @JsonProperty("demographics")
  public void setDemographics(@Nullable AudienceDemographics demographics) {
    this.demographics = demographics;
  }

  public AudienceInsights size(@Nullable Integer size) {
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

  @JsonProperty("size")
  public void setSize(@Nullable Integer size) {
    this.size = size;
  }

  public AudienceInsights sizeIsUpperBound(@Nullable Boolean sizeIsUpperBound) {
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

  @JsonProperty("size_is_upper_bound")
  public void setSizeIsUpperBound(@Nullable Boolean sizeIsUpperBound) {
    this.sizeIsUpperBound = sizeIsUpperBound;
  }

  public AudienceInsights type(@Nullable AudienceInsightType type) {
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
  public @Nullable AudienceInsightType getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(@Nullable AudienceInsightType type) {
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
        equalsNullable(this.date, audienceInsights.date) &&
        Objects.equals(this.demographics, audienceInsights.demographics) &&
        Objects.equals(this.size, audienceInsights.size) &&
        Objects.equals(this.sizeIsUpperBound, audienceInsights.sizeIsUpperBound) &&
        Objects.equals(this.type, audienceInsights.type);
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

