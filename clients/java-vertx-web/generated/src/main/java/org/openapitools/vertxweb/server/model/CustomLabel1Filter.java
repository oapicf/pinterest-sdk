package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CatalogsProductGroupMultipleStringCriteria;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomLabel1Filter   {
  
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1;

  public CustomLabel1Filter () {

  }

  public CustomLabel1Filter (CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
  }

    
  @JsonProperty("CUSTOM_LABEL_1")
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL1() {
    return CUSTOM_LABEL_1;
  }
  public void setCUSTOMLABEL1(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1) {
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
    return Objects.equals(CUSTOM_LABEL_1, customLabel1Filter.CUSTOM_LABEL_1);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
