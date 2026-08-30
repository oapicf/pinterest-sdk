package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupUint32Criteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomNumber3Filter  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3;
 /**
  * Get CUSTOM_NUMBER_3
  * @return CUSTOM_NUMBER_3
  */
  @JsonProperty("CUSTOM_NUMBER_3")
  @NotNull
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER3() {
    return CUSTOM_NUMBER_3;
  }

  /**
   * Sets the <code>CUSTOM_NUMBER_3</code> property.
   */
 public void setCUSTOMNUMBER3(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3) {
    this.CUSTOM_NUMBER_3 = CUSTOM_NUMBER_3;
  }

  /**
   * Sets the <code>CUSTOM_NUMBER_3</code> property.
   */
  public CustomNumber3Filter CUSTOM_NUMBER_3(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_3) {
    this.CUSTOM_NUMBER_3 = CUSTOM_NUMBER_3;
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
    CustomNumber3Filter customNumber3Filter = (CustomNumber3Filter) o;
    return Objects.equals(this.CUSTOM_NUMBER_3, customNumber3Filter.CUSTOM_NUMBER_3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_NUMBER_3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomNumber3Filter {\n");
    
    sb.append("    CUSTOM_NUMBER_3: ").append(toIndentedString(CUSTOM_NUMBER_3)).append("\n");
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

