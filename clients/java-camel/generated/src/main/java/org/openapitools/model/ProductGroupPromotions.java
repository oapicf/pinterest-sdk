package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ProductGroupPromotionResponseItem;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Wrapper model for ProductGroupPromotion.
 */

@Schema(name = "ProductGroupPromotions", description = "Wrapper model for ProductGroupPromotion.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ProductGroupPromotions {

  @Valid
  private List<@Valid ProductGroupPromotionResponseItem> items = new ArrayList<>();

  public ProductGroupPromotions items(List<@Valid ProductGroupPromotionResponseItem> items) {
    this.items = items;
    return this;
  }

  public ProductGroupPromotions addItemsItem(ProductGroupPromotionResponseItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Response-only: created or updated product group promotions, or exceptions.
   * @return items
   */
  @Valid 
  @Schema(name = "items", accessMode = Schema.AccessMode.READ_ONLY, description = "Response-only: created or updated product group promotions, or exceptions.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("items")
  public List<@Valid ProductGroupPromotionResponseItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid ProductGroupPromotionResponseItem> items) {
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
    ProductGroupPromotions productGroupPromotions = (ProductGroupPromotions) o;
    return Objects.equals(this.items, productGroupPromotions.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductGroupPromotions {\n");
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

