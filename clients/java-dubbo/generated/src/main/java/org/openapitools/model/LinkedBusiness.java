package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class LinkedBusiness implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * image_large_url
   */
  @JsonProperty("image_large_url")
  private String imageLargeUrl;

  /**
   * image_medium_url
   */
  @JsonProperty("image_medium_url")
  private String imageMediumUrl;

  /**
   * image_small_url
   */
  @JsonProperty("image_small_url")
  private String imageSmallUrl;

  /**
   * image_xlarge_url
   */
  @JsonProperty("image_xlarge_url")
  private String imageXlargeUrl;

  /**
   * Username
   */
  @JsonProperty("username")
  private String username;

  /**
   * image_large_url
   * @return imageLargeUrl
   */
  public String getImageLargeUrl() {
    return imageLargeUrl;
  }

  public void setImageLargeUrl(String imageLargeUrl) {
    this.imageLargeUrl = imageLargeUrl;
  }

  /**
   * image_medium_url
   * @return imageMediumUrl
   */
  public String getImageMediumUrl() {
    return imageMediumUrl;
  }

  public void setImageMediumUrl(String imageMediumUrl) {
    this.imageMediumUrl = imageMediumUrl;
  }

  /**
   * image_small_url
   * @return imageSmallUrl
   */
  public String getImageSmallUrl() {
    return imageSmallUrl;
  }

  public void setImageSmallUrl(String imageSmallUrl) {
    this.imageSmallUrl = imageSmallUrl;
  }

  /**
   * image_xlarge_url
   * @return imageXlargeUrl
   */
  public String getImageXlargeUrl() {
    return imageXlargeUrl;
  }

  public void setImageXlargeUrl(String imageXlargeUrl) {
    this.imageXlargeUrl = imageXlargeUrl;
  }

  /**
   * Username
   * @return username
   */
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
