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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ItemAvailability;



/**
 * Local inventory attributes for retail items (all fields optional for update/get)
 */

@ApiModel(description = "Local inventory attributes for retail items (all fields optional for update/get)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class RetailLocalInventoryItemAttributesOptional   {
  
  private String adLink;
  private ItemAvailability availability;
  private String price;
  private String salePrice;

  /**
   * Ad link for the item
   */
  public RetailLocalInventoryItemAttributesOptional adLink(String adLink) {
    this.adLink = adLink;
    return this;
  }

  
  @ApiModelProperty(example = "https://examplelink.com", value = "Ad link for the item")
  @JsonProperty("ad_link")
  public String getAdLink() {
    return adLink;
  }
  public void setAdLink(String adLink) {
    this.adLink = adLink;
  }

  /**
   * Availability status of the item
   */
  public RetailLocalInventoryItemAttributesOptional availability(ItemAvailability availability) {
    this.availability = availability;
    return this;
  }

  
  @ApiModelProperty(example = "in stock", value = "Availability status of the item")
  @JsonProperty("availability")
  public ItemAvailability getAvailability() {
    return availability;
  }
  public void setAvailability(ItemAvailability availability) {
    this.availability = availability;
  }

  /**
   * The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
   */
  public RetailLocalInventoryItemAttributesOptional price(String price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(example = "49.99 USD", value = "The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.")
  @JsonProperty("price")
  public String getPrice() {
    return price;
  }
  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
   */
  public RetailLocalInventoryItemAttributesOptional salePrice(String salePrice) {
    this.salePrice = salePrice;
    return this;
  }

  
  @ApiModelProperty(example = "24.99 USD", value = "The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.")
  @JsonProperty("sale_price")
  public String getSalePrice() {
    return salePrice;
  }
  public void setSalePrice(String salePrice) {
    this.salePrice = salePrice;
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
    return Objects.equals(adLink, retailLocalInventoryItemAttributesOptional.adLink) &&
        Objects.equals(availability, retailLocalInventoryItemAttributesOptional.availability) &&
        Objects.equals(price, retailLocalInventoryItemAttributesOptional.price) &&
        Objects.equals(salePrice, retailLocalInventoryItemAttributesOptional.salePrice);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

