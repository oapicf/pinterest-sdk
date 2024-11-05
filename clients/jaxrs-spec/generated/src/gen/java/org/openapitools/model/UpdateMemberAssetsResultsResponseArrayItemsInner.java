package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.UsersForIndividualAssetResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("UpdateMemberAssetsResultsResponseArray_items_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateMemberAssetsResultsResponseArrayItemsInner   {
  private UsersForIndividualAssetResponse response;

  /**
   **/
  public UpdateMemberAssetsResultsResponseArrayItemsInner response(UsersForIndividualAssetResponse response) {
    this.response = response;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("response")
  @Valid public UsersForIndividualAssetResponse getResponse() {
    return response;
  }

  @JsonProperty("response")
  public void setResponse(UsersForIndividualAssetResponse response) {
    this.response = response;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMemberAssetsResultsResponseArrayItemsInner updateMemberAssetsResultsResponseArrayItemsInner = (UpdateMemberAssetsResultsResponseArrayItemsInner) o;
    return Objects.equals(this.response, updateMemberAssetsResultsResponseArrayItemsInner.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMemberAssetsResultsResponseArrayItemsInner {\n");
    
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

