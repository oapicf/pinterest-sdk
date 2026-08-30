package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.BrandAccountProfileImage;
import org.openapitools.model.Country;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource create operation model.
 */
@ApiModel(description="Resource create operation model.")

public class BrandAccountCreate  {
  
 /**
  * Brand Account about information
  */
  @ApiModelProperty(value = "Brand Account about information")

  private String about;

  @ApiModelProperty(required = true, value = "")

  @Valid

  private Country country;

 /**
  * Brand Account name
  */
  @ApiModelProperty(required = true, value = "Brand Account name")

  private String name;

  @ApiModelProperty(value = "")

  @Valid

  private BrandAccountProfileImage profileImage;

 /**
  * Brand Account username
  */
  @ApiModelProperty(required = true, value = "Brand Account username")

  private String username;

 /**
  * Brand Account website
  */
  @ApiModelProperty(value = "Brand Account website")

  private String website;
 /**
   * Brand Account about information
   * @return about
  **/
  @JsonProperty("about")
  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }

  public BrandAccountCreate about(String about) {
    this.about = about;
    return this;
  }

 /**
   * Get country
   * @return country
  **/
  @JsonProperty("country")
  @NotNull
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public BrandAccountCreate country(Country country) {
    this.country = country;
    return this;
  }

 /**
   * Brand Account name
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BrandAccountCreate name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get profileImage
   * @return profileImage
  **/
  @JsonProperty("profile_image")
  public BrandAccountProfileImage getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(BrandAccountProfileImage profileImage) {
    this.profileImage = profileImage;
  }

  public BrandAccountCreate profileImage(BrandAccountProfileImage profileImage) {
    this.profileImage = profileImage;
    return this;
  }

 /**
   * Brand Account username
   * @return username
  **/
  @JsonProperty("username")
  @NotNull
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public BrandAccountCreate username(String username) {
    this.username = username;
    return this;
  }

 /**
   * Brand Account website
   * @return website
  **/
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public BrandAccountCreate website(String website) {
    this.website = website;
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
    BrandAccountCreate brandAccountCreate = (BrandAccountCreate) o;
    return Objects.equals(this.about, brandAccountCreate.about) &&
        Objects.equals(this.country, brandAccountCreate.country) &&
        Objects.equals(this.name, brandAccountCreate.name) &&
        Objects.equals(this.profileImage, brandAccountCreate.profileImage) &&
        Objects.equals(this.username, brandAccountCreate.username) &&
        Objects.equals(this.website, brandAccountCreate.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(about, country, name, profileImage, username, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandAccountCreate {\n");
    
    sb.append("    about: ").append(toIndentedString(about)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

