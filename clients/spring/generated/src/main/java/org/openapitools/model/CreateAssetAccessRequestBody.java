package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateAssetAccessRequestBodyAssetRequestsInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An object containing a list of all the asset access requests
 */

@Schema(name = "CreateAssetAccessRequestBody", description = "An object containing a list of all the asset access requests")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateAssetAccessRequestBody {

  @Valid
  private List<@Valid CreateAssetAccessRequestBodyAssetRequestsInner> assetRequests = new ArrayList<>();

  public CreateAssetAccessRequestBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateAssetAccessRequestBody(List<@Valid CreateAssetAccessRequestBodyAssetRequestsInner> assetRequests) {
    this.assetRequests = assetRequests;
  }

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
   */
  @NotNull @Valid @Size(min = 1, max = 100) 
  @Schema(name = "asset_requests", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("asset_requests")
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

