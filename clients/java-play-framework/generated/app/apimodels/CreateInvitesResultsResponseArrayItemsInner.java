package apimodels;

import apimodels.CreateInvitesResultsResponseArrayItemsInnerInvite;
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
 * CreateInvitesResultsResponseArrayItemsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateInvitesResultsResponseArrayItemsInner   {
  @JsonProperty("exception")
  @Valid

  private InviteExceptionResponse exception;

  @JsonProperty("invite")
  @Valid

  private CreateInvitesResultsResponseArrayItemsInnerInvite invite;

  public CreateInvitesResultsResponseArrayItemsInner exception(InviteExceptionResponse exception) {
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

  public CreateInvitesResultsResponseArrayItemsInner invite(CreateInvitesResultsResponseArrayItemsInnerInvite invite) {
    this.invite = invite;
    return this;
  }

   /**
   * Get invite
   * @return invite
  **/
  public CreateInvitesResultsResponseArrayItemsInnerInvite getInvite() {
    return invite;
  }

  public void setInvite(CreateInvitesResultsResponseArrayItemsInnerInvite invite) {
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
    CreateInvitesResultsResponseArrayItemsInner createInvitesResultsResponseArrayItemsInner = (CreateInvitesResultsResponseArrayItemsInner) o;
    return Objects.equals(exception, createInvitesResultsResponseArrayItemsInner.exception) &&
        Objects.equals(invite, createInvitesResultsResponseArrayItemsInner.invite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, invite);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

