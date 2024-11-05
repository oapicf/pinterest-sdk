package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsAttributes;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Pin;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Object describing a hotel record
 */
@ApiModel(description="Object describing a hotel record")

public class CatalogsCreativeAssetsItemResponse  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsType catalogType;

 /**
  * The catalog creative assets id in the merchant namespace
  */
  @ApiModelProperty(example = "DS0294-M", value = "The catalog creative assets id in the merchant namespace")
  private String creativeAssetsId;

 /**
  * The pins mapped to the item
  */
  @ApiModelProperty(value = "The pins mapped to the item")
  @Valid
  private List<@Valid Pin> pins;

  @ApiModelProperty(value = "")
  @Valid
  private CatalogsCreativeAssetsAttributes attributes;
 /**
  * Get catalogType
  * @return catalogType
  */
  @JsonProperty("catalog_type")
  @NotNull
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
 public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  /**
   * Sets the <code>catalogType</code> property.
   */
  public CatalogsCreativeAssetsItemResponse catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

 /**
  * The catalog creative assets id in the merchant namespace
  * @return creativeAssetsId
  */
  @JsonProperty("creative_assets_id")
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  /**
   * Sets the <code>creativeAssetsId</code> property.
   */
 public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  /**
   * Sets the <code>creativeAssetsId</code> property.
   */
  public CatalogsCreativeAssetsItemResponse creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

 /**
  * The pins mapped to the item
  * @return pins
  */
  @JsonProperty("pins")
 @Size(max=11)  public List<@Valid Pin> getPins() {
    return pins;
  }

  /**
   * Sets the <code>pins</code> property.
   */
 public void setPins(List<@Valid Pin> pins) {
    this.pins = pins;
  }

  /**
   * Sets the <code>pins</code> property.
   */
  public CatalogsCreativeAssetsItemResponse pins(List<@Valid Pin> pins) {
    this.pins = pins;
    return this;
  }

  /**
   * Adds a new item to the <code>pins</code> list.
   */
  public CatalogsCreativeAssetsItemResponse addPinsItem(Pin pinsItem) {
    this.pins.add(pinsItem);
    return this;
  }

 /**
  * Get attributes
  * @return attributes
  */
  @JsonProperty("attributes")
  public CatalogsCreativeAssetsAttributes getAttributes() {
    return attributes;
  }

  /**
   * Sets the <code>attributes</code> property.
   */
 public void setAttributes(CatalogsCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
  }

  /**
   * Sets the <code>attributes</code> property.
   */
  public CatalogsCreativeAssetsItemResponse attributes(CatalogsCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
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
    CatalogsCreativeAssetsItemResponse catalogsCreativeAssetsItemResponse = (CatalogsCreativeAssetsItemResponse) o;
    return Objects.equals(this.catalogType, catalogsCreativeAssetsItemResponse.catalogType) &&
        Objects.equals(this.creativeAssetsId, catalogsCreativeAssetsItemResponse.creativeAssetsId) &&
        Objects.equals(this.pins, catalogsCreativeAssetsItemResponse.pins) &&
        Objects.equals(this.attributes, catalogsCreativeAssetsItemResponse.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, creativeAssetsId, pins, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsItemResponse {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
    sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

