package org.openapitools.model;

import org.openapitools.model.BrandAccountProfileImageUpdate;
import org.openapitools.model.Country;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create or update operation model.
 */
public class BrandAccountUpdate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Brand Account about information
   */
  @JsonProperty("about")
  private String about;

  @JsonProperty("country")
  private Country country;

  /**
   * Brand Account name
   */
  @JsonProperty("name")
  private String name;

  @JsonProperty("profile_image")
  private BrandAccountProfileImageUpdate profileImage;

  /**
   * Brand Account username
   */
  @JsonProperty("username")
  private String username;

  /**
   * Brand Account website
   */
  @JsonProperty("website")
  private String website;

  /**
   * Brand Account about information
   * @return about
   */
  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }

  /**
   * 
   * @return country
   */
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  /**
   * Brand Account name
   * @return name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * 
   * @return profileImage
   */
  public BrandAccountProfileImageUpdate getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(BrandAccountProfileImageUpdate profileImage) {
    this.profileImage = profileImage;
  }

  /**
   * Brand Account username
   * @return username
   */
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Brand Account website
   * @return website
   */
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
