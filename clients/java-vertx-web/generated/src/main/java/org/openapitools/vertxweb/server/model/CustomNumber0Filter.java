package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupUint32Criteria;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomNumber0Filter   {
  
  private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0;

  public CustomNumber0Filter () {

  }

  public CustomNumber0Filter (CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0) {
    this.CUSTOM_NUMBER_0 = CUSTOM_NUMBER_0;
  }

    
  @JsonProperty("CUSTOM_NUMBER_0")
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
    return Objects.equals(CUSTOM_NUMBER_0, customNumber0Filter.CUSTOM_NUMBER_0);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
