package org.openapitools.model;

import org.openapitools.model.ItemAvailability;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Local inventory attributes for retail items (all fields optional for update/get)
 */
public class RetailLocalInventoryItemAttributesOptional implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Ad link for the item
   */
  @JsonProperty("ad_link")
  private String adLink;

  /**
   * Availability status of the item
   */
  @JsonProperty("availability")
  private ItemAvailability availability;

  /**
   * The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars.
   */
  @JsonProperty("price")
  private String price;

  /**
   * The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.
   */
  @JsonProperty("sale_price")
  private String salePrice;

  /**
   * Ad link for the item
   * @return adLink
   */
  public String getAdLink() {
    return adLink;
  }

  public void setAdLink(String adLink) {
    this.adLink = adLink;
  }

  /**
   * Availability status of the item
   * @return availability
   */
  public ItemAvailability getAvailability() {
    return availability;
  }

  public void setAvailability(ItemAvailability availability) {
    this.availability = availability;
  }

  /**
   * The price of the product. It supports the following formats, \&quot;49.99 USD\&quot;, \&quot;49.99USD\&quot; and \&quot;49.99\&quot;. If the currency is not included, we default to US dollars.
   * @return price
   */
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * The sale price of the product. It supports the following formats, \&quot;24.99 USD\&quot;, \&quot;24.99USD\&quot; and \&quot;24.99\&quot;. If the currency is not included, we default to US dollars.
   * @return salePrice
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
