package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.DeletePartnerAssetAccessBodyAccessesInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("DeletePartnerAssetAccessBody")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeletePartnerAssetAccessBody   {
  private @Valid List<@Valid DeletePartnerAssetAccessBodyAccessesInner> accesses = new ArrayList<>();

  /**
   **/
  public DeletePartnerAssetAccessBody accesses(List<@Valid DeletePartnerAssetAccessBodyAccessesInner> accesses) {
    this.accesses = accesses;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("accesses")
  @NotNull @Valid  @Size(min=1,max=50)public List<@Valid DeletePartnerAssetAccessBodyAccessesInner> getAccesses() {
    return accesses;
  }

  @JsonProperty("accesses")
  public void setAccesses(List<@Valid DeletePartnerAssetAccessBodyAccessesInner> accesses) {
    this.accesses = accesses;
  }

  public DeletePartnerAssetAccessBody addAccessesItem(DeletePartnerAssetAccessBodyAccessesInner accessesItem) {
    if (this.accesses == null) {
      this.accesses = new ArrayList<>();
    }

    this.accesses.add(accessesItem);
    return this;
  }

  public DeletePartnerAssetAccessBody removeAccessesItem(DeletePartnerAssetAccessBodyAccessesInner accessesItem) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

