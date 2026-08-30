package org.openapitools.model;

import org.openapitools.model.ItemValidationEvent;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Object describing a creative assets item error
 */
public class CatalogsCreativeAssetsItemErrorResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("catalog_type")
  private String catalogType;

  /**
   * The catalog creative assets id in the merchant namespace
   */
  @JsonProperty("creative_assets_id")
  private String creativeAssetsId;

  /**
   * Array with the errors for the item id requested
   */
  @JsonProperty("errors")
  private List<ItemValidationEvent> errors = new ArrayList<>();

  /**
   * Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload.
   */
  @JsonProperty("item_response_kind")
  private String itemResponseKind;

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
   * The catalog creative assets id in the merchant namespace
   * @return creativeAssetsId
   */
  public String getCreativeAssetsId() {
    return creativeAssetsId;
  }

  public void setCreativeAssetsId(String creativeAssetsId) {
    this.creativeAssetsId = creativeAssetsId;
  }

  /**
   * Array with the errors for the item id requested
   * @return errors
   */
  public List<ItemValidationEvent> getErrors() {
    return errors;
  }

  public void setErrors(List<ItemValidationEvent> errors) {
    this.errors = errors;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsCreativeAssetsItemErrorResponse catalogsCreativeAssetsItemErrorResponse = (CatalogsCreativeAssetsItemErrorResponse) o;
    return Objects.equals(this.catalogType, catalogsCreativeAssetsItemErrorResponse.catalogType) &&
        Objects.equals(this.creativeAssetsId, catalogsCreativeAssetsItemErrorResponse.creativeAssetsId) &&
        Objects.equals(this.errors, catalogsCreativeAssetsItemErrorResponse.errors) &&
        Objects.equals(this.itemResponseKind, catalogsCreativeAssetsItemErrorResponse.itemResponseKind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, creativeAssetsId, errors, itemResponseKind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsItemErrorResponse {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    itemResponseKind: ").append(toIndentedString(itemResponseKind)).append("\n");
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
