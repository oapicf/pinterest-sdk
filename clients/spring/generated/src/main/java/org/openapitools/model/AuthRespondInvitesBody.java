package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AuthRespondInvitesBodyInvitesInner;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * An object with a list of all the invites the user would like to respond to and the action to take.
 */

@Schema(name = "AuthRespondInvitesBody", description = "An object with a list of all the invites the user would like to respond to and the action to take.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class AuthRespondInvitesBody {

  @Valid
  private List<@Valid AuthRespondInvitesBodyInvitesInner> invites = new ArrayList<>();

  public AuthRespondInvitesBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AuthRespondInvitesBody(List<@Valid AuthRespondInvitesBodyInvitesInner> invites) {
    this.invites = invites;
  }

  public AuthRespondInvitesBody invites(List<@Valid AuthRespondInvitesBodyInvitesInner> invites) {
    this.invites = invites;
    return this;
  }

  public AuthRespondInvitesBody addInvitesItem(AuthRespondInvitesBodyInvitesInner invitesItem) {
    if (this.invites == null) {
      this.invites = new ArrayList<>();
    }
    this.invites.add(invitesItem);
    return this;
  }

  /**
   * Get invites
   * @return invites
   */
  @NotNull @Valid @Size(min = 1, max = 100) 
  @Schema(name = "invites", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("invites")
  public List<@Valid AuthRespondInvitesBodyInvitesInner> getInvites() {
    return invites;
  }

  public void setInvites(List<@Valid AuthRespondInvitesBodyInvitesInner> invites) {
    this.invites = invites;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthRespondInvitesBody authRespondInvitesBody = (AuthRespondInvitesBody) o;
    return Objects.equals(this.invites, authRespondInvitesBody.invites);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invites);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthRespondInvitesBody {\n");
    sb.append("    invites: ").append(toIndentedString(invites)).append("\n");
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

