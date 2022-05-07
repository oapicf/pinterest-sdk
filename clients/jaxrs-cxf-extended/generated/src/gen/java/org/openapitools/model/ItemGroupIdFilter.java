package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ItemGroupIdFilter  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID;
 /**
  * Get ITEM_GROUP_ID
  * @return ITEM_GROUP_ID
  */
  @JsonProperty("ITEM_GROUP_ID")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getITEMGROUPID() {
    return ITEM_GROUP_ID;
  }

  /**
   * Sets the <code>ITEM_GROUP_ID</code> property.
   */
 public void setITEMGROUPID(CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID) {
    this.ITEM_GROUP_ID = ITEM_GROUP_ID;
  }

  /**
   * Sets the <code>ITEM_GROUP_ID</code> property.
   */
  public ItemGroupIdFilter ITEM_GROUP_ID(CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID) {
    this.ITEM_GROUP_ID = ITEM_GROUP_ID;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemGroupIdFilter {\n");
    
    sb.append("    ITEM_GROUP_ID: ").append(toIndentedString(ITEM_GROUP_ID)).append("\n");
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

