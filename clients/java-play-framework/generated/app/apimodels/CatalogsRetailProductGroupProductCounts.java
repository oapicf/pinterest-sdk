package apimodels;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Product counts for a Retail CatalogsProductGroup
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsRetailProductGroupProductCounts   {
  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    RETAIL("RETAIL");

    private final String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("catalog_type")
  @NotNull

  private CatalogTypeEnum catalogType;

  @JsonProperty("in_stock")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal inStock;

  @JsonProperty("out_of_stock")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal outOfStock;

  @JsonProperty("preorder")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal preorder;

  @JsonProperty("total")
  @NotNull
@DecimalMin("0")
@Valid

  private BigDecimal total;

  @JsonProperty("videos")
  @DecimalMin("0")
@Valid

  private BigDecimal videos;

  public CatalogsRetailProductGroupProductCounts catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

   /**
   * Get catalogType
   * @return catalogType
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(catalogType, catalogsRetailProductGroupProductCounts.catalogType) &&
        Objects.equals(inStock, catalogsRetailProductGroupProductCounts.inStock) &&
        Objects.equals(outOfStock, catalogsRetailProductGroupProductCounts.outOfStock) &&
        Objects.equals(preorder, catalogsRetailProductGroupProductCounts.preorder) &&
        Objects.equals(total, catalogsRetailProductGroupProductCounts.total) &&
        Objects.equals(videos, catalogsRetailProductGroupProductCounts.videos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, inStock, outOfStock, preorder, total, videos);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

