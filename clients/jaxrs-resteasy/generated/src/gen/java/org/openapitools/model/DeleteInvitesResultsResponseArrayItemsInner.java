package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BaseInviteDataResponse;
import org.openapitools.model.DeleteInvitesResultsResponseArrayItemsInnerException;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-05T02:20:31.447227872Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class DeleteInvitesResultsResponseArrayItemsInner   {
  
  private DeleteInvitesResultsResponseArrayItemsInnerException exception;
  private BaseInviteDataResponse invite;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("exception")
  @Valid
  public DeleteInvitesResultsResponseArrayItemsInnerException getException() {
    return exception;
  }
  public void setException(DeleteInvitesResultsResponseArrayItemsInnerException exception) {
    this.exception = exception;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("invite")
  @Valid
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

