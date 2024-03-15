package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class LinkedBusiness  {
  
  @ApiModelProperty(example = "username", value = "Username")
 /**
   * Username
  **/
  private String username;

  @ApiModelProperty(example = "https://www.example.com/dj23454f53dfk2324.jpg", value = "image_small_url")
 /**
   * image_small_url
  **/
  private String imageSmallUrl;

  @ApiModelProperty(example = "https://www.example.com/dj23454f53dfk2324.jpg", value = "image_medium_url")
 /**
   * image_medium_url
  **/
  private String imageMediumUrl;

  @ApiModelProperty(example = "https://www.example.com/dj23454f53dfk2324.jpg", value = "image_large_url")
 /**
   * image_large_url
  **/
  private String imageLargeUrl;

  @ApiModelProperty(example = "https://www.example.com/dj23454f53dfk2324.jpg", value = "image_xlarge_url")
 /**
   * image_xlarge_url
  **/
  private String imageXlargeUrl;
 /**
   * Username
   * @return username
  **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public LinkedBusiness username(String username) {
    this.username = username;
    return this;
  }

 /**
   * image_small_url
   * @return imageSmallUrl
  **/
  @JsonProperty("image_small_url")
  public String getImageSmallUrl() {
    return imageSmallUrl;
  }

  public void setImageSmallUrl(String imageSmallUrl) {
    this.imageSmallUrl = imageSmallUrl;
  }

  public LinkedBusiness imageSmallUrl(String imageSmallUrl) {
    this.imageSmallUrl = imageSmallUrl;
    return this;
  }

 /**
   * image_medium_url
   * @return imageMediumUrl
  **/
  @JsonProperty("image_medium_url")
  public String getImageMediumUrl() {
    return imageMediumUrl;
  }

  public void setImageMediumUrl(String imageMediumUrl) {
    this.imageMediumUrl = imageMediumUrl;
  }

  public LinkedBusiness imageMediumUrl(String imageMediumUrl) {
    this.imageMediumUrl = imageMediumUrl;
    return this;
  }

 /**
   * image_large_url
   * @return imageLargeUrl
  **/
  @JsonProperty("image_large_url")
  public String getImageLargeUrl() {
    return imageLargeUrl;
  }

  public void setImageLargeUrl(String imageLargeUrl) {
    this.imageLargeUrl = imageLargeUrl;
  }

  public LinkedBusiness imageLargeUrl(String imageLargeUrl) {
    this.imageLargeUrl = imageLargeUrl;
    return this;
  }

 /**
   * image_xlarge_url
   * @return imageXlargeUrl
  **/
  @JsonProperty("image_xlarge_url")
  public String getImageXlargeUrl() {
    return imageXlargeUrl;
  }

  public void setImageXlargeUrl(String imageXlargeUrl) {
    this.imageXlargeUrl = imageXlargeUrl;
  }

  public LinkedBusiness imageXlargeUrl(String imageXlargeUrl) {
    this.imageXlargeUrl = imageXlargeUrl;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

