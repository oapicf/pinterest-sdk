package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateInvitesResultsResponseArrayItemsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateInvitesResultsResponseArray
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateInvitesResultsResponseArray {

  @Valid
  private List<@Valid UpdateInvitesResultsResponseArrayItemsInner> items = new ArrayList<>();

  public UpdateInvitesResultsResponseArray items(List<@Valid UpdateInvitesResultsResponseArrayItemsInner> items) {
    this.items = items;
    return this;
  }

  public UpdateInvitesResultsResponseArray addItemsItem(UpdateInvitesResultsResponseArrayItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
   * @return items
   */
  @Valid 
  @Schema(name = "items", description = "List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid UpdateInvitesResultsResponseArrayItemsInner> getItems() {
    return items;
  }

  public void setItems(List<@Valid UpdateInvitesResultsResponseArrayItemsInner> items) {
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
    UpdateInvitesResultsResponseArray updateInvitesResultsResponseArray = (UpdateInvitesResultsResponseArray) o;
    return Objects.equals(this.items, updateInvitesResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInvitesResultsResponseArray {\n");
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

