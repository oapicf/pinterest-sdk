package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupCurrencyCriteria;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemIdFilter  {
  
  @ApiModelProperty(required = true, value = "")
  private CatalogsProductGroupCurrencyCriteria ITEM_ID;
 /**
   * Get ITEM_ID
   * @return ITEM_ID
  **/
  @JsonProperty("ITEM_ID")
  public CatalogsProductGroupCurrencyCriteria getITEMID() {
    return ITEM_ID;
  }

  public void setITEMID(CatalogsProductGroupCurrencyCriteria ITEM_ID) {
    this.ITEM_ID = ITEM_ID;
  }

  public ItemIdFilter ITEM_ID(CatalogsProductGroupCurrencyCriteria ITEM_ID) {
    this.ITEM_ID = ITEM_ID;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemIdFilter {\n");
    
    sb.append("    ITEM_ID: ").append(toIndentedString(ITEM_ID)).append("\n");
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

