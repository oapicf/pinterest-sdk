package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupUint32Criteria;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomNumber1Filter   {
  
  private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1;

  public CustomNumber1Filter () {

  }

  public CustomNumber1Filter (CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1) {
    this.CUSTOM_NUMBER_1 = CUSTOM_NUMBER_1;
  }

    
  @JsonProperty("CUSTOM_NUMBER_1")
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER1() {
    return CUSTOM_NUMBER_1;
  }
  public void setCUSTOMNUMBER1(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1) {
    this.CUSTOM_NUMBER_1 = CUSTOM_NUMBER_1;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomNumber1Filter customNumber1Filter = (CustomNumber1Filter) o;
    return Objects.equals(CUSTOM_NUMBER_1, customNumber1Filter.CUSTOM_NUMBER_1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_NUMBER_1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomNumber1Filter {\n");
    
    sb.append("    CUSTOM_NUMBER_1: ").append(toIndentedString(CUSTOM_NUMBER_1)).append("\n");
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
