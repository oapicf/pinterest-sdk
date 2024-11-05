package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BaseInviteDataResponse;
import org.openapitools.model.InviteExceptionResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("RespondToInvitesResponseArray_items_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class RespondToInvitesResponseArrayItemsInner   {
  private InviteExceptionResponse exception;
  private BaseInviteDataResponse invite;

  /**
   **/
  public RespondToInvitesResponseArrayItemsInner exception(InviteExceptionResponse exception) {
    this.exception = exception;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("exception")
  @Valid public InviteExceptionResponse getException() {
    return exception;
  }

  @JsonProperty("exception")
  public void setException(InviteExceptionResponse exception) {
    this.exception = exception;
  }

  /**
   **/
  public RespondToInvitesResponseArrayItemsInner invite(BaseInviteDataResponse invite) {
    this.invite = invite;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("invite")
  @Valid public BaseInviteDataResponse getInvite() {
    return invite;
  }

  @JsonProperty("invite")
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
    return Objects.equals(this.exception, respondToInvitesResponseArrayItemsInner.exception) &&
        Objects.equals(this.invite, respondToInvitesResponseArrayItemsInner.invite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, invite);
  }

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

