package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Metadata for the invite/request.
 */
public class InviteDataResponse   {

    private Integer inviteExpiration;
    private String inviteStatus;
    private String inviteType;
    private Integer lastUpdatedTime;
    private Integer sentAt;

    /**
     * Default constructor.
     */
    public InviteDataResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create InviteDataResponse.
     *
     * @param inviteExpiration The date and time when the invite/request will expire. Returned in milliseconds.
     * @param inviteStatus The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
     * @param inviteType The type of invite. - &#39;MEMBER_INVITE&#39; is to invite a member to access your business assets. - &#39;PARTNER_INVITE&#39; is to invite a partner to access your business assets. - &#39;PARTNER_REQUEST&#39; is to request access a partner&#39;s business assets.
     * @param lastUpdatedTime The date and time the invite/request was last updated. Returned in milliseconds.
     * @param sentAt The date and time the invite/request was sent/created. Returned in milliseconds.
     */
    public InviteDataResponse(
        Integer inviteExpiration, 
        String inviteStatus, 
        String inviteType, 
        Integer lastUpdatedTime, 
        Integer sentAt
    ) {
        this.inviteExpiration = inviteExpiration;
        this.inviteStatus = inviteStatus;
        this.inviteType = inviteType;
        this.lastUpdatedTime = lastUpdatedTime;
        this.sentAt = sentAt;
    }



    /**
     * The date and time when the invite/request will expire. Returned in milliseconds.
     * @return inviteExpiration
     */
    public Integer getInviteExpiration() {
        return inviteExpiration;
    }

    public void setInviteExpiration(Integer inviteExpiration) {
        this.inviteExpiration = inviteExpiration;
    }

    /**
     * The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
     * @return inviteStatus
     */
    public String getInviteStatus() {
        return inviteStatus;
    }

    public void setInviteStatus(String inviteStatus) {
        this.inviteStatus = inviteStatus;
    }

    /**
     * The type of invite. - 'MEMBER_INVITE' is to invite a member to access your business assets. - 'PARTNER_INVITE' is to invite a partner to access your business assets. - 'PARTNER_REQUEST' is to request access a partner's business assets.
     * @return inviteType
     */
    public String getInviteType() {
        return inviteType;
    }

    public void setInviteType(String inviteType) {
        this.inviteType = inviteType;
    }

    /**
     * The date and time the invite/request was last updated. Returned in milliseconds.
     * @return lastUpdatedTime
     */
    public Integer getLastUpdatedTime() {
        return lastUpdatedTime;
    }

    public void setLastUpdatedTime(Integer lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * The date and time the invite/request was sent/created. Returned in milliseconds.
     * @return sentAt
     */
    public Integer getSentAt() {
        return sentAt;
    }

    public void setSentAt(Integer sentAt) {
        this.sentAt = sentAt;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InviteDataResponse {\n");
        
        sb.append("    inviteExpiration: ").append(toIndentedString(inviteExpiration)).append("\n");
        sb.append("    inviteStatus: ").append(toIndentedString(inviteStatus)).append("\n");
        sb.append("    inviteType: ").append(toIndentedString(inviteType)).append("\n");
        sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
        sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

