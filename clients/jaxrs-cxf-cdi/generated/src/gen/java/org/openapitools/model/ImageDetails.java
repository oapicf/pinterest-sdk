package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;



public class ImageDetails   {
  
  private Integer width;

  private Integer height;

  private String url;


  /**
   * minimum: 100
   **/
  public ImageDetails width(Integer width) {
    this.width = width;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("width")
  @NotNull
 @Min(100)  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
  }


  /**
   * minimum: 100
   **/
  public ImageDetails height(Integer height) {
    this.height = height;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("height")
  @NotNull
 @Min(100)  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }


  /**
   **/
  public ImageDetails url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("url")
  @NotNull
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
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
    return Objects.equals(width, imageDetails.width) &&
        Objects.equals(height, imageDetails.height) &&
        Objects.equals(url, imageDetails.url);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

