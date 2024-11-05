package org.openapitools.model;

import org.openapitools.model.UsersForIndividualAssetResponse;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdateMemberAssetsResultsResponseArrayItemsInner  {
  
  @ApiModelProperty(value = "")
  private UsersForIndividualAssetResponse response;
 /**
   * Get response
   * @return response
  **/
  @JsonProperty("response")
  public UsersForIndividualAssetResponse getResponse() {
    return response;
  }

  public void setResponse(UsersForIndividualAssetResponse response) {
    this.response = response;
  }

  public UpdateMemberAssetsResultsResponseArrayItemsInner response(UsersForIndividualAssetResponse response) {
    this.response = response;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

