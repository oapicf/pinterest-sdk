package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.UserAccountType;

/**
 * User account model containing properties related to a user&#39;s account.
 */
@ApiModel(description = "User account model containing properties related to a user's account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class Account   {
  @JsonProperty("about")
  private String about;

  @JsonProperty("account_type")
  private UserAccountType accountType;

  @JsonProperty("board_count")
  private Integer boardCount;

  @JsonProperty("business_name")
  private String businessName;

  @JsonProperty("follower_count")
  private Integer followerCount;

  @JsonProperty("following_count")
  private Integer followingCount;

  @JsonProperty("id")
  private String id;

  @JsonProperty("monthly_views")
  private Integer monthlyViews;

  @JsonProperty("pin_count")
  private Integer pinCount;

  @JsonProperty("profile_image")
  private String profileImage;

  @JsonProperty("username")
  private String username;

  @JsonProperty("website_url")
  private String websiteUrl;

  public Account about(String about) {
    this.about = about;
    return this;
  }

   /**
   * Profile about description.
   * @return about
  **/
  @ApiModelProperty(value = "Profile about description.")
  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }

  public Account accountType(UserAccountType accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Type of account
   * @return accountType
  **/
  @ApiModelProperty(value = "Type of account")
  public UserAccountType getAccountType() {
    return accountType;
  }

  public void setAccountType(UserAccountType accountType) {
    this.accountType = accountType;
  }

   /**
   *   User account board count.   **Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
   * @return boardCount
  **/
  @ApiModelProperty(example = "14", value = "  User account board count.   **Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.")
  public Integer getBoardCount() {
    return boardCount;
  }

  public Account businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * Get businessName
   * @return businessName
  **/
  @ApiModelProperty(value = "")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

   /**
   * User account follower count.
   * @return followerCount
  **/
  @ApiModelProperty(example = "10", value = "User account follower count.")
  public Integer getFollowerCount() {
    return followerCount;
  }

   /**
   * User account following count.
   * @return followingCount
  **/
  @ApiModelProperty(example = "347", value = "User account following count.")
  public Integer getFollowingCount() {
    return followingCount;
  }

  public Account id(String id) {
    this.id = id;
    return this;
  }

   /**
   * User account ID.
   * @return id
  **/
  @ApiModelProperty(example = "2783136121146311751", value = "User account ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * User account monthly views.
   * @return monthlyViews
  **/
  @ApiModelProperty(example = "163", value = "User account monthly views.")
  public Integer getMonthlyViews() {
    return monthlyViews;
  }

   /**
   * User account pin count. This includes both created and saved pins.
   * @return pinCount
  **/
  @ApiModelProperty(example = "339", value = "User account pin count. This includes both created and saved pins.")
  public Integer getPinCount() {
    return pinCount;
  }

  public Account profileImage(String profileImage) {
    this.profileImage = profileImage;
    return this;
  }

   /**
   * Get profileImage
   * @return profileImage
  **/
  @ApiModelProperty(value = "")
  public String getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

  public Account username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Account websiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
    return this;
  }

   /**
   * Get websiteUrl
   * @return websiteUrl
  **/
  @ApiModelProperty(value = "")
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

