package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BrandAccountProfileImage;
import org.openapitools.model.Country;



/**
 * Resource create operation model.
 **/

@ApiModel(description = "Resource create operation model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BrandAccountCreate   {
  @JsonProperty("about")
  private String about;

  @JsonProperty("country")
  private Country country;

  @JsonProperty("name")
  private String name;

  @JsonProperty("profile_image")
  private BrandAccountProfileImage profileImage;

  @JsonProperty("username")
  private String username;

  @JsonProperty("website")
  private String website;

  /**
   * Brand Account about information
   **/
  public BrandAccountCreate about(String about) {
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
  public BrandAccountCreate country(Country country) {
    this.country = country;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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
  public BrandAccountCreate name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Brand Account name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public BrandAccountCreate profileImage(BrandAccountProfileImage profileImage) {
    this.profileImage = profileImage;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("profile_image")
  public BrandAccountProfileImage getProfileImage() {
    return profileImage;
  }
  public void setProfileImage(BrandAccountProfileImage profileImage) {
    this.profileImage = profileImage;
  }

  /**
   * Brand Account username
   **/
  public BrandAccountCreate username(String username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Brand Account username")
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
  public BrandAccountCreate website(String website) {
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

