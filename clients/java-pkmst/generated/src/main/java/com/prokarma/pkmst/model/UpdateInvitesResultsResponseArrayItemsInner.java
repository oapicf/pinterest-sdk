package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.InviteBusinessRoleBinding;
import com.prokarma.pkmst.model.InviteExceptionResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * UpdateInvitesResultsResponseArrayItemsInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateInvitesResultsResponseArrayItemsInner   {
  @JsonProperty("exception")
  private InviteExceptionResponse exception;

  @JsonProperty("invite")
  private InviteBusinessRoleBinding invite;

  public UpdateInvitesResultsResponseArrayItemsInner exception(InviteExceptionResponse exception) {
    this.exception = exception;
    return this;
  }

  /**
   * Get exception
   * @return exception
   */
  @ApiModelProperty(value = "")
  public InviteExceptionResponse getException() {
    return exception;
  }

  public void setException(InviteExceptionResponse exception) {
    this.exception = exception;
  }

  public UpdateInvitesResultsResponseArrayItemsInner invite(InviteBusinessRoleBinding invite) {
    this.invite = invite;
    return this;
  }

  /**
   * Get invite
   * @return invite
   */
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.exception, updateInvitesResultsResponseArrayItemsInner.exception) &&
        Objects.equals(this.invite, updateInvitesResultsResponseArrayItemsInner.invite);
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

