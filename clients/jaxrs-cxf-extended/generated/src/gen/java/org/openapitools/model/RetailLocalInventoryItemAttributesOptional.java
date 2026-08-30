package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ItemAvailability;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Local inventory attributes for retail items (all fields optional for update/get)
 */
@ApiModel(description="Local inventory attributes for retail items (all fields optional for update/get)")

public class RetailLocalInventoryItemAttributesOptional  {
  
 /**
  * Ad link for the item
  */
  @ApiModelProperty(example = "https://examplelink.com", value = "Ad link for the item")
  private String adLink;

 /**
  * Availability status of the item
  */
  @ApiModelProperty(example = "in stock", value = "Availability status of the item")
  @Valid
  private ItemAvailability availability;

 /**
  * The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
  */
  @ApiModelProperty(example = "49.99 USD", value = "The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.")
  private String price;

 /**
  * The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
  */
  @ApiModelProperty(example = "24.99 USD", value = "The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.")
  private String salePrice;
 /**
  * Ad link for the item
  * @return adLink
  */
  @JsonProperty("ad_link")
  public String getAdLink() {
    return adLink;
  }

  /**
   * Sets the <code>adLink</code> property.
   */
 public void setAdLink(String adLink) {
    this.adLink = adLink;
  }

  /**
   * Sets the <code>adLink</code> property.
   */
  public RetailLocalInventoryItemAttributesOptional adLink(String adLink) {
    this.adLink = adLink;
    return this;
  }

 /**
  * Availability status of the item
  * @return availability
  */
  @JsonProperty("availability")
  public ItemAvailability getAvailability() {
    return availability;
  }

  /**
   * Sets the <code>availability</code> property.
   */
 public void setAvailability(ItemAvailability availability) {
    this.availability = availability;
  }

  /**
   * Sets the <code>availability</code> property.
   */
  public RetailLocalInventoryItemAttributesOptional availability(ItemAvailability availability) {
    this.availability = availability;
    return this;
  }

 /**
  * The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars.
  * @return price
  */
  @JsonProperty("price")
  public String getPrice() {
    return price;
  }

  /**
   * Sets the <code>price</code> property.
   */
 public void setPrice(String price) {
    this.price = price;
  }

  /**
   * Sets the <code>price</code> property.
   */
  public RetailLocalInventoryItemAttributesOptional price(String price) {
    this.price = price;
    return this;
  }

 /**
  * The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.
  * @return salePrice
  */
  @JsonProperty("sale_price")
  public String getSalePrice() {
    return salePrice;
  }

  /**
   * Sets the <code>salePrice</code> property.
   */
 public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
  }

  /**
   * Sets the <code>salePrice</code> property.
   */
  public RetailLocalInventoryItemAttributesOptional salePrice(String salePrice) {
    this.salePrice = salePrice;
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
    RetailLocalInventoryItemAttributesOptional retailLocalInventoryItemAttributesOptional = (RetailLocalInventoryItemAttributesOptional) o;
    return Objects.equals(this.adLink, retailLocalInventoryItemAttributesOptional.adLink) &&
        Objects.equals(this.availability, retailLocalInventoryItemAttributesOptional.availability) &&
        Objects.equals(this.price, retailLocalInventoryItemAttributesOptional.price) &&
        Objects.equals(this.salePrice, retailLocalInventoryItemAttributesOptional.salePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adLink, availability, price, salePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailLocalInventoryItemAttributesOptional {\n");
    
    sb.append("    adLink: ").append(toIndentedString(adLink)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
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

