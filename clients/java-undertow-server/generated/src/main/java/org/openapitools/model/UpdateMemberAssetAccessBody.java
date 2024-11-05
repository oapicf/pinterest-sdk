/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateMemberAssetAccessBodyAccessesInner;



/**
 * An object with a list of all the new accesses.
 */

@ApiModel(description = "An object with a list of all the new accesses.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateMemberAssetAccessBody   {
  
  private List<UpdateMemberAssetAccessBodyAccessesInner> accesses = new ArrayList<>();

  /**
   */
  public UpdateMemberAssetAccessBody accesses(List<UpdateMemberAssetAccessBodyAccessesInner> accesses) {
    this.accesses = accesses;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("accesses")
  public List<UpdateMemberAssetAccessBodyAccessesInner> getAccesses() {
    return accesses;
  }
  public void setAccesses(List<UpdateMemberAssetAccessBodyAccessesInner> accesses) {
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
    UpdateMemberAssetAccessBody updateMemberAssetAccessBody = (UpdateMemberAssetAccessBody) o;
    return Objects.equals(accesses, updateMemberAssetAccessBody.accesses);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

