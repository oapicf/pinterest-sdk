package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BaseInviteDataResponse;
import org.openapitools.model.InviteExceptionResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class RespondToInviteResultItem  {
  
  @ApiModelProperty(value = "")
  @Valid
  private InviteExceptionResponse exception;

 /**
  * An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.
  */
  @ApiModelProperty(value = "An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.")
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
  public RespondToInviteResultItem exception(InviteExceptionResponse exception) {
    this.exception = exception;
    return this;
  }

 /**
  * An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.
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
  public RespondToInviteResultItem invite(BaseInviteDataResponse invite) {
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
    RespondToInviteResultItem respondToInviteResultItem = (RespondToInviteResultItem) o;
    return Objects.equals(this.exception, respondToInviteResultItem.exception) &&
        Objects.equals(this.invite, respondToInviteResultItem.invite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, invite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RespondToInviteResultItem {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

