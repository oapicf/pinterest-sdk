package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AudienceDefinition;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AudienceDefinitionResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private List<@Valid AudienceDefinition> items;
 /**
  * Get items
  * @return items
  */
  @JsonProperty("items")
  public List<@Valid AudienceDefinition> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid AudienceDefinition> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public AudienceDefinitionResponse items(List<@Valid AudienceDefinition> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public AudienceDefinitionResponse addItemsItem(AudienceDefinition itemsItem) {
    this.items.add(itemsItem);
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
    AudienceDefinitionResponse audienceDefinitionResponse = (AudienceDefinitionResponse) o;
    return Objects.equals(this.items, audienceDefinitionResponse.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AudienceDefinitionResponse {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

