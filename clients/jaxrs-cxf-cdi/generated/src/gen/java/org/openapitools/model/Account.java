package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;



public class Account   {
  

public enum AccountTypeEnum {

    PINNER(String.valueOf("PINNER")), BUSINESS(String.valueOf("BUSINESS"));


    private String value;

    AccountTypeEnum(String v) {
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

  private AccountTypeEnum accountType;

  private String profileImage;

  private String websiteUrl;

  private String username;


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

