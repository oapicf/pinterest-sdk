package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.InviteBusinessRoleBinding;
import org.openapitools.model.InviteExceptionResponse;
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
 * An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).
 **/
@ApiModel(description = "An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).")
@JsonTypeName("InviteActionResultItem")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class InviteActionResultItem   {
  private InviteExceptionResponse exception;
  private InviteBusinessRoleBinding invite;

  public InviteActionResultItem() {
  }

  /**
   **/
  public InviteActionResultItem exception(InviteExceptionResponse exception) {
    this.exception = exception;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("exception")
  @Valid public InviteExceptionResponse getException() {
    return exception;
  }

  @JsonProperty("exception")
  public void setException(InviteExceptionResponse exception) {
    this.exception = exception;
  }

  /**
   **/
  public InviteActionResultItem invite(InviteBusinessRoleBinding invite) {
    this.invite = invite;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("invite")
  @Valid public InviteBusinessRoleBinding getInvite() {
    return invite;
  }

  @JsonProperty("invite")
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
    InviteActionResultItem inviteActionResultItem = (InviteActionResultItem) o;
    return Objects.equals(this.exception, inviteActionResultItem.exception) &&
        Objects.equals(this.invite, inviteActionResultItem.invite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, invite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteActionResultItem {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
