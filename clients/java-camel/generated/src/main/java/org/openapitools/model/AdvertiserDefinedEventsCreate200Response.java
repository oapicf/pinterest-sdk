package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdvertiserDefinedEventProcessingRecord;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AdvertiserDefinedEventsCreate200Response
 */

@JsonTypeName("advertiser_defined_events_create_200_response")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdvertiserDefinedEventsCreate200Response {

  @Valid
  private List<@Valid AdvertiserDefinedEventProcessingRecord> items = new ArrayList<>();

  public AdvertiserDefinedEventsCreate200Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdvertiserDefinedEventsCreate200Response(List<@Valid AdvertiserDefinedEventProcessingRecord> items) {
    this.items = items;
  }

  public AdvertiserDefinedEventsCreate200Response items(List<@Valid AdvertiserDefinedEventProcessingRecord> items) {
    this.items = items;
    return this;
  }

  public AdvertiserDefinedEventsCreate200Response addItemsItem(AdvertiserDefinedEventProcessingRecord itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   */
  @NotNull @Valid 
  @Schema(name = "items", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid AdvertiserDefinedEventProcessingRecord> getItems() {
    return items;
  }

  public void setItems(List<@Valid AdvertiserDefinedEventProcessingRecord> items) {
    this.items = items;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDefinedEventsCreate200Response advertiserDefinedEventsCreate200Response = (AdvertiserDefinedEventsCreate200Response) o;
    return Objects.equals(this.items, advertiserDefinedEventsCreate200Response.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserDefinedEventsCreate200Response {\n");
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

