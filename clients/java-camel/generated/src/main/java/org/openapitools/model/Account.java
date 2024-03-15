package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Account
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class Account {

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

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private AccountTypeEnum accountType;

  private String id;

  private String profileImage;

  private String websiteUrl;

  private String username;

  private String about;

  private JsonNullable<String> businessName = JsonNullable.<String>undefined();

  private JsonNullable<Integer> boardCount = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> pinCount = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> followerCount = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> followingCount = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> monthlyViews = JsonNullable.<Integer>undefined();

  public Account accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Type of account
   * @return accountType
  */
  
  @Schema(name = "account_type", description = "Type of account", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("account_type")
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
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "2783136121146311751", description = "User account ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
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
  */
  
  @Schema(name = "profile_image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profile_image")
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
  */
  
  @Schema(name = "website_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("website_url")
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
  */
  
  @Schema(name = "username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
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
  */
  
  @Schema(name = "about", description = "Profile about description.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("about")
  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }

  public Account businessName(String businessName) {
    this.businessName = JsonNullable.of(businessName);
    return this;
  }

  /**
   * Get businessName
   * @return businessName
  */
  
  @Schema(name = "business_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("business_name")
  public JsonNullable<String> getBusinessName() {
    return businessName;
  }

  public void setBusinessName(JsonNullable<String> businessName) {
    this.businessName = businessName;
  }

  public Account boardCount(Integer boardCount) {
    this.boardCount = JsonNullable.of(boardCount);
    return this;
  }

  /**
   * User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.
   * @return boardCount
  */
  
  @Schema(name = "board_count", accessMode = Schema.AccessMode.READ_ONLY, example = "14", description = "User account board count.<br/>**Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("board_count")
  public JsonNullable<Integer> getBoardCount() {
    return boardCount;
  }

  public void setBoardCount(JsonNullable<Integer> boardCount) {
    this.boardCount = boardCount;
  }

  public Account pinCount(Integer pinCount) {
    this.pinCount = JsonNullable.of(pinCount);
    return this;
  }

  /**
   * User account pin count. This includes both created and saved pins.
   * @return pinCount
  */
  
  @Schema(name = "pin_count", accessMode = Schema.AccessMode.READ_ONLY, example = "339", description = "User account pin count. This includes both created and saved pins.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pin_count")
  public JsonNullable<Integer> getPinCount() {
    return pinCount;
  }

  public void setPinCount(JsonNullable<Integer> pinCount) {
    this.pinCount = pinCount;
  }

  public Account followerCount(Integer followerCount) {
    this.followerCount = JsonNullable.of(followerCount);
    return this;
  }

  /**
   * User account follower count.
   * @return followerCount
  */
  
  @Schema(name = "follower_count", accessMode = Schema.AccessMode.READ_ONLY, example = "10", description = "User account follower count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("follower_count")
  public JsonNullable<Integer> getFollowerCount() {
    return followerCount;
  }

  public void setFollowerCount(JsonNullable<Integer> followerCount) {
    this.followerCount = followerCount;
  }

  public Account followingCount(Integer followingCount) {
    this.followingCount = JsonNullable.of(followingCount);
    return this;
  }

  /**
   * User account following count.
   * @return followingCount
  */
  
  @Schema(name = "following_count", accessMode = Schema.AccessMode.READ_ONLY, example = "347", description = "User account following count.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("following_count")
  public JsonNullable<Integer> getFollowingCount() {
    return followingCount;
  }

  public void setFollowingCount(JsonNullable<Integer> followingCount) {
    this.followingCount = followingCount;
  }

  public Account monthlyViews(Integer monthlyViews) {
    this.monthlyViews = JsonNullable.of(monthlyViews);
    return this;
  }

  /**
   * User account monthly views.
   * @return monthlyViews
  */
  
  @Schema(name = "monthly_views", accessMode = Schema.AccessMode.READ_ONLY, example = "163", description = "User account monthly views.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("monthly_views")
  public JsonNullable<Integer> getMonthlyViews() {
    return monthlyViews;
  }

  public void setMonthlyViews(JsonNullable<Integer> monthlyViews) {
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
        equalsNullable(this.businessName, account.businessName) &&
        equalsNullable(this.boardCount, account.boardCount) &&
        equalsNullable(this.pinCount, account.pinCount) &&
        equalsNullable(this.followerCount, account.followerCount) &&
        equalsNullable(this.followingCount, account.followingCount) &&
        equalsNullable(this.monthlyViews, account.monthlyViews);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, id, profileImage, websiteUrl, username, about, hashCodeNullable(businessName), hashCodeNullable(boardCount), hashCodeNullable(pinCount), hashCodeNullable(followerCount), hashCodeNullable(followingCount), hashCodeNullable(monthlyViews));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

