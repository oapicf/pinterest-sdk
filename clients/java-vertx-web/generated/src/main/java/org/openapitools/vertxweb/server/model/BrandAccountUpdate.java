package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.BrandAccountProfileImageUpdate;
import org.openapitools.vertxweb.server.model.Country;

/**
 * Resource create or update operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrandAccountUpdate   {
  
  private String about;
  private Country country;
  private String name;
  private BrandAccountProfileImageUpdate profileImage;
  private String username;
  private String website;

  public BrandAccountUpdate () {

  }

  public BrandAccountUpdate (String about, Country country, String name, BrandAccountProfileImageUpdate profileImage, String username, String website) {
    this.about = about;
    this.country = country;
    this.name = name;
    this.profileImage = profileImage;
    this.username = username;
    this.website = website;
  }

    
  @JsonProperty("about")
  public String getAbout() {
    return about;
  }
  public void setAbout(String about) {
    this.about = about;
  }

    
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("profile_image")
  public BrandAccountProfileImageUpdate getProfileImage() {
    return profileImage;
  }
  public void setProfileImage(BrandAccountProfileImageUpdate profileImage) {
    this.profileImage = profileImage;
  }

    
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

    
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
    return Objects.equals(about, brandAccountUpdate.about) &&
        Objects.equals(country, brandAccountUpdate.country) &&
        Objects.equals(name, brandAccountUpdate.name) &&
        Objects.equals(profileImage, brandAccountUpdate.profileImage) &&
        Objects.equals(username, brandAccountUpdate.username) &&
        Objects.equals(website, brandAccountUpdate.website);
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
