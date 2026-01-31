package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LinkedBusiness   {
  
  private String imageLargeUrl;
  private String imageMediumUrl;
  private String imageSmallUrl;
  private String imageXlargeUrl;
  private String username;

  public LinkedBusiness () {

  }

  public LinkedBusiness (String imageLargeUrl, String imageMediumUrl, String imageSmallUrl, String imageXlargeUrl, String username) {
    this.imageLargeUrl = imageLargeUrl;
    this.imageMediumUrl = imageMediumUrl;
    this.imageSmallUrl = imageSmallUrl;
    this.imageXlargeUrl = imageXlargeUrl;
    this.username = username;
  }

    
  @JsonProperty("image_large_url")
  public String getImageLargeUrl() {
    return imageLargeUrl;
  }
  public void setImageLargeUrl(String imageLargeUrl) {
    this.imageLargeUrl = imageLargeUrl;
  }

    
  @JsonProperty("image_medium_url")
  public String getImageMediumUrl() {
    return imageMediumUrl;
  }
  public void setImageMediumUrl(String imageMediumUrl) {
    this.imageMediumUrl = imageMediumUrl;
  }

    
  @JsonProperty("image_small_url")
  public String getImageSmallUrl() {
    return imageSmallUrl;
  }
  public void setImageSmallUrl(String imageSmallUrl) {
    this.imageSmallUrl = imageSmallUrl;
  }

    
  @JsonProperty("image_xlarge_url")
  public String getImageXlargeUrl() {
    return imageXlargeUrl;
  }
  public void setImageXlargeUrl(String imageXlargeUrl) {
    this.imageXlargeUrl = imageXlargeUrl;
  }

    
  @JsonProperty("username")
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
    return Objects.equals(imageLargeUrl, linkedBusiness.imageLargeUrl) &&
        Objects.equals(imageMediumUrl, linkedBusiness.imageMediumUrl) &&
        Objects.equals(imageSmallUrl, linkedBusiness.imageSmallUrl) &&
        Objects.equals(imageXlargeUrl, linkedBusiness.imageXlargeUrl) &&
        Objects.equals(username, linkedBusiness.username);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
