package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeliveryMetricsResponseItemsItems;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("delivery_metrics_get_200_response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DeliveryMetricsGet200Response   {
  private @Valid List<@Valid DeliveryMetricsResponseItemsItems> items = new ArrayList<>();

  public DeliveryMetricsGet200Response() {
  }

  @JsonCreator
  public DeliveryMetricsGet200Response(
    @JsonProperty(required = true, value = "items") List<@Valid DeliveryMetricsResponseItemsItems> items
  ) {
    this.items = items;
  }

  /**
   **/
  public DeliveryMetricsGet200Response items(List<@Valid DeliveryMetricsResponseItemsItems> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "items")
  @NotNull @Valid public List<@Valid DeliveryMetricsResponseItemsItems> getItems() {
    return items;
  }

  @JsonProperty(required = true, value = "items")
  public void setItems(List<@Valid DeliveryMetricsResponseItemsItems> items) {
    this.items = items;
  }

  public DeliveryMetricsGet200Response addItemsItem(DeliveryMetricsResponseItemsItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public DeliveryMetricsGet200Response removeItemsItem(DeliveryMetricsResponseItemsItems itemsItem) {
    if (itemsItem != null && this.items != null) {
      this.items.remove(itemsItem);
    }

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
    DeliveryMetricsGet200Response deliveryMetricsGet200Response = (DeliveryMetricsGet200Response) o;
    return Objects.equals(this.items, deliveryMetricsGet200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryMetricsGet200Response {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
