package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvertiserDefinedEventInput;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request body for creating or updating advertiser defined events
 */
@ApiModel(description="Request body for creating or updating advertiser defined events")

public class AdvertiserDefinedEventsCreateRequest  {
  
 /**
  * List of advertiser defined events to create or update
  */
  @ApiModelProperty(required = true, value = "List of advertiser defined events to create or update")

  @Valid

  private List<@Valid AdvertiserDefinedEventInput> items = new ArrayList<>();
 /**
   * List of advertiser defined events to create or update
   * @return items
  **/
  @JsonProperty("items")
  @NotNull
 @Size(min=1)  public List<@Valid AdvertiserDefinedEventInput> getItems() {
    return items;
  }

  public void setItems(List<@Valid AdvertiserDefinedEventInput> items) {
    this.items = items;
  }

  public AdvertiserDefinedEventsCreateRequest items(List<@Valid AdvertiserDefinedEventInput> items) {
    this.items = items;
    return this;
  }

  public AdvertiserDefinedEventsCreateRequest addItemsItem(AdvertiserDefinedEventInput itemsItem) {
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
    AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest = (AdvertiserDefinedEventsCreateRequest) o;
    return Objects.equals(this.items, advertiserDefinedEventsCreateRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserDefinedEventsCreateRequest {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

