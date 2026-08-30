package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ItemAttributesRequest;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Object describing an item batch record to upsert items
 */

@Schema(name = "ItemUpsertBatchRecord", description = "Object describing an item batch record to upsert items")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ItemUpsertBatchRecord {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ItemAttributesRequest attributes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String itemId;

  public ItemUpsertBatchRecord attributes(@Nullable ItemAttributesRequest attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  @Valid 
  @Schema(name = "attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributes")
  public @Nullable ItemAttributesRequest getAttributes() {
    return attributes;
  }

  @JsonProperty("attributes")
  public void setAttributes(@Nullable ItemAttributesRequest attributes) {
    this.attributes = attributes;
  }

  public ItemUpsertBatchRecord itemId(@Nullable String itemId) {
    this.itemId = itemId;
    return this;
  }

  /**
   * The catalog item id in the merchant namespace
   * @return itemId
   */
  
  @Schema(name = "item_id", example = "DS0294-M", description = "The catalog item id in the merchant namespace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("item_id")
  public @Nullable String getItemId() {
    return itemId;
  }

  @JsonProperty("item_id")
  public void setItemId(@Nullable String itemId) {
    this.itemId = itemId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemUpsertBatchRecord itemUpsertBatchRecord = (ItemUpsertBatchRecord) o;
    return Objects.equals(this.attributes, itemUpsertBatchRecord.attributes) &&
        Objects.equals(this.itemId, itemUpsertBatchRecord.itemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, itemId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemUpsertBatchRecord {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

