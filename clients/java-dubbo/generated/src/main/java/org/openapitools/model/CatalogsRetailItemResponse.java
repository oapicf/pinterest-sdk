package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ItemAttributes;
import org.openapitools.model.Pin;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Object describing a retail item record
 */
public class CatalogsRetailItemResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("attributes")
  private ItemAttributes attributes;

  @JsonProperty("catalog_type")
  private String catalogType;

  /**
   * The catalog retail item id in the merchant namespace
   */
  @JsonProperty("item_id")
  private String itemId;

  /**
   * Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.
   */
  @JsonProperty("item_response_kind")
  private String itemResponseKind;

  /**
   * The pins mapped to the item
   */
  @JsonProperty("pins")
  private List<Pin> pins;

  /**
   * 
   * @return attributes
   */
  public ItemAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ItemAttributes attributes) {
    this.attributes = attributes;
  }

  /**
   * 
   * @return catalogType
   */
  public String getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * The catalog retail item id in the merchant namespace
   * @return itemId
   */
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  /**
   * Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.
   * @return itemResponseKind
   */
  public String getItemResponseKind() {
    return itemResponseKind;
  }

  public void setItemResponseKind(String itemResponseKind) {
    this.itemResponseKind = itemResponseKind;
  }

  /**
   * The pins mapped to the item
   * @return pins
   */
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
    CatalogsRetailItemResponse catalogsRetailItemResponse = (CatalogsRetailItemResponse) o;
    return Objects.equals(this.attributes, catalogsRetailItemResponse.attributes) &&
        Objects.equals(this.catalogType, catalogsRetailItemResponse.catalogType) &&
        Objects.equals(this.itemId, catalogsRetailItemResponse.itemId) &&
        Objects.equals(this.itemResponseKind, catalogsRetailItemResponse.itemResponseKind) &&
        Objects.equals(this.pins, catalogsRetailItemResponse.pins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, catalogType, itemId, itemResponseKind, pins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailItemResponse {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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
