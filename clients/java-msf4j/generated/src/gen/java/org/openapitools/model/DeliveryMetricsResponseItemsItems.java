package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DeliveryMetricsResponseItemsItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DeliveryMetricsResponseItemsItems   {
  /**
   * Category name
   */
  public enum CategoryEnum {
    ADS("ADS"),
    
    ORGANIC("ORGANIC");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CategoryEnum fromValue(String text) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("category")
  private CategoryEnum category;

  @JsonProperty("definition")
  private String definition;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("name")
  private String name;

  public DeliveryMetricsResponseItemsItems category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * Category name
   * @return category
  **/
  @ApiModelProperty(value = "Category name")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public DeliveryMetricsResponseItemsItems definition(String definition) {
    this.definition = definition;
    return this;
  }

   /**
   * How the metric is defined.
   * @return definition
  **/
  @ApiModelProperty(value = "How the metric is defined.")
  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public DeliveryMetricsResponseItemsItems displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
   * @return displayName
  **/
  @ApiModelProperty(value = "Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public DeliveryMetricsResponseItemsItems name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Metric's name.
   * @return name
  **/
  @ApiModelProperty(value = "Metric's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

