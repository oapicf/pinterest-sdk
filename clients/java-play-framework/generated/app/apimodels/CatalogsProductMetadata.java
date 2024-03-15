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
 * Product metadata entity
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsProductMetadata   {
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

  public CatalogsProductMetadata itemId(String itemId) {
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

  public CatalogsProductMetadata itemGroupId(String itemGroupId) {
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

  public CatalogsProductMetadata availability(NonNullableProductAvailabilityType availability) {
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

  public CatalogsProductMetadata price(BigDecimal price) {
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

  public CatalogsProductMetadata salePrice(BigDecimal salePrice) {
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

  public CatalogsProductMetadata currency(NonNullableCatalogsCurrency currency) {
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
    CatalogsProductMetadata catalogsProductMetadata = (CatalogsProductMetadata) o;
    return Objects.equals(itemId, catalogsProductMetadata.itemId) &&
        Objects.equals(itemGroupId, catalogsProductMetadata.itemGroupId) &&
        Objects.equals(availability, catalogsProductMetadata.availability) &&
        Objects.equals(price, catalogsProductMetadata.price) &&
        Objects.equals(salePrice, catalogsProductMetadata.salePrice) &&
        Objects.equals(currency, catalogsProductMetadata.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, itemGroupId, availability, price, salePrice, currency);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsProductMetadata {\n");
    
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

