package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2022-05-07T06:42:33.868481Z[Etc/UTC]")
public class ItemGroupIdFilter   {
  

  private CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("ITEM_GROUP_ID")
  @NotNull
  public CatalogsProductGroupMultipleStringCriteria getITEMGROUPID() {
    return ITEM_GROUP_ID;
  }
  public void setITEMGROUPID(CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID) {
    this.ITEM_GROUP_ID = ITEM_GROUP_ID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemGroupIdFilter itemGroupIdFilter = (ItemGroupIdFilter) o;
    return Objects.equals(ITEM_GROUP_ID, itemGroupIdFilter.ITEM_GROUP_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ITEM_GROUP_ID);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

