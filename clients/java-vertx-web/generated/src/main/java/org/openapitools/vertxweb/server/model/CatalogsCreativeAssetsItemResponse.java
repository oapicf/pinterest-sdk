package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CatalogsCreativeAssetsAttributes;
import org.openapitools.vertxweb.server.model.Pin;

/**
 * Object describing a creative assets item record
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsCreativeAssetsItemResponse   {
  
  private CatalogsCreativeAssetsAttributes attributes;


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
  private String creativeAssetsId;


  public enum ItemResponseKindEnum {
    CREATIVE_ASSETS_ITEM("creative_assets_item");

    private String value;

    ItemResponseKindEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ItemResponseKindEnum itemResponseKind;
  private List<Pin> pins;

  public CatalogsCreativeAssetsItemResponse () {

  }

  public CatalogsCreativeAssetsItemResponse (CatalogsCreativeAssetsAttributes attributes, CatalogTypeEnum catalogType, String creativeAssetsId, ItemResponseKindEnum itemResponseKind, List<Pin> pins) {
    this.attributes = attributes;
    this.catalogType = catalogType;
    this.creativeAssetsId = creativeAssetsId;
    this.itemResponseKind = itemResponseKind;
    this.pins = pins;
  }

    
  @JsonProperty("attributes")
  public CatalogsCreativeAssetsAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(CatalogsCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
  }

    
  @JsonProperty("catalog_type")
  public CatalogTypeEnum getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogTypeEnum catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("creative_assets_id")
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }
  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

    
  @JsonProperty("item_response_kind")
  public ItemResponseKindEnum getItemResponseKind() {
    return itemResponseKind;
  }
  public void setItemResponseKind(ItemResponseKindEnum itemResponseKind) {
    this.itemResponseKind = itemResponseKind;
  }

    
  @JsonProperty("pins")
  public List<Pin> getPins() {
    return pins;
  }
  public void setPins(List<Pin> pins) {
    this.pins = pins;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsCreativeAssetsItemResponse catalogsCreativeAssetsItemResponse = (CatalogsCreativeAssetsItemResponse) o;
    return Objects.equals(attributes, catalogsCreativeAssetsItemResponse.attributes) &&
        Objects.equals(catalogType, catalogsCreativeAssetsItemResponse.catalogType) &&
        Objects.equals(creativeAssetsId, catalogsCreativeAssetsItemResponse.creativeAssetsId) &&
        Objects.equals(itemResponseKind, catalogsCreativeAssetsItemResponse.itemResponseKind) &&
        Objects.equals(pins, catalogsCreativeAssetsItemResponse.pins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, catalogType, creativeAssetsId, itemResponseKind, pins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsItemResponse {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
    sb.append("    itemResponseKind: ").append(toIndentedString(itemResponseKind)).append("\n");
    sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
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
