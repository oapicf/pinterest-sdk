/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PinterestLibError;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CatalogsLocalStoresCreate200ResponseInnerDataOneOf   {
  
  private String id;
  private PinterestLibError exceptions;

  /**
   * The ID of the local store.
   */
  public CatalogsLocalStoresCreate200ResponseInnerDataOneOf id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "1234567890", required = true, value = "The ID of the local store.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   */
  public CatalogsLocalStoresCreate200ResponseInnerDataOneOf exceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("exceptions")
  public PinterestLibError getExceptions() {
    return exceptions;
  }
  public void setExceptions(PinterestLibError exceptions) {
    this.exceptions = exceptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsLocalStoresCreate200ResponseInnerDataOneOf catalogsLocalStoresCreate200ResponseInnerDataOneOf = (CatalogsLocalStoresCreate200ResponseInnerDataOneOf) o;
    return Objects.equals(id, catalogsLocalStoresCreate200ResponseInnerDataOneOf.id) &&
        Objects.equals(exceptions, catalogsLocalStoresCreate200ResponseInnerDataOneOf.exceptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, exceptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsLocalStoresCreate200ResponseInnerDataOneOf {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
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

