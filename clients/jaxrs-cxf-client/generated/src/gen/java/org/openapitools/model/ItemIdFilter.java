package org.openapitools.model;

import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ItemIdFilter  {
  
  @ApiModelProperty(required = true, value = "")
  private CatalogsProductGroupMultipleStringCriteria ITEM_ID;
 /**
   * Get ITEM_ID
   * @return ITEM_ID
  **/
  @JsonProperty("ITEM_ID")
  public CatalogsProductGroupMultipleStringCriteria getITEMID() {
    return ITEM_ID;
  }

  public void setITEMID(CatalogsProductGroupMultipleStringCriteria ITEM_ID) {
    this.ITEM_ID = ITEM_ID;
  }

  public ItemIdFilter ITEM_ID(CatalogsProductGroupMultipleStringCriteria ITEM_ID) {
    this.ITEM_ID = ITEM_ID;
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
    ItemIdFilter itemIdFilter = (ItemIdFilter) o;
    return Objects.equals(this.ITEM_ID, itemIdFilter.ITEM_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ITEM_ID);
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

