package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupUint32Criteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomNumber1Filter  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1;
 /**
  * Get CUSTOM_NUMBER_1
  * @return CUSTOM_NUMBER_1
  */
  @JsonProperty("CUSTOM_NUMBER_1")
  @NotNull
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER1() {
    return CUSTOM_NUMBER_1;
  }

  /**
   * Sets the <code>CUSTOM_NUMBER_1</code> property.
   */
 public void setCUSTOMNUMBER1(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1) {
    this.CUSTOM_NUMBER_1 = CUSTOM_NUMBER_1;
  }

  /**
   * Sets the <code>CUSTOM_NUMBER_1</code> property.
   */
  public CustomNumber1Filter CUSTOM_NUMBER_1(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_1) {
    this.CUSTOM_NUMBER_1 = CUSTOM_NUMBER_1;
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
    CustomNumber1Filter customNumber1Filter = (CustomNumber1Filter) o;
    return Objects.equals(this.CUSTOM_NUMBER_1, customNumber1Filter.CUSTOM_NUMBER_1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_NUMBER_1);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomNumber1Filter {\n");
    
    sb.append("    CUSTOM_NUMBER_1: ").append(toIndentedString(CUSTOM_NUMBER_1)).append("\n");
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

