package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.UsersForIndividualAssetResponse;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateMemberAssetsResultsResponseArrayItemsInner
 */

@JsonTypeName("UpdateMemberAssetsResultsResponseArray_items_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-26T05:48:22.520185154Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class UpdateMemberAssetsResultsResponseArrayItemsInner {

  private @Nullable UsersForIndividualAssetResponse response;

  public UpdateMemberAssetsResultsResponseArrayItemsInner response(@Nullable UsersForIndividualAssetResponse response) {
    this.response = response;
    return this;
  }

  /**
   * Get response
   * @return response
   */
  @Valid 
  @Schema(name = "response", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("response")
  public @Nullable UsersForIndividualAssetResponse getResponse() {
    return response;
  }

  public void setResponse(@Nullable UsersForIndividualAssetResponse response) {
    this.response = response;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

