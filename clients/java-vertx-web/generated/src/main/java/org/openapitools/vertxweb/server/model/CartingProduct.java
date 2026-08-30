package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CartingRetailer;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CartingProduct   {
  
  private String cartingProductId;
  private Boolean displayPreferredRetailersOnly;
  private Boolean displayProductPrice;
  private List<CartingRetailer> preferredRetailers = new ArrayList<>();
  private Boolean randomizePreferredRetailers;

  public CartingProduct () {

  }

  public CartingProduct (String cartingProductId, Boolean displayPreferredRetailersOnly, Boolean displayProductPrice, List<CartingRetailer> preferredRetailers, Boolean randomizePreferredRetailers) {
    this.cartingProductId = cartingProductId;
    this.displayPreferredRetailersOnly = displayPreferredRetailersOnly;
    this.displayProductPrice = displayProductPrice;
    this.preferredRetailers = preferredRetailers;
    this.randomizePreferredRetailers = randomizePreferredRetailers;
  }

    
  @JsonProperty("carting_product_id")
  public String getCartingProductId() {
    return cartingProductId;
  }
  public void setCartingProductId(String cartingProductId) {
    this.cartingProductId = cartingProductId;
  }

    
  @JsonProperty("display_preferred_retailers_only")
  public Boolean getDisplayPreferredRetailersOnly() {
    return displayPreferredRetailersOnly;
  }
  public void setDisplayPreferredRetailersOnly(Boolean displayPreferredRetailersOnly) {
    this.displayPreferredRetailersOnly = displayPreferredRetailersOnly;
  }

    
  @JsonProperty("display_product_price")
  public Boolean getDisplayProductPrice() {
    return displayProductPrice;
  }
  public void setDisplayProductPrice(Boolean displayProductPrice) {
    this.displayProductPrice = displayProductPrice;
  }

    
  @JsonProperty("preferred_retailers")
  public List<CartingRetailer> getPreferredRetailers() {
    return preferredRetailers;
  }
  public void setPreferredRetailers(List<CartingRetailer> preferredRetailers) {
    this.preferredRetailers = preferredRetailers;
  }

    
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
