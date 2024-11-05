package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeletePartnerAssetAccessBodyAccessesInner;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeletePartnerAssetAccessBody  {
  
  @ApiModelProperty(required = true, value = "")
  private List<DeletePartnerAssetAccessBodyAccessesInner> accesses = new ArrayList<>();
 /**
   * Get accesses
   * @return accesses
  **/
  @JsonProperty("accesses")
  public List<DeletePartnerAssetAccessBodyAccessesInner> getAccesses() {
    return accesses;
  }

  public void setAccesses(List<DeletePartnerAssetAccessBodyAccessesInner> accesses) {
    this.accesses = accesses;
  }

  public DeletePartnerAssetAccessBody accesses(List<DeletePartnerAssetAccessBodyAccessesInner> accesses) {
    this.accesses = accesses;
    return this;
  }

  public DeletePartnerAssetAccessBody addAccessesItem(DeletePartnerAssetAccessBodyAccessesInner accessesItem) {
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
    DeletePartnerAssetAccessBody deletePartnerAssetAccessBody = (DeletePartnerAssetAccessBody) o;
    return Objects.equals(this.accesses, deletePartnerAssetAccessBody.accesses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accesses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeletePartnerAssetAccessBody {\n");
    
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

