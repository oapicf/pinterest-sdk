package org.openapitools.model;

import org.openapitools.model.CatalogsCreateCreativeAssetsItem;
import org.openapitools.model.CatalogsDeleteCreativeAssetsItem;
import org.openapitools.model.CatalogsUpdatableCreativeAssetsAttributes;
import org.openapitools.model.CatalogsUpdateCreativeAssetsItem;
import org.openapitools.model.CatalogsUpsertCreativeAssetsItem;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Creative assets batch item
 */
public class CatalogsCreativeAssetsBatchItem implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("attributes")
  private CatalogsUpdatableCreativeAssetsAttributes attributes;

  /**
   * The catalog creative assets id in the merchant namespace
   */
  @JsonProperty("creative_assets_id")
  private String creativeAssetsId;

  @JsonProperty("operation")
  private String operation;

  /**
   * 
   * @return attributes
   */
  public CatalogsUpdatableCreativeAssetsAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CatalogsUpdatableCreativeAssetsAttributes attributes) {
    this.attributes = attributes;
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
   * 
   * @return operation
   */
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsCreativeAssetsBatchItem catalogsCreativeAssetsBatchItem = (CatalogsCreativeAssetsBatchItem) o;
    return Objects.equals(this.attributes, catalogsCreativeAssetsBatchItem.attributes) &&
        Objects.equals(this.creativeAssetsId, catalogsCreativeAssetsBatchItem.creativeAssetsId) &&
        Objects.equals(this.operation, catalogsCreativeAssetsBatchItem.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, creativeAssetsId, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsBatchItem {\n");
    
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    creativeAssetsId: ").append(toIndentedString(creativeAssetsId)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
