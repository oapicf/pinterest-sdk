/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Pin image data for trending topics
 */

@ApiModel(description = "Pin image data for trending topics")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TrendingPin   {
  
  private String color;
  private Integer height;
  private String id;
  private String src;
  private Double verticalOffset;
  private Integer width;

  /**
   * Dominant color of the pin image in hex format
   */
  public TrendingPin color(String color) {
    this.color = color;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Dominant color of the pin image in hex format")
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  /**
   * Height of the pin image in pixels
   */
  public TrendingPin height(Integer height) {
    this.height = height;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Height of the pin image in pixels")
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   * Unique identifier for the pin
   */
  public TrendingPin id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Unique identifier for the pin")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * URL of the pin image
   */
  public TrendingPin src(String src) {
    this.src = src;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "URL of the pin image")
  @JsonProperty("src")
  public String getSrc() {
    return src;
  }
  public void setSrc(String src) {
    this.src = src;
  }

  /**
   * The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.
   */
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
   */
  public TrendingPin width(Integer width) {
    this.width = width;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Width of the pin image in pixels")
  @JsonProperty("width")
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
    return Objects.equals(color, trendingPin.color) &&
        Objects.equals(height, trendingPin.height) &&
        Objects.equals(id, trendingPin.id) &&
        Objects.equals(src, trendingPin.src) &&
        Objects.equals(verticalOffset, trendingPin.verticalOffset) &&
        Objects.equals(width, trendingPin.width);
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

