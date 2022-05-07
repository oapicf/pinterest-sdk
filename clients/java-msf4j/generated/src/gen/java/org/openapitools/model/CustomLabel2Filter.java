package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;

/**
 * CustomLabel2Filter
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2022-05-07T06:39:19.282212Z[Etc/UTC]")
public class CustomLabel2Filter   {
  @JsonProperty("CUSTOM_LABEL_2")
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2;

  public CustomLabel2Filter CUSTOM_LABEL_2(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2) {
    this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
    return this;
  }

   /**
   * Get CUSTOM_LABEL_2
   * @return CUSTOM_LABEL_2
  **/
  @ApiModelProperty(required = true, value = "")
  public CatalogsProductGroupMultipleStringCriteria getCUSTOMLABEL2() {
    return CUSTOM_LABEL_2;
  }

  public void setCUSTOMLABEL2(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_2) {
    this.CUSTOM_LABEL_2 = CUSTOM_LABEL_2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomLabel2Filter customLabel2Filter = (CustomLabel2Filter) o;
    return Objects.equals(this.CUSTOM_LABEL_2, customLabel2Filter.CUSTOM_LABEL_2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_LABEL_2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomLabel2Filter {\n");
    
    sb.append("    CUSTOM_LABEL_2: ").append(toIndentedString(CUSTOM_LABEL_2)).append("\n");
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

