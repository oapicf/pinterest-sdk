package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateInvitesResultsResponseArrayItemsInnerInvite;
import org.openapitools.model.InviteExceptionResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateInvitesResultsResponseArrayItemsInner  {
  
  @ApiModelProperty(value = "")
  @Valid
  private InviteExceptionResponse exception;

  @ApiModelProperty(value = "")
  @Valid
  private CreateInvitesResultsResponseArrayItemsInnerInvite invite;
 /**
   * Get exception
   * @return exception
  **/
  @JsonProperty("exception")
  public InviteExceptionResponse getException() {
    return exception;
  }

  public void setException(InviteExceptionResponse exception) {
    this.exception = exception;
  }

  public CreateInvitesResultsResponseArrayItemsInner exception(InviteExceptionResponse exception) {
    this.exception = exception;
    return this;
  }

 /**
   * Get invite
   * @return invite
  **/
  @JsonProperty("invite")
  public CreateInvitesResultsResponseArrayItemsInnerInvite getInvite() {
    return invite;
  }

  public void setInvite(CreateInvitesResultsResponseArrayItemsInnerInvite invite) {
    this.invite = invite;
  }

  public CreateInvitesResultsResponseArrayItemsInner invite(CreateInvitesResultsResponseArrayItemsInnerInvite invite) {
    this.invite = invite;
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
    CreateInvitesResultsResponseArrayItemsInner createInvitesResultsResponseArrayItemsInner = (CreateInvitesResultsResponseArrayItemsInner) o;
    return Objects.equals(this.exception, createInvitesResultsResponseArrayItemsInner.exception) &&
        Objects.equals(this.invite, createInvitesResultsResponseArrayItemsInner.invite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, invite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInvitesResultsResponseArrayItemsInner {\n");
    
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    invite: ").append(toIndentedString(invite)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

