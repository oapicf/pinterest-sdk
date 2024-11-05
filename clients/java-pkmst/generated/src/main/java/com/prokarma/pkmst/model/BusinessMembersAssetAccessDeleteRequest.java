package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.BusinessMembersAssetAccessDeleteRequestAccessesInner;
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
 * BusinessMembersAssetAccessDeleteRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessMembersAssetAccessDeleteRequest   {
  @JsonProperty("accesses")
  
  private List<BusinessMembersAssetAccessDeleteRequestAccessesInner> accesses = new ArrayList<>();

  public BusinessMembersAssetAccessDeleteRequest accesses(List<BusinessMembersAssetAccessDeleteRequestAccessesInner> accesses) {
    this.accesses = accesses;
    return this;
  }

  public BusinessMembersAssetAccessDeleteRequest addAccessesItem(BusinessMembersAssetAccessDeleteRequestAccessesInner accessesItem) {
    if (this.accesses == null) {
      this.accesses = new ArrayList<>();
    }
    this.accesses.add(accessesItem);
    return this;
  }

  /**
   * List of members asset access to be deleted
   * @return accesses
   */
  @ApiModelProperty(required = true, value = "List of members asset access to be deleted")
  public List<BusinessMembersAssetAccessDeleteRequestAccessesInner> getAccesses() {
    return accesses;
  }

  public void setAccesses(List<BusinessMembersAssetAccessDeleteRequestAccessesInner> accesses) {
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
    BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest = (BusinessMembersAssetAccessDeleteRequest) o;
    return Objects.equals(this.accesses, businessMembersAssetAccessDeleteRequest.accesses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accesses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessMembersAssetAccessDeleteRequest {\n");
    
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

