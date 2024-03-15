package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LinkedBusiness   {
  
  private String username;
  private String imageSmallUrl;
  private String imageMediumUrl;
  private String imageLargeUrl;
  private String imageXlargeUrl;

  public LinkedBusiness () {

  }

  public LinkedBusiness (String username, String imageSmallUrl, String imageMediumUrl, String imageLargeUrl, String imageXlargeUrl) {
    this.username = username;
    this.imageSmallUrl = imageSmallUrl;
    this.imageMediumUrl = imageMediumUrl;
    this.imageLargeUrl = imageLargeUrl;
    this.imageXlargeUrl = imageXlargeUrl;
  }

    
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

    
  @JsonProperty("image_small_url")
  public String getImageSmallUrl() {
    return imageSmallUrl;
  }
  public void setImageSmallUrl(String imageSmallUrl) {
    this.imageSmallUrl = imageSmallUrl;
  }

    
  @JsonProperty("image_medium_url")
  public String getImageMediumUrl() {
    return imageMediumUrl;
  }
  public void setImageMediumUrl(String imageMediumUrl) {
    this.imageMediumUrl = imageMediumUrl;
  }

    
  @JsonProperty("image_large_url")
  public String getImageLargeUrl() {
    return imageLargeUrl;
  }
  public void setImageLargeUrl(String imageLargeUrl) {
    this.imageLargeUrl = imageLargeUrl;
  }

    
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
    return Objects.equals(username, linkedBusiness.username) &&
        Objects.equals(imageSmallUrl, linkedBusiness.imageSmallUrl) &&
        Objects.equals(imageMediumUrl, linkedBusiness.imageMediumUrl) &&
        Objects.equals(imageLargeUrl, linkedBusiness.imageLargeUrl) &&
        Objects.equals(imageXlargeUrl, linkedBusiness.imageXlargeUrl);
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
