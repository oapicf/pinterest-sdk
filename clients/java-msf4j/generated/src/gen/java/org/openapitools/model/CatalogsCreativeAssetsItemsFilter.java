package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * CatalogsCreativeAssetsItemsFilter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsCreativeAssetsItemsFilter   {
  /**
   * Gets or Sets catalogType
   */
  public enum CatalogTypeEnum {
    CREATIVE_ASSETS("CREATIVE_ASSETS");

    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CatalogTypeEnum fromValue(String text) {
      for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("catalog_type")
  private CatalogTypeEnum catalogType;

  @JsonProperty("creative_assets_ids")
  private List<String> creativeAssetsIds = new ArrayList<>();

  @JsonProperty("catalog_id")
  private String catalogId;

  public CatalogsCreativeAssetsItemsFilter catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

   /**
   * Get catalogType
   * @return catalogType
  **/
  @ApiModelProperty(required = true, value = "")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsCreativeAssetsItemsFilter creativeAssetsIds(List<String> creativeAssetsIds) {
    this.creativeAssetsIds = creativeAssetsIds;
    return this;
  }

  public CatalogsCreativeAssetsItemsFilter addCreativeAssetsIdsItem(String creativeAssetsIdsItem) {
    this.creativeAssetsIds.add(creativeAssetsIdsItem);
    return this;
  }

   /**
   * Get creativeAssetsIds
   * @return creativeAssetsIds
  **/
  @ApiModelProperty(required = true, value = "")
  public List<String> getCreativeAssetsIds() {
    return creativeAssetsIds;
  }

  public void setCreativeAssetsIds(List<String> creativeAssetsIds) {
    this.creativeAssetsIds = creativeAssetsIds;
  }

  public CatalogsCreativeAssetsItemsFilter catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
   * @return catalogId
  **/
  @ApiModelProperty(value = "Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsCreativeAssetsItemsFilter catalogsCreativeAssetsItemsFilter = (CatalogsCreativeAssetsItemsFilter) o;
    return Objects.equals(this.catalogType, catalogsCreativeAssetsItemsFilter.catalogType) &&
        Objects.equals(this.creativeAssetsIds, catalogsCreativeAssetsItemsFilter.creativeAssetsIds) &&
        Objects.equals(this.catalogId, catalogsCreativeAssetsItemsFilter.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, creativeAssetsIds, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsItemsFilter {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    creativeAssetsIds: ").append(toIndentedString(creativeAssetsIds)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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

