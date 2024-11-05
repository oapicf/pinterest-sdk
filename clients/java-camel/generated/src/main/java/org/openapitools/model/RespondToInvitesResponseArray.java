package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.RespondToInvitesResponseArrayItemsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * RespondToInvitesResponseArray
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RespondToInvitesResponseArray {

  @Valid
  private List<@Valid RespondToInvitesResponseArrayItemsInner> items = new ArrayList<>();

  public RespondToInvitesResponseArray items(List<@Valid RespondToInvitesResponseArrayItemsInner> items) {
    this.items = items;
    return this;
  }

  public RespondToInvitesResponseArray addItemsItem(RespondToInvitesResponseArrayItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned.
   * @return items
   */
  @Valid 
  @Schema(name = "items", description = "List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid RespondToInvitesResponseArrayItemsInner> getItems() {
    return items;
  }

  public void setItems(List<@Valid RespondToInvitesResponseArrayItemsInner> items) {
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
    RespondToInvitesResponseArray respondToInvitesResponseArray = (RespondToInvitesResponseArray) o;
    return Objects.equals(this.items, respondToInvitesResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespondToInvitesResponseArray {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

