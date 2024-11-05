package apimodels;

import apimodels.NonNullableCatalogsCurrency;
import apimodels.NonNullableProductAvailabilityType;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Retail product metadata entity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsRetailProductMetadata   {
  @JsonProperty("item_id")
  @NotNull

  private String itemId;

  @JsonProperty("item_group_id")
  @NotNull

  private String itemGroupId;

  @JsonProperty("availability")
  @NotNull
@Valid

  private NonNullableProductAvailabilityType availability;

  @JsonProperty("price")
  @NotNull
@Valid

  private BigDecimal price;

  @JsonProperty("sale_price")
  @NotNull
@Valid

  private BigDecimal salePrice;

  @JsonProperty("currency")
  @NotNull
@Valid

  private NonNullableCatalogsCurrency currency;

  public CatalogsRetailProductMetadata itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The user-created unique ID that represents the product.
   * @return itemId
  **/
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public CatalogsRetailProductMetadata itemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
    return this;
  }

   /**
   * The parent ID of the product.
   * @return itemGroupId
  **/
  public String getItemGroupId() {
    return itemGroupId;
  }

  public void setItemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
  }

  public CatalogsRetailProductMetadata availability(NonNullableProductAvailabilityType availability) {
    this.availability = availability;
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  public NonNullableProductAvailabilityType getAvailability() {
    return availability;
  }

  public void setAvailability(NonNullableProductAvailabilityType availability) {
    this.availability = availability;
  }

  public CatalogsRetailProductMetadata price(BigDecimal price) {
    this.price = price;
    return this;
  }

   /**
   * The price of the product.
   * @return price
  **/
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public CatalogsRetailProductMetadata salePrice(BigDecimal salePrice) {
    this.salePrice = salePrice;
    return this;
  }

   /**
   * The discounted price of the product.
   * @return salePrice
  **/
  public BigDecimal getSalePrice() {
    return salePrice;
  }

  public void setSalePrice(BigDecimal salePrice) {
    this.salePrice = salePrice;
  }

  public CatalogsRetailProductMetadata currency(NonNullableCatalogsCurrency currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

