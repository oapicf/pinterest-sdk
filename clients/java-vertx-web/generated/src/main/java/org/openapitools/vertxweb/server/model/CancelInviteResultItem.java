package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.CancelInviteException;
import org.openapitools.vertxweb.server.model.CancelInviteResult;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CancelInviteResultItem   {
  
  private CancelInviteException exception;
  private CancelInviteResult invite;

  public CancelInviteResultItem () {

  }

  public CancelInviteResultItem (CancelInviteException exception, CancelInviteResult invite) {
    this.exception = exception;
    this.invite = invite;
  }

    
  @JsonProperty("exception")
  public CancelInviteException getException() {
    return exception;
  }
  public void setException(CancelInviteException exception) {
    this.exception = exception;
  }

    
  @JsonProperty("invite")
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
    return Objects.equals(exception, cancelInviteResultItem.exception) &&
        Objects.equals(invite, cancelInviteResultItem.invite);
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
