package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BrandAccountProfileImageUpdate;
import org.openapitools.model.Country;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Resource create or update operation model.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Resource create or update operation model.")
public class BrandAccountUpdate   {
  
  private String about;

  private Country country;

  private String name;

  private BrandAccountProfileImageUpdate profileImage;

  private String username;

  private String website;

  /**
   * Brand Account about information
   **/
  public BrandAccountUpdate about(String about) {
    this.about = about;
    return this;
  }

  
  @ApiModelProperty(value = "Brand Account about information")
  @JsonProperty("about")
  public String getAbout() {
    return about;
  }
  public void setAbout(String about) {
    this.about = about;
  }


  /**
   **/
  public BrandAccountUpdate country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }


  /**
   * Brand Account name
   **/
  public BrandAccountUpdate name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(value = "Brand Account name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public BrandAccountUpdate profileImage(BrandAccountProfileImageUpdate profileImage) {
    this.profileImage = profileImage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("profile_image")
  public BrandAccountProfileImageUpdate getProfileImage() {
    return profileImage;
  }
  public void setProfileImage(BrandAccountProfileImageUpdate profileImage) {
    this.profileImage = profileImage;
  }


  /**
   * Brand Account username
   **/
  public BrandAccountUpdate username(String username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(value = "Brand Account username")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }


  /**
   * Brand Account website
   **/
  public BrandAccountUpdate website(String website) {
    this.website = website;
    return this;
  }

  
  @ApiModelProperty(value = "Brand Account website")
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }
  public void setWebsite(String website) {
    this.website = website;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAccountUpdate brandAccountUpdate = (BrandAccountUpdate) o;
    return Objects.equals(this.about, brandAccountUpdate.about) &&
        Objects.equals(this.country, brandAccountUpdate.country) &&
        Objects.equals(this.name, brandAccountUpdate.name) &&
        Objects.equals(this.profileImage, brandAccountUpdate.profileImage) &&
        Objects.equals(this.username, brandAccountUpdate.username) &&
        Objects.equals(this.website, brandAccountUpdate.website);
  }

  @Override
  public int hashCode() {
    return Objects.hash(about, country, name, profileImage, username, website);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandAccountUpdate {\n");
    
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

