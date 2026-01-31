package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupUint32Criteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomNumber0Filter  {
  
  @ApiModelProperty(required = true, value = "")

  @Valid

  private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0;
 /**
   * Get CUSTOM_NUMBER_0
   * @return CUSTOM_NUMBER_0
  **/
  @JsonProperty("CUSTOM_NUMBER_0")
  @NotNull
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER0() {
    return CUSTOM_NUMBER_0;
  }

  public void setCUSTOMNUMBER0(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0) {
    this.CUSTOM_NUMBER_0 = CUSTOM_NUMBER_0;
  }

  public CustomNumber0Filter CUSTOM_NUMBER_0(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_0) {
    this.CUSTOM_NUMBER_0 = CUSTOM_NUMBER_0;
    return this;
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
    return Objects.equals(this.CUSTOM_NUMBER_0, customNumber0Filter.CUSTOM_NUMBER_0);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

