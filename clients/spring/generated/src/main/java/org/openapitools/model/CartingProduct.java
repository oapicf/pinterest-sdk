package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CartingRetailer;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CartingProduct
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CartingProduct {

  private String cartingProductId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean displayPreferredRetailersOnly;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean displayProductPrice;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<@Valid CartingRetailer> preferredRetailers = new ArrayList<>();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean randomizePreferredRetailers;

  public CartingProduct() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CartingProduct(String cartingProductId) {
    this.cartingProductId = cartingProductId;
  }

  public CartingProduct cartingProductId(String cartingProductId) {
    this.cartingProductId = cartingProductId;
    return this;
  }

  /**
   * the internal Pinterest carting product id (different from industry product id)
   * @return cartingProductId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "carting_product_id", description = "the internal Pinterest carting product id (different from industry product id)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("carting_product_id")
  public String getCartingProductId() {
    return cartingProductId;
  }

  @JsonProperty("carting_product_id")
  public void setCartingProductId(String cartingProductId) {
    this.cartingProductId = cartingProductId;
  }

  public CartingProduct displayPreferredRetailersOnly(@Nullable Boolean displayPreferredRetailersOnly) {
    this.displayPreferredRetailersOnly = displayPreferredRetailersOnly;
    return this;
  }

  /**
   * Whether to display only the preferred retailers for the carting product
   * @return displayPreferredRetailersOnly
   */
  
  @Schema(name = "display_preferred_retailers_only", description = "Whether to display only the preferred retailers for the carting product", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display_preferred_retailers_only")
  public @Nullable Boolean getDisplayPreferredRetailersOnly() {
    return displayPreferredRetailersOnly;
  }

  @JsonProperty("display_preferred_retailers_only")
  public void setDisplayPreferredRetailersOnly(@Nullable Boolean displayPreferredRetailersOnly) {
    this.displayPreferredRetailersOnly = displayPreferredRetailersOnly;
  }

  public CartingProduct displayProductPrice(@Nullable Boolean displayProductPrice) {
    this.displayProductPrice = displayProductPrice;
    return this;
  }

  /**
   * Whether to display the price for the carting product
   * @return displayProductPrice
   */
  
  @Schema(name = "display_product_price", description = "Whether to display the price for the carting product", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("display_product_price")
  public @Nullable Boolean getDisplayProductPrice() {
    return displayProductPrice;
  }

  @JsonProperty("display_product_price")
  public void setDisplayProductPrice(@Nullable Boolean displayProductPrice) {
    this.displayProductPrice = displayProductPrice;
  }

  public CartingProduct preferredRetailers(List<@Valid CartingRetailer> preferredRetailers) {
    this.preferredRetailers = preferredRetailers;
    return this;
  }

  public CartingProduct addPreferredRetailersItem(CartingRetailer preferredRetailersItem) {
    if (this.preferredRetailers == null) {
      this.preferredRetailers = new ArrayList<>();
    }
    this.preferredRetailers.add(preferredRetailersItem);
    return this;
  }

  /**
   * A sorted array of preferred retailers for the carting product
   * @return preferredRetailers
   */
  @Valid 
  @Schema(name = "preferred_retailers", description = "A sorted array of preferred retailers for the carting product", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preferred_retailers")
  public List<@Valid CartingRetailer> getPreferredRetailers() {
    return preferredRetailers;
  }

  @JsonProperty("preferred_retailers")
  public void setPreferredRetailers(List<@Valid CartingRetailer> preferredRetailers) {
    this.preferredRetailers = preferredRetailers;
  }

  public CartingProduct randomizePreferredRetailers(@Nullable Boolean randomizePreferredRetailers) {
    this.randomizePreferredRetailers = randomizePreferredRetailers;
    return this;
  }

  /**
   * Whether to randomize preferred retailers for the carting product
   * @return randomizePreferredRetailers
   */
  
  @Schema(name = "randomize_preferred_retailers", description = "Whether to randomize preferred retailers for the carting product", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("randomize_preferred_retailers")
  public @Nullable Boolean getRandomizePreferredRetailers() {
    return randomizePreferredRetailers;
  }

  @JsonProperty("randomize_preferred_retailers")
  public void setRandomizePreferredRetailers(@Nullable Boolean randomizePreferredRetailers) {
    this.randomizePreferredRetailers = randomizePreferredRetailers;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CartingProduct cartingProduct = (CartingProduct) o;
    return Objects.equals(this.cartingProductId, cartingProduct.cartingProductId) &&
        Objects.equals(this.displayPreferredRetailersOnly, cartingProduct.displayPreferredRetailersOnly) &&
        Objects.equals(this.displayProductPrice, cartingProduct.displayProductPrice) &&
        Objects.equals(this.preferredRetailers, cartingProduct.preferredRetailers) &&
        Objects.equals(this.randomizePreferredRetailers, cartingProduct.randomizePreferredRetailers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartingProductId, displayPreferredRetailersOnly, displayProductPrice, preferredRetailers, randomizePreferredRetailers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartingProduct {\n");
    sb.append("    cartingProductId: ").append(toIndentedString(cartingProductId)).append("\n");
    sb.append("    displayPreferredRetailersOnly: ").append(toIndentedString(displayPreferredRetailersOnly)).append("\n");
    sb.append("    displayProductPrice: ").append(toIndentedString(displayProductPrice)).append("\n");
    sb.append("    preferredRetailers: ").append(toIndentedString(preferredRetailers)).append("\n");
    sb.append("    randomizePreferredRetailers: ").append(toIndentedString(randomizePreferredRetailers)).append("\n");
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

