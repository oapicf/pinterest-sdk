package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BaseInviteDataResponse;
import org.openapitools.model.InviteExceptionResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RespondToInvitesResponseArrayItemsInner  {
  
  @ApiModelProperty(value = "")
  @Valid
  private InviteExceptionResponse exception;

  @ApiModelProperty(value = "")
  @Valid
  private BaseInviteDataResponse invite;
 /**
  * Get exception
  * @return exception
  */
  @JsonProperty("exception")
  public InviteExceptionResponse getException() {
    return exception;
  }

  /**
   * Sets the <code>exception</code> property.
   */
 public void setException(InviteExceptionResponse exception) {
    this.exception = exception;
  }

  /**
   * Sets the <code>exception</code> property.
   */
  public RespondToInvitesResponseArrayItemsInner exception(InviteExceptionResponse exception) {
    this.exception = exception;
    return this;
  }

 /**
  * Get invite
  * @return invite
  */
  @JsonProperty("invite")
  public BaseInviteDataResponse getInvite() {
    return invite;
  }

  /**
   * Sets the <code>invite</code> property.
   */
 public void setInvite(BaseInviteDataResponse invite) {
    this.invite = invite;
  }

  /**
   * Sets the <code>invite</code> property.
   */
  public RespondToInvitesResponseArrayItemsInner invite(BaseInviteDataResponse invite) {
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
    RespondToInvitesResponseArrayItemsInner respondToInvitesResponseArrayItemsInner = (RespondToInvitesResponseArrayItemsInner) o;
    return Objects.equals(this.exception, respondToInvitesResponseArrayItemsInner.exception) &&
        Objects.equals(this.invite, respondToInvitesResponseArrayItemsInner.invite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, invite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespondToInvitesResponseArrayItemsInner {\n");
    
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

