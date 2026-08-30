package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.UserAccountType;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * User account model containing properties related to a user&#39;s account.
 */
public class Account implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Profile about description.
   */
  @JsonProperty("about")
  private String about;

  /**
   * Type of account
   */
  @JsonProperty("account_type")
  private UserAccountType accountType;

  /**
   *   User account board count.   **Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
   */
  @JsonProperty("board_count")
  private Integer boardCount;

  @JsonProperty("business_name")
  private String businessName;

  /**
   * User account follower count.
   */
  @JsonProperty("follower_count")
  private Integer followerCount;

  /**
   * User account following count.
   */
  @JsonProperty("following_count")
  private Integer followingCount;

  /**
   * User account ID.
   */
  @JsonProperty("id")
  private String id;

  /**
   * User account monthly views.
   */
  @JsonProperty("monthly_views")
  private Integer monthlyViews;

  /**
   * User account pin count. This includes both created and saved pins.
   */
  @JsonProperty("pin_count")
  private Integer pinCount;

  @JsonProperty("profile_image")
  private String profileImage;

  @JsonProperty("username")
  private String username;

  @JsonProperty("website_url")
  private String websiteUrl;

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
   * 
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
   * 
   * @return profileImage
   */
  public String getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

  /**
   * 
   * @return username
   */
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * 
   * @return websiteUrl
   */
  public String getWebsiteUrl() {
    return websiteUrl;
  }

  public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.about, account.about) &&
        Objects.equals(this.accountType, account.accountType) &&
        Objects.equals(this.boardCount, account.boardCount) &&
        Objects.equals(this.businessName, account.businessName) &&
        Objects.equals(this.followerCount, account.followerCount) &&
        Objects.equals(this.followingCount, account.followingCount) &&
        Objects.equals(this.id, account.id) &&
        Objects.equals(this.monthlyViews, account.monthlyViews) &&
        Objects.equals(this.pinCount, account.pinCount) &&
        Objects.equals(this.profileImage, account.profileImage) &&
        Objects.equals(this.username, account.username) &&
        Objects.equals(this.websiteUrl, account.websiteUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(about, accountType, boardCount, businessName, followerCount, followingCount, id, monthlyViews, pinCount, profileImage, username, websiteUrl);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
