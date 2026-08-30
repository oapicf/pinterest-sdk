package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ItemAvailability;



/**
 * Local inventory attributes for retail items (required fields for create/upsert)
 **/

@ApiModel(description = "Local inventory attributes for retail items (required fields for create/upsert)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class RetailLocalInventoryItemAttributes   {
  @JsonProperty("ad_link")
  private String adLink;

  @JsonProperty("availability")
  private ItemAvailability availability;

  @JsonProperty("price")
  private String price;

  @JsonProperty("sale_price")
  private String salePrice;

  /**
   * Ad link for the item
   **/
  public RetailLocalInventoryItemAttributes adLink(String adLink) {
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
   **/
  public RetailLocalInventoryItemAttributes availability(ItemAvailability availability) {
    this.availability = availability;
    return this;
  }

  
  @ApiModelProperty(example = "in stock", required = true, value = "Availability status of the item")
  @JsonProperty("availability")
  public ItemAvailability getAvailability() {
    return availability;
  }
  public void setAvailability(ItemAvailability availability) {
    this.availability = availability;
  }

  /**
   * The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
   **/
  public RetailLocalInventoryItemAttributes price(String price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(example = "49.99 USD", required = true, value = "The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.")
  @JsonProperty("price")
  public String getPrice() {
    return price;
  }
  public void setPrice(String price) {
    this.price = price;
  }

  /**
   * The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
   **/
  public RetailLocalInventoryItemAttributes salePrice(String salePrice) {
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
    RetailLocalInventoryItemAttributes retailLocalInventoryItemAttributes = (RetailLocalInventoryItemAttributes) o;
    return Objects.equals(adLink, retailLocalInventoryItemAttributes.adLink) &&
        Objects.equals(availability, retailLocalInventoryItemAttributes.availability) &&
        Objects.equals(price, retailLocalInventoryItemAttributes.price) &&
        Objects.equals(salePrice, retailLocalInventoryItemAttributes.salePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adLink, availability, price, salePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetailLocalInventoryItemAttributes {\n");
    
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

