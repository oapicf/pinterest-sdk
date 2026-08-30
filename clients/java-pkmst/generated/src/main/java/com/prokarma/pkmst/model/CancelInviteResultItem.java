package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CancelInviteException;
import com.prokarma.pkmst.model.CancelInviteResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CancelInviteResultItem
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CancelInviteResultItem   {
  @JsonProperty("exception")
  private CancelInviteException exception;

  @JsonProperty("invite")
  private CancelInviteResult invite;

  public CancelInviteResultItem exception(CancelInviteException exception) {
    this.exception = exception;
    return this;
  }

  /**
   * Get exception
   * @return exception
   */
  @ApiModelProperty(value = "")
  public CancelInviteException getException() {
    return exception;
  }

  public void setException(CancelInviteException exception) {
    this.exception = exception;
  }

  public CancelInviteResultItem invite(CancelInviteResult invite) {
    this.invite = invite;
    return this;
  }

  /**
   * Get invite
   * @return invite
   */
  @ApiModelProperty(value = "")
  public CancelInviteResult getInvite() {
    return invite;
  }

  public void setInvite(CancelInviteResult invite) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

