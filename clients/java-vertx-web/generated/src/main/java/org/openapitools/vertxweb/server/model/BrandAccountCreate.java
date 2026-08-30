package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.BrandAccountProfileImage;
import org.openapitools.vertxweb.server.model.Country;

/**
 * Resource create operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrandAccountCreate   {
  
  private String about;
  private Country country;
  private String name;
  private BrandAccountProfileImage profileImage;
  private String username;
  private String website;

  public BrandAccountCreate () {

  }

  public BrandAccountCreate (String about, Country country, String name, BrandAccountProfileImage profileImage, String username, String website) {
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
  public BrandAccountProfileImage getProfileImage() {
    return profileImage;
  }
  public void setProfileImage(BrandAccountProfileImage profileImage) {
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
    BrandAccountCreate brandAccountCreate = (BrandAccountCreate) o;
    return Objects.equals(about, brandAccountCreate.about) &&
        Objects.equals(country, brandAccountCreate.country) &&
        Objects.equals(name, brandAccountCreate.name) &&
        Objects.equals(profileImage, brandAccountCreate.profileImage) &&
        Objects.equals(username, brandAccountCreate.username) &&
        Objects.equals(website, brandAccountCreate.website);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
