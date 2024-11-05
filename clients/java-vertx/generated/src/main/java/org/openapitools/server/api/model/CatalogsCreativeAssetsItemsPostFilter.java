package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsCreativeAssetsItemsPostFilter   {
  


  public enum CatalogTypeEnum {
    CREATIVE_ASSETS("CREATIVE_ASSETS");

    private String value;

    CatalogTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CatalogTypeEnum catalogType;
  private List<String> creativeAssetsIds = new ArrayList<>();
  private String catalogId;

  public CatalogsCreativeAssetsItemsPostFilter () {

  }

  public CatalogsCreativeAssetsItemsPostFilter (CatalogTypeEnum catalogType, List<String> creativeAssetsIds, String catalogId) {
    this.catalogType = catalogType;
    this.creativeAssetsIds = creativeAssetsIds;
    this.catalogId = catalogId;
  }

    
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("creative_assets_ids")
  public List<String> getCreativeAssetsIds() {
    return creativeAssetsIds;
  }
  public void setCreativeAssetsIds(List<String> creativeAssetsIds) {
    this.creativeAssetsIds = creativeAssetsIds;
  }

    
  @JsonProperty("catalog_id")
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
    CatalogsCreativeAssetsItemsPostFilter catalogsCreativeAssetsItemsPostFilter = (CatalogsCreativeAssetsItemsPostFilter) o;
    return Objects.equals(catalogType, catalogsCreativeAssetsItemsPostFilter.catalogType) &&
        Objects.equals(creativeAssetsIds, catalogsCreativeAssetsItemsPostFilter.creativeAssetsIds) &&
        Objects.equals(catalogId, catalogsCreativeAssetsItemsPostFilter.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, creativeAssetsIds, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsItemsPostFilter {\n");
    
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
