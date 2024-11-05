package org.openapitools.model;

import org.openapitools.model.BaseInviteDataResponseInviteData;
import org.openapitools.model.BusinessAccessUserSummary;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BaseInviteDataResponse  {
  
  @ApiModelProperty(example = "383791336903426391", value = "Unique identifier of the invite/request.")
 /**
   * Unique identifier of the invite/request.
  **/
  private String id;

  @ApiModelProperty(value = "")
  private BaseInviteDataResponseInviteData inviteData;

  @ApiModelProperty(value = "Indicates whether the invite/request was received.")
 /**
   * Indicates whether the invite/request was received.
  **/
  private Boolean isReceivedInvite;

  @ApiModelProperty(value = "Metadata for the member/partner that was sent the invite/request.")
 /**
   * Metadata for the member/partner that was sent the invite/request.
  **/
  private BusinessAccessUserSummary user;
 /**
   * Unique identifier of the invite/request.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BaseInviteDataResponse id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get inviteData
   * @return inviteData
  **/
  @JsonProperty("invite_data")
  public BaseInviteDataResponseInviteData getInviteData() {
    return inviteData;
  }

  public void setInviteData(BaseInviteDataResponseInviteData inviteData) {
    this.inviteData = inviteData;
  }

  public BaseInviteDataResponse inviteData(BaseInviteDataResponseInviteData inviteData) {
    this.inviteData = inviteData;
    return this;
  }

 /**
   * Indicates whether the invite/request was received.
   * @return isReceivedInvite
  **/
  @JsonProperty("is_received_invite")
  public Boolean getIsReceivedInvite() {
    return isReceivedInvite;
  }

  public void setIsReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
  }

  public BaseInviteDataResponse isReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
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

  public BaseInviteDataResponse user(BusinessAccessUserSummary user) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

