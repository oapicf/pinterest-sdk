package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

  /**
   * Type of account
   **/
  public Account accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

  
  @ApiModelProperty(value = "Type of account")
  @JsonProperty("account_type")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }
  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  /**
   * User account ID.
   **/
  public Account id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "2783136121146311751", value = "User account ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public Account profileImage(String profileImage) {
    this.profileImage = profileImage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("profile_image")
  public String getProfileImage() {
    return profileImage;
  }
  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

  /**
   **/
  public Account websiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("website_url")
  public String getWebsiteUrl() {
    return websiteUrl;
  }
  public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }

  /**
   **/
  public Account username(String username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Profile about description.
   **/
  public Account about(String about) {
    this.about = about;
    return this;
  }

  
  @ApiModelProperty(value = "Profile about description.")
  @JsonProperty("about")
  public String getAbout() {
    return about;
  }
  public void setAbout(String about) {
    this.about = about;
  }

  /**
   **/
  public Account businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("business_name")
  public String getBusinessName() {
    return businessName;
  }
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  /**
   * User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
   **/
  public Account boardCount(Integer boardCount) {
    this.boardCount = boardCount;
    return this;
  }

  
  @ApiModelProperty(example = "14", value = "User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.")
  @JsonProperty("board_count")
  public Integer getBoardCount() {
    return boardCount;
  }
  public void setBoardCount(Integer boardCount) {
    this.boardCount = boardCount;
  }

  /**
   * User account pin count. This includes both created and saved pins.
   **/
  public Account pinCount(Integer pinCount) {
    this.pinCount = pinCount;
    return this;
  }

  
  @ApiModelProperty(example = "339", value = "User account pin count. This includes both created and saved pins.")
  @JsonProperty("pin_count")
  public Integer getPinCount() {
    return pinCount;
  }
  public void setPinCount(Integer pinCount) {
    this.pinCount = pinCount;
  }

  /**
   * User account follower count.
   **/
  public Account followerCount(Integer followerCount) {
    this.followerCount = followerCount;
    return this;
  }

  
  @ApiModelProperty(example = "10", value = "User account follower count.")
  @JsonProperty("follower_count")
  public Integer getFollowerCount() {
    return followerCount;
  }
  public void setFollowerCount(Integer followerCount) {
    this.followerCount = followerCount;
  }

  /**
   * User account following count.
   **/
  public Account followingCount(Integer followingCount) {
    this.followingCount = followingCount;
    return this;
  }

  
  @ApiModelProperty(example = "347", value = "User account following count.")
  @JsonProperty("following_count")
  public Integer getFollowingCount() {
    return followingCount;
  }
  public void setFollowingCount(Integer followingCount) {
    this.followingCount = followingCount;
  }

  /**
   * User account monthly views.
   **/
  public Account monthlyViews(Integer monthlyViews) {
    this.monthlyViews = monthlyViews;
    return this;
  }

  
  @ApiModelProperty(example = "163", value = "User account monthly views.")
  @JsonProperty("monthly_views")
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
    return Objects.equals(accountType, account.accountType) &&
        Objects.equals(id, account.id) &&
        Objects.equals(profileImage, account.profileImage) &&
        Objects.equals(websiteUrl, account.websiteUrl) &&
        Objects.equals(username, account.username) &&
        Objects.equals(about, account.about) &&
        Objects.equals(businessName, account.businessName) &&
        Objects.equals(boardCount, account.boardCount) &&
        Objects.equals(pinCount, account.pinCount) &&
        Objects.equals(followerCount, account.followerCount) &&
        Objects.equals(followingCount, account.followingCount) &&
        Objects.equals(monthlyViews, account.monthlyViews);
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

