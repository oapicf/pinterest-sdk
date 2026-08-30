package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Pin image data for trending topics
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Pin image data for trending topics")
public class TrendingPin   {
  
  private String color;

  private Integer height;

  private String id;

  private String src;

  private Double verticalOffset;

  private Integer width;

  /**
   * Dominant color of the pin image in hex format
   **/
  public TrendingPin color(String color) {
    this.color = color;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Dominant color of the pin image in hex format")
  @JsonProperty("color")
  @NotNull
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }


  /**
   * Height of the pin image in pixels
   **/
  public TrendingPin height(Integer height) {
    this.height = height;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Height of the pin image in pixels")
  @JsonProperty("height")
  @NotNull
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }


  /**
   * Unique identifier for the pin
   **/
  public TrendingPin id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier for the pin")
  @JsonProperty("id")
  @NotNull
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * URL of the pin image
   **/
  public TrendingPin src(String src) {
    this.src = src;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "URL of the pin image")
  @JsonProperty("src")
  @NotNull
  public String getSrc() {
    return src;
  }
  public void setSrc(String src) {
    this.src = src;
  }


  /**
   * The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.
   **/
  public TrendingPin verticalOffset(Double verticalOffset) {
    this.verticalOffset = verticalOffset;
    return this;
  }

  
  @ApiModelProperty(value = "The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.")
  @JsonProperty("vertical_offset")
  public Double getVerticalOffset() {
    return verticalOffset;
  }
  public void setVerticalOffset(Double verticalOffset) {
    this.verticalOffset = verticalOffset;
  }


  /**
   * Width of the pin image in pixels
   **/
  public TrendingPin width(Integer width) {
    this.width = width;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Width of the pin image in pixels")
  @JsonProperty("width")
  @NotNull
  public Integer getWidth() {
    return width;
  }
  public void setWidth(Integer width) {
    this.width = width;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

