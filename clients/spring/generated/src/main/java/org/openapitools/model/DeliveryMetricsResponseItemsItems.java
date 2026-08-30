package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DeliveryMetricsResponseItemsItems
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DeliveryMetricsResponseItemsItems {

  /**
   * Category name
   */
  public enum CategoryEnum {
    ADS("ADS"),
    
    ORGANIC("ORGANIC");

    private final String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CategoryEnum category;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String definition;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String displayName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String name;

  public DeliveryMetricsResponseItemsItems category(@Nullable CategoryEnum category) {
    this.category = category;
    return this;
  }

  /**
   * Category name
   * @return category
   */
  
  @Schema(name = "category", description = "Category name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("category")
  public @Nullable CategoryEnum getCategory() {
    return category;
  }

  @JsonProperty("category")
  public void setCategory(@Nullable CategoryEnum category) {
    this.category = category;
  }

  public DeliveryMetricsResponseItemsItems definition(@Nullable String definition) {
    this.definition = definition;
    return this;
  }

  /**
   * How the metric is defined.
   * @return definition
   */
  
  @Schema(name = "definition", description = "How the metric is defined.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("definition")
  public @Nullable String getDefinition() {
    return definition;
  }

  @JsonProperty("definition")
  public void setDefinition(@Nullable String definition) {
    this.definition = definition;
  }

  public DeliveryMetricsResponseItemsItems displayName(@Nullable String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
   * @return displayName
   */
  
  @Schema(name = "display_name", description = "Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display_name")
  public @Nullable String getDisplayName() {
    return displayName;
  }

  @JsonProperty("display_name")
  public void setDisplayName(@Nullable String displayName) {
    this.displayName = displayName;
  }

  public DeliveryMetricsResponseItemsItems name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Metric's name.
   * @return name
   */
  
  @Schema(name = "name", description = "Metric's name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryMetricsResponseItemsItems deliveryMetricsResponseItemsItems = (DeliveryMetricsResponseItemsItems) o;
    return Objects.equals(this.category, deliveryMetricsResponseItemsItems.category) &&
        Objects.equals(this.definition, deliveryMetricsResponseItemsItems.definition) &&
        Objects.equals(this.displayName, deliveryMetricsResponseItemsItems.displayName) &&
        Objects.equals(this.name, deliveryMetricsResponseItemsItems.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, definition, displayName, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryMetricsResponseItemsItems {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

