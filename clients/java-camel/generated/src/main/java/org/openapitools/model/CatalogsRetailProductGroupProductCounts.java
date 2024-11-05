package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Product counts for a Retail CatalogsProductGroup
 */

@Schema(name = "CatalogsRetailProductGroupProductCounts", description = "Product counts for a Retail CatalogsProductGroup")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsRetailProductGroupProductCounts implements CatalogsProductGroupProductCountsVertical {

  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    RETAIL("RETAIL");

    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CatalogTypeEnum fromValue(String value) {
      for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CatalogTypeEnum catalogType;

  private BigDecimal inStock;

  private BigDecimal outOfStock;

  private BigDecimal preorder;

  private BigDecimal total;

  private BigDecimal videos;

  public CatalogsRetailProductGroupProductCounts() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsRetailProductGroupProductCounts(CatalogTypeEnum catalogType, BigDecimal inStock, BigDecimal outOfStock, BigDecimal preorder, BigDecimal total) {
    this.catalogType = catalogType;
    this.inStock = inStock;
    this.outOfStock = outOfStock;
    this.preorder = preorder;
    this.total = total;
  }

  public CatalogsRetailProductGroupProductCounts catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Get catalogType
   * @return catalogType
   */
  @NotNull 
  @Schema(name = "catalog_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsRetailProductGroupProductCounts inStock(BigDecimal inStock) {
    this.inStock = inStock;
    return this;
  }

  /**
   * Get inStock
   * minimum: 0
   * @return inStock
   */
  @NotNull @Valid @DecimalMin("0") 
  @Schema(name = "in_stock", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("in_stock")
  public BigDecimal getInStock() {
    return inStock;
  }

  public void setInStock(BigDecimal inStock) {
    this.inStock = inStock;
  }

  public CatalogsRetailProductGroupProductCounts outOfStock(BigDecimal outOfStock) {
    this.outOfStock = outOfStock;
    return this;
  }

  /**
   * Get outOfStock
   * minimum: 0
   * @return outOfStock
   */
  @NotNull @Valid @DecimalMin("0") 
  @Schema(name = "out_of_stock", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("out_of_stock")
  public BigDecimal getOutOfStock() {
    return outOfStock;
  }

  public void setOutOfStock(BigDecimal outOfStock) {
    this.outOfStock = outOfStock;
  }

  public CatalogsRetailProductGroupProductCounts preorder(BigDecimal preorder) {
    this.preorder = preorder;
    return this;
  }

  /**
   * Get preorder
   * minimum: 0
   * @return preorder
   */
  @NotNull @Valid @DecimalMin("0") 
  @Schema(name = "preorder", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("preorder")
  public BigDecimal getPreorder() {
    return preorder;
  }

  public void setPreorder(BigDecimal preorder) {
    this.preorder = preorder;
  }

  public CatalogsRetailProductGroupProductCounts total(BigDecimal total) {
    this.total = total;
    return this;
  }

  /**
   * Get total
   * minimum: 0
   * @return total
   */
  @NotNull @Valid @DecimalMin("0") 
  @Schema(name = "total", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("total")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public CatalogsRetailProductGroupProductCounts videos(BigDecimal videos) {
    this.videos = videos;
    return this;
  }

  /**
   * Get videos
   * minimum: 0
   * @return videos
   */
  @Valid @DecimalMin("0") 
  @Schema(name = "videos", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("videos")
  public BigDecimal getVideos() {
    return videos;
  }

  public void setVideos(BigDecimal videos) {
    this.videos = videos;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailProductGroupProductCounts catalogsRetailProductGroupProductCounts = (CatalogsRetailProductGroupProductCounts) o;
    return Objects.equals(this.catalogType, catalogsRetailProductGroupProductCounts.catalogType) &&
        Objects.equals(this.inStock, catalogsRetailProductGroupProductCounts.inStock) &&
        Objects.equals(this.outOfStock, catalogsRetailProductGroupProductCounts.outOfStock) &&
        Objects.equals(this.preorder, catalogsRetailProductGroupProductCounts.preorder) &&
        Objects.equals(this.total, catalogsRetailProductGroupProductCounts.total) &&
        Objects.equals(this.videos, catalogsRetailProductGroupProductCounts.videos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, inStock, outOfStock, preorder, total, videos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailProductGroupProductCounts {\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    inStock: ").append(toIndentedString(inStock)).append("\n");
    sb.append("    outOfStock: ").append(toIndentedString(outOfStock)).append("\n");
    sb.append("    preorder: ").append(toIndentedString(preorder)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
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

