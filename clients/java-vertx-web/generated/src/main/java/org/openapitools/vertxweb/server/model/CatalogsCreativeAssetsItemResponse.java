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
import org.openapitools.vertxweb.server.model.CatalogsType;
import org.openapitools.vertxweb.server.model.Pin;

/**
 * Object describing a hotel record
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CatalogsCreativeAssetsItemResponse   {
  
  private CatalogsType catalogType;
  private String creativeAssetsId;
  private List<Pin> pins;
  private CatalogsCreativeAssetsAttributes attributes;

  public CatalogsCreativeAssetsItemResponse () {

  }

  public CatalogsCreativeAssetsItemResponse (CatalogsType catalogType, String creativeAssetsId, List<Pin> pins, CatalogsCreativeAssetsAttributes attributes) {
    this.catalogType = catalogType;
    this.creativeAssetsId = creativeAssetsId;
    this.pins = pins;
    this.attributes = attributes;
  }

    
  @JsonProperty("catalog_type")
  public CatalogsType getCatalogType() {
    return catalogType;
  }
  public void setCatalogType(CatalogsType catalogType) {
    this.catalogType = catalogType;
  }

    
  @JsonProperty("creative_assets_id")
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }
  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

    
  @JsonProperty("pins")
  public List<Pin> getPins() {
    return pins;
  }
  public void setPins(List<Pin> pins) {
    this.pins = pins;
  }

    
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
    return Objects.equals(catalogType, catalogsCreativeAssetsItemResponse.catalogType) &&
        Objects.equals(creativeAssetsId, catalogsCreativeAssetsItemResponse.creativeAssetsId) &&
        Objects.equals(pins, catalogsCreativeAssetsItemResponse.pins) &&
        Objects.equals(attributes, catalogsCreativeAssetsItemResponse.attributes);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
