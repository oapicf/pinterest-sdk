package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsCreativeAssetsItemsFilter;
import org.openapitools.model.CatalogsHotelItemsFilter;
import org.openapitools.model.CatalogsRetailItemsFilter;
import org.openapitools.model.CatalogsType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "catalog_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = CatalogsCreativeAssetsItemsFilter.class, name = "CREATIVE_ASSETS"),
  @JsonSubTypes.Type(value = CatalogsHotelItemsFilter.class, name = "HOTEL"),
  @JsonSubTypes.Type(value = CatalogsRetailItemsFilter.class, name = "RETAIL"),
})


@JsonTypeName("CatalogsItemsFilters")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsItemsFilters   {
  private CatalogsType catalogType;
  private @Valid List<String> itemIds = new ArrayList<>();
  private String catalogId;
  private @Valid List<String> hotelIds = new ArrayList<>();
  private @Valid List<String> creativeAssetsIds = new ArrayList<>();

  /**
   **/
  public CatalogsItemsFilters catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  @NotNull public CatalogsType getCatalogType() {
    return catalogType;
  }

  @JsonProperty("catalog_type")
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  /**
   **/
  public CatalogsItemsFilters itemIds(List<String> itemIds) {
    this.itemIds = itemIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("item_ids")
  @NotNull  @Size(min=1,max=100)public List<String> getItemIds() {
    return itemIds;
  }

  @JsonProperty("item_ids")
  public void setItemIds(List<String> itemIds) {
    this.itemIds = itemIds;
  }

  public CatalogsItemsFilters addItemIdsItem(String itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }

    this.itemIds.add(itemIdsItem);
    return this;
  }

  public CatalogsItemsFilters removeItemIdsItem(String itemIdsItem) {
    if (itemIdsItem != null && this.itemIds != null) {
      this.itemIds.remove(itemIdsItem);
    }

    return this;
  }
  /**
   * Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
   **/
  public CatalogsItemsFilters catalogId(String catalogId) {
    this.catalogId = catalogId;
    return this;
  }

  
  @ApiModelProperty(value = "Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog")
  @JsonProperty("catalog_id")
   @Pattern(regexp="^\\d+$")public String getCatalogId() {
    return catalogId;
  }

  @JsonProperty("catalog_id")
  public void setCatalogId(String catalogId) {
    this.catalogId = catalogId;
  }

  /**
   **/
  public CatalogsItemsFilters hotelIds(List<String> hotelIds) {
    this.hotelIds = hotelIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("hotel_ids")
  @NotNull  @Size(min=1,max=100)public List<String> getHotelIds() {
    return hotelIds;
  }

  @JsonProperty("hotel_ids")
  public void setHotelIds(List<String> hotelIds) {
    this.hotelIds = hotelIds;
  }

  public CatalogsItemsFilters addHotelIdsItem(String hotelIdsItem) {
    if (this.hotelIds == null) {
      this.hotelIds = new ArrayList<>();
    }

    this.hotelIds.add(hotelIdsItem);
    return this;
  }

  public CatalogsItemsFilters removeHotelIdsItem(String hotelIdsItem) {
    if (hotelIdsItem != null && this.hotelIds != null) {
      this.hotelIds.remove(hotelIdsItem);
    }

    return this;
  }
  /**
   **/
  public CatalogsItemsFilters creativeAssetsIds(List<String> creativeAssetsIds) {
    this.creativeAssetsIds = creativeAssetsIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("creative_assets_ids")
  @NotNull  @Size(min=1,max=100)public List<String> getCreativeAssetsIds() {
    return creativeAssetsIds;
  }

  @JsonProperty("creative_assets_ids")
  public void setCreativeAssetsIds(List<String> creativeAssetsIds) {
    this.creativeAssetsIds = creativeAssetsIds;
  }

  public CatalogsItemsFilters addCreativeAssetsIdsItem(String creativeAssetsIdsItem) {
    if (this.creativeAssetsIds == null) {
      this.creativeAssetsIds = new ArrayList<>();
    }

    this.creativeAssetsIds.add(creativeAssetsIdsItem);
    return this;
  }

  public CatalogsItemsFilters removeCreativeAssetsIdsItem(String creativeAssetsIdsItem) {
    if (creativeAssetsIdsItem != null && this.creativeAssetsIds != null) {
      this.creativeAssetsIds.remove(creativeAssetsIdsItem);
    }

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
    CatalogsItemsFilters catalogsItemsFilters = (CatalogsItemsFilters) o;
    return Objects.equals(this.catalogType, catalogsItemsFilters.catalogType) &&
        Objects.equals(this.itemIds, catalogsItemsFilters.itemIds) &&
        Objects.equals(this.catalogId, catalogsItemsFilters.catalogId) &&
        Objects.equals(this.hotelIds, catalogsItemsFilters.hotelIds) &&
        Objects.equals(this.creativeAssetsIds, catalogsItemsFilters.creativeAssetsIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, itemIds, catalogId, hotelIds, creativeAssetsIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsItemsFilters {\n");
    
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

