package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.AssetGroupBinding;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CreateAssetGroupResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateAssetGroupResponse {

  private AssetGroupBinding assetGroup;

  public CreateAssetGroupResponse assetGroup(AssetGroupBinding assetGroup) {
    this.assetGroup = assetGroup;
    return this;
  }

  /**
   * Get assetGroup
   * @return assetGroup
   */
  @Valid 
  @Schema(name = "asset_group", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("asset_group")
  public AssetGroupBinding getAssetGroup() {
    return assetGroup;
  }

  public void setAssetGroup(AssetGroupBinding assetGroup) {
    this.assetGroup = assetGroup;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAssetGroupResponse createAssetGroupResponse = (CreateAssetGroupResponse) o;
    return Objects.equals(this.assetGroup, createAssetGroupResponse.assetGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssetGroupResponse {\n");
    sb.append("    assetGroup: ").append(toIndentedString(assetGroup)).append("\n");
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

