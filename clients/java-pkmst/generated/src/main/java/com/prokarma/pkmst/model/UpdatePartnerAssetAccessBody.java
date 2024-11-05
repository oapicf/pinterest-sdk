package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.UpdatePartnerAssetAccessBodyAccessesInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * UpdatePartnerAssetAccessBody
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdatePartnerAssetAccessBody   {
  @JsonProperty("accesses")
  
  private List<UpdatePartnerAssetAccessBodyAccessesInner> accesses = new ArrayList<>();

  public UpdatePartnerAssetAccessBody accesses(List<UpdatePartnerAssetAccessBodyAccessesInner> accesses) {
    this.accesses = accesses;
    return this;
  }

  public UpdatePartnerAssetAccessBody addAccessesItem(UpdatePartnerAssetAccessBodyAccessesInner accessesItem) {
    if (this.accesses == null) {
      this.accesses = new ArrayList<>();
    }
    this.accesses.add(accessesItem);
    return this;
  }

  /**
   * Get accesses
   * @return accesses
   */
  @ApiModelProperty(required = true, value = "")
  public List<UpdatePartnerAssetAccessBodyAccessesInner> getAccesses() {
    return accesses;
  }

  public void setAccesses(List<UpdatePartnerAssetAccessBodyAccessesInner> accesses) {
    this.accesses = accesses;
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

