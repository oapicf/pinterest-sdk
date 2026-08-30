package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupFilterOperatorTypeCriteria;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CustomLabel0Filter implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("CUSTOM_LABEL_0")
  private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0;

  /**
   * 
   * @return CUSTOM_LABEL_0
   */
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL0() {
    return CUSTOM_LABEL_0;
  }

  public void setCUSTOMLABEL0(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_0) {
    this.CUSTOM_LABEL_0 = CUSTOM_LABEL_0;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomLabel0Filter customLabel0Filter = (CustomLabel0Filter) o;
    return Objects.equals(this.CUSTOM_LABEL_0, customLabel0Filter.CUSTOM_LABEL_0);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_LABEL_0);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomLabel0Filter {\n");
    
    sb.append("    CUSTOM_LABEL_0: ").append(toIndentedString(CUSTOM_LABEL_0)).append("\n");
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
