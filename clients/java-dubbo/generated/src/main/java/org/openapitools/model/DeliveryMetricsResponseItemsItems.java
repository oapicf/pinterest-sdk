package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class DeliveryMetricsResponseItemsItems implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Category name
   */
  @JsonProperty("category")
  private String category;

  /**
   * How the metric is defined.
   */
  @JsonProperty("definition")
  private String definition;

  /**
   * Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
   */
  @JsonProperty("display_name")
  private String displayName;

  /**
   * Metric&#39;s name.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Category name
   * @return category
   */
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  /**
   * How the metric is defined.
   * @return definition
   */
  public String getDefinition() {
    return definition;
  }

  public void setDefinition(String definition) {
    this.definition = definition;
  }

  /**
   * Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager.
   * @return displayName
   */
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * Metric&#39;s name.
   * @return name
   */
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
