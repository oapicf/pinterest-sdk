package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Country;
import org.openapitools.model.ImageBase64;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BrandAccountsCreateRequest  {
  
 /**
  * Brand Account name
  */
  @ApiModelProperty(example = "Canada Stores", required = true, value = "Brand Account name")
  private String name;

 /**
  * Brand Account username
  */
  @ApiModelProperty(example = "canada_stores", required = true, value = "Brand Account username")
  private String username;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private Country country;

 /**
  * Brand Account about information
  */
  @ApiModelProperty(example = "Stores in Canada", value = "Brand Account about information")
  private String about;

 /**
  * Brand Account website
  */
  @ApiModelProperty(example = "https://www.example.com", value = "Brand Account website")
  private String website;

  @ApiModelProperty(value = "")
  @Valid
  private ImageBase64 profileImage;
 /**
  * Brand Account name
  * @return name
  */
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public BrandAccountsCreateRequest name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Brand Account username
  * @return username
  */
  @JsonProperty("username")
  @NotNull
  public String getUsername() {
    return username;
  }

  /**
   * Sets the <code>username</code> property.
   */
 public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Sets the <code>username</code> property.
   */
  public BrandAccountsCreateRequest username(String username) {
    this.username = username;
    return this;
  }

 /**
  * Get country
  * @return country
  */
  @JsonProperty("country")
  @NotNull
  public Country getCountry() {
    return country;
  }

  /**
   * Sets the <code>country</code> property.
   */
 public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * Sets the <code>country</code> property.
   */
  public BrandAccountsCreateRequest country(Country country) {
    this.country = country;
    return this;
  }

 /**
  * Brand Account about information
  * @return about
  */
  @JsonProperty("about")
  public String getAbout() {
    return about;
  }

  /**
   * Sets the <code>about</code> property.
   */
 public void setAbout(String about) {
    this.about = about;
  }

  /**
   * Sets the <code>about</code> property.
   */
  public BrandAccountsCreateRequest about(String about) {
    this.about = about;
    return this;
  }

 /**
  * Brand Account website
  * @return website
  */
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }

  /**
   * Sets the <code>website</code> property.
   */
 public void setWebsite(String website) {
    this.website = website;
  }

  /**
   * Sets the <code>website</code> property.
   */
  public BrandAccountsCreateRequest website(String website) {
    this.website = website;
    return this;
  }

 /**
  * Get profileImage
  * @return profileImage
  */
  @JsonProperty("profile_image")
  public ImageBase64 getProfileImage() {
    return profileImage;
  }

  /**
   * Sets the <code>profileImage</code> property.
   */
 public void setProfileImage(ImageBase64 profileImage) {
    this.profileImage = profileImage;
  }

  /**
   * Sets the <code>profileImage</code> property.
   */
  public BrandAccountsCreateRequest profileImage(ImageBase64 profileImage) {
    this.profileImage = profileImage;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

