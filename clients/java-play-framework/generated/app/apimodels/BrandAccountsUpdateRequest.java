package apimodels;

import apimodels.Country;
import apimodels.ImageBase64;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * BrandAccountsUpdateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BrandAccountsUpdateRequest   {
  @JsonProperty("name")
  
  private String name;

  @JsonProperty("username")
  
  private String username;

  @JsonProperty("country")
  @Valid

  private Country country;

  @JsonProperty("about")
  
  private String about;

  @JsonProperty("website")
  
  private String website;

  @JsonProperty("profile_image")
  @Valid

  private ImageBase64 profileImage;

  public BrandAccountsUpdateRequest name(String name) {
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

  public BrandAccountsUpdateRequest username(String username) {
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

  public BrandAccountsUpdateRequest country(Country country) {
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

  public BrandAccountsUpdateRequest about(String about) {
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

  public BrandAccountsUpdateRequest website(String website) {
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

  public BrandAccountsUpdateRequest profileImage(ImageBase64 profileImage) {
    this.profileImage = profileImage;
    return this;
  }

   /**
   * Get profileImage
   * @return profileImage
  **/
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
    BrandAccountsUpdateRequest brandAccountsUpdateRequest = (BrandAccountsUpdateRequest) o;
    return Objects.equals(name, brandAccountsUpdateRequest.name) &&
        Objects.equals(username, brandAccountsUpdateRequest.username) &&
        Objects.equals(country, brandAccountsUpdateRequest.country) &&
        Objects.equals(about, brandAccountsUpdateRequest.about) &&
        Objects.equals(website, brandAccountsUpdateRequest.website) &&
        Objects.equals(profileImage, brandAccountsUpdateRequest.profileImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, username, country, about, website, profileImage);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

