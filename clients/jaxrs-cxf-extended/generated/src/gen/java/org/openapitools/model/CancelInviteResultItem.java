package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CancelInviteException;
import org.openapitools.model.CancelInviteResult;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CancelInviteResultItem  {
  
  @ApiModelProperty(value = "")
  @Valid
  private CancelInviteException exception;

  @ApiModelProperty(value = "")
  @Valid
  private CancelInviteResult invite;
 /**
  * Get exception
  * @return exception
  */
  @JsonProperty("exception")
  public CancelInviteException getException() {
    return exception;
  }

  /**
   * Sets the <code>exception</code> property.
   */
 public void setException(CancelInviteException exception) {
    this.exception = exception;
  }

  /**
   * Sets the <code>exception</code> property.
   */
  public CancelInviteResultItem exception(CancelInviteException exception) {
    this.exception = exception;
    return this;
  }

 /**
  * Get invite
  * @return invite
  */
  @JsonProperty("invite")
  public CancelInviteResult getInvite() {
    return invite;
  }

  /**
   * Sets the <code>invite</code> property.
   */
 public void setInvite(CancelInviteResult invite) {
    this.invite = invite;
  }

  /**
   * Sets the <code>invite</code> property.
   */
  public CancelInviteResultItem invite(CancelInviteResult invite) {
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
    CancelInviteResultItem cancelInviteResultItem = (CancelInviteResultItem) o;
    return Objects.equals(this.exception, cancelInviteResultItem.exception) &&
        Objects.equals(this.invite, cancelInviteResultItem.invite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, invite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelInviteResultItem {\n");
    
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

