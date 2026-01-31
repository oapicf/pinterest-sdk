package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Country;
import org.openapitools.model.ImageBase64;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("brand_accounts_create_request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BrandAccountsCreateRequest   {
  private String name;
  private String username;
  private Country country;
  private String about;
  private String website;
  private ImageBase64 profileImage;

  public BrandAccountsCreateRequest() {
  }

  @JsonCreator
  public BrandAccountsCreateRequest(
    @JsonProperty(required = true, value = "name") String name,
    @JsonProperty(required = true, value = "username") String username,
    @JsonProperty(required = true, value = "country") Country country
  ) {
    this.name = name;
    this.username = username;
    this.country = country;
  }

  /**
   * Brand Account name
   **/
  public BrandAccountsCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(example = "Canada Stores", required = true, value = "Brand Account name")
  @JsonProperty(required = true, value = "name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty(required = true, value = "name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Brand Account username
   **/
  public BrandAccountsCreateRequest username(String username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(example = "canada_stores", required = true, value = "Brand Account username")
  @JsonProperty(required = true, value = "username")
  @NotNull public String getUsername() {
    return username;
  }

  @JsonProperty(required = true, value = "username")
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   **/
  public BrandAccountsCreateRequest country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "country")
  @NotNull public Country getCountry() {
    return country;
  }

  @JsonProperty(required = true, value = "country")
  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * Brand Account about information
   **/
  public BrandAccountsCreateRequest about(String about) {
    this.about = about;
    return this;
  }

  
  @ApiModelProperty(example = "Stores in Canada", value = "Brand Account about information")
  @JsonProperty("about")
  public String getAbout() {
    return about;
  }

  @JsonProperty("about")
  public void setAbout(String about) {
    this.about = about;
  }

  /**
   * Brand Account website
   **/
  public BrandAccountsCreateRequest website(String website) {
    this.website = website;
    return this;
  }

  
  @ApiModelProperty(example = "https://www.example.com", value = "Brand Account website")
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }

  @JsonProperty("website")
  public void setWebsite(String website) {
    this.website = website;
  }

  /**
   **/
  public BrandAccountsCreateRequest profileImage(ImageBase64 profileImage) {
    this.profileImage = profileImage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("profile_image")
  @Valid public ImageBase64 getProfileImage() {
    return profileImage;
  }

  @JsonProperty("profile_image")
  public void setProfileImage(ImageBase64 profileImage) {
    this.profileImage = profileImage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAccountsCreateRequest brandAccountsCreateRequest = (BrandAccountsCreateRequest) o;
    return Objects.equals(this.name, brandAccountsCreateRequest.name) &&
        Objects.equals(this.username, brandAccountsCreateRequest.username) &&
        Objects.equals(this.country, brandAccountsCreateRequest.country) &&
        Objects.equals(this.about, brandAccountsCreateRequest.about) &&
        Objects.equals(this.website, brandAccountsCreateRequest.website) &&
        Objects.equals(this.profileImage, brandAccountsCreateRequest.profileImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, username, country, about, website, profileImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandAccountsCreateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
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

