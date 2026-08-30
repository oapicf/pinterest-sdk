package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateAssetAccessRequestItem;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * An object containing a list of all the asset access requests
 **/
@ApiModel(description = "An object containing a list of all the asset access requests")
@JsonTypeName("CreateAssetAccessRequestBody")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CreateAssetAccessRequestBody   {
  private @Valid List<@Valid CreateAssetAccessRequestItem> assetRequests = new ArrayList<>();

  public CreateAssetAccessRequestBody() {
  }

  @JsonCreator
  public CreateAssetAccessRequestBody(
    @JsonProperty(required = true, value = "asset_requests") List<@Valid CreateAssetAccessRequestItem> assetRequests
  ) {
    this.assetRequests = assetRequests;
  }

  /**
   **/
  public CreateAssetAccessRequestBody assetRequests(List<@Valid CreateAssetAccessRequestItem> assetRequests) {
    this.assetRequests = assetRequests;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "asset_requests")
  @NotNull @Valid  @Size(min=1,max=100)public List<@Valid CreateAssetAccessRequestItem> getAssetRequests() {
    return assetRequests;
  }

  @JsonProperty(required = true, value = "asset_requests")
  public void setAssetRequests(List<@Valid CreateAssetAccessRequestItem> assetRequests) {
    this.assetRequests = assetRequests;
  }

  public CreateAssetAccessRequestBody addAssetRequestsItem(CreateAssetAccessRequestItem assetRequestsItem) {
    if (this.assetRequests == null) {
      this.assetRequests = new ArrayList<>();
    }

    this.assetRequests.add(assetRequestsItem);
    return this;
  }

  public CreateAssetAccessRequestBody removeAssetRequestsItem(CreateAssetAccessRequestItem assetRequestsItem) {
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
