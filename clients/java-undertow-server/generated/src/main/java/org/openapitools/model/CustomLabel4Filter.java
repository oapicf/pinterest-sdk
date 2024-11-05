/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CustomLabel4Filter   {
  
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4;

  /**
   */
  public CustomLabel4Filter CUSTOM_LABEL_4(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_4) {
    this.CUSTOM_LABEL_4 = CUSTOM_LABEL_4;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

