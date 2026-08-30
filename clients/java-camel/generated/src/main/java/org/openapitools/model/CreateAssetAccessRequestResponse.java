package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.AssetAccessRequestError;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CreateAssetAccessRequestResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CreateAssetAccessRequestResponse {

  @Valid
  private List<@Valid AssetAccessRequestError> exceptions = new ArrayList<>();

  @Valid
  private Map<String, String> invites = new HashMap<>();

  public CreateAssetAccessRequestResponse exceptions(List<@Valid AssetAccessRequestError> exceptions) {
    this.exceptions = exceptions;
    return this;
  }

  public CreateAssetAccessRequestResponse addExceptionsItem(AssetAccessRequestError exceptionsItem) {
    if (this.exceptions == null) {
      this.exceptions = new ArrayList<>();
    }
    this.exceptions.add(exceptionsItem);
    return this;
  }

  /**
   * A list of errors associated with the asset access requests. Will be returned if there is an error.
   * @return exceptions
   */
  @Valid 
  @Schema(name = "exceptions", description = "A list of errors associated with the asset access requests. Will be returned if there is an error.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("exceptions")
  public List<@Valid AssetAccessRequestError> getExceptions() {
    return exceptions;
  }

  public void setExceptions(List<@Valid AssetAccessRequestError> exceptions) {
    this.exceptions = exceptions;
  }

  public CreateAssetAccessRequestResponse invites(Map<String, String> invites) {
    this.invites = invites;
    return this;
  }

  public CreateAssetAccessRequestResponse putInvitesItem(String key, String invitesItem) {
    if (this.invites == null) {
      this.invites = new HashMap<>();
    }
    this.invites.put(key, invitesItem);
    return this;
  }

  /**
   * An object mapping each partner id to the asset access request id. Only one request id is returned per partner.
   * @return invites
   */
  
  @Schema(name = "invites", example = "{\"766456567741825556\":\"5349280584552211583\",\"733242520489967216\":\"5349280584552211845\"}", description = "An object mapping each partner id to the asset access request id. Only one request id is returned per partner.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("invites")
  public Map<String, String> getInvites() {
    return invites;
  }

  public void setInvites(Map<String, String> invites) {
    this.invites = invites;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateAssetAccessRequestResponse createAssetAccessRequestResponse = (CreateAssetAccessRequestResponse) o;
    return Objects.equals(this.exceptions, createAssetAccessRequestResponse.exceptions) &&
        Objects.equals(this.invites, createAssetAccessRequestResponse.invites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exceptions, invites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateAssetAccessRequestResponse {\n");
    sb.append("    exceptions: ").append(toIndentedString(exceptions)).append("\n");
    sb.append("    invites: ").append(toIndentedString(invites)).append("\n");
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

