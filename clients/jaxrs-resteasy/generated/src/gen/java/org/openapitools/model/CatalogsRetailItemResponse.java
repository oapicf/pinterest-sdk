package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.ItemAttributes;
import org.openapitools.model.Pin;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@ApiModel(description="Object describing a retail item record")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CatalogsRetailItemResponse   {
  
  private CatalogsType catalogType;
  private String itemId;
  private List<@Valid Pin> pins;
  private ItemAttributes attributes;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("catalog_type")
  @NotNull
  @Valid
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * The catalog retail item id in the merchant namespace
   **/
  
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
  
  @ApiModelProperty(value = "The pins mapped to the item")
  @JsonProperty("pins")
 @Size(max=11)  @Valid
  public List<@Valid Pin> getPins() {
    return pins;
  }
  public void setPins(List<@Valid Pin> pins) {
    this.pins = pins;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("attributes")
  @Valid
  public ItemAttributes getAttributes() {
    return attributes;
  }
  public void setAttributes(ItemAttributes attributes) {
    this.attributes = attributes;
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
    return Objects.equals(this.catalogType, catalogsRetailItemResponse.catalogType) &&
        Objects.equals(this.itemId, catalogsRetailItemResponse.itemId) &&
        Objects.equals(this.pins, catalogsRetailItemResponse.pins) &&
        Objects.equals(this.attributes, catalogsRetailItemResponse.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, itemId, pins, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailItemResponse {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

