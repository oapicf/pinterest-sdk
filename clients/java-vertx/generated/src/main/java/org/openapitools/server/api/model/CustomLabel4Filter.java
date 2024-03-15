package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.CatalogsProductGroupMultipleStringCriteria;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomLabel4Filter   {
  
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4;

  public CustomLabel4Filter () {

  }

  public CustomLabel4Filter (CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4) {
    this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
  }

    
  @JsonProperty("CUSTOM_LABEL_4")
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL4() {
    return CUSTOM_LABEL_4;
  }
  public void setCUSTOMLABEL4(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4) {
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
    return Objects.equals(CUSTOM_LABEL_4, customLabel4Filter.CUSTOM_LABEL_4);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
