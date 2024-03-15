package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * LinkedBusiness
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class LinkedBusiness {

  private String username;

  private String imageSmallUrl;

  private String imageMediumUrl;

  private String imageLargeUrl;

  private String imageXlargeUrl;

  public LinkedBusiness username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Username
   * @return username
  */
  
  @Schema(name = "username", example = "username", description = "Username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public LinkedBusiness imageSmallUrl(String imageSmallUrl) {
    this.imageSmallUrl = imageSmallUrl;
    return this;
  }

  /**
   * image_small_url
   * @return imageSmallUrl
  */
  
  @Schema(name = "image_small_url", example = "https://www.example.com/dj23454f53dfk2324.jpg", description = "image_small_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_small_url")
  public String getImageSmallUrl() {
    return imageSmallUrl;
  }

  public void setImageSmallUrl(String imageSmallUrl) {
    this.imageSmallUrl = imageSmallUrl;
  }

  public LinkedBusiness imageMediumUrl(String imageMediumUrl) {
    this.imageMediumUrl = imageMediumUrl;
    return this;
  }

  /**
   * image_medium_url
   * @return imageMediumUrl
  */
  
  @Schema(name = "image_medium_url", example = "https://www.example.com/dj23454f53dfk2324.jpg", description = "image_medium_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_medium_url")
  public String getImageMediumUrl() {
    return imageMediumUrl;
  }

  public void setImageMediumUrl(String imageMediumUrl) {
    this.imageMediumUrl = imageMediumUrl;
  }

  public LinkedBusiness imageLargeUrl(String imageLargeUrl) {
    this.imageLargeUrl = imageLargeUrl;
    return this;
  }

  /**
   * image_large_url
   * @return imageLargeUrl
  */
  
  @Schema(name = "image_large_url", example = "https://www.example.com/dj23454f53dfk2324.jpg", description = "image_large_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_large_url")
  public String getImageLargeUrl() {
    return imageLargeUrl;
  }

  public void setImageLargeUrl(String imageLargeUrl) {
    this.imageLargeUrl = imageLargeUrl;
  }

  public LinkedBusiness imageXlargeUrl(String imageXlargeUrl) {
    this.imageXlargeUrl = imageXlargeUrl;
    return this;
  }

  /**
   * image_xlarge_url
   * @return imageXlargeUrl
  */
  
  @Schema(name = "image_xlarge_url", example = "https://www.example.com/dj23454f53dfk2324.jpg", description = "image_xlarge_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_xlarge_url")
  public String getImageXlargeUrl() {
    return imageXlargeUrl;
  }

  public void setImageXlargeUrl(String imageXlargeUrl) {
    this.imageXlargeUrl = imageXlargeUrl;
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
    return Objects.equals(this.username, linkedBusiness.username) &&
        Objects.equals(this.imageSmallUrl, linkedBusiness.imageSmallUrl) &&
        Objects.equals(this.imageMediumUrl, linkedBusiness.imageMediumUrl) &&
        Objects.equals(this.imageLargeUrl, linkedBusiness.imageLargeUrl) &&
        Objects.equals(this.imageXlargeUrl, linkedBusiness.imageXlargeUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, imageSmallUrl, imageMediumUrl, imageLargeUrl, imageXlargeUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedBusiness {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    imageSmallUrl: ").append(toIndentedString(imageSmallUrl)).append("\n");
    sb.append("    imageMediumUrl: ").append(toIndentedString(imageMediumUrl)).append("\n");
    sb.append("    imageLargeUrl: ").append(toIndentedString(imageLargeUrl)).append("\n");
    sb.append("    imageXlargeUrl: ").append(toIndentedString(imageXlargeUrl)).append("\n");
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

