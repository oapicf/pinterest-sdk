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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-01-31T04:52:33.064583645Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TrendingPin   {
  @JsonProperty("height")
  private Integer height;

  @JsonProperty("id")
  private String id;

  @JsonProperty("src")
  private String src;

  @JsonProperty("width")
  private Integer width;

  public TrendingPin height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Height of the pin image in pixels
   * @return height
  **/
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
  **/
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
  **/
  @ApiModelProperty(required = true, value = "URL of the pin image")
  public String getSrc() {
    return src;
  }

  public void setSrc(String src) {
    this.src = src;
  }

  public TrendingPin width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Width of the pin image in pixels
   * @return width
  **/
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

