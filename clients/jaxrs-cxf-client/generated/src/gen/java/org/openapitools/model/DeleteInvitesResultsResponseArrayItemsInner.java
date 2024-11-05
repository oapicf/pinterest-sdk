package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BaseInviteDataResponse;
import org.openapitools.model.DeleteInvitesResultsResponseArrayItemsInnerException;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class DeleteInvitesResultsResponseArrayItemsInner  {
  
  @ApiModelProperty(value = "")
  private DeleteInvitesResultsResponseArrayItemsInnerException exception;

  @ApiModelProperty(value = "")
  private BaseInviteDataResponse invite;
 /**
   * Get exception
   * @return exception
  **/
  @JsonProperty("exception")
  public DeleteInvitesResultsResponseArrayItemsInnerException getException() {
    return exception;
  }

  public void setException(DeleteInvitesResultsResponseArrayItemsInnerException exception) {
    this.exception = exception;
  }

  public DeleteInvitesResultsResponseArrayItemsInner exception(DeleteInvitesResultsResponseArrayItemsInnerException exception) {
    this.exception = exception;
    return this;
  }

 /**
   * Get invite
   * @return invite
  **/
  @JsonProperty("invite")
  public BaseInviteDataResponse getInvite() {
    return invite;
  }

  public void setInvite(BaseInviteDataResponse invite) {
    this.invite = invite;
  }

  public DeleteInvitesResultsResponseArrayItemsInner invite(BaseInviteDataResponse invite) {
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
    DeleteInvitesResultsResponseArrayItemsInner deleteInvitesResultsResponseArrayItemsInner = (DeleteInvitesResultsResponseArrayItemsInner) o;
    return Objects.equals(this.exception, deleteInvitesResultsResponseArrayItemsInner.exception) &&
        Objects.equals(this.invite, deleteInvitesResultsResponseArrayItemsInner.invite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, invite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteInvitesResultsResponseArrayItemsInner {\n");
    
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

