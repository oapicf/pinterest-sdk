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
 * Object describing a retail item error
 */
public class CatalogsRetailItemErrorResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("catalog_type")
  private String catalogType;

  /**
   * Array with the errors for the item id requested
   */
  @JsonProperty("errors")
  private List<ItemValidationEvent> errors = new ArrayList<>();

  /**
   * The catalog item id in the merchant namespace
   */
  @JsonProperty("item_id")
  private String itemId;

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
   * The catalog item id in the merchant namespace
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsRetailItemErrorResponse catalogsRetailItemErrorResponse = (CatalogsRetailItemErrorResponse) o;
    return Objects.equals(this.catalogType, catalogsRetailItemErrorResponse.catalogType) &&
        Objects.equals(this.errors, catalogsRetailItemErrorResponse.errors) &&
        Objects.equals(this.itemId, catalogsRetailItemErrorResponse.itemId) &&
        Objects.equals(this.itemResponseKind, catalogsRetailItemErrorResponse.itemResponseKind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, errors, itemId, itemResponseKind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsRetailItemErrorResponse {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
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
