package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupFilterOperatorTypeCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("CustomLabel3Filter")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CustomLabel3Filter   {
  private CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3;

  public CustomLabel3Filter() {
  }

  @JsonCreator
  public CustomLabel3Filter(
    @JsonProperty(required = true, value = "CUSTOM_LABEL_3") CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3
  ) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
  }

  /**
   **/
  public CustomLabel3Filter CUSTOM_LABEL_3(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3) {
    this.CUSTOM_LABEL_3 = CUSTOM_LABEL_3;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "CUSTOM_LABEL_3")
  @NotNull @Valid public CatalogsProductGroupFilterOperatorTypeCriteria getCUSTOMLABEL3() {
    return CUSTOM_LABEL_3;
  }

  @JsonProperty(required = true, value = "CUSTOM_LABEL_3")
  public void setCUSTOMLABEL3(CatalogsProductGroupFilterOperatorTypeCriteria CUSTOM_LABEL_3) {
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
    return Objects.equals(this.CUSTOM_LABEL_3, customLabel3Filter.CUSTOM_LABEL_3);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
