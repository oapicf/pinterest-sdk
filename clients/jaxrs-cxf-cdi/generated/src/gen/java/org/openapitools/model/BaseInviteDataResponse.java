package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BaseInviteDataResponseInviteData;
import org.openapitools.model.BusinessAccessUserSummary;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class BaseInviteDataResponse   {
  
  private String id;

  private BaseInviteDataResponseInviteData inviteData;

  private Boolean isReceivedInvite;

  private BusinessAccessUserSummary user;

  /**
   * Unique identifier of the invite/request.
   **/
  public BaseInviteDataResponse id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "383791336903426391", value = "Unique identifier of the invite/request.")
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public BaseInviteDataResponse inviteData(BaseInviteDataResponseInviteData inviteData) {
    this.inviteData = inviteData;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("invite_data")
  public BaseInviteDataResponseInviteData getInviteData() {
    return inviteData;
  }
  public void setInviteData(BaseInviteDataResponseInviteData inviteData) {
    this.inviteData = inviteData;
  }


  /**
   * Indicates whether the invite/request was received.
   **/
  public BaseInviteDataResponse isReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
    return this;
  }

  
  @ApiModelProperty(value = "Indicates whether the invite/request was received.")
  @JsonProperty("is_received_invite")
  public Boolean getIsReceivedInvite() {
    return isReceivedInvite;
  }
  public void setIsReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
  }


  /**
   * Metadata for the member/partner that was sent the invite/request.
   **/
  public BaseInviteDataResponse user(BusinessAccessUserSummary user) {
    this.user = user;
    return this;
  }

  
  @ApiModelProperty(value = "Metadata for the member/partner that was sent the invite/request.")
  @JsonProperty("user")
  public BusinessAccessUserSummary getUser() {
    return user;
  }
  public void setUser(BusinessAccessUserSummary user) {
    this.user = user;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseInviteDataResponse baseInviteDataResponse = (BaseInviteDataResponse) o;
    return Objects.equals(this.id, baseInviteDataResponse.id) &&
        Objects.equals(this.inviteData, baseInviteDataResponse.inviteData) &&
        Objects.equals(this.isReceivedInvite, baseInviteDataResponse.isReceivedInvite) &&
        Objects.equals(this.user, baseInviteDataResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, inviteData, isReceivedInvite, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseInviteDataResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inviteData: ").append(toIndentedString(inviteData)).append("\n");
    sb.append("    isReceivedInvite: ").append(toIndentedString(isReceivedInvite)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

