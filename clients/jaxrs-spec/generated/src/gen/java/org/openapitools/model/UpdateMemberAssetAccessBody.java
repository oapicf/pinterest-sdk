package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateMemberAssetAccessBodyAccessesInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * An object with a list of all the new accesses.
 **/
@ApiModel(description = "An object with a list of all the new accesses.")
@JsonTypeName("UpdateMemberAssetAccessBody")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateMemberAssetAccessBody   {
  private @Valid List<@Valid UpdateMemberAssetAccessBodyAccessesInner> accesses = new ArrayList<>();

  /**
   **/
  public UpdateMemberAssetAccessBody accesses(List<@Valid UpdateMemberAssetAccessBodyAccessesInner> accesses) {
    this.accesses = accesses;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("accesses")
  @NotNull @Valid  @Size(min=1,max=50)public List<@Valid UpdateMemberAssetAccessBodyAccessesInner> getAccesses() {
    return accesses;
  }

  @JsonProperty("accesses")
  public void setAccesses(List<@Valid UpdateMemberAssetAccessBodyAccessesInner> accesses) {
    this.accesses = accesses;
  }

  public UpdateMemberAssetAccessBody addAccessesItem(UpdateMemberAssetAccessBodyAccessesInner accessesItem) {
    if (this.accesses == null) {
      this.accesses = new ArrayList<>();
    }

    this.accesses.add(accessesItem);
    return this;
  }

  public UpdateMemberAssetAccessBody removeAccessesItem(UpdateMemberAssetAccessBodyAccessesInner accessesItem) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

