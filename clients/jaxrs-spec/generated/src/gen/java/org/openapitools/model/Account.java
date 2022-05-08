package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2022-05-08T00:33:54.705491Z[Etc/UTC]")public class Account   {
  

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

  private @Valid AccountTypeEnum accountType;
  private @Valid String profileImage;
  private @Valid String websiteUrl;
  private @Valid String username;

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
        Objects.equals(this.profileImage, account.profileImage) &&
        Objects.equals(this.websiteUrl, account.websiteUrl) &&
        Objects.equals(this.username, account.username);
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

