package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.ItemAvailability;

/**
 * Local inventory attributes for retail items (required fields for create/upsert)
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RetailLocalInventoryItemAttributes   {
  
  private String adLink;
  private ItemAvailability availability;
  private String price;
  private String salePrice;

  public RetailLocalInventoryItemAttributes () {

  }

  public RetailLocalInventoryItemAttributes (String adLink, ItemAvailability availability, String price, String salePrice) {
    this.adLink = adLink;
    this.availability = availability;
    this.price = price;
    this.salePrice = salePrice;
  }

    
  @JsonProperty("ad_link")
  public String getAdLink() {
    return adLink;
  }
  public void setAdLink(String adLink) {
    this.adLink = adLink;
  }

    
  @JsonProperty("availability")
  public ItemAvailability getAvailability() {
    return availability;
  }
  public void setAvailability(ItemAvailability availability) {
    this.availability = availability;
  }

    
  @JsonProperty("price")
  public String getPrice() {
    return price;
  }
  public void setPrice(String price) {
    this.price = price;
  }

    
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
