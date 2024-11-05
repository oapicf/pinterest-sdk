package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CreateAssetAccessRequestBodyAssetRequestsInner;

/**
 * An object containing a list of all the asset access requests
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateAssetAccessRequestBody   {
  
  private List<CreateAssetAccessRequestBodyAssetRequestsInner> assetRequests = new ArrayList<>();

  public CreateAssetAccessRequestBody () {

  }

  public CreateAssetAccessRequestBody (List<CreateAssetAccessRequestBodyAssetRequestsInner> assetRequests) {
    this.assetRequests = assetRequests;
  }

    
  @JsonProperty("asset_requests")
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
    return Objects.equals(assetRequests, createAssetAccessRequestBody.assetRequests);
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
