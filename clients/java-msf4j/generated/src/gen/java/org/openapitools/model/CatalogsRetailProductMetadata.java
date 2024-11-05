package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.NonNullableCatalogsCurrency;
import org.openapitools.model.NonNullableProductAvailabilityType;

/**
 * Retail product metadata entity
 */
@ApiModel(description = "Retail product metadata entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsRetailProductMetadata   {
  @JsonProperty("item_id")
  private String itemId;

  @JsonProperty("item_group_id")
  private String itemGroupId;

  @JsonProperty("availability")
  private NonNullableProductAvailabilityType availability;

  @JsonProperty("price")
  private BigDecimal price;

  @JsonProperty("sale_price")
  private BigDecimal salePrice;

  @JsonProperty("currency")
  private NonNullableCatalogsCurrency currency;

  public CatalogsRetailProductMetadata itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * The user-created unique ID that represents the product.
   * @return itemId
  **/
  @ApiModelProperty(example = "DS0294-L", required = true, value = "The user-created unique ID that represents the product.")
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
  @ApiModelProperty(example = "DS0294", required = true, value = "The parent ID of the product.")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(example = "24.99", required = true, value = "The price of the product.")
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
  @ApiModelProperty(example = "14.99", required = true, value = "The discounted price of the product.")
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
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(this.itemId, catalogsRetailProductMetadata.itemId) &&
        Objects.equals(this.itemGroupId, catalogsRetailProductMetadata.itemGroupId) &&
        Objects.equals(this.availability, catalogsRetailProductMetadata.availability) &&
        Objects.equals(this.price, catalogsRetailProductMetadata.price) &&
        Objects.equals(this.salePrice, catalogsRetailProductMetadata.salePrice) &&
        Objects.equals(this.currency, catalogsRetailProductMetadata.currency);
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

