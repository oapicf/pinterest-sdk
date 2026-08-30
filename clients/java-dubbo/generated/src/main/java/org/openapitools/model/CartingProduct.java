package org.openapitools.model;

import org.openapitools.model.CartingRetailer;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CartingProduct implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * the internal Pinterest carting product id (different from industry product id)
   */
  @JsonProperty("carting_product_id")
  private String cartingProductId;

  /**
   * Whether to display only the preferred retailers for the carting product
   */
  @JsonProperty("display_preferred_retailers_only")
  private Boolean displayPreferredRetailersOnly;

  /**
   * Whether to display the price for the carting product
   */
  @JsonProperty("display_product_price")
  private Boolean displayProductPrice;

  /**
   * A sorted array of preferred retailers for the carting product
   */
  @JsonProperty("preferred_retailers")
  private List<CartingRetailer> preferredRetailers = new ArrayList<>();

  /**
   * Whether to randomize preferred retailers for the carting product
   */
  @JsonProperty("randomize_preferred_retailers")
  private Boolean randomizePreferredRetailers;

  /**
   * the internal Pinterest carting product id (different from industry product id)
   * @return cartingProductId
   */
  public String getCartingProductId() {
    return cartingProductId;
  }

  public void setCartingProductId(String cartingProductId) {
    this.cartingProductId = cartingProductId;
  }

  /**
   * Whether to display only the preferred retailers for the carting product
   * @return displayPreferredRetailersOnly
   */
  public Boolean getDisplayPreferredRetailersOnly() {
    return displayPreferredRetailersOnly;
  }

  public void setDisplayPreferredRetailersOnly(Boolean displayPreferredRetailersOnly) {
    this.displayPreferredRetailersOnly = displayPreferredRetailersOnly;
  }

  /**
   * Whether to display the price for the carting product
   * @return displayProductPrice
   */
  public Boolean getDisplayProductPrice() {
    return displayProductPrice;
  }

  public void setDisplayProductPrice(Boolean displayProductPrice) {
    this.displayProductPrice = displayProductPrice;
  }

  /**
   * A sorted array of preferred retailers for the carting product
   * @return preferredRetailers
   */
  public List<CartingRetailer> getPreferredRetailers() {
    return preferredRetailers;
  }

  public void setPreferredRetailers(List<CartingRetailer> preferredRetailers) {
    this.preferredRetailers = preferredRetailers;
  }

  /**
   * Whether to randomize preferred retailers for the carting product
   * @return randomizePreferredRetailers
   */
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
