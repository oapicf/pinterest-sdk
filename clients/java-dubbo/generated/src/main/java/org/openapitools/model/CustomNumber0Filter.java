package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupUint32Criteria;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CustomNumber0Filter implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("CUSTOM_NUMBER_0")
  private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0;

  /**
   * 
   * @return CUSTOM_NUMBER_0
   */
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER0() {
    return CUSTOM_NUMBER_0;
  }

  public void setCUSTOMNUMBER0(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0) {
    this.CUSTOM_NUMBER_0 = CUSTOM_NUMBER_0;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomNumber0Filter customNumber0Filter = (CustomNumber0Filter) o;
    return Objects.equals(this.CUSTOM_NUMBER_0, customNumber0Filter.CUSTOM_NUMBER_0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_NUMBER_0);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomNumber0Filter {\n");
    
    sb.append("    CUSTOM_NUMBER_0: ").append(toIndentedString(CUSTOM_NUMBER_0)).append("\n");
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
