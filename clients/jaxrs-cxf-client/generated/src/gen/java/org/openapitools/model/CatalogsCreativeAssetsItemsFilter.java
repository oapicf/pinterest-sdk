package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsCreativeAssetsItemsFilter  {
  
public enum CatalogTypeEnum {

CREATIVE_ASSETS(String.valueOf("CREATIVE_ASSETS"));


    private String value;

    CatalogTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogTypeEnum fromValue(String value) {
        for (CatalogTypeEnum b : CatalogTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private CatalogTypeEnum catalogType;

  @ApiModelProperty(required = true, value = "")
  private List<String> creativeAssetsIds = new ArrayList<>();

  @ApiModelProperty(value = "Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog")
 /**
   * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  **/
  private String catalogId;
 /**
   * Get catalogType
   * @return catalogType
  **/
  @JsonProperty("catalog_type")
  public String getCatalogType() {
    if (catalogType == null) {
      return null;
    }
    return catalogType.value();
  }

  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsCreativeAssetsItemsFilter catalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
   * Get creativeAssetsIds
   * @return creativeAssetsIds
  **/
  @JsonProperty("creative_assets_ids")
  public List<String> getCreativeAssetsIds() {
    return creativeAssetsIds;
  }

  public void setCreativeAssetsIds(List<String> creativeAssetsIds) {
    this.creativeAssetsIds = creativeAssetsIds;
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
   * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
   * @return catalogId
  **/
  @JsonProperty("catalog_id")
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsCreativeAssetsItemsFilter catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

