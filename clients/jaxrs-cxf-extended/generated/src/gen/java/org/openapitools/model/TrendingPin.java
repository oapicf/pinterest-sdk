package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Pin image data for trending topics
 */
@ApiModel(description="Pin image data for trending topics")

public class TrendingPin  {
  
 /**
  * Dominant color of the pin image in hex format
  */
  @ApiModelProperty(required = true, value = "Dominant color of the pin image in hex format")
  private String color;

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
  * The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.
  */
  @ApiModelProperty(value = "The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.")
  private Double verticalOffset;

 /**
  * Width of the pin image in pixels
  */
  @ApiModelProperty(required = true, value = "Width of the pin image in pixels")
  private Integer width;
 /**
  * Dominant color of the pin image in hex format
  * @return color
  */
  @JsonProperty("color")
  @NotNull
  public String getColor() {
    return color;
  }

  /**
   * Sets the <code>color</code> property.
   */
 public void setColor(String color) {
    this.color = color;
  }

  /**
   * Sets the <code>color</code> property.
   */
  public TrendingPin color(String color) {
    this.color = color;
    return this;
  }

 /**
  * Height of the pin image in pixels
  * @return height
  */
  @JsonProperty("height")
  @NotNull
  public Integer getHeight() {
    return height;
  }

  /**
   * Sets the <code>height</code> property.
   */
 public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * Sets the <code>height</code> property.
   */
  public TrendingPin height(Integer height) {
    this.height = height;
    return this;
  }

 /**
  * Unique identifier for the pin
  * @return id
  */
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public TrendingPin id(String id) {
    this.id = id;
    return this;
  }

 /**
  * URL of the pin image
  * @return src
  */
  @JsonProperty("src")
  @NotNull
  public String getSrc() {
    return src;
  }

  /**
   * Sets the <code>src</code> property.
   */
 public void setSrc(String src) {
    this.src = src;
  }

  /**
   * Sets the <code>src</code> property.
   */
  public TrendingPin src(String src) {
    this.src = src;
    return this;
  }

 /**
  * The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.
  * @return verticalOffset
  */
  @JsonProperty("vertical_offset")
  public Double getVerticalOffset() {
    return verticalOffset;
  }

  /**
   * Sets the <code>verticalOffset</code> property.
   */
 public void setVerticalOffset(Double verticalOffset) {
    this.verticalOffset = verticalOffset;
  }

  /**
   * Sets the <code>verticalOffset</code> property.
   */
  public TrendingPin verticalOffset(Double verticalOffset) {
    this.verticalOffset = verticalOffset;
    return this;
  }

 /**
  * Width of the pin image in pixels
  * @return width
  */
  @JsonProperty("width")
  @NotNull
  public Integer getWidth() {
    return width;
  }

  /**
   * Sets the <code>width</code> property.
   */
 public void setWidth(Integer width) {
    this.width = width;
  }

  /**
   * Sets the <code>width</code> property.
   */
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
    return Objects.equals(this.color, trendingPin.color) &&
        Objects.equals(this.height, trendingPin.height) &&
        Objects.equals(this.id, trendingPin.id) &&
        Objects.equals(this.src, trendingPin.src) &&
        Objects.equals(this.verticalOffset, trendingPin.verticalOffset) &&
        Objects.equals(this.width, trendingPin.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, height, id, src, verticalOffset, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingPin {\n");
    
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    src: ").append(toIndentedString(src)).append("\n");
    sb.append("    verticalOffset: ").append(toIndentedString(verticalOffset)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

