package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.api.model.NonNullableCatalogsCurrency;
import org.openapitools.server.api.model.NonNullableProductAvailabilityType;

/**
 * Retail product metadata entity
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsRetailProductMetadata   {
  
  private String itemId;
  private String itemGroupId;
  private NonNullableProductAvailabilityType availability;
  private BigDecimal price;
  private BigDecimal salePrice;
  private NonNullableCatalogsCurrency currency;

  public CatalogsRetailProductMetadata () {

  }

  public CatalogsRetailProductMetadata (String itemId, String itemGroupId, NonNullableProductAvailabilityType availability, BigDecimal price, BigDecimal salePrice, NonNullableCatalogsCurrency currency) {
    this.itemId = itemId;
    this.itemGroupId = itemGroupId;
    this.availability = availability;
    this.price = price;
    this.salePrice = salePrice;
    this.currency = currency;
  }

    
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

    
  @JsonProperty("item_group_id")
  public String getItemGroupId() {
    return itemGroupId;
  }
  public void setItemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
  }

    
  @JsonProperty("availability")
  public NonNullableProductAvailabilityType getAvailability() {
    return availability;
  }
  public void setAvailability(NonNullableProductAvailabilityType availability) {
    this.availability = availability;
  }

    
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

    
  @JsonProperty("sale_price")
  public BigDecimal getSalePrice() {
    return salePrice;
  }
  public void setSalePrice(BigDecimal salePrice) {
    this.salePrice = salePrice;
  }

    
  @JsonProperty("currency")
  public NonNullableCatalogsCurrency getCurrency() {
    return currency;
  }
  public void setCurrency(NonNullableCatalogsCurrency currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailProductMetadata catalogsRetailProductMetadata = (CatalogsRetailProductMetadata) o;
    return Objects.equals(itemId, catalogsRetailProductMetadata.itemId) &&
        Objects.equals(itemGroupId, catalogsRetailProductMetadata.itemGroupId) &&
        Objects.equals(availability, catalogsRetailProductMetadata.availability) &&
        Objects.equals(price, catalogsRetailProductMetadata.price) &&
        Objects.equals(salePrice, catalogsRetailProductMetadata.salePrice) &&
        Objects.equals(currency, catalogsRetailProductMetadata.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, itemGroupId, availability, price, salePrice, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailProductMetadata {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    itemGroupId: ").append(toIndentedString(itemGroupId)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    salePrice: ").append(toIndentedString(salePrice)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
