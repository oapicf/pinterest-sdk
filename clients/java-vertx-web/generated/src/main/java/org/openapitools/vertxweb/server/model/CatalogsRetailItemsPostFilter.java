package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsRetailItemsPostFilter   {
  


  public enum CatalogTypeEnum {
    RETAIL("RETAIL");

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
  private List<String> itemIds = new ArrayList<>();
  private String catalogId;

  public CatalogsRetailItemsPostFilter () {

  }

  public CatalogsRetailItemsPostFilter (CatalogTypeEnum catalogType, List<String> itemIds, String catalogId) {
    this.catalogType = catalogType;
    this.itemIds = itemIds;
    this.catalogId = catalogId;
  }

    
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("item_ids")
  public List<String> getItemIds() {
    return itemIds;
  }
  public void setItemIds(List<String> itemIds) {
    this.itemIds = itemIds;
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
    CatalogsRetailItemsPostFilter catalogsRetailItemsPostFilter = (CatalogsRetailItemsPostFilter) o;
    return Objects.equals(catalogType, catalogsRetailItemsPostFilter.catalogType) &&
        Objects.equals(itemIds, catalogsRetailItemsPostFilter.itemIds) &&
        Objects.equals(catalogId, catalogsRetailItemsPostFilter.catalogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, itemIds, catalogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailItemsPostFilter {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
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
