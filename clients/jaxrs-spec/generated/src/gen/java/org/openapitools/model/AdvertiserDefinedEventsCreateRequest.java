package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvertiserDefinedEventInput;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Request body for creating or updating advertiser defined events
 **/
@ApiModel(description = "Request body for creating or updating advertiser defined events")
@JsonTypeName("AdvertiserDefinedEventsCreateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdvertiserDefinedEventsCreateRequest   {
  private @Valid List<@Valid AdvertiserDefinedEventInput> items = new ArrayList<>();

  public AdvertiserDefinedEventsCreateRequest() {
  }

  @JsonCreator
  public AdvertiserDefinedEventsCreateRequest(
    @JsonProperty(required = true, value = "items") List<@Valid AdvertiserDefinedEventInput> items
  ) {
    this.items = items;
  }

  /**
   * List of advertiser defined events to create or update
   **/
  public AdvertiserDefinedEventsCreateRequest items(List<@Valid AdvertiserDefinedEventInput> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of advertiser defined events to create or update")
  @JsonProperty(required = true, value = "items")
  @NotNull @Valid  @Size(min=1)public List<@Valid AdvertiserDefinedEventInput> getItems() {
    return items;
  }

  @JsonProperty(required = true, value = "items")
  public void setItems(List<@Valid AdvertiserDefinedEventInput> items) {
    this.items = items;
  }

  public AdvertiserDefinedEventsCreateRequest addItemsItem(AdvertiserDefinedEventInput itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }

    this.items.add(itemsItem);
    return this;
  }

  public AdvertiserDefinedEventsCreateRequest removeItemsItem(AdvertiserDefinedEventInput itemsItem) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
