package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.NonNullableCatalogsCurrency;
import org.openapitools.model.ProductAvailability;



/**
 * Retail product metadata entity
 **/

@ApiModel(description = "Retail product metadata entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsRetailProductMetadata   {
  @JsonProperty("availability")
  private ProductAvailability availability;

  @JsonProperty("currency")
  private NonNullableCatalogsCurrency currency;

  @JsonProperty("item_group_id")
  private String itemGroupId;

  @JsonProperty("item_id")
  private String itemId;

  @JsonProperty("price")
  private BigDecimal price;

  @JsonProperty("sale_price")
  private BigDecimal salePrice;

  /**
   **/
  public CatalogsRetailProductMetadata availability(ProductAvailability availability) {
    this.availability = availability;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("availability")
  public ProductAvailability getAvailability() {
    return availability;
  }
  public void setAvailability(ProductAvailability availability) {
    this.availability = availability;
  }

  /**
   **/
  public CatalogsRetailProductMetadata currency(NonNullableCatalogsCurrency currency) {
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

  /**
   * The parent ID of the product.
   **/
  public CatalogsRetailProductMetadata itemGroupId(String itemGroupId) {
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
   * The user-created unique ID that represents the product.
   **/
  public CatalogsRetailProductMetadata itemId(String itemId) {
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
   * The price of the product.
   **/
  public CatalogsRetailProductMetadata price(BigDecimal price) {
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
   **/
  public CatalogsRetailProductMetadata salePrice(BigDecimal salePrice) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailProductMetadata catalogsRetailProductMetadata = (CatalogsRetailProductMetadata) o;
    return Objects.equals(availability, catalogsRetailProductMetadata.availability) &&
        Objects.equals(currency, catalogsRetailProductMetadata.currency) &&
        Objects.equals(itemGroupId, catalogsRetailProductMetadata.itemGroupId) &&
        Objects.equals(itemId, catalogsRetailProductMetadata.itemId) &&
        Objects.equals(price, catalogsRetailProductMetadata.price) &&
        Objects.equals(salePrice, catalogsRetailProductMetadata.salePrice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability, currency, itemGroupId, itemId, price, salePrice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailProductMetadata {\n");
    
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    itemGroupId: ").append(toIndentedString(itemGroupId)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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

