package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * DeliveryMetricsResponseItemsInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DeliveryMetricsResponseItemsInner   {
  @JsonProperty("name")
  private String name;

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

  public DeliveryMetricsResponseItemsInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Metric's name.
   * @return name
  **/
  @ApiModelProperty(example = "AD_GROUP_ID", value = "Metric's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeliveryMetricsResponseItemsInner category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * Category name
   * @return category
  **/
  @ApiModelProperty(example = "ADS", value = "Category name")
  public CategoryEnum getCategory() {
    return category;
  }

  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  public DeliveryMetricsResponseItemsInner definition(String definition) {
    this.definition = definition;
    return this;
  }

   /**
   * How the metric is defined.
   * @return definition
  **/
  @ApiModelProperty(example = "Unique ID for your ad group", value = "How the metric is defined.")
  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  public DeliveryMetricsResponseItemsInner displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
   * @return displayName
  **/
  @ApiModelProperty(example = "Ad group ID", value = "Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryMetricsResponseItemsInner deliveryMetricsResponseItemsInner = (DeliveryMetricsResponseItemsInner) o;
    return Objects.equals(this.name, deliveryMetricsResponseItemsInner.name) &&
        Objects.equals(this.category, deliveryMetricsResponseItemsInner.category) &&
        Objects.equals(this.definition, deliveryMetricsResponseItemsInner.definition) &&
        Objects.equals(this.displayName, deliveryMetricsResponseItemsInner.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, category, definition, displayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryMetricsResponseItemsInner {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

