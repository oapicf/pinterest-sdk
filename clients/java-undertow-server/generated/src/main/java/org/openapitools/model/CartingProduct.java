/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CartingRetailer;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CartingProduct   {
  
  private String cartingProductId;
  private Boolean displayPreferredRetailersOnly;
  private Boolean displayProductPrice;
  private List<CartingRetailer> preferredRetailers = new ArrayList<>();
  private Boolean randomizePreferredRetailers;

  /**
   * the internal Pinterest carting product id (different from industry product id)
   */
  public CartingProduct cartingProductId(String cartingProductId) {
    this.cartingProductId = cartingProductId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "the internal Pinterest carting product id (different from industry product id)")
  @JsonProperty("carting_product_id")
  public String getCartingProductId() {
    return cartingProductId;
  }
  public void setCartingProductId(String cartingProductId) {
    this.cartingProductId = cartingProductId;
  }

  /**
   * Whether to display only the preferred retailers for the carting product
   */
  public CartingProduct displayPreferredRetailersOnly(Boolean displayPreferredRetailersOnly) {
    this.displayPreferredRetailersOnly = displayPreferredRetailersOnly;
    return this;
  }

  
  @ApiModelProperty(value = "Whether to display only the preferred retailers for the carting product")
  @JsonProperty("display_preferred_retailers_only")
  public Boolean getDisplayPreferredRetailersOnly() {
    return displayPreferredRetailersOnly;
  }
  public void setDisplayPreferredRetailersOnly(Boolean displayPreferredRetailersOnly) {
    this.displayPreferredRetailersOnly = displayPreferredRetailersOnly;
  }

  /**
   * Whether to display the price for the carting product
   */
  public CartingProduct displayProductPrice(Boolean displayProductPrice) {
    this.displayProductPrice = displayProductPrice;
    return this;
  }

  
  @ApiModelProperty(value = "Whether to display the price for the carting product")
  @JsonProperty("display_product_price")
  public Boolean getDisplayProductPrice() {
    return displayProductPrice;
  }
  public void setDisplayProductPrice(Boolean displayProductPrice) {
    this.displayProductPrice = displayProductPrice;
  }

  /**
   * A sorted array of preferred retailers for the carting product
   */
  public CartingProduct preferredRetailers(List<CartingRetailer> preferredRetailers) {
    this.preferredRetailers = preferredRetailers;
    return this;
  }

  
  @ApiModelProperty(value = "A sorted array of preferred retailers for the carting product")
  @JsonProperty("preferred_retailers")
  public List<CartingRetailer> getPreferredRetailers() {
    return preferredRetailers;
  }
  public void setPreferredRetailers(List<CartingRetailer> preferredRetailers) {
    this.preferredRetailers = preferredRetailers;
  }

  /**
   * Whether to randomize preferred retailers for the carting product
   */
  public CartingProduct randomizePreferredRetailers(Boolean randomizePreferredRetailers) {
    this.randomizePreferredRetailers = randomizePreferredRetailers;
    return this;
  }

  
  @ApiModelProperty(value = "Whether to randomize preferred retailers for the carting product")
  @JsonProperty("randomize_preferred_retailers")
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
    return Objects.equals(cartingProductId, cartingProduct.cartingProductId) &&
        Objects.equals(displayPreferredRetailersOnly, cartingProduct.displayPreferredRetailersOnly) &&
        Objects.equals(displayProductPrice, cartingProduct.displayProductPrice) &&
        Objects.equals(preferredRetailers, cartingProduct.preferredRetailers) &&
        Objects.equals(randomizePreferredRetailers, cartingProduct.randomizePreferredRetailers);
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

