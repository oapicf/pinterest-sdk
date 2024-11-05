package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdatePartnerAssetAccessBodyAccessesInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdatePartnerAssetAccessBody  {
  
  @ApiModelProperty(required = true, value = "")
  private List<UpdatePartnerAssetAccessBodyAccessesInner> accesses = new ArrayList<>();
 /**
   * Get accesses
   * @return accesses
  **/
  @JsonProperty("accesses")
  public List<UpdatePartnerAssetAccessBodyAccessesInner> getAccesses() {
    return accesses;
  }

  public void setAccesses(List<UpdatePartnerAssetAccessBodyAccessesInner> accesses) {
    this.accesses = accesses;
  }

  public UpdatePartnerAssetAccessBody accesses(List<UpdatePartnerAssetAccessBodyAccessesInner> accesses) {
    this.accesses = accesses;
    return this;
  }

  public UpdatePartnerAssetAccessBody addAccessesItem(UpdatePartnerAssetAccessBodyAccessesInner accessesItem) {
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
    UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody = (UpdatePartnerAssetAccessBody) o;
    return Objects.equals(this.accesses, updatePartnerAssetAccessBody.accesses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accesses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePartnerAssetAccessBody {\n");
    
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

