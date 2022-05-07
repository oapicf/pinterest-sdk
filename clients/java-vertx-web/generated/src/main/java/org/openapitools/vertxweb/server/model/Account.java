package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

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
  private String profileImage;
  private String websiteUrl;
  private String username;

  public Account () {

  }

  public Account (AccountTypeEnum accountType, String profileImage, String websiteUrl, String username) {
    this.accountType = accountType;
    this.profileImage = profileImage;
    this.websiteUrl = websiteUrl;
    this.username = username;
  }

    
  @JsonProperty("account_type")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }
  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
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
        Objects.equals(profileImage, account.profileImage) &&
        Objects.equals(websiteUrl, account.websiteUrl) &&
        Objects.equals(username, account.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountType, profileImage, websiteUrl, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
    sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
