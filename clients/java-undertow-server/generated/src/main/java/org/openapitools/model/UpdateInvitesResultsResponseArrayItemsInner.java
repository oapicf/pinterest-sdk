/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
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
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.InviteBusinessRoleBinding;
import org.openapitools.model.InviteExceptionResponse;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateInvitesResultsResponseArrayItemsInner   {
  
  private InviteExceptionResponse exception;
  private InviteBusinessRoleBinding invite;

  /**
   */
  public UpdateInvitesResultsResponseArrayItemsInner exception(InviteExceptionResponse exception) {
    this.exception = exception;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("exception")
  public InviteExceptionResponse getException() {
    return exception;
  }
  public void setException(InviteExceptionResponse exception) {
    this.exception = exception;
  }

  /**
   */
  public UpdateInvitesResultsResponseArrayItemsInner invite(InviteBusinessRoleBinding invite) {
    this.invite = invite;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("invite")
  public InviteBusinessRoleBinding getInvite() {
    return invite;
  }
  public void setInvite(InviteBusinessRoleBinding invite) {
    this.invite = invite;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateInvitesResultsResponseArrayItemsInner updateInvitesResultsResponseArrayItemsInner = (UpdateInvitesResultsResponseArrayItemsInner) o;
    return Objects.equals(exception, updateInvitesResultsResponseArrayItemsInner.exception) &&
        Objects.equals(invite, updateInvitesResultsResponseArrayItemsInner.invite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, invite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateInvitesResultsResponseArrayItemsInner {\n");
    
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    invite: ").append(toIndentedString(invite)).append("\n");
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

