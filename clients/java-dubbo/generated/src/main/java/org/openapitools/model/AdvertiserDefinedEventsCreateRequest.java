package org.openapitools.model;

import org.openapitools.model.AdvertiserDefinedEventInput;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Request body for creating or updating advertiser defined events
 */
public class AdvertiserDefinedEventsCreateRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * List of advertiser defined events to create or update
   */
  @JsonProperty("items")
  private List<AdvertiserDefinedEventInput> items = new ArrayList<>();

  /**
   * List of advertiser defined events to create or update
   * @return items
   */
  public List<AdvertiserDefinedEventInput> getItems() {
    return items;
  }

  public void setItems(List<AdvertiserDefinedEventInput> items) {
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
