package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupUint32Criteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CustomNumber4Filter  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4;
 /**
  * Get CUSTOM_NUMBER_4
  * @return CUSTOM_NUMBER_4
  */
  @JsonProperty("CUSTOM_NUMBER_4")
  @NotNull
  public CatalogsProductGroupUint32Criteria getCUSTOMNUMBER4() {
    return CUSTOM_NUMBER_4;
  }

  /**
   * Sets the <code>CUSTOM_NUMBER_4</code> property.
   */
 public void setCUSTOMNUMBER4(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4) {
    this.CUSTOM_NUMBER_4 = CUSTOM_NUMBER_4;
  }

  /**
   * Sets the <code>CUSTOM_NUMBER_4</code> property.
   */
  public CustomNumber4Filter CUSTOM_NUMBER_4(CatalogsProductGroupUint32Criteria CUSTOM_NUMBER_4) {
    this.CUSTOM_NUMBER_4 = CUSTOM_NUMBER_4;
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
    CustomNumber4Filter customNumber4Filter = (CustomNumber4Filter) o;
    return Objects.equals(this.CUSTOM_NUMBER_4, customNumber4Filter.CUSTOM_NUMBER_4);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CUSTOM_NUMBER_4);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomNumber4Filter {\n");
    
    sb.append("    CUSTOM_NUMBER_4: ").append(toIndentedString(CUSTOM_NUMBER_4)).append("\n");
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

