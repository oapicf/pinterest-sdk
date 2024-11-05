package apimodels;

import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Account
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Account   {
  /**
   * Type of account
   */
  public enum AccountTypeEnum {
    PINNER("PINNER"),
    
    BUSINESS("BUSINESS");

    private final String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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

  @JsonProperty("account_type")
  
  private AccountTypeEnum accountType;

  @JsonProperty("id")
  @Pattern(regexp="^\\d+$")

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

  @SuppressWarnings("StringBufferReplaceableByString")
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

