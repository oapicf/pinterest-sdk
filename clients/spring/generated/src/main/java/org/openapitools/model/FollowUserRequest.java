package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * FollowUserRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-03-14T23:15:39.458648915Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FollowUserRequest {

  private Boolean autoFollow = false;

  public FollowUserRequest autoFollow(Boolean autoFollow) {
    this.autoFollow = autoFollow;
    return this;
  }

  /**
   * Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed.
   * @return autoFollow
  */
  
  @Schema(name = "auto_follow", example = "false", description = "Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auto_follow")
  public Boolean getAutoFollow() {
    return autoFollow;
  }

  public void setAutoFollow(Boolean autoFollow) {
    this.autoFollow = autoFollow;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FollowUserRequest followUserRequest = (FollowUserRequest) o;
    return Objects.equals(this.autoFollow, followUserRequest.autoFollow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoFollow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FollowUserRequest {\n");
    sb.append("    autoFollow: ").append(toIndentedString(autoFollow)).append("\n");
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

