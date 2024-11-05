package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BaseInviteDataResponse;
import org.openapitools.model.DeleteInvitesResultsResponseArrayItemsInnerException;

/**
 * DeleteInvitesResultsResponseArrayItemsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeleteInvitesResultsResponseArrayItemsInner   {
  @JsonProperty("exception")
  private DeleteInvitesResultsResponseArrayItemsInnerException exception;

  @JsonProperty("invite")
  private BaseInviteDataResponse invite;

  public DeleteInvitesResultsResponseArrayItemsInner exception(DeleteInvitesResultsResponseArrayItemsInnerException exception) {
    this.exception = exception;
    return this;
  }

   /**
   * Get exception
   * @return exception
  **/
  @ApiModelProperty(value = "")
  public DeleteInvitesResultsResponseArrayItemsInnerException getException() {
    return exception;
  }

  public void setException(DeleteInvitesResultsResponseArrayItemsInnerException exception) {
    this.exception = exception;
  }

  public DeleteInvitesResultsResponseArrayItemsInner invite(BaseInviteDataResponse invite) {
    this.invite = invite;
    return this;
  }

   /**
   * Get invite
   * @return invite
  **/
  @ApiModelProperty(value = "")
  public BaseInviteDataResponse getInvite() {
    return invite;
  }

  public void setInvite(BaseInviteDataResponse invite) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

