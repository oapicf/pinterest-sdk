package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.UserAccountType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * User account model containing properties related to a user's account.
 */
public class Account   {

    private String about;
    private UserAccountType accountType;
    private Integer boardCount;
    private String businessName;
    private Integer followerCount;
    private Integer followingCount;
    private String id;
    private Integer monthlyViews;
    private Integer pinCount;
    private String profileImage;
    private String username;
    private String websiteUrl;

    /**
     * Default constructor.
     */
    public Account() {
    // JSON-B / Jackson
    }

    /**
     * Create Account.
     *
     * @param about Profile about description.
     * @param accountType Type of account
     * @param boardCount   User account board count.   **Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
     * @param businessName businessName
     * @param followerCount User account follower count.
     * @param followingCount User account following count.
     * @param id User account ID.
     * @param monthlyViews User account monthly views.
     * @param pinCount User account pin count. This includes both created and saved pins.
     * @param profileImage profileImage
     * @param username username
     * @param websiteUrl websiteUrl
     */
    public Account(
        String about, 
        UserAccountType accountType, 
        Integer boardCount, 
        String businessName, 
        Integer followerCount, 
        Integer followingCount, 
        String id, 
        Integer monthlyViews, 
        Integer pinCount, 
        String profileImage, 
        String username, 
        String websiteUrl
    ) {
        this.about = about;
        this.accountType = accountType;
        this.boardCount = boardCount;
        this.businessName = businessName;
        this.followerCount = followerCount;
        this.followingCount = followingCount;
        this.id = id;
        this.monthlyViews = monthlyViews;
        this.pinCount = pinCount;
        this.profileImage = profileImage;
        this.username = username;
        this.websiteUrl = websiteUrl;
    }



    /**
     * Profile about description.
     * @return about
     */
    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    /**
     * Type of account
     * @return accountType
     */
    public UserAccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(UserAccountType accountType) {
        this.accountType = accountType;
    }

    /**
     *   User account board count.   **Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
     * @return boardCount
     */
    public Integer getBoardCount() {
        return boardCount;
    }

    public void setBoardCount(Integer boardCount) {
        this.boardCount = boardCount;
    }

    /**
     * Get businessName
     * @return businessName
     */
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    /**
     * User account follower count.
     * @return followerCount
     */
    public Integer getFollowerCount() {
        return followerCount;
    }

    public void setFollowerCount(Integer followerCount) {
        this.followerCount = followerCount;
    }

    /**
     * User account following count.
     * @return followingCount
     */
    public Integer getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(Integer followingCount) {
        this.followingCount = followingCount;
    }

    /**
     * User account ID.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * User account monthly views.
     * @return monthlyViews
     */
    public Integer getMonthlyViews() {
        return monthlyViews;
    }

    public void setMonthlyViews(Integer monthlyViews) {
        this.monthlyViews = monthlyViews;
    }

    /**
     * User account pin count. This includes both created and saved pins.
     * @return pinCount
     */
    public Integer getPinCount() {
        return pinCount;
    }

    public void setPinCount(Integer pinCount) {
        this.pinCount = pinCount;
    }

    /**
     * Get profileImage
     * @return profileImage
     */
    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    /**
     * Get username
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Get websiteUrl
     * @return websiteUrl
     */
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Account {\n");
        
        sb.append("    about: ").append(toIndentedString(about)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    boardCount: ").append(toIndentedString(boardCount)).append("\n");
        sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
        sb.append("    followerCount: ").append(toIndentedString(followerCount)).append("\n");
        sb.append("    followingCount: ").append(toIndentedString(followingCount)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    monthlyViews: ").append(toIndentedString(monthlyViews)).append("\n");
        sb.append("    pinCount: ").append(toIndentedString(pinCount)).append("\n");
        sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
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

