package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.BusinessAccessUserSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.
 **/
@ApiModel(description="An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.")

public class CreateInvitesResultsResponseArrayItemsInnerInvite  {
  
  @ApiModelProperty(example = "383791336903426391", value = "Unique identifier of the invite/request.")
 /**
   * Unique identifier of the invite/request.
  **/
  private String id;

  @ApiModelProperty(value = "Metadata for the member/partner that was sent the invite/request.")
  @Valid
 /**
   * Metadata for the member/partner that was sent the invite/request.
  **/
  private BusinessAccessUserSummary user;
 /**
   * Unique identifier of the invite/request.
   * @return id
  **/
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CreateInvitesResultsResponseArrayItemsInnerInvite id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Metadata for the member/partner that was sent the invite/request.
   * @return user
  **/
  @JsonProperty("user")
  public BusinessAccessUserSummary getUser() {
    return user;
  }

  public void setUser(BusinessAccessUserSummary user) {
    this.user = user;
  }

  public CreateInvitesResultsResponseArrayItemsInnerInvite user(BusinessAccessUserSummary user) {
    this.user = user;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInvitesResultsResponseArrayItemsInnerInvite createInvitesResultsResponseArrayItemsInnerInvite = (CreateInvitesResultsResponseArrayItemsInnerInvite) o;
    return Objects.equals(this.id, createInvitesResultsResponseArrayItemsInnerInvite.id) &&
        Objects.equals(this.user, createInvitesResultsResponseArrayItemsInnerInvite.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateInvitesResultsResponseArrayItemsInnerInvite {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

