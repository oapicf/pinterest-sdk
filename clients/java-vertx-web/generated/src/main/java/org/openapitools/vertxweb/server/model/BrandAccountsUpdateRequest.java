package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.Country;
import org.openapitools.vertxweb.server.model.ImageBase64;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrandAccountsUpdateRequest   {
  
  private String name;
  private String username;
  private Country country;
  private String about;
  private String website;
  private ImageBase64 profileImage;

  public BrandAccountsUpdateRequest () {

  }

  public BrandAccountsUpdateRequest (String name, String username, Country country, String about, String website, ImageBase64 profileImage) {
    this.name = name;
    this.username = username;
    this.country = country;
    this.about = about;
    this.website = website;
    this.profileImage = profileImage;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

    
  @JsonProperty("country")
  public Country getCountry() {
    return country;
  }
  public void setCountry(Country country) {
    this.country = country;
  }

    
  @JsonProperty("about")
  public String getAbout() {
    return about;
  }
  public void setAbout(String about) {
    this.about = about;
  }

    
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }
  public void setWebsite(String website) {
    this.website = website;
  }

    
  @JsonProperty("profile_image")
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
