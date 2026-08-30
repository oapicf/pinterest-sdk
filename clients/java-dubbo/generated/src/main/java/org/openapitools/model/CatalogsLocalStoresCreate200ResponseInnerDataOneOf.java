package org.openapitools.model;

import org.openapitools.model.PinterestLibError;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CatalogsLocalStoresCreate200ResponseInnerDataOneOf implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The ID of the local store.
   */
  @JsonProperty("id")
  private String id;

  @JsonProperty("exceptions")
  private PinterestLibError exceptions;

  /**
   * The ID of the local store.
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * 
   * @return exceptions
   */
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
    return Objects.equals(this.id, catalogsLocalStoresCreate200ResponseInnerDataOneOf.id) &&
        Objects.equals(this.exceptions, catalogsLocalStoresCreate200ResponseInnerDataOneOf.exceptions);
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
