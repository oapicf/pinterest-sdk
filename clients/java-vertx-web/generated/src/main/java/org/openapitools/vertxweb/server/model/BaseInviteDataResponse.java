package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.BaseInviteDataResponseInviteData;
import org.openapitools.vertxweb.server.model.BusinessAccessUserSummary;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseInviteDataResponse   {
  
  private String id;
  private BaseInviteDataResponseInviteData inviteData;
  private Boolean isReceivedInvite;
  private BusinessAccessUserSummary user;

  public BaseInviteDataResponse () {

  }

  public BaseInviteDataResponse (String id, BaseInviteDataResponseInviteData inviteData, Boolean isReceivedInvite, BusinessAccessUserSummary user) {
    this.id = id;
    this.inviteData = inviteData;
    this.isReceivedInvite = isReceivedInvite;
    this.user = user;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("invite_data")
  public BaseInviteDataResponseInviteData getInviteData() {
    return inviteData;
  }
  public void setInviteData(BaseInviteDataResponseInviteData inviteData) {
    this.inviteData = inviteData;
  }

    
  @JsonProperty("is_received_invite")
  public Boolean getIsReceivedInvite() {
    return isReceivedInvite;
  }
  public void setIsReceivedInvite(Boolean isReceivedInvite) {
    this.isReceivedInvite = isReceivedInvite;
  }

    
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
    return Objects.equals(id, baseInviteDataResponse.id) &&
        Objects.equals(inviteData, baseInviteDataResponse.inviteData) &&
        Objects.equals(isReceivedInvite, baseInviteDataResponse.isReceivedInvite) &&
        Objects.equals(user, baseInviteDataResponse.user);
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
