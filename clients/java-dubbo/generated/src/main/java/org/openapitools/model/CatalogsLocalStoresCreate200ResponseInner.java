package org.openapitools.model;

import org.openapitools.model.CatalogsLocalStoresCreate200ResponseInnerData;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CatalogsLocalStoresCreate200ResponseInner implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("data")
  private CatalogsLocalStoresCreate200ResponseInnerData data;

  /**
   * 
   * @return data
   */
  public CatalogsLocalStoresCreate200ResponseInnerData getData() {
    return data;
  }

  public void setData(CatalogsLocalStoresCreate200ResponseInnerData data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsLocalStoresCreate200ResponseInner catalogsLocalStoresCreate200ResponseInner = (CatalogsLocalStoresCreate200ResponseInner) o;
    return Objects.equals(this.data, catalogsLocalStoresCreate200ResponseInner.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsLocalStoresCreate200ResponseInner {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
