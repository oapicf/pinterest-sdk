package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsCreativeAssetsAttributes;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.Pin;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Object describing a hotel record
 */

@Schema(name = "CatalogsCreativeAssetsItemResponse", description = "Object describing a hotel record")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsCreativeAssetsItemResponse implements ItemResponseAnyOf {

  private CatalogsType catalogType;

  private String creativeAssetsId;

  @Valid
  private JsonNullable<List<@Valid Pin>> pins = JsonNullable.<List<@Valid Pin>>undefined();

  private CatalogsCreativeAssetsAttributes attributes;

  public CatalogsCreativeAssetsItemResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CatalogsCreativeAssetsItemResponse(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsCreativeAssetsItemResponse catalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Get catalogType
   * @return catalogType
   */
  @NotNull @Valid 
  @Schema(name = "catalog_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogsCreativeAssetsItemResponse creativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
    return this;
  }

  /**
   * The catalog creative assets id in the merchant namespace
   * @return creativeAssetsId
   */
  
  @Schema(name = "creative_assets_id", example = "DS0294-M", description = "The catalog creative assets id in the merchant namespace", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creative_assets_id")
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  public CatalogsCreativeAssetsItemResponse pins(List<@Valid Pin> pins) {
    this.pins = JsonNullable.of(pins);
    return this;
  }

  public CatalogsCreativeAssetsItemResponse addPinsItem(Pin pinsItem) {
    if (this.pins == null || !this.pins.isPresent()) {
      this.pins = JsonNullable.of(new ArrayList<>());
    }
    this.pins.get().add(pinsItem);
    return this;
  }

  /**
   * The pins mapped to the item
   * @return pins
   */
  @Valid @Size(max = 11) 
  @Schema(name = "pins", description = "The pins mapped to the item", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pins")
  public JsonNullable<List<@Valid Pin>> getPins() {
    return pins;
  }

  public void setPins(JsonNullable<List<@Valid Pin>> pins) {
    this.pins = pins;
  }

  public CatalogsCreativeAssetsItemResponse attributes(CatalogsCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Get attributes
   * @return attributes
   */
  @Valid 
  @Schema(name = "attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attributes")
  public CatalogsCreativeAssetsAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CatalogsCreativeAssetsAttributes attributes) {
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
    CatalogsCreativeAssetsItemResponse catalogsCreativeAssetsItemResponse = (CatalogsCreativeAssetsItemResponse) o;
    return Objects.equals(this.catalogType, catalogsCreativeAssetsItemResponse.catalogType) &&
        Objects.equals(this.creativeAssetsId, catalogsCreativeAssetsItemResponse.creativeAssetsId) &&
        equalsNullable(this.pins, catalogsCreativeAssetsItemResponse.pins) &&
        Objects.equals(this.attributes, catalogsCreativeAssetsItemResponse.attributes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, creativeAssetsId, hashCodeNullable(pins), attributes);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

