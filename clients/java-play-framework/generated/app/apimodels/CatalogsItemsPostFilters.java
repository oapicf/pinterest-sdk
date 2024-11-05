package apimodels;

import apimodels.CatalogsCreativeAssetsItemsPostFilter;
import apimodels.CatalogsHotelItemsPostFilter;
import apimodels.CatalogsRetailItemsPostFilter;
import apimodels.CatalogsType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * CatalogsItemsPostFilters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CatalogsItemsPostFilters   {
  @JsonProperty("catalog_type")
  @NotNull
@Valid

  private CatalogsType catalogType;

  @JsonProperty("item_ids")
  @NotNull
@Size(min=1,max=1000)

  private List<String> itemIds = new ArrayList<>();

  @JsonProperty("catalog_id")
  @Pattern(regexp="^\\d+$")

  private String catalogId;

  @JsonProperty("hotel_ids")
  @NotNull
@Size(min=1,max=1000)

  private List<String> hotelIds = new ArrayList<>();

  @JsonProperty("creative_assets_ids")
  @NotNull
@Size(min=1,max=1000)

  private List<String> creativeAssetsIds = new ArrayList<>();

  public CatalogsItemsPostFilters catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

   /**
   * Get catalogType
   * @return catalogType
  **/
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsItemsPostFilters itemIds(List<String> itemIds) {
    this.itemIds = itemIds;
    return this;
  }

  public CatalogsItemsPostFilters addItemIdsItem(String itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * Get itemIds
   * @return itemIds
  **/
  public List<String> getItemIds() {
    return itemIds;
  }

  public void setItemIds(List<String> itemIds) {
    this.itemIds = itemIds;
  }

  public CatalogsItemsPostFilters catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
   * @return catalogId
  **/
  public String getCatalogId() {
    return catalogId;
  }

  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  public CatalogsItemsPostFilters hotelIds(List<String> hotelIds) {
    this.hotelIds = hotelIds;
    return this;
  }

  public CatalogsItemsPostFilters addHotelIdsItem(String hotelIdsItem) {
    if (this.hotelIds == null) {
      this.hotelIds = new ArrayList<>();
    }
    this.hotelIds.add(hotelIdsItem);
    return this;
  }

   /**
   * Get hotelIds
   * @return hotelIds
  **/
  public List<String> getHotelIds() {
    return hotelIds;
  }

  public void setHotelIds(List<String> hotelIds) {
    this.hotelIds = hotelIds;
  }

  public CatalogsItemsPostFilters creativeAssetsIds(List<String> creativeAssetsIds) {
    this.creativeAssetsIds = creativeAssetsIds;
    return this;
  }

  public CatalogsItemsPostFilters addCreativeAssetsIdsItem(String creativeAssetsIdsItem) {
    if (this.creativeAssetsIds == null) {
      this.creativeAssetsIds = new ArrayList<>();
    }
    this.creativeAssetsIds.add(creativeAssetsIdsItem);
    return this;
  }

   /**
   * Get creativeAssetsIds
   * @return creativeAssetsIds
  **/
  public List<String> getCreativeAssetsIds() {
    return creativeAssetsIds;
  }

  public void setCreativeAssetsIds(List<String> creativeAssetsIds) {
    this.creativeAssetsIds = creativeAssetsIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsItemsPostFilters catalogsItemsPostFilters = (CatalogsItemsPostFilters) o;
    return Objects.equals(catalogType, catalogsItemsPostFilters.catalogType) &&
        Objects.equals(itemIds, catalogsItemsPostFilters.itemIds) &&
        Objects.equals(catalogId, catalogsItemsPostFilters.catalogId) &&
        Objects.equals(hotelIds, catalogsItemsPostFilters.hotelIds) &&
        Objects.equals(creativeAssetsIds, catalogsItemsPostFilters.creativeAssetsIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, itemIds, catalogId, hotelIds, creativeAssetsIds);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsPostFilters {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    hotelIds: ").append(toIndentedString(hotelIds)).append("\n");
    sb.append("    creativeAssetsIds: ").append(toIndentedString(creativeAssetsIds)).append("\n");
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

