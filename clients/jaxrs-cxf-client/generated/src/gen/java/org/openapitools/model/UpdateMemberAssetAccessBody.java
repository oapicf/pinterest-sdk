package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateMemberAssetAccessBodyAccessesInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * An object with a list of all the new accesses.
 **/
@ApiModel(description="An object with a list of all the new accesses.")

public class UpdateMemberAssetAccessBody  {
  
  @ApiModelProperty(required = true, value = "")
  private List<UpdateMemberAssetAccessBodyAccessesInner> accesses = new ArrayList<>();
 /**
   * Get accesses
   * @return accesses
  **/
  @JsonProperty("accesses")
  public List<UpdateMemberAssetAccessBodyAccessesInner> getAccesses() {
    return accesses;
  }

  public void setAccesses(List<UpdateMemberAssetAccessBodyAccessesInner> accesses) {
    this.accesses = accesses;
  }

  public UpdateMemberAssetAccessBody accesses(List<UpdateMemberAssetAccessBodyAccessesInner> accesses) {
    this.accesses = accesses;
    return this;
  }

  public UpdateMemberAssetAccessBody addAccessesItem(UpdateMemberAssetAccessBodyAccessesInner accessesItem) {
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
    UpdateMemberAssetAccessBody updateMemberAssetAccessBody = (UpdateMemberAssetAccessBody) o;
    return Objects.equals(this.accesses, updateMemberAssetAccessBody.accesses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accesses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMemberAssetAccessBody {\n");
    
    sb.append("    accesses: ").append(toIndentedString(accesses)).append("\n");
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

