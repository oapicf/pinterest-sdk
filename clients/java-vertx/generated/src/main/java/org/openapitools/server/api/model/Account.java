package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Account   {
  


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

  public Account () {

  }

  public Account (AccountTypeEnum accountType, String id, String profileImage, String websiteUrl, String username, String about, String businessName, Integer boardCount, Integer pinCount, Integer followerCount, Integer followingCount, Integer monthlyViews) {
    this.accountType = accountType;
    this.id = id;
    this.profileImage = profileImage;
    this.websiteUrl = websiteUrl;
    this.username = username;
    this.about = about;
    this.businessName = businessName;
    this.boardCount = boardCount;
    this.pinCount = pinCount;
    this.followerCount = followerCount;
    this.followingCount = followingCount;
    this.monthlyViews = monthlyViews;
  }

    
  @JsonProperty("account_type")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }
  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("profile_image")
  public String getProfileImage() {
    return profileImage;
  }
  public void setProfileImage(String profileImage) {
    this.profileImage = profileImage;
  }

    
  @JsonProperty("website_url")
  public String getWebsiteUrl() {
    return websiteUrl;
  }
  public void setWebsiteUrl(String websiteUrl) {
    this.websiteUrl = websiteUrl;
  }

    
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

    
  @JsonProperty("about")
  public String getAbout() {
    return about;
  }
  public void setAbout(String about) {
    this.about = about;
  }

    
  @JsonProperty("business_name")
  public String getBusinessName() {
    return businessName;
  }
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

    
  @JsonProperty("board_count")
  public Integer getBoardCount() {
    return boardCount;
  }
  public void setBoardCount(Integer boardCount) {
    this.boardCount = boardCount;
  }

    
  @JsonProperty("pin_count")
  public Integer getPinCount() {
    return pinCount;
  }
  public void setPinCount(Integer pinCount) {
    this.pinCount = pinCount;
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
