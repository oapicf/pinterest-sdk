package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * LinkedBusiness
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class LinkedBusiness {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String imageLargeUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String imageMediumUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String imageSmallUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String imageXlargeUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String username;

  public LinkedBusiness imageLargeUrl(@Nullable String imageLargeUrl) {
    this.imageLargeUrl = imageLargeUrl;
    return this;
  }

  /**
   * image_large_url
   * @return imageLargeUrl
   */
  
  @Schema(name = "image_large_url", example = "https://www.example.com/dj23454f53dfk2324.jpg", description = "image_large_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_large_url")
  public @Nullable String getImageLargeUrl() {
    return imageLargeUrl;
  }

  @JsonProperty("image_large_url")
  public void setImageLargeUrl(@Nullable String imageLargeUrl) {
    this.imageLargeUrl = imageLargeUrl;
  }

  public LinkedBusiness imageMediumUrl(@Nullable String imageMediumUrl) {
    this.imageMediumUrl = imageMediumUrl;
    return this;
  }

  /**
   * image_medium_url
   * @return imageMediumUrl
   */
  
  @Schema(name = "image_medium_url", example = "https://www.example.com/dj23454f53dfk2324.jpg", description = "image_medium_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_medium_url")
  public @Nullable String getImageMediumUrl() {
    return imageMediumUrl;
  }

  @JsonProperty("image_medium_url")
  public void setImageMediumUrl(@Nullable String imageMediumUrl) {
    this.imageMediumUrl = imageMediumUrl;
  }

  public LinkedBusiness imageSmallUrl(@Nullable String imageSmallUrl) {
    this.imageSmallUrl = imageSmallUrl;
    return this;
  }

  /**
   * image_small_url
   * @return imageSmallUrl
   */
  
  @Schema(name = "image_small_url", example = "https://www.example.com/dj23454f53dfk2324.jpg", description = "image_small_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_small_url")
  public @Nullable String getImageSmallUrl() {
    return imageSmallUrl;
  }

  @JsonProperty("image_small_url")
  public void setImageSmallUrl(@Nullable String imageSmallUrl) {
    this.imageSmallUrl = imageSmallUrl;
  }

  public LinkedBusiness imageXlargeUrl(@Nullable String imageXlargeUrl) {
    this.imageXlargeUrl = imageXlargeUrl;
    return this;
  }

  /**
   * image_xlarge_url
   * @return imageXlargeUrl
   */
  
  @Schema(name = "image_xlarge_url", example = "https://www.example.com/dj23454f53dfk2324.jpg", description = "image_xlarge_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_xlarge_url")
  public @Nullable String getImageXlargeUrl() {
    return imageXlargeUrl;
  }

  @JsonProperty("image_xlarge_url")
  public void setImageXlargeUrl(@Nullable String imageXlargeUrl) {
    this.imageXlargeUrl = imageXlargeUrl;
  }

  public LinkedBusiness username(@Nullable String username) {
    this.username = username;
    return this;
  }

  /**
   * Username
   * @return username
   */
  
  @Schema(name = "username", example = "username", description = "Username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public @Nullable String getUsername() {
    return username;
  }

  @JsonProperty("username")
  public void setUsername(@Nullable String username) {
    this.username = username;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedBusiness linkedBusiness = (LinkedBusiness) o;
    return Objects.equals(this.imageLargeUrl, linkedBusiness.imageLargeUrl) &&
        Objects.equals(this.imageMediumUrl, linkedBusiness.imageMediumUrl) &&
        Objects.equals(this.imageSmallUrl, linkedBusiness.imageSmallUrl) &&
        Objects.equals(this.imageXlargeUrl, linkedBusiness.imageXlargeUrl) &&
        Objects.equals(this.username, linkedBusiness.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageLargeUrl, imageMediumUrl, imageSmallUrl, imageXlargeUrl, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedBusiness {\n");
    sb.append("    imageLargeUrl: ").append(toIndentedString(imageLargeUrl)).append("\n");
    sb.append("    imageMediumUrl: ").append(toIndentedString(imageMediumUrl)).append("\n");
    sb.append("    imageSmallUrl: ").append(toIndentedString(imageSmallUrl)).append("\n");
    sb.append("    imageXlargeUrl: ").append(toIndentedString(imageXlargeUrl)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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

