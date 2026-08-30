package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CartingRetailer;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CartingProduct  {
  
 /**
  * the internal Pinterest carting product id (different from industry product id)
  */
  @ApiModelProperty(required = true, value = "the internal Pinterest carting product id (different from industry product id)")
  private String cartingProductId;

 /**
  * Whether to display only the preferred retailers for the carting product
  */
  @ApiModelProperty(value = "Whether to display only the preferred retailers for the carting product")
  private Boolean displayPreferredRetailersOnly;

 /**
  * Whether to display the price for the carting product
  */
  @ApiModelProperty(value = "Whether to display the price for the carting product")
  private Boolean displayProductPrice;

 /**
  * A sorted array of preferred retailers for the carting product
  */
  @ApiModelProperty(value = "A sorted array of preferred retailers for the carting product")
  @Valid
  private List<@Valid CartingRetailer> preferredRetailers = new ArrayList<>();

 /**
  * Whether to randomize preferred retailers for the carting product
  */
  @ApiModelProperty(value = "Whether to randomize preferred retailers for the carting product")
  private Boolean randomizePreferredRetailers;
 /**
  * the internal Pinterest carting product id (different from industry product id)
  * @return cartingProductId
  */
  @JsonProperty("carting_product_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getCartingProductId() {
    return cartingProductId;
  }

  /**
   * Sets the <code>cartingProductId</code> property.
   */
 public void setCartingProductId(String cartingProductId) {
    this.cartingProductId = cartingProductId;
  }

  /**
   * Sets the <code>cartingProductId</code> property.
   */
  public CartingProduct cartingProductId(String cartingProductId) {
    this.cartingProductId = cartingProductId;
    return this;
  }

 /**
  * Whether to display only the preferred retailers for the carting product
  * @return displayPreferredRetailersOnly
  */
  @JsonProperty("display_preferred_retailers_only")
  public Boolean getDisplayPreferredRetailersOnly() {
    return displayPreferredRetailersOnly;
  }

  /**
   * Sets the <code>displayPreferredRetailersOnly</code> property.
   */
 public void setDisplayPreferredRetailersOnly(Boolean displayPreferredRetailersOnly) {
    this.displayPreferredRetailersOnly = displayPreferredRetailersOnly;
  }

  /**
   * Sets the <code>displayPreferredRetailersOnly</code> property.
   */
  public CartingProduct displayPreferredRetailersOnly(Boolean displayPreferredRetailersOnly) {
    this.displayPreferredRetailersOnly = displayPreferredRetailersOnly;
    return this;
  }

 /**
  * Whether to display the price for the carting product
  * @return displayProductPrice
  */
  @JsonProperty("display_product_price")
  public Boolean getDisplayProductPrice() {
    return displayProductPrice;
  }

  /**
   * Sets the <code>displayProductPrice</code> property.
   */
 public void setDisplayProductPrice(Boolean displayProductPrice) {
    this.displayProductPrice = displayProductPrice;
  }

  /**
   * Sets the <code>displayProductPrice</code> property.
   */
  public CartingProduct displayProductPrice(Boolean displayProductPrice) {
    this.displayProductPrice = displayProductPrice;
    return this;
  }

 /**
  * A sorted array of preferred retailers for the carting product
  * @return preferredRetailers
  */
  @JsonProperty("preferred_retailers")
  public List<@Valid CartingRetailer> getPreferredRetailers() {
    return preferredRetailers;
  }

  /**
   * Sets the <code>preferredRetailers</code> property.
   */
 public void setPreferredRetailers(List<@Valid CartingRetailer> preferredRetailers) {
    this.preferredRetailers = preferredRetailers;
  }

  /**
   * Sets the <code>preferredRetailers</code> property.
   */
  public CartingProduct preferredRetailers(List<@Valid CartingRetailer> preferredRetailers) {
    this.preferredRetailers = preferredRetailers;
    return this;
  }

  /**
   * Adds a new item to the <code>preferredRetailers</code> list.
   */
  public CartingProduct addPreferredRetailersItem(CartingRetailer preferredRetailersItem) {
    this.preferredRetailers.add(preferredRetailersItem);
    return this;
  }

 /**
  * Whether to randomize preferred retailers for the carting product
  * @return randomizePreferredRetailers
  */
  @JsonProperty("randomize_preferred_retailers")
  public Boolean getRandomizePreferredRetailers() {
    return randomizePreferredRetailers;
  }

  /**
   * Sets the <code>randomizePreferredRetailers</code> property.
   */
 public void setRandomizePreferredRetailers(Boolean randomizePreferredRetailers) {
    this.randomizePreferredRetailers = randomizePreferredRetailers;
  }

  /**
   * Sets the <code>randomizePreferredRetailers</code> property.
   */
  public CartingProduct randomizePreferredRetailers(Boolean randomizePreferredRetailers) {
    this.randomizePreferredRetailers = randomizePreferredRetailers;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

