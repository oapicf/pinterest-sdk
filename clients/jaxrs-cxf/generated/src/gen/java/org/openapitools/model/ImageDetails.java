package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ImageDetails  {
  
  @ApiModelProperty(required = true, value = "")
  private Integer width;

  @ApiModelProperty(required = true, value = "")
  private Integer height;

  @ApiModelProperty(required = true, value = "")
  private String url;
 /**
   * Get width
   * minimum: 100
   * @return width
  **/
  @JsonProperty("width")
  @NotNull
 @Min(100)  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public ImageDetails width(Integer width) {
    this.width = width;
    return this;
  }

 /**
   * Get height
   * minimum: 100
   * @return height
  **/
  @JsonProperty("height")
  @NotNull
 @Min(100)  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public ImageDetails height(Integer height) {
    this.height = height;
    return this;
  }

 /**
   * Get url
   * @return url
  **/
  @JsonProperty("url")
  @NotNull
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ImageDetails url(String url) {
    this.url = url;
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
    ImageDetails imageDetails = (ImageDetails) o;
    return Objects.equals(this.width, imageDetails.width) &&
        Objects.equals(this.height, imageDetails.height) &&
        Objects.equals(this.url, imageDetails.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageDetails {\n");
    
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

