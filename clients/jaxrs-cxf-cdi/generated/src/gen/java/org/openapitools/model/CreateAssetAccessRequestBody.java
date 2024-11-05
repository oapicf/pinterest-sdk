package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateAssetAccessRequestBodyAssetRequestsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * An object containing a list of all the asset access requests
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "An object containing a list of all the asset access requests")
public class CreateAssetAccessRequestBody   {
  
  private List<@Valid CreateAssetAccessRequestBodyAssetRequestsInner> assetRequests = new ArrayList<>();

  /**
   **/
  public CreateAssetAccessRequestBody assetRequests(List<@Valid CreateAssetAccessRequestBodyAssetRequestsInner> assetRequests) {
    this.assetRequests = assetRequests;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("asset_requests")
  @NotNull
 @Size(min=1,max=100)  public List<@Valid CreateAssetAccessRequestBodyAssetRequestsInner> getAssetRequests() {
    return assetRequests;
  }
  public void setAssetRequests(List<@Valid CreateAssetAccessRequestBodyAssetRequestsInner> assetRequests) {
    this.assetRequests = assetRequests;
  }

  public CreateAssetAccessRequestBody addAssetRequestsItem(CreateAssetAccessRequestBodyAssetRequestsInner assetRequestsItem) {
    if (this.assetRequests == null) {
      this.assetRequests = new ArrayList<>();
    }
    this.assetRequests.add(assetRequestsItem);
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
    CreateAssetAccessRequestBody createAssetAccessRequestBody = (CreateAssetAccessRequestBody) o;
    return Objects.equals(this.assetRequests, createAssetAccessRequestBody.assetRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssetAccessRequestBody {\n");
    
    sb.append("    assetRequests: ").append(toIndentedString(assetRequests)).append("\n");
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

