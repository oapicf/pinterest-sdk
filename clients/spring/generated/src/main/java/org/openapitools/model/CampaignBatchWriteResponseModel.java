package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignBatchItem;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Response model for batch campaign write operations.
 */

@Schema(name = "CampaignBatchWriteResponseModel", description = "Response model for batch campaign write operations.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignBatchWriteResponseModel {

  private List<@Valid CampaignBatchItem> items = new ArrayList<>();

  public CampaignBatchWriteResponseModel() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CampaignBatchWriteResponseModel(List<@Valid CampaignBatchItem> items) {
    this.items = items;
  }

  public CampaignBatchWriteResponseModel items(List<@Valid CampaignBatchItem> items) {
    this.items = items;
    return this;
  }

  public CampaignBatchWriteResponseModel addItemsItem(CampaignBatchItem itemsItem) {
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
  public List<@Valid CampaignBatchItem> getItems() {
    return items;
  }

  @JsonProperty("items")
  public void setItems(List<@Valid CampaignBatchItem> items) {
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
    CampaignBatchWriteResponseModel campaignBatchWriteResponseModel = (CampaignBatchWriteResponseModel) o;
    return Objects.equals(this.items, campaignBatchWriteResponseModel.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignBatchWriteResponseModel {\n");
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

