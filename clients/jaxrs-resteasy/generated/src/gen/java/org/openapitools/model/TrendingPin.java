package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Pin image data for trending topics")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-31T04:54:58.059572557Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TrendingPin   {
  
  private Integer height;
  private String id;
  private String src;
  private Integer width;

  /**
   * Height of the pin image in pixels
   **/
  
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
   * Width of the pin image in pixels
   **/
  
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

