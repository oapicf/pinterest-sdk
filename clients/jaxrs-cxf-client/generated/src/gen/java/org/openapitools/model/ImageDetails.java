package org.openapitools.model;


import io.swagger.annotations.ApiModelProperty;
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
  public Integer getWidth() {
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
  public Integer getHeight() {
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

