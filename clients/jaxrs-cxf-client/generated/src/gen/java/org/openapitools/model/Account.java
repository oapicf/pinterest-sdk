package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Account  {
  
 /**
  * Profile about description.
  */
  @ApiModelProperty(value = "Profile about description.")

  private String about;

public enum AccountTypeEnum {

PINNER(String.valueOf("PINNER")), BUSINESS(String.valueOf("BUSINESS"));


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
  * User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
  */
  @ApiModelProperty(example = "14", value = "User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.")

  private Integer boardCount;

  @ApiModelProperty(value = "")

  private String businessName;

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
  * User account ID.
  */
  @ApiModelProperty(example = "2783136121146311751", value = "User account ID.")

  private String id;

 /**
  * User account monthly views.
  */
  @ApiModelProperty(example = "163", value = "User account monthly views.")

  private Integer monthlyViews;

 /**
  * User account pin count. This includes both created and saved pins.
  */
  @ApiModelProperty(example = "339", value = "User account pin count. This includes both created and saved pins.")

  private Integer pinCount;

  @ApiModelProperty(value = "")

  private String profileImage;

  @ApiModelProperty(value = "")

  private String username;

  @ApiModelProperty(value = "")

  private String websiteUrl;
 /**
   * Profile about description.
   * @return about
  **/
  @JsonProperty("about")
  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }

  public Account about(String about) {
    this.about = about;
    return this;
  }

 /**
   * Type of account
   * @return accountType
  **/
  @JsonProperty("account_type")
  public String getAccountType() {
    if (accountType == null) {
      return null;
    }
    return accountType.value();
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  public Account accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

 /**
   * User account board count.&lt;br/&gt;**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
   * @return boardCount
  **/
  @JsonProperty("board_count")
  public Integer getBoardCount() {
    return boardCount;
  }


 /**
   * Get businessName
   * @return businessName
  **/
  @JsonProperty("business_name")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public Account businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

 /**
   * User account follower count.
   * @return followerCount
  **/
  @JsonProperty("follower_count")
  public Integer getFollowerCount() {
    return followerCount;
  }


 /**
   * User account following count.
   * @return followingCount
  **/
  @JsonProperty("following_count")
  public Integer getFollowingCount() {
    return followingCount;
  }


 /**
   * User account ID.
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Account id(String id) {
    this.id = id;
    return this;
  }

 /**
   * User account monthly views.
   * @return monthlyViews
  **/
  @JsonProperty("monthly_views")
  public Integer getMonthlyViews() {
    return monthlyViews;
  }


 /**
   * User account pin count. This includes both created and saved pins.
   * @return pinCount
  **/
  @JsonProperty("pin_count")
  public Integer getPinCount() {
    return pinCount;
  }


 /**
   * Get profileImage
   * @return profileImage
  **/
  @JsonProperty("profile_image")
  public String getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

  public Account profileImage(String profileImage) {
    this.profileImage = profileImage;
    return this;
  }

 /**
   * Get username
   * @return username
  **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Account username(String username) {
    this.username = username;
    return this;
  }

 /**
   * Get websiteUrl
   * @return websiteUrl
  **/
  @JsonProperty("website_url")
  public String getWebsiteUrl() {
    return websiteUrl;
  }

  public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }

  public Account websiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

