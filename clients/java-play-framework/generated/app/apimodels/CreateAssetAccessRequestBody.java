package apimodels;

import apimodels.CreateAssetAccessRequestBodyAssetRequestsInner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * An object containing a list of all the asset access requests
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateAssetAccessRequestBody   {
  @JsonProperty("asset_requests")
  @NotNull
@Size(min=1,max=100)
@Valid

  private List<@Valid CreateAssetAccessRequestBodyAssetRequestsInner> assetRequests = new ArrayList<>();

  public CreateAssetAccessRequestBody assetRequests(List<@Valid CreateAssetAccessRequestBodyAssetRequestsInner> assetRequests) {
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
  **/
  public List<@Valid CreateAssetAccessRequestBodyAssetRequestsInner> getAssetRequests() {
    return assetRequests;
  }

  public void setAssetRequests(List<@Valid CreateAssetAccessRequestBodyAssetRequestsInner> assetRequests) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

