package apimodels;

import apimodels.ItemAvailability;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Local inventory attributes for retail items (required fields for create/upsert)
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RetailLocalInventoryItemAttributes   {
  @JsonProperty("ad_link")
  
  private String adLink;

  @JsonProperty("availability")
  @NotNull
@Valid

  private ItemAvailability availability;

  @JsonProperty("price")
  @NotNull

  private String price;

  @JsonProperty("sale_price")
  
  private String salePrice;

  public RetailLocalInventoryItemAttributes adLink(String adLink) {
    this.adLink = adLink;
    return this;
  }

   /**
   * Ad link for the item
   * @return adLink
  **/
  public String getAdLink() {
    return adLink;
  }

  public void setAdLink(String adLink) {
    this.adLink = adLink;
  }

  public RetailLocalInventoryItemAttributes availability(ItemAvailability availability) {
    this.availability = availability;
    return this;
  }

   /**
   * Availability status of the item
   * @return availability
  **/
  public ItemAvailability getAvailability() {
    return availability;
  }

  public void setAvailability(ItemAvailability availability) {
    this.availability = availability;
  }

  public RetailLocalInventoryItemAttributes price(String price) {
    this.price = price;
    return this;
  }

   /**
   * The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars.
   * @return price
  **/
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public RetailLocalInventoryItemAttributes salePrice(String salePrice) {
    this.salePrice = salePrice;
    return this;
  }

   /**
   * The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars.
   * @return salePrice
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

