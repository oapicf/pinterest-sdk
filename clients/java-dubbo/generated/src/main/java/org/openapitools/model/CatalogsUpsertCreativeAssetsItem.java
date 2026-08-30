package org.openapitools.model;

import org.openapitools.model.CatalogsCreativeAssetsAttributes;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * A creative assets item to be upserted.
 */
public class CatalogsUpsertCreativeAssetsItem implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("attributes")
  private CatalogsCreativeAssetsAttributes attributes;

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
  public CatalogsCreativeAssetsAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(CatalogsCreativeAssetsAttributes attributes) {
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
    CatalogsUpsertCreativeAssetsItem catalogsUpsertCreativeAssetsItem = (CatalogsUpsertCreativeAssetsItem) o;
    return Objects.equals(this.attributes, catalogsUpsertCreativeAssetsItem.attributes) &&
        Objects.equals(this.creativeAssetsId, catalogsUpsertCreativeAssetsItem.creativeAssetsId) &&
        Objects.equals(this.operation, catalogsUpsertCreativeAssetsItem.operation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, creativeAssetsId, operation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsUpsertCreativeAssetsItem {\n");
    
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
