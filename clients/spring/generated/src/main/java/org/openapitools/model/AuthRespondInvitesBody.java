package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AuthRespondInvitesBodyItem;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * An object with a list of all the invites the user would like to respond to and the action to take.
 */

@Schema(name = "AuthRespondInvitesBody", description = "An object with a list of all the invites the user would like to respond to and the action to take.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AuthRespondInvitesBody {

  private List<@Valid AuthRespondInvitesBodyItem> invites = new ArrayList<>();

  public AuthRespondInvitesBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AuthRespondInvitesBody(List<@Valid AuthRespondInvitesBodyItem> invites) {
    this.invites = invites;
  }

  public AuthRespondInvitesBody invites(List<@Valid AuthRespondInvitesBodyItem> invites) {
    this.invites = invites;
    return this;
  }

  public AuthRespondInvitesBody addInvitesItem(AuthRespondInvitesBodyItem invitesItem) {
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
  public List<@Valid AuthRespondInvitesBodyItem> getInvites() {
    return invites;
  }

  @JsonProperty("invites")
  public void setInvites(List<@Valid AuthRespondInvitesBodyItem> invites) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

