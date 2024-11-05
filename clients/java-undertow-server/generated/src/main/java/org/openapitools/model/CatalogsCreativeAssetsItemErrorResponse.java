/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CatalogsType;
import org.openapitools.model.ItemValidationEvent;



/**
 * Object describing a creative assets item error
 */

@ApiModel(description = "Object describing a creative assets item error")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsCreativeAssetsItemErrorResponse   {
  
  private CatalogsType catalogType;
  private String creativeAssetsId;
  private List<ItemValidationEvent> errors = new ArrayList<>();

  /**
   */
  public CatalogsCreativeAssetsItemErrorResponse catalogType(CatalogsType catalogType) {
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
   * The catalog creative assets id in the merchant namespace
   */
  public CatalogsCreativeAssetsItemErrorResponse creativeAssetsId(String creativeAssetsId) {
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

  /**
   * Array with the errors for the item id requested
   */
  public CatalogsCreativeAssetsItemErrorResponse errors(List<ItemValidationEvent> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Array with the errors for the item id requested")
  @JsonProperty("errors")
  public List<ItemValidationEvent> getErrors() {
    return errors;
  }
  public void setErrors(List<ItemValidationEvent> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsCreativeAssetsItemErrorResponse catalogsCreativeAssetsItemErrorResponse = (CatalogsCreativeAssetsItemErrorResponse) o;
    return Objects.equals(catalogType, catalogsCreativeAssetsItemErrorResponse.catalogType) &&
        Objects.equals(creativeAssetsId, catalogsCreativeAssetsItemErrorResponse.creativeAssetsId) &&
        Objects.equals(errors, catalogsCreativeAssetsItemErrorResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, creativeAssetsId, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsItemErrorResponse {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

