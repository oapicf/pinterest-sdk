package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.Country;
import org.openapitools.model.ImageBase64;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * BrandAccountsUpdateRequest
 */

@JsonTypeName("brand_accounts_update_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-01-31T05:12:58.482218752Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class BrandAccountsUpdateRequest {

  private @Nullable String name;

  private @Nullable String username;

  private @Nullable Country country;

  private @Nullable String about;

  private @Nullable String website;

  private @Nullable ImageBase64 profileImage;

  public BrandAccountsUpdateRequest name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Brand Account name
   * @return name
   */
  
  @Schema(name = "name", example = "Canada Stores", description = "Brand Account name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  public void setName(@Nullable String name) {
    this.name = name;
  }

  public BrandAccountsUpdateRequest username(@Nullable String username) {
    this.username = username;
    return this;
  }

  /**
   * Brand Account username
   * @return username
   */
  
  @Schema(name = "username", example = "canada_stores", description = "Brand Account username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public @Nullable String getUsername() {
    return username;
  }

  public void setUsername(@Nullable String username) {
    this.username = username;
  }

  public BrandAccountsUpdateRequest country(@Nullable Country country) {
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

  public void setCountry(@Nullable Country country) {
    this.country = country;
  }

  public BrandAccountsUpdateRequest about(@Nullable String about) {
    this.about = about;
    return this;
  }

  /**
   * Brand Account about information
   * @return about
   */
  
  @Schema(name = "about", example = "Stores in Canada", description = "Brand Account about information", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("about")
  public @Nullable String getAbout() {
    return about;
  }

  public void setAbout(@Nullable String about) {
    this.about = about;
  }

  public BrandAccountsUpdateRequest website(@Nullable String website) {
    this.website = website;
    return this;
  }

  /**
   * Brand Account website
   * @return website
   */
  
  @Schema(name = "website", example = "https://www.example.com", description = "Brand Account website", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("website")
  public @Nullable String getWebsite() {
    return website;
  }

  public void setWebsite(@Nullable String website) {
    this.website = website;
  }

  public BrandAccountsUpdateRequest profileImage(@Nullable ImageBase64 profileImage) {
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
  public @Nullable ImageBase64 getProfileImage() {
    return profileImage;
  }

  public void setProfileImage(@Nullable ImageBase64 profileImage) {
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
    return Objects.equals(this.name, brandAccountsUpdateRequest.name) &&
        Objects.equals(this.username, brandAccountsUpdateRequest.username) &&
        Objects.equals(this.country, brandAccountsUpdateRequest.country) &&
        Objects.equals(this.about, brandAccountsUpdateRequest.about) &&
        Objects.equals(this.website, brandAccountsUpdateRequest.website) &&
        Objects.equals(this.profileImage, brandAccountsUpdateRequest.profileImage);
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

