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


public class BrandAccountsUpdateRequest  {
  
 /**
  * Brand Account name
  */
  @ApiModelProperty(example = "Canada Stores", value = "Brand Account name")
  private String name;

 /**
  * Brand Account username
  */
  @ApiModelProperty(example = "canada_stores", value = "Brand Account username")
  private String username;

  @ApiModelProperty(value = "")
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
  public BrandAccountsUpdateRequest name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Brand Account username
  * @return username
  */
  @JsonProperty("username")
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
  public BrandAccountsUpdateRequest username(String username) {
    this.username = username;
    return this;
  }

 /**
  * Get country
  * @return country
  */
  @JsonProperty("country")
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
  public BrandAccountsUpdateRequest country(Country country) {
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
  public BrandAccountsUpdateRequest about(String about) {
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
  public BrandAccountsUpdateRequest website(String website) {
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
  public BrandAccountsUpdateRequest profileImage(ImageBase64 profileImage) {
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
    BrandAccountsUpdateRequest brandAccountsUpdateRequest = (BrandAccountsUpdateRequest) o;
    return Objects.equals(this.name, brandAccountsUpdateRequest.name) &&
        Objects.equals(this.username, brandAccountsUpdateRequest.username) &&
        Objects.equals(this.country, brandAccountsUpdateRequest.country) &&
        Objects.equals(this.about, brandAccountsUpdateRequest.about) &&
        Objects.equals(this.website, brandAccountsUpdateRequest.website) &&
        Objects.equals(this.profileImage, brandAccountsUpdateRequest.profileImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, username, country, about, website, profileImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandAccountsUpdateRequest {\n");
    
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

