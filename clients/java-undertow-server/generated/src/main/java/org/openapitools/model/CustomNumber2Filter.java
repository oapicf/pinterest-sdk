/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
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
import org.openapitools.model.CatalogsProductGroupUint32Criteria;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomNumber2Filter   {
  
  private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2;

  /**
   */
  public CustomNumber2Filter CUSTOM_NUMBER_2(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2) {
    this.CUSTOM_NUMBER_2 = CUSTOM_NUMBER_2;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("CUSTOM_NUMBER_2")
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER2() {
    return CUSTOM_NUMBER_2;
  }
  public void setCUSTOMNUMBER2(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2) {
    this.CUSTOM_NUMBER_2 = CUSTOM_NUMBER_2;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomNumber2Filter customNumber2Filter = (CustomNumber2Filter) o;
    return Objects.equals(CUSTOM_NUMBER_2, customNumber2Filter.CUSTOM_NUMBER_2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_NUMBER_2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomNumber2Filter {\n");
    
    sb.append("    CUSTOM_NUMBER_2: ").append(toIndentedString(CUSTOM_NUMBER_2)).append("\n");
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

