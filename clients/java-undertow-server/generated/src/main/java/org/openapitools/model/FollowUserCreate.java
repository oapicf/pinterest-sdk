/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Resource create operation model.
 */

@ApiModel(description = "Resource create operation model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class FollowUserCreate   {
  
  private Boolean autoFollow;

  /**
   *   Whether this request comes as result of auto-follow after clicking on a link.   Follow links can be used by partners on their site or in emails.   Only selected partners can be followed this way. We verify that partner can be auto-followed.
   */
  public FollowUserCreate autoFollow(Boolean autoFollow) {
    this.autoFollow = autoFollow;
    return this;
  }

  
  @ApiModelProperty(value = "  Whether this request comes as result of auto-follow after clicking on a link.   Follow links can be used by partners on their site or in emails.   Only selected partners can be followed this way. We verify that partner can be auto-followed.")
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
    FollowUserCreate followUserCreate = (FollowUserCreate) o;
    return Objects.equals(autoFollow, followUserCreate.autoFollow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoFollow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FollowUserCreate {\n");
    
    sb.append("    autoFollow: ").append(toIndentedString(autoFollow)).append("\n");
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

