/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.3.0
 * Maintained by: pinterest-api@pinterest.com
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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2022-05-08T00:32:08.284608Z[Etc/UTC]")
public class CustomLabel1Filter   {
  
  private CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1;

  /**
   */
  public CustomLabel1Filter CUSTOM_LABEL_1(CatalogsProductGroupMultipleStringCriteria CUSTOM_LABEL_1) {
    this.CUSTOM_LABEL_1 = CUSTOM_LABEL_1;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

