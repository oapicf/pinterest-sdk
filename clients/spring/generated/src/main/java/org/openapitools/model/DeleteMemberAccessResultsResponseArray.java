package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeleteMemberAccessResult;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * DeleteMemberAccessResultsResponseArray
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeleteMemberAccessResultsResponseArray {

  @Valid
  private List<@Valid DeleteMemberAccessResult> items = new ArrayList<>();

  public DeleteMemberAccessResultsResponseArray items(List<@Valid DeleteMemberAccessResult> items) {
    this.items = items;
    return this;
  }

  public DeleteMemberAccessResultsResponseArray addItemsItem(DeleteMemberAccessResult itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * List of member asset permissions that were deleted.
   * @return items
   */
  @Valid 
  @Schema(name = "items", description = "List of member asset permissions that were deleted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid DeleteMemberAccessResult> getItems() {
    return items;
  }

  public void setItems(List<@Valid DeleteMemberAccessResult> items) {
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
    DeleteMemberAccessResultsResponseArray deleteMemberAccessResultsResponseArray = (DeleteMemberAccessResultsResponseArray) o;
    return Objects.equals(this.items, deleteMemberAccessResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteMemberAccessResultsResponseArray {\n");
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

