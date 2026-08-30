package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateAssetAccessRequestItem;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An object containing a list of all the asset access requests
 */
@ApiModel(description="An object containing a list of all the asset access requests")

public class CreateAssetAccessRequestBody  {
  
  @ApiModelProperty(required = true, value = "")

  private List<CreateAssetAccessRequestItem> assetRequests = new ArrayList<>();
 /**
   * Get assetRequests
   * @return assetRequests
  **/
  @JsonProperty("asset_requests")
  public List<CreateAssetAccessRequestItem> getAssetRequests() {
    return assetRequests;
  }

  public void setAssetRequests(List<CreateAssetAccessRequestItem> assetRequests) {
    this.assetRequests = assetRequests;
  }

  public CreateAssetAccessRequestBody assetRequests(List<CreateAssetAccessRequestItem> assetRequests) {
    this.assetRequests = assetRequests;
    return this;
  }

  public CreateAssetAccessRequestBody addAssetRequestsItem(CreateAssetAccessRequestItem assetRequestsItem) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

