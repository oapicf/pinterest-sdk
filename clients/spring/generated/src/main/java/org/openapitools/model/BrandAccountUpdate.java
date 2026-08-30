package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.BrandAccountProfileImageUpdate;
import org.openapitools.model.Country;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create or update operation model.
 */

@Schema(name = "BrandAccountUpdate", description = "Resource create or update operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BrandAccountUpdate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String about;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Country country;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String name;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable BrandAccountProfileImageUpdate profileImage;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String username;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String website;

  public BrandAccountUpdate about(@Nullable String about) {
    this.about = about;
    return this;
  }

  /**
   * Brand Account about information
   * @return about
   */
  
  @Schema(name = "about", description = "Brand Account about information", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("about")
  public @Nullable String getAbout() {
    return about;
  }

  @JsonProperty("about")
  public void setAbout(@Nullable String about) {
    this.about = about;
  }

  public BrandAccountUpdate country(@Nullable Country country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   */
  @Valid 
  @Schema(name = "country", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("country")
  public @Nullable Country getCountry() {
    return country;
  }

  @JsonProperty("country")
  public void setCountry(@Nullable Country country) {
    this.country = country;
  }

  public BrandAccountUpdate name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Brand Account name
   * @return name
   */
  
  @Schema(name = "name", description = "Brand Account name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  public BrandAccountUpdate profileImage(@Nullable BrandAccountProfileImageUpdate profileImage) {
    this.profileImage = profileImage;
    return this;
  }

  /**
   * Get profileImage
   * @return profileImage
   */
  @Valid 
  @Schema(name = "profile_image", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profile_image")
  public @Nullable BrandAccountProfileImageUpdate getProfileImage() {
    return profileImage;
  }

  @JsonProperty("profile_image")
  public void setProfileImage(@Nullable BrandAccountProfileImageUpdate profileImage) {
    this.profileImage = profileImage;
  }

  public BrandAccountUpdate username(@Nullable String username) {
    this.username = username;
    return this;
  }

  /**
   * Brand Account username
   * @return username
   */
  
  @Schema(name = "username", description = "Brand Account username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public @Nullable String getUsername() {
    return username;
  }

  @JsonProperty("username")
  public void setUsername(@Nullable String username) {
    this.username = username;
  }

  public BrandAccountUpdate website(@Nullable String website) {
    this.website = website;
    return this;
  }

  /**
   * Brand Account website
   * @return website
   */
  
  @Schema(name = "website", description = "Brand Account website", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("website")
  public @Nullable String getWebsite() {
    return website;
  }

  @JsonProperty("website")
  public void setWebsite(@Nullable String website) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

