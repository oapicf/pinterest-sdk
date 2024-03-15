package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeliveryMetricsResponseItemsInner  {
  
 /**
  * Metric's name.
  */
  @ApiModelProperty(example = "AD_GROUP_ID", value = "Metric's name.")
  private String name;

public enum CategoryEnum {

    @JsonProperty("ADS") ADS(String.valueOf("ADS")),
    @JsonProperty("ORGANIC") ORGANIC(String.valueOf("ORGANIC"));

    private String value;

    CategoryEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CategoryEnum fromValue(String value) {
        for (CategoryEnum b : CategoryEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Category name
  */
  @ApiModelProperty(example = "ADS", value = "Category name")
  private CategoryEnum category;

 /**
  * How the metric is defined.
  */
  @ApiModelProperty(example = "Unique ID for your ad group", value = "How the metric is defined.")
  private String definition;

 /**
  * Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
  */
  @ApiModelProperty(example = "Ad group ID", value = "Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.")
  private String displayName;
 /**
  * Metric&#39;s name.
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public DeliveryMetricsResponseItemsInner name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Category name
  * @return category
  */
  @JsonProperty("category")
  public String getCategory() {
    return category == null ? null : category.value();
  }

  /**
   * Sets the <code>category</code> property.
   */
 public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  /**
   * Sets the <code>category</code> property.
   */
  public DeliveryMetricsResponseItemsInner category(CategoryEnum category) {
    this.category = category;
    return this;
  }

 /**
  * How the metric is defined.
  * @return definition
  */
  @JsonProperty("definition")
  public String getDefinition() {
    return definition;
  }

  /**
   * Sets the <code>definition</code> property.
   */
 public void setDefinition(String definition) {
    this.definition = definition;
  }

  /**
   * Sets the <code>definition</code> property.
   */
  public DeliveryMetricsResponseItemsInner definition(String definition) {
    this.definition = definition;
    return this;
  }

 /**
  * Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
  * @return displayName
  */
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Sets the <code>displayName</code> property.
   */
 public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * Sets the <code>displayName</code> property.
   */
  public DeliveryMetricsResponseItemsInner displayName(String displayName) {
    this.displayName = displayName;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

