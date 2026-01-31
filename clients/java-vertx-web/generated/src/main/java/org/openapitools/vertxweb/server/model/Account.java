package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Account   {
  
  private String about;


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
      return value;
    }
  }

  private AccountTypeEnum accountType;
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

  public Account () {

  }

  public Account (String about, AccountTypeEnum accountType, Integer boardCount, String businessName, Integer followerCount, Integer followingCount, String id, Integer monthlyViews, Integer pinCount, String profileImage, String username, String websiteUrl) {
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

    
  @JsonProperty("about")
  public String getAbout() {
    return about;
  }
  public void setAbout(String about) {
    this.about = about;
  }

    
  @JsonProperty("account_type")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }
  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

    
  @JsonProperty("board_count")
  public Integer getBoardCount() {
    return boardCount;
  }
  public void setBoardCount(Integer boardCount) {
    this.boardCount = boardCount;
  }

    
  @JsonProperty("business_name")
  public String getBusinessName() {
    return businessName;
  }
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

    
  @JsonProperty("follower_count")
  public Integer getFollowerCount() {
    return followerCount;
  }
  public void setFollowerCount(Integer followerCount) {
    this.followerCount = followerCount;
  }

    
  @JsonProperty("following_count")
  public Integer getFollowingCount() {
    return followingCount;
  }
  public void setFollowingCount(Integer followingCount) {
    this.followingCount = followingCount;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("monthly_views")
  public Integer getMonthlyViews() {
    return monthlyViews;
  }
  public void setMonthlyViews(Integer monthlyViews) {
    this.monthlyViews = monthlyViews;
  }

    
  @JsonProperty("pin_count")
  public Integer getPinCount() {
    return pinCount;
  }
  public void setPinCount(Integer pinCount) {
    this.pinCount = pinCount;
  }

    
  @JsonProperty("profile_image")
  public String getProfileImage() {
    return profileImage;
  }
  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

    
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

    
  @JsonProperty("website_url")
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
    return Objects.equals(about, account.about) &&
        Objects.equals(accountType, account.accountType) &&
        Objects.equals(boardCount, account.boardCount) &&
        Objects.equals(businessName, account.businessName) &&
        Objects.equals(followerCount, account.followerCount) &&
        Objects.equals(followingCount, account.followingCount) &&
        Objects.equals(id, account.id) &&
        Objects.equals(monthlyViews, account.monthlyViews) &&
        Objects.equals(pinCount, account.pinCount) &&
        Objects.equals(profileImage, account.profileImage) &&
        Objects.equals(username, account.username) &&
        Objects.equals(websiteUrl, account.websiteUrl);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
