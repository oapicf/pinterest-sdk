package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsAttributes;
import org.openapitools.model.CatalogsCreativeAssetsItemResponse;
import org.openapitools.model.CatalogsHotelItemResponse;
import org.openapitools.model.CatalogsRetailItemResponse;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Pin;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ItemResponseAnyOf   {
  @JsonProperty("catalog_type")
  private CatalogsType catalogType;

  @JsonProperty("item_id")
  private String itemId;

  @JsonProperty("pins")
  private List<Pin> pins = null;

  @JsonProperty("attributes")
  private CatalogsCreativeAssetsAttributes attributes;

  @JsonProperty("hotel_id")
  private String hotelId;

  @JsonProperty("creative_assets_id")
  private String creativeAssetsId;

  /**
   **/
  public ItemResponseAnyOf catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * The catalog retail item id in the merchant namespace
   **/
  public ItemResponseAnyOf itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", value = "The catalog retail item id in the merchant namespace")
  @JsonProperty("item_id")
  public String getItemId() {
    return itemId;
  }
  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * The pins mapped to the item
   **/
  public ItemResponseAnyOf pins(List<Pin> pins) {
    this.pins = pins;
    return this;
  }

  
  @ApiModelProperty(value = "The pins mapped to the item")
  @JsonProperty("pins")
  public List<Pin> getPins() {
    return pins;
  }
  public void setPins(List<Pin> pins) {
    this.pins = pins;
  }

  /**
   **/
  public ItemResponseAnyOf attributes(CatalogsCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("attributes")
  public CatalogsCreativeAssetsAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(CatalogsCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
  }

  /**
   * The catalog hotel id in the merchant namespace
   **/
  public ItemResponseAnyOf hotelId(String hotelId) {
    this.hotelId = hotelId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", value = "The catalog hotel id in the merchant namespace")
  @JsonProperty("hotel_id")
  public String getHotelId() {
    return hotelId;
  }
  public void setHotelId(String hotelId) {
    this.hotelId = hotelId;
  }

  /**
   * The catalog creative assets id in the merchant namespace
   **/
  public ItemResponseAnyOf creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

  
  @ApiModelProperty(example = "DS0294-M", value = "The catalog creative assets id in the merchant namespace")
  @JsonProperty("creative_assets_id")
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }
  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemResponseAnyOf itemResponseAnyOf = (ItemResponseAnyOf) o;
    return Objects.equals(catalogType, itemResponseAnyOf.catalogType) &&
        Objects.equals(itemId, itemResponseAnyOf.itemId) &&
        Objects.equals(pins, itemResponseAnyOf.pins) &&
        Objects.equals(attributes, itemResponseAnyOf.attributes) &&
        Objects.equals(hotelId, itemResponseAnyOf.hotelId) &&
        Objects.equals(creativeAssetsId, itemResponseAnyOf.creativeAssetsId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, itemId, pins, attributes, hotelId, creativeAssetsId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemResponseAnyOf {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    hotelId: ").append(toIndentedString(hotelId)).append("\n");
    sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
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

