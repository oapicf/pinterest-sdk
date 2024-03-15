package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Account
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Account   {
  /**
   * Type of account
   */
  public enum AccountTypeEnum {
    PINNER("PINNER"),
    
    BUSINESS("BUSINESS");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccountTypeEnum fromValue(String text) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("account_type")
  private AccountTypeEnum accountType;

  @JsonProperty("id")
  private String id;

  @JsonProperty("profile_image")
  private String profileImage;

  @JsonProperty("website_url")
  private String websiteUrl;

  @JsonProperty("username")
  private String username;

  @JsonProperty("about")
  private String about;

  @JsonProperty("business_name")
  private String businessName;

  @JsonProperty("board_count")
  private Integer boardCount;

  @JsonProperty("pin_count")
  private Integer pinCount;

  @JsonProperty("follower_count")
  private Integer followerCount;

  @JsonProperty("following_count")
  private Integer followingCount;

  @JsonProperty("monthly_views")
  private Integer monthlyViews;

  public Account accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

   /**
   * Type of account
   * @return accountType
  **/
  @ApiModelProperty(value = "Type of account")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
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

  public Account boardCount(Integer boardCount) {
    this.boardCount = boardCount;
    return this;
  }

   /**
   * User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
   * @return boardCount
  **/
  @ApiModelProperty(example = "14", readOnly = true, value = "User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.")
  public Integer getBoardCount() {
    return boardCount;
  }

  public void setBoardCount(Integer boardCount) {
    this.boardCount = boardCount;
  }

  public Account pinCount(Integer pinCount) {
    this.pinCount = pinCount;
    return this;
  }

   /**
   * User account pin count. This includes both created and saved pins.
   * @return pinCount
  **/
  @ApiModelProperty(example = "339", readOnly = true, value = "User account pin count. This includes both created and saved pins.")
  public Integer getPinCount() {
    return pinCount;
  }

  public void setPinCount(Integer pinCount) {
    this.pinCount = pinCount;
  }

  public Account followerCount(Integer followerCount) {
    this.followerCount = followerCount;
    return this;
  }

   /**
   * User account follower count.
   * @return followerCount
  **/
  @ApiModelProperty(example = "10", readOnly = true, value = "User account follower count.")
  public Integer getFollowerCount() {
    return followerCount;
  }

  public void setFollowerCount(Integer followerCount) {
    this.followerCount = followerCount;
  }

  public Account followingCount(Integer followingCount) {
    this.followingCount = followingCount;
    return this;
  }

   /**
   * User account following count.
   * @return followingCount
  **/
  @ApiModelProperty(example = "347", readOnly = true, value = "User account following count.")
  public Integer getFollowingCount() {
    return followingCount;
  }

  public void setFollowingCount(Integer followingCount) {
    this.followingCount = followingCount;
  }

  public Account monthlyViews(Integer monthlyViews) {
    this.monthlyViews = monthlyViews;
    return this;
  }

   /**
   * User account monthly views.
   * @return monthlyViews
  **/
  @ApiModelProperty(example = "163", readOnly = true, value = "User account monthly views.")
  public Integer getMonthlyViews() {
    return monthlyViews;
  }

  public void setMonthlyViews(Integer monthlyViews) {
    this.monthlyViews = monthlyViews;
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
    return Objects.equals(this.accountType, account.accountType) &&
        Objects.equals(this.id, account.id) &&
        Objects.equals(this.profileImage, account.profileImage) &&
        Objects.equals(this.websiteUrl, account.websiteUrl) &&
        Objects.equals(this.username, account.username) &&
        Objects.equals(this.about, account.about) &&
        Objects.equals(this.businessName, account.businessName) &&
        Objects.equals(this.boardCount, account.boardCount) &&
        Objects.equals(this.pinCount, account.pinCount) &&
        Objects.equals(this.followerCount, account.followerCount) &&
        Objects.equals(this.followingCount, account.followingCount) &&
        Objects.equals(this.monthlyViews, account.monthlyViews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, id, profileImage, websiteUrl, username, about, businessName, boardCount, pinCount, followerCount, followingCount, monthlyViews);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    boardCount: ").append(toIndentedString(boardCount)).append("\n");
    sb.append("    pinCount: ").append(toIndentedString(pinCount)).append("\n");
    sb.append("    followerCount: ").append(toIndentedString(followerCount)).append("\n");
    sb.append("    followingCount: ").append(toIndentedString(followingCount)).append("\n");
    sb.append("    monthlyViews: ").append(toIndentedString(monthlyViews)).append("\n");
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

