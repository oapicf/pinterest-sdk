package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2022-05-07T06:38:14.669946Z[Etc/UTC]")
public class CustomLabel3Filter   {
  @JsonProperty("CUSTOM_LABEL_3")
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3;

  /**
   **/
  public CustomLabel3Filter CUSTOM_LABEL_3(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_LABEL_3")
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL3() {
    return CUSTOM_LABEL_3;
  }
  public void setCUSTOMLABEL3(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomLabel3Filter customLabel3Filter = (CustomLabel3Filter) o;
    return Objects.equals(CUSTOM_LABEL_3, customLabel3Filter.CUSTOM_LABEL_3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_LABEL_3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomLabel3Filter {\n");
    
    sb.append("    CUSTOM_LABEL_3: ").append(toIndentedString(CUSTOM_LABEL_3)).append("\n");
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

