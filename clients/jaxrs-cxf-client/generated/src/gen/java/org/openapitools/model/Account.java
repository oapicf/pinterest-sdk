package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Account  {
  
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

  @ApiModelProperty(value = "Type of account")
 /**
   * Type of account
  **/
  private AccountTypeEnum accountType;

  @ApiModelProperty(value = "")
  private String profileImage;

  @ApiModelProperty(value = "")
  private String websiteUrl;

  @ApiModelProperty(value = "")
  private String username;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

