package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Pin image data for trending topics
 */
@ApiModel(description="Pin image data for trending topics")

public class TrendingPin  {
  
 /**
  * Height of the pin image in pixels
  */
  @ApiModelProperty(required = true, value = "Height of the pin image in pixels")

  private Integer height;

 /**
  * Unique identifier for the pin
  */
  @ApiModelProperty(required = true, value = "Unique identifier for the pin")

  private String id;

 /**
  * URL of the pin image
  */
  @ApiModelProperty(required = true, value = "URL of the pin image")

  private String src;

 /**
  * Width of the pin image in pixels
  */
  @ApiModelProperty(required = true, value = "Width of the pin image in pixels")

  private Integer width;
 /**
   * Height of the pin image in pixels
   * @return height
  **/
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public TrendingPin height(Integer height) {
    this.height = height;
    return this;
  }

 /**
   * Unique identifier for the pin
   * @return id
  **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TrendingPin id(String id) {
    this.id = id;
    return this;
  }

 /**
   * URL of the pin image
   * @return src
  **/
  @JsonProperty("src")
  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  public TrendingPin src(String src) {
    this.src = src;
    return this;
  }

 /**
   * Width of the pin image in pixels
   * @return width
  **/
  @JsonProperty("width")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public TrendingPin width(Integer width) {
    this.width = width;
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
    TrendingPin trendingPin = (TrendingPin) o;
    return Objects.equals(this.height, trendingPin.height) &&
        Objects.equals(this.id, trendingPin.id) &&
        Objects.equals(this.src, trendingPin.src) &&
        Objects.equals(this.width, trendingPin.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, id, src, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingPin {\n");
    
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

