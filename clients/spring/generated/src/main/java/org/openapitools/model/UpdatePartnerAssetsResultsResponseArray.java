package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdatePartnerAssetsResult;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * UpdatePartnerAssetsResultsResponseArray
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class UpdatePartnerAssetsResultsResponseArray {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid UpdatePartnerAssetsResult> items = new ArrayList<>();

  public UpdatePartnerAssetsResultsResponseArray items(List<@Valid UpdatePartnerAssetsResult> items) {
    this.items = items;
    return this;
  }

  public UpdatePartnerAssetsResultsResponseArray addItemsItem(UpdatePartnerAssetsResult itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * List of assigned/updated partner asset access.
   * @return items
   */
  @Valid 
  @Schema(name = "items", description = "List of assigned/updated partner asset access.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid UpdatePartnerAssetsResult> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<@Valid UpdatePartnerAssetsResult> items) {
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
    UpdatePartnerAssetsResultsResponseArray updatePartnerAssetsResultsResponseArray = (UpdatePartnerAssetsResultsResponseArray) o;
    return Objects.equals(this.items, updatePartnerAssetsResultsResponseArray.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePartnerAssetsResultsResponseArray {\n");
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

