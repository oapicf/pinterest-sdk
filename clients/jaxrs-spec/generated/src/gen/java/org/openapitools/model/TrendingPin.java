package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Pin image data for trending topics
 **/
@ApiModel(description = "Pin image data for trending topics")
@JsonTypeName("TrendingPin")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TrendingPin   {
  private Integer height;
  private String id;
  private String src;
  private Integer width;

  public TrendingPin() {
  }

  @JsonCreator
  public TrendingPin(
    @JsonProperty(required = true, value = "height") Integer height,
    @JsonProperty(required = true, value = "id") String id,
    @JsonProperty(required = true, value = "src") String src,
    @JsonProperty(required = true, value = "width") Integer width
  ) {
    this.height = height;
    this.id = id;
    this.src = src;
    this.width = width;
  }

  /**
   * Height of the pin image in pixels
   **/
  public TrendingPin height(Integer height) {
    this.height = height;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Height of the pin image in pixels")
  @JsonProperty(required = true, value = "height")
  @NotNull public Integer getHeight() {
    return height;
  }

  @JsonProperty(required = true, value = "height")
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
  @JsonProperty(required = true, value = "id")
  @NotNull public String getId() {
    return id;
  }

  @JsonProperty(required = true, value = "id")
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
  @JsonProperty(required = true, value = "src")
  @NotNull public String getSrc() {
    return src;
  }

  @JsonProperty(required = true, value = "src")
  public void setSrc(String src) {
    this.src = src;
  }

  /**
   * Width of the pin image in pixels
   **/
  public TrendingPin width(Integer width) {
    this.width = width;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Width of the pin image in pixels")
  @JsonProperty(required = true, value = "width")
  @NotNull public Integer getWidth() {
    return width;
  }

  @JsonProperty(required = true, value = "width")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

