package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Pin image data for trending topics
 */
@ApiModel(description = "Pin image data for trending topics")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TrendingPin   {
  @JsonProperty("color")
  private String color;

  @JsonProperty("height")
  private Integer height;

  @JsonProperty("id")
  private String id;

  @JsonProperty("src")
  private String src;

  @JsonProperty("vertical_offset")
  private Double verticalOffset;

  @JsonProperty("width")
  private Integer width;

  public TrendingPin color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Dominant color of the pin image in hex format
   * @return color
   */
  @ApiModelProperty(required = true, value = "Dominant color of the pin image in hex format")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public TrendingPin height(Integer height) {
    this.height = height;
    return this;
  }

  /**
   * Height of the pin image in pixels
   * @return height
   */
  @ApiModelProperty(required = true, value = "Height of the pin image in pixels")
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public TrendingPin id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier for the pin
   * @return id
   */
  @ApiModelProperty(required = true, value = "Unique identifier for the pin")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TrendingPin src(String src) {
    this.src = src;
    return this;
  }

  /**
   * URL of the pin image
   * @return src
   */
  @ApiModelProperty(required = true, value = "URL of the pin image")
  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  public TrendingPin verticalOffset(Double verticalOffset) {
    this.verticalOffset = verticalOffset;
    return this;
  }

  /**
   * The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.
   * @return verticalOffset
   */
  @ApiModelProperty(value = "The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.")
  public Double getVerticalOffset() {
    return verticalOffset;
  }

  public void setVerticalOffset(Double verticalOffset) {
    this.verticalOffset = verticalOffset;
  }

  public TrendingPin width(Integer width) {
    this.width = width;
    return this;
  }

  /**
   * Width of the pin image in pixels
   * @return width
   */
  @ApiModelProperty(required = true, value = "Width of the pin image in pixels")
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

