/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
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
import java.math.BigDecimal;
import org.openapitools.model.NonNullableCatalogsCurrency;
import org.openapitools.model.NonNullableProductAvailabilityType;



/**
 * Product metadata entity
 */

@ApiModel(description = "Product metadata entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsProductMetadata   {
  
  private String itemId;
  private String itemGroupId;
  private NonNullableProductAvailabilityType availability;
  private BigDecimal price;
  private BigDecimal salePrice;
  private NonNullableCatalogsCurrency currency;

  /**
   * The user-created unique ID that represents the product.
   */
  public CatalogsProductMetadata itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-L", required = true, value = "The user-created unique ID that represents the product.")
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * The parent ID of the product.
   */
  public CatalogsProductMetadata itemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294", required = true, value = "The parent ID of the product.")
  @JsonProperty("item_group_id")
  public String getItemGroupId() {
    return itemGroupId;
  }
  public void setItemGroupId(String itemGroupId) {
    this.itemGroupId = itemGroupId;
  }

  /**
   */
  public CatalogsProductMetadata availability(NonNullableProductAvailabilityType availability) {
    this.availability = availability;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("availability")
  public NonNullableProductAvailabilityType getAvailability() {
    return availability;
  }
  public void setAvailability(NonNullableProductAvailabilityType availability) {
    this.availability = availability;
  }

  /**
   * The price of the product.
   */
  public CatalogsProductMetadata price(BigDecimal price) {
    this.price = price;
    return this;
  }

  
  @ApiModelProperty(example = "24.99", required = true, value = "The price of the product.")
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  /**
   * The discounted price of the product.
   */
  public CatalogsProductMetadata salePrice(BigDecimal salePrice) {
    this.salePrice = salePrice;
    return this;
  }

  
  @ApiModelProperty(example = "14.99", required = true, value = "The discounted price of the product.")
  @JsonProperty("sale_price")
  public BigDecimal getSalePrice() {
    return salePrice;
  }
  public void setSalePrice(BigDecimal salePrice) {
    this.salePrice = salePrice;
  }

  /**
   */
  public CatalogsProductMetadata currency(NonNullableCatalogsCurrency currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

