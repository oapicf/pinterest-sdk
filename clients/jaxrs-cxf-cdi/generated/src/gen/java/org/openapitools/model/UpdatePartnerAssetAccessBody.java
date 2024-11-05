package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdatePartnerAssetAccessBodyAccessesInner;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class UpdatePartnerAssetAccessBody   {
  
  private List<@Valid UpdatePartnerAssetAccessBodyAccessesInner> accesses = new ArrayList<>();

  /**
   **/
  public UpdatePartnerAssetAccessBody accesses(List<@Valid UpdatePartnerAssetAccessBodyAccessesInner> accesses) {
    this.accesses = accesses;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("accesses")
  @NotNull
 @Size(min=1,max=50)  public List<@Valid UpdatePartnerAssetAccessBodyAccessesInner> getAccesses() {
    return accesses;
  }
  public void setAccesses(List<@Valid UpdatePartnerAssetAccessBodyAccessesInner> accesses) {
    this.accesses = accesses;
  }

  public UpdatePartnerAssetAccessBody addAccessesItem(UpdatePartnerAssetAccessBodyAccessesInner accessesItem) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

