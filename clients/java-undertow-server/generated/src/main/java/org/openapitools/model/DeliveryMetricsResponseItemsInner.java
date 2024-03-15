/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DeliveryMetricsResponseItemsInner   {
  
  private String name;


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
      return value;
    }
  }

  private CategoryEnum category;
  private String definition;
  private String displayName;

  /**
   * Metric's name.
   */
  public DeliveryMetricsResponseItemsInner name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "AD_GROUP_ID", value = "Metric's name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Category name
   */
  public DeliveryMetricsResponseItemsInner category(CategoryEnum category) {
    this.category = category;
    return this;
  }

  
  @ApiModelProperty(example = "ADS", value = "Category name")
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  /**
   * How the metric is defined.
   */
  public DeliveryMetricsResponseItemsInner definition(String definition) {
    this.definition = definition;
    return this;
  }

  
  @ApiModelProperty(example = "Unique ID for your ad group", value = "How the metric is defined.")
  @JsonProperty("definition")
  public String getDefinition() {
    return definition;
  }
  public void setDefinition(String definition) {
    this.definition = definition;
  }

  /**
   * Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
   */
  public DeliveryMetricsResponseItemsInner displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  
  @ApiModelProperty(example = "Ad group ID", value = "Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.")
  @JsonProperty("display_name")
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
    return Objects.equals(name, deliveryMetricsResponseItemsInner.name) &&
        Objects.equals(category, deliveryMetricsResponseItemsInner.category) &&
        Objects.equals(definition, deliveryMetricsResponseItemsInner.definition) &&
        Objects.equals(displayName, deliveryMetricsResponseItemsInner.displayName);
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

