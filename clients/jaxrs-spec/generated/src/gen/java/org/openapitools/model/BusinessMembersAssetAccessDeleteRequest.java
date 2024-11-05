package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BusinessMembersAssetAccessDeleteRequestAccessesInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("business_members_asset_access_delete_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessMembersAssetAccessDeleteRequest   {
  private @Valid List<@Valid BusinessMembersAssetAccessDeleteRequestAccessesInner> accesses = new ArrayList<>();

  /**
   * List of members asset access to be deleted
   **/
  public BusinessMembersAssetAccessDeleteRequest accesses(List<@Valid BusinessMembersAssetAccessDeleteRequestAccessesInner> accesses) {
    this.accesses = accesses;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of members asset access to be deleted")
  @JsonProperty("accesses")
  @NotNull @Valid  @Size(min=1,max=100)public List<@Valid BusinessMembersAssetAccessDeleteRequestAccessesInner> getAccesses() {
    return accesses;
  }

  @JsonProperty("accesses")
  public void setAccesses(List<@Valid BusinessMembersAssetAccessDeleteRequestAccessesInner> accesses) {
    this.accesses = accesses;
  }

  public BusinessMembersAssetAccessDeleteRequest addAccessesItem(BusinessMembersAssetAccessDeleteRequestAccessesInner accessesItem) {
    if (this.accesses == null) {
      this.accesses = new ArrayList<>();
    }

    this.accesses.add(accessesItem);
    return this;
  }

  public BusinessMembersAssetAccessDeleteRequest removeAccessesItem(BusinessMembersAssetAccessDeleteRequestAccessesInner accessesItem) {
    if (accessesItem != null && this.accesses != null) {
      this.accesses.remove(accessesItem);
    }

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

