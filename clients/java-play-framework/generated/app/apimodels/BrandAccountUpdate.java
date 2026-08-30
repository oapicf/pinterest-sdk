package apimodels;

import apimodels.BrandAccountProfileImageUpdate;
import apimodels.Country;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Resource create or update operation model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BrandAccountUpdate   {
  @JsonProperty("about")
  
  private String about;

  @JsonProperty("country")
  @Valid

  private Country country;

  @JsonProperty("name")
  
  private String name;

  @JsonProperty("profile_image")
  @Valid

  private BrandAccountProfileImageUpdate profileImage;

  @JsonProperty("username")
  
  private String username;

  @JsonProperty("website")
  
  private String website;

  public BrandAccountUpdate about(String about) {
    this.about = about;
    return this;
  }

   /**
   * Brand Account about information
   * @return about
  **/
  public String getAbout() {
    return about;
  }

  public void setAbout(String about) {
    this.about = about;
  }

  public BrandAccountUpdate country(Country country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  public Country getCountry() {
    return country;
  }

  public void setCountry(Country country) {
    this.country = country;
  }

  public BrandAccountUpdate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Brand Account name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BrandAccountUpdate profileImage(BrandAccountProfileImageUpdate profileImage) {
    this.profileImage = profileImage;
    return this;
  }

   /**
   * Get profileImage
   * @return profileImage
  **/
  public BrandAccountProfileImageUpdate getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(BrandAccountProfileImageUpdate profileImage) {
    this.profileImage = profileImage;
  }

  public BrandAccountUpdate username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Brand Account username
   * @return username
  **/
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public BrandAccountUpdate website(String website) {
    this.website = website;
    return this;
  }

   /**
   * Brand Account website
   * @return website
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

