package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateAssetAccessRequestBodyAssetRequestsInner;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * An object containing a list of all the asset access requests
 **/
@ApiModel(description = "An object containing a list of all the asset access requests")
@JsonTypeName("CreateAssetAccessRequestBody")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateAssetAccessRequestBody   {
  private @Valid List<@Valid CreateAssetAccessRequestBodyAssetRequestsInner> assetRequests = new ArrayList<>();

  /**
   **/
  public CreateAssetAccessRequestBody assetRequests(List<@Valid CreateAssetAccessRequestBodyAssetRequestsInner> assetRequests) {
    this.assetRequests = assetRequests;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("asset_requests")
  @NotNull @Valid  @Size(min=1,max=100)public List<@Valid CreateAssetAccessRequestBodyAssetRequestsInner> getAssetRequests() {
    return assetRequests;
  }

  @JsonProperty("asset_requests")
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

  public CreateAssetAccessRequestBody removeAssetRequestsItem(CreateAssetAccessRequestBodyAssetRequestsInner assetRequestsItem) {
    if (assetRequestsItem != null && this.assetRequests != null) {
      this.assetRequests.remove(assetRequestsItem);
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

