package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CreateInvitesResultsResponseArrayItemsInnerInvite;
import org.openapitools.model.InviteExceptionResponse;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("CreateInvitesResultsResponseArray_items_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateInvitesResultsResponseArrayItemsInner   {
  private InviteExceptionResponse exception;
  private CreateInvitesResultsResponseArrayItemsInnerInvite invite;

  /**
   **/
  public CreateInvitesResultsResponseArrayItemsInner exception(InviteExceptionResponse exception) {
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
  public CreateInvitesResultsResponseArrayItemsInner invite(CreateInvitesResultsResponseArrayItemsInnerInvite invite) {
    this.invite = invite;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("invite")
  @Valid public CreateInvitesResultsResponseArrayItemsInnerInvite getInvite() {
    return invite;
  }

  @JsonProperty("invite")
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
    return Objects.equals(this.exception, createInvitesResultsResponseArrayItemsInner.exception) &&
        Objects.equals(this.invite, createInvitesResultsResponseArrayItemsInner.invite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, invite);
  }

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

