package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.Country;
import com.prokarma.pkmst.model.ImageBase64;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * BrandAccountsCreateRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-01-31T04:52:46.215362801Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BrandAccountsCreateRequest   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("username")
  private String username;

  @JsonProperty("country")
  private Country country;

  @JsonProperty("about")
  private String about;

  @JsonProperty("website")
  private String website;

  @JsonProperty("profile_image")
  private ImageBase64 profileImage;

  public BrandAccountsCreateRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Brand Account name
   * @return name
   */
  @ApiModelProperty(example = "Canada Stores", required = true, value = "Brand Account name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BrandAccountsCreateRequest username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Brand Account username
   * @return username
   */
  @ApiModelProperty(example = "canada_stores", required = true, value = "Brand Account username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public BrandAccountsCreateRequest country(Country country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @ApiModelProperty(required = true, value = "")
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public BrandAccountsCreateRequest about(String about) {
    this.about = about;
    return this;
  }

  /**
   * Brand Account about information
   * @return about
   */
  @ApiModelProperty(example = "Stores in Canada", value = "Brand Account about information")
  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }

  public BrandAccountsCreateRequest website(String website) {
    this.website = website;
    return this;
  }

  /**
   * Brand Account website
   * @return website
   */
  @ApiModelProperty(example = "https://www.example.com", value = "Brand Account website")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public BrandAccountsCreateRequest profileImage(ImageBase64 profileImage) {
    this.profileImage = profileImage;
    return this;
  }

  /**
   * Get profileImage
   * @return profileImage
   */
  @ApiModelProperty(value = "")
  public ImageBase64 getProfileImage() {
    return profileImage;
  }

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

