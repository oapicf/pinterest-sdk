package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeletePartnerAssetAccessResult;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DeletePartnerAssetAccessResultsResponseArray
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DeletePartnerAssetAccessResultsResponseArray {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid DeletePartnerAssetAccessResult> items = new ArrayList<>();

  public DeletePartnerAssetAccessResultsResponseArray items(List<@Valid DeletePartnerAssetAccessResult> items) {
    this.items = items;
    return this;
  }

  public DeletePartnerAssetAccessResultsResponseArray addItemsItem(DeletePartnerAssetAccessResult itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * List of terminated partner asset accesses.
   * @return items
   */
  @Valid 
  @Schema(name = "items", description = "List of terminated partner asset accesses.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid DeletePartnerAssetAccessResult> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<@Valid DeletePartnerAssetAccessResult> items) {
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
    DeletePartnerAssetAccessResultsResponseArray deletePartnerAssetAccessResultsResponseArray = (DeletePartnerAssetAccessResultsResponseArray) o;
    return Objects.equals(this.items, deletePartnerAssetAccessResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePartnerAssetAccessResultsResponseArray {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

