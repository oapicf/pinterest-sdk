package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CancelInviteException;
import org.openapitools.model.CancelInviteResult;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CancelInviteResultItem  {
  
  @ApiModelProperty(value = "")

  private CancelInviteException exception;

  @ApiModelProperty(value = "")

  private CancelInviteResult invite;
 /**
   * Get exception
   * @return exception
  **/
  @JsonProperty("exception")
  public CancelInviteException getException() {
    return exception;
  }

  public void setException(CancelInviteException exception) {
    this.exception = exception;
  }

  public CancelInviteResultItem exception(CancelInviteException exception) {
    this.exception = exception;
    return this;
  }

 /**
   * Get invite
   * @return invite
  **/
  @JsonProperty("invite")
  public CancelInviteResult getInvite() {
    return invite;
  }

  public void setInvite(CancelInviteResult invite) {
    this.invite = invite;
  }

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

