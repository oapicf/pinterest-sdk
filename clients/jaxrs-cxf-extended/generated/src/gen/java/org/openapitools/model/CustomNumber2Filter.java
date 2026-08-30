package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupUint32Criteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomNumber2Filter  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2;
 /**
  * Get CUSTOM_NUMBER_2
  * @return CUSTOM_NUMBER_2
  */
  @JsonProperty("CUSTOM_NUMBER_2")
  @NotNull
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER2() {
    return CUSTOM_NUMBER_2;
  }

  /**
   * Sets the <code>CUSTOM_NUMBER_2</code> property.
   */
 public void setCUSTOMNUMBER2(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2) {
    this.CUSTOM_NUMBER_2 = CUSTOM_NUMBER_2;
  }

  /**
   * Sets the <code>CUSTOM_NUMBER_2</code> property.
   */
  public CustomNumber2Filter CUSTOM_NUMBER_2(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_2) {
    this.CUSTOM_NUMBER_2 = CUSTOM_NUMBER_2;
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
    CustomNumber2Filter customNumber2Filter = (CustomNumber2Filter) o;
    return Objects.equals(this.CUSTOM_NUMBER_2, customNumber2Filter.CUSTOM_NUMBER_2);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

