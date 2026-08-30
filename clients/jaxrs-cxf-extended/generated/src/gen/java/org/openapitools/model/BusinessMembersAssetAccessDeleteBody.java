package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeleteMemberAssetAccessItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * An object with a list of member asset accesses to delete.
 */
@ApiModel(description="An object with a list of member asset accesses to delete.")

public class BusinessMembersAssetAccessDeleteBody  {
  
 /**
  * List of members asset access to be deleted
  */
  @ApiModelProperty(required = true, value = "List of members asset access to be deleted")
  @Valid
  private List<@Valid DeleteMemberAssetAccessItem> accesses = new ArrayList<>();
 /**
  * List of members asset access to be deleted
  * @return accesses
  */
  @JsonProperty("accesses")
  @NotNull
 @Size(min=1,max=100)  public List<@Valid DeleteMemberAssetAccessItem> getAccesses() {
    return accesses;
  }

  /**
   * Sets the <code>accesses</code> property.
   */
 public void setAccesses(List<@Valid DeleteMemberAssetAccessItem> accesses) {
    this.accesses = accesses;
  }

  /**
   * Sets the <code>accesses</code> property.
   */
  public BusinessMembersAssetAccessDeleteBody accesses(List<@Valid DeleteMemberAssetAccessItem> accesses) {
    this.accesses = accesses;
    return this;
  }

  /**
   * Adds a new item to the <code>accesses</code> list.
   */
  public BusinessMembersAssetAccessDeleteBody addAccessesItem(DeleteMemberAssetAccessItem accessesItem) {
    this.accesses.add(accessesItem);
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
    BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody = (BusinessMembersAssetAccessDeleteBody) o;
    return Objects.equals(this.accesses, businessMembersAssetAccessDeleteBody.accesses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accesses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessMembersAssetAccessDeleteBody {\n");
    
    sb.append("    accesses: ").append(toIndentedString(accesses)).append("\n");
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

