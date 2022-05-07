package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ItemGroupIdFilter
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-05-07T10:48:11.625089Z[Etc/UTC]")
public class ItemGroupIdFilter   {

  @JsonProperty("ITEM_GROUP_ID")
  private CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID;

  public ItemGroupIdFilter ITEM_GROUP_ID(CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID) {
    this.ITEM_GROUP_ID = ITEM_GROUP_ID;
    return this;
  }

  /**
   * Get ITEM_GROUP_ID
   * @return ITEM_GROUP_ID
  */
  @NotNull @Valid 
  @Schema(name = "ITEM_GROUP_ID", required = true)
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
    return Objects.equals(this.ITEM_GROUP_ID, itemGroupIdFilter.ITEM_GROUP_ID);
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

