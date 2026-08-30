package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CartingRetailer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CartingProduct
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CartingProduct   {
  @JsonProperty("carting_product_id")
  private String cartingProductId;

  @JsonProperty("display_preferred_retailers_only")
  private Boolean displayPreferredRetailersOnly;

  @JsonProperty("display_product_price")
  private Boolean displayProductPrice;

  @JsonProperty("preferred_retailers")
  
  private List<CartingRetailer> preferredRetailers = null;

  @JsonProperty("randomize_preferred_retailers")
  private Boolean randomizePreferredRetailers;

  public CartingProduct cartingProductId(String cartingProductId) {
    this.cartingProductId = cartingProductId;
    return this;
  }

  /**
   * the internal Pinterest carting product id (different from industry product id)
   * @return cartingProductId
   */
  @ApiModelProperty(required = true, value = "the internal Pinterest carting product id (different from industry product id)")
  public String getCartingProductId() {
    return cartingProductId;
  }

  public void setCartingProductId(String cartingProductId) {
    this.cartingProductId = cartingProductId;
  }

  public CartingProduct displayPreferredRetailersOnly(Boolean displayPreferredRetailersOnly) {
    this.displayPreferredRetailersOnly = displayPreferredRetailersOnly;
    return this;
  }

  /**
   * Whether to display only the preferred retailers for the carting product
   * @return displayPreferredRetailersOnly
   */
  @ApiModelProperty(value = "Whether to display only the preferred retailers for the carting product")
  public Boolean getDisplayPreferredRetailersOnly() {
    return displayPreferredRetailersOnly;
  }

  public void setDisplayPreferredRetailersOnly(Boolean displayPreferredRetailersOnly) {
    this.displayPreferredRetailersOnly = displayPreferredRetailersOnly;
  }

  public CartingProduct displayProductPrice(Boolean displayProductPrice) {
    this.displayProductPrice = displayProductPrice;
    return this;
  }

  /**
   * Whether to display the price for the carting product
   * @return displayProductPrice
   */
  @ApiModelProperty(value = "Whether to display the price for the carting product")
  public Boolean getDisplayProductPrice() {
    return displayProductPrice;
  }

  public void setDisplayProductPrice(Boolean displayProductPrice) {
    this.displayProductPrice = displayProductPrice;
  }

  public CartingProduct preferredRetailers(List<CartingRetailer> preferredRetailers) {
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
  @ApiModelProperty(value = "A sorted array of preferred retailers for the carting product")
  public List<CartingRetailer> getPreferredRetailers() {
    return preferredRetailers;
  }

  public void setPreferredRetailers(List<CartingRetailer> preferredRetailers) {
    this.preferredRetailers = preferredRetailers;
  }

  public CartingProduct randomizePreferredRetailers(Boolean randomizePreferredRetailers) {
    this.randomizePreferredRetailers = randomizePreferredRetailers;
    return this;
  }

  /**
   * Whether to randomize preferred retailers for the carting product
   * @return randomizePreferredRetailers
   */
  @ApiModelProperty(value = "Whether to randomize preferred retailers for the carting product")
  public Boolean getRandomizePreferredRetailers() {
    return randomizePreferredRetailers;
  }

  public void setRandomizePreferredRetailers(Boolean randomizePreferredRetailers) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

