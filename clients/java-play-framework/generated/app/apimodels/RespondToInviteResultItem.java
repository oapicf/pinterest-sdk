package apimodels;

import apimodels.BaseInviteDataResponse;
import apimodels.InviteExceptionResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * RespondToInviteResultItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class RespondToInviteResultItem   {
  @JsonProperty("exception")
  @Valid

  private InviteExceptionResponse exception;

  @JsonProperty("invite")
  @Valid

  private BaseInviteDataResponse invite;

  public RespondToInviteResultItem exception(InviteExceptionResponse exception) {
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

  public RespondToInviteResultItem invite(BaseInviteDataResponse invite) {
    this.invite = invite;
    return this;
  }

   /**
   * An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.
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
    RespondToInviteResultItem respondToInviteResultItem = (RespondToInviteResultItem) o;
    return Objects.equals(exception, respondToInviteResultItem.exception) &&
        Objects.equals(invite, respondToInviteResultItem.invite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, invite);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

