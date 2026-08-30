package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupFilterOperatorTypeCriteria;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CustomLabel1Filter implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("CUSTOM_LABEL_1")
  private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1;

  /**
   * 
   * @return CUSTOM_LABEL_1
   */
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL1() {
    return CUSTOM_LABEL_1;
  }

  public void setCUSTOMLABEL1(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomLabel1Filter customLabel1Filter = (CustomLabel1Filter) o;
    return Objects.equals(this.CUSTOM_LABEL_1, customLabel1Filter.CUSTOM_LABEL_1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_LABEL_1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomLabel1Filter {\n");
    
    sb.append("    CUSTOM_LABEL_1: ").append(toIndentedString(CUSTOM_LABEL_1)).append("\n");
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
