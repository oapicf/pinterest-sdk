package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CartingRetailer;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CartingProduct")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CartingProduct   {
  private String cartingProductId;
  private Boolean displayPreferredRetailersOnly;
  private Boolean displayProductPrice;
  private @Valid List<@Valid CartingRetailer> preferredRetailers = new ArrayList<>();
  private Boolean randomizePreferredRetailers;

  public CartingProduct() {
  }

  @JsonCreator
  public CartingProduct(
    @JsonProperty(required = true, value = "carting_product_id") String cartingProductId
  ) {
    this.cartingProductId = cartingProductId;
  }

  /**
   * the internal Pinterest carting product id (different from industry product id)
   **/
  public CartingProduct cartingProductId(String cartingProductId) {
    this.cartingProductId = cartingProductId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "the internal Pinterest carting product id (different from industry product id)")
  @JsonProperty(required = true, value = "carting_product_id")
  @NotNull  @Pattern(regexp="^\\d+$")public String getCartingProductId() {
    return cartingProductId;
  }

  @JsonProperty(required = true, value = "carting_product_id")
  public void setCartingProductId(String cartingProductId) {
    this.cartingProductId = cartingProductId;
  }

  /**
   * Whether to display only the preferred retailers for the carting product
   **/
  public CartingProduct displayPreferredRetailersOnly(Boolean displayPreferredRetailersOnly) {
    this.displayPreferredRetailersOnly = displayPreferredRetailersOnly;
    return this;
  }

  
  @ApiModelProperty(value = "Whether to display only the preferred retailers for the carting product")
  @JsonProperty("display_preferred_retailers_only")
  public Boolean getDisplayPreferredRetailersOnly() {
    return displayPreferredRetailersOnly;
  }

  @JsonProperty("display_preferred_retailers_only")
  public void setDisplayPreferredRetailersOnly(Boolean displayPreferredRetailersOnly) {
    this.displayPreferredRetailersOnly = displayPreferredRetailersOnly;
  }

  /**
   * Whether to display the price for the carting product
   **/
  public CartingProduct displayProductPrice(Boolean displayProductPrice) {
    this.displayProductPrice = displayProductPrice;
    return this;
  }

  
  @ApiModelProperty(value = "Whether to display the price for the carting product")
  @JsonProperty("display_product_price")
  public Boolean getDisplayProductPrice() {
    return displayProductPrice;
  }

  @JsonProperty("display_product_price")
  public void setDisplayProductPrice(Boolean displayProductPrice) {
    this.displayProductPrice = displayProductPrice;
  }

  /**
   * A sorted array of preferred retailers for the carting product
   **/
  public CartingProduct preferredRetailers(List<@Valid CartingRetailer> preferredRetailers) {
    this.preferredRetailers = preferredRetailers;
    return this;
  }

  
  @ApiModelProperty(value = "A sorted array of preferred retailers for the carting product")
  @JsonProperty("preferred_retailers")
  @Valid public List<@Valid CartingRetailer> getPreferredRetailers() {
    return preferredRetailers;
  }

  @JsonProperty("preferred_retailers")
  public void setPreferredRetailers(List<@Valid CartingRetailer> preferredRetailers) {
    this.preferredRetailers = preferredRetailers;
  }

  public CartingProduct addPreferredRetailersItem(CartingRetailer preferredRetailersItem) {
    if (this.preferredRetailers == null) {
      this.preferredRetailers = new ArrayList<>();
    }

    this.preferredRetailers.add(preferredRetailersItem);
    return this;
  }

  public CartingProduct removePreferredRetailersItem(CartingRetailer preferredRetailersItem) {
    if (preferredRetailersItem != null && this.preferredRetailers != null) {
      this.preferredRetailers.remove(preferredRetailersItem);
    }

    return this;
  }
  /**
   * Whether to randomize preferred retailers for the carting product
   **/
  public CartingProduct randomizePreferredRetailers(Boolean randomizePreferredRetailers) {
    this.randomizePreferredRetailers = randomizePreferredRetailers;
    return this;
  }

  
  @ApiModelProperty(value = "Whether to randomize preferred retailers for the carting product")
  @JsonProperty("randomize_preferred_retailers")
  public Boolean getRandomizePreferredRetailers() {
    return randomizePreferredRetailers;
  }

  @JsonProperty("randomize_preferred_retailers")
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
