package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CancelInviteException;
import org.openapitools.model.CancelInviteResult;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CancelInviteResultItem   {
  
  private CancelInviteException exception;
  private CancelInviteResult invite;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("exception")
  @Valid
  public CancelInviteException getException() {
    return exception;
  }
  public void setException(CancelInviteException exception) {
    this.exception = exception;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("invite")
  @Valid
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

