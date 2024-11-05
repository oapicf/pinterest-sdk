package apimodels;

import apimodels.BaseInviteDataResponse;
import apimodels.InviteExceptionResponse;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RespondToInvitesResponseArrayItemsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RespondToInvitesResponseArrayItemsInner   {
  @JsonProperty("exception")
  @Valid

  private InviteExceptionResponse exception;

  @JsonProperty("invite")
  @Valid

  private BaseInviteDataResponse invite;

  public RespondToInvitesResponseArrayItemsInner exception(InviteExceptionResponse exception) {
    this.exception = exception;
    return this;
  }

   /**
   * Get exception
   * @return exception
  **/
  public InviteExceptionResponse getException() {
    return exception;
  }

  public void setException(InviteExceptionResponse exception) {
    this.exception = exception;
  }

  public RespondToInvitesResponseArrayItemsInner invite(BaseInviteDataResponse invite) {
    this.invite = invite;
    return this;
  }

   /**
   * Get invite
   * @return invite
  **/
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
    RespondToInvitesResponseArrayItemsInner respondToInvitesResponseArrayItemsInner = (RespondToInvitesResponseArrayItemsInner) o;
    return Objects.equals(exception, respondToInvitesResponseArrayItemsInner.exception) &&
        Objects.equals(invite, respondToInvitesResponseArrayItemsInner.invite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, invite);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

