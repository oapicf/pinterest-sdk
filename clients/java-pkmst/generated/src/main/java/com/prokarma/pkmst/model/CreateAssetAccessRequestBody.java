package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CreateAssetAccessRequestBodyAssetRequestsInner;
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
 * An object containing a list of all the asset access requests
 */
@ApiModel(description = "An object containing a list of all the asset access requests")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateAssetAccessRequestBody   {
  @JsonProperty("asset_requests")
  
  private List<CreateAssetAccessRequestBodyAssetRequestsInner> assetRequests = new ArrayList<>();

  public CreateAssetAccessRequestBody assetRequests(List<CreateAssetAccessRequestBodyAssetRequestsInner> assetRequests) {
    this.assetRequests = assetRequests;
    return this;
  }

  public CreateAssetAccessRequestBody addAssetRequestsItem(CreateAssetAccessRequestBodyAssetRequestsInner assetRequestsItem) {
    if (this.assetRequests == null) {
      this.assetRequests = new ArrayList<>();
    }
    this.assetRequests.add(assetRequestsItem);
    return this;
  }

  /**
   * Get assetRequests
   * @return assetRequests
   */
  @ApiModelProperty(required = true, value = "")
  public List<CreateAssetAccessRequestBodyAssetRequestsInner> getAssetRequests() {
    return assetRequests;
  }

  public void setAssetRequests(List<CreateAssetAccessRequestBodyAssetRequestsInner> assetRequests) {
    this.assetRequests = assetRequests;
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

