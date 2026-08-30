package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupFilterOperatorTypeCriteria;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CustomLabel4Filter implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("CUSTOM_LABEL_4")
  private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4;

  /**
   * 
   * @return CUSTOM_LABEL_4
   */
  public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL4() {
    return CUSTOM_LABEL_4;
  }

  public void setCUSTOMLABEL4(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_4) {
    this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomLabel4Filter customLabel4Filter = (CustomLabel4Filter) o;
    return Objects.equals(this.CUSTOM_LABEL_4, customLabel4Filter.CUSTOM_LABEL_4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_LABEL_4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomLabel4Filter {\n");
    
    sb.append("    CUSTOM_LABEL_4: ").append(toIndentedString(CUSTOM_LABEL_4)).append("\n");
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
