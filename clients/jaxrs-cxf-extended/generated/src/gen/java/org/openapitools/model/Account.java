package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Account  {
  
public enum AccountTypeEnum {

    @JsonProperty("PINNER") PINNER(String.valueOf("PINNER")),
    @JsonProperty("BUSINESS") BUSINESS(String.valueOf("BUSINESS"));

    private String value;

    AccountTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AccountTypeEnum fromValue(String value) {
        for (AccountTypeEnum b : AccountTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Type of account
  */
  @ApiModelProperty(value = "Type of account")
  private AccountTypeEnum accountType;

 /**
  * User account ID.
  */
  @ApiModelProperty(example = "2783136121146311751", value = "User account ID.")
  private String id;

  @ApiModelProperty(value = "")
  private String profileImage;

  @ApiModelProperty(value = "")
  private String websiteUrl;

  @ApiModelProperty(value = "")
  private String username;

 /**
  * Profile about description.
  */
  @ApiModelProperty(value = "Profile about description.")
  private String about;

  @ApiModelProperty(value = "")
  private String businessName;

 /**
  * User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
  */
  @ApiModelProperty(example = "14", value = "User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.")
  private Integer boardCount;

 /**
  * User account pin count. This includes both created and saved pins.
  */
  @ApiModelProperty(example = "339", value = "User account pin count. This includes both created and saved pins.")
  private Integer pinCount;

 /**
  * User account follower count.
  */
  @ApiModelProperty(example = "10", value = "User account follower count.")
  private Integer followerCount;

 /**
  * User account following count.
  */
  @ApiModelProperty(example = "347", value = "User account following count.")
  private Integer followingCount;

 /**
  * User account monthly views.
  */
  @ApiModelProperty(example = "163", value = "User account monthly views.")
  private Integer monthlyViews;
 /**
  * Type of account
  * @return accountType
  */
  @JsonProperty("account_type")
  public String getAccountType() {
    return accountType == null ? null : accountType.value();
  }

  /**
   * Sets the <code>accountType</code> property.
   */
 public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  /**
   * Sets the <code>accountType</code> property.
   */
  public Account accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

 /**
  * User account ID.
  * @return id
  */
  @JsonProperty("id")
 @Pattern(regexp="^\\d+$")  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public Account id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get profileImage
  * @return profileImage
  */
  @JsonProperty("profile_image")
  public String getProfileImage() {
    return profileImage;
  }

  /**
   * Sets the <code>profileImage</code> property.
   */
 public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

  /**
   * Sets the <code>profileImage</code> property.
   */
  public Account profileImage(String profileImage) {
    this.profileImage = profileImage;
    return this;
  }

 /**
  * Get websiteUrl
  * @return websiteUrl
  */
  @JsonProperty("website_url")
  public String getWebsiteUrl() {
    return websiteUrl;
  }

  /**
   * Sets the <code>websiteUrl</code> property.
   */
 public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }

  /**
   * Sets the <code>websiteUrl</code> property.
   */
  public Account websiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
    return this;
  }

 /**
  * Get username
  * @return username
  */
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  /**
   * Sets the <code>username</code> property.
   */
 public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Sets the <code>username</code> property.
   */
  public Account username(String username) {
    this.username = username;
    return this;
  }

 /**
  * Profile about description.
  * @return about
  */
  @JsonProperty("about")
  public String getAbout() {
    return about;
  }

  /**
   * Sets the <code>about</code> property.
   */
 public void setAbout(String about) {
    this.about = about;
  }

  /**
   * Sets the <code>about</code> property.
   */
  public Account about(String about) {
    this.about = about;
    return this;
  }

 /**
  * Get businessName
  * @return businessName
  */
  @JsonProperty("business_name")
  public String getBusinessName() {
    return businessName;
  }

  /**
   * Sets the <code>businessName</code> property.
   */
 public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  /**
   * Sets the <code>businessName</code> property.
   */
  public Account businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

 /**
  * User account board count.&lt;br/&gt;**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
  * @return boardCount
  */
  @JsonProperty("board_count")
  public Integer getBoardCount() {
    return boardCount;
  }

  /**
   * Sets the <code>boardCount</code> property.
   * <br><em>N.B. <code>boardCount</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setBoardCount(Integer boardCount) {
    this.boardCount = boardCount;
  }

  /**
   * Sets the <code>boardCount</code> property.
   * <br><em>N.B. <code>boardCount</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Account boardCount(Integer boardCount) {
    this.boardCount = boardCount;
    return this;
  }

 /**
  * User account pin count. This includes both created and saved pins.
  * @return pinCount
  */
  @JsonProperty("pin_count")
  public Integer getPinCount() {
    return pinCount;
  }

  /**
   * Sets the <code>pinCount</code> property.
   * <br><em>N.B. <code>pinCount</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setPinCount(Integer pinCount) {
    this.pinCount = pinCount;
  }

  /**
   * Sets the <code>pinCount</code> property.
   * <br><em>N.B. <code>pinCount</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Account pinCount(Integer pinCount) {
    this.pinCount = pinCount;
    return this;
  }

 /**
  * User account follower count.
  * @return followerCount
  */
  @JsonProperty("follower_count")
  public Integer getFollowerCount() {
    return followerCount;
  }

  /**
   * Sets the <code>followerCount</code> property.
   * <br><em>N.B. <code>followerCount</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setFollowerCount(Integer followerCount) {
    this.followerCount = followerCount;
  }

  /**
   * Sets the <code>followerCount</code> property.
   * <br><em>N.B. <code>followerCount</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Account followerCount(Integer followerCount) {
    this.followerCount = followerCount;
    return this;
  }

 /**
  * User account following count.
  * @return followingCount
  */
  @JsonProperty("following_count")
  public Integer getFollowingCount() {
    return followingCount;
  }

  /**
   * Sets the <code>followingCount</code> property.
   * <br><em>N.B. <code>followingCount</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setFollowingCount(Integer followingCount) {
    this.followingCount = followingCount;
  }

  /**
   * Sets the <code>followingCount</code> property.
   * <br><em>N.B. <code>followingCount</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Account followingCount(Integer followingCount) {
    this.followingCount = followingCount;
    return this;
  }

 /**
  * User account monthly views.
  * @return monthlyViews
  */
  @JsonProperty("monthly_views")
  public Integer getMonthlyViews() {
    return monthlyViews;
  }

  /**
   * Sets the <code>monthlyViews</code> property.
   * <br><em>N.B. <code>monthlyViews</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setMonthlyViews(Integer monthlyViews) {
    this.monthlyViews = monthlyViews;
  }

  /**
   * Sets the <code>monthlyViews</code> property.
   * <br><em>N.B. <code>monthlyViews</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public Account monthlyViews(Integer monthlyViews) {
    this.monthlyViews = monthlyViews;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

