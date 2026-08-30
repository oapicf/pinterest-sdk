package apimodels;

import apimodels.CartingRetailer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CartingProduct
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CartingProduct   {
  @JsonProperty("carting_product_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String cartingProductId;

  @JsonProperty("display_preferred_retailers_only")
  
  private Boolean displayPreferredRetailersOnly;

  @JsonProperty("display_product_price")
  
  private Boolean displayProductPrice;

  @JsonProperty("preferred_retailers")
  @Valid

  private List<@Valid CartingRetailer> preferredRetailers = null;

  @JsonProperty("randomize_preferred_retailers")
  
  private Boolean randomizePreferredRetailers;

  public CartingProduct cartingProductId(String cartingProductId) {
    this.cartingProductId = cartingProductId;
    return this;
  }

   /**
   * the internal Pinterest carting product id (different from industry product id)
   * @return cartingProductId
  **/
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
  **/
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
  **/
  public Boolean getDisplayProductPrice() {
    return displayProductPrice;
  }

  public void setDisplayProductPrice(Boolean displayProductPrice) {
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
  **/
  public List<@Valid CartingRetailer> getPreferredRetailers() {
    return preferredRetailers;
  }

  public void setPreferredRetailers(List<@Valid CartingRetailer> preferredRetailers) {
    this.preferredRetailers = preferredRetailers;
  }

  public CartingProduct randomizePreferredRetailers(Boolean randomizePreferredRetailers) {
    this.randomizePreferredRetailers = randomizePreferredRetailers;
    return this;
  }

   /**
   * Whether to randomize preferred retailers for the carting product
   * @return randomizePreferredRetailers
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

