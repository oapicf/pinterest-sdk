package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Pin image data for trending topics
 */

@Schema(name = "TrendingPin", description = "Pin image data for trending topics")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TrendingPin {

  private String color;

  private Integer height;

  private String id;

  private String src;

  private Double verticalOffset;

  private Integer width;

  public TrendingPin() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrendingPin(String color, Integer height, String id, String src, Integer width) {
    this.color = color;
    this.height = height;
    this.id = id;
    this.src = src;
    this.width = width;
  }

  public TrendingPin color(String color) {
    this.color = color;
    return this;
  }

  /**
   * Dominant color of the pin image in hex format
   * @return color
   */
  @NotNull 
  @Schema(name = "color", description = "Dominant color of the pin image in hex format", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("color")
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
  @NotNull 
  @Schema(name = "height", description = "Height of the pin image in pixels", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("height")
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
  @NotNull 
  @Schema(name = "id", description = "Unique identifier for the pin", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
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
  @NotNull 
  @Schema(name = "src", description = "URL of the pin image", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("src")
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
  
  @Schema(name = "vertical_offset", description = "The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vertical_offset")
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
  @NotNull 
  @Schema(name = "width", description = "Width of the pin image in pixels", requiredMode = Schema.RequiredMode.REQUIRED)
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

