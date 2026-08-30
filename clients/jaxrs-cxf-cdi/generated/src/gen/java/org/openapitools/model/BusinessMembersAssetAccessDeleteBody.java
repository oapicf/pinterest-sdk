package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeleteMemberAssetAccessItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * An object with a list of member asset accesses to delete.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "An object with a list of member asset accesses to delete.")
public class BusinessMembersAssetAccessDeleteBody   {
  
  private List<@Valid DeleteMemberAssetAccessItem> accesses = new ArrayList<>();

  /**
   * List of members asset access to be deleted
   **/
  public BusinessMembersAssetAccessDeleteBody accesses(List<@Valid DeleteMemberAssetAccessItem> accesses) {
    this.accesses = accesses;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of members asset access to be deleted")
  @JsonProperty("accesses")
  @NotNull
 @Size(min=1,max=100)  public List<@Valid DeleteMemberAssetAccessItem> getAccesses() {
    return accesses;
  }
  public void setAccesses(List<@Valid DeleteMemberAssetAccessItem> accesses) {
    this.accesses = accesses;
  }

  public BusinessMembersAssetAccessDeleteBody addAccessesItem(DeleteMemberAssetAccessItem accessesItem) {
    if (this.accesses == null) {
      this.accesses = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

