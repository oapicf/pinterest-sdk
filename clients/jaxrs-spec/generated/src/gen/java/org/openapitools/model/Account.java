package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class Account   {
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static AccountTypeEnum fromString(String s) {
        for (AccountTypeEnum b : AccountTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static AccountTypeEnum fromValue(String value) {
        for (AccountTypeEnum b : AccountTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private AccountTypeEnum accountType;
  private String id;
  private String profileImage;
  private String websiteUrl;
  private String username;
  private String about;
  private String businessName;
  private Integer boardCount;
  private Integer pinCount;
  private Integer followerCount;
  private Integer followingCount;
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

  @JsonProperty("account_type")
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
   @Pattern(regexp="^\\d+$")public String getId() {
    return id;
  }

  @JsonProperty("id")
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

  @JsonProperty("profile_image")
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

  @JsonProperty("website_url")
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

  @JsonProperty("username")
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

  @JsonProperty("about")
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

  @JsonProperty("business_name")
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  /**
   * User account board count.&lt;br/&gt;**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
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

  @JsonProperty("board_count")
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

  @JsonProperty("pin_count")
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

  @JsonProperty("follower_count")
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

  @JsonProperty("following_count")
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

  @JsonProperty("monthly_views")
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

