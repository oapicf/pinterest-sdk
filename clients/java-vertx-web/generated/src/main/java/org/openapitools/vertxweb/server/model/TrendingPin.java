package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Pin image data for trending topics
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrendingPin   {
  
  private String color;
  private Integer height;
  private String id;
  private String src;
  private Double verticalOffset;
  private Integer width;

  public TrendingPin () {

  }

  public TrendingPin (String color, Integer height, String id, String src, Double verticalOffset, Integer width) {
    this.color = color;
    this.height = height;
    this.id = id;
    this.src = src;
    this.verticalOffset = verticalOffset;
    this.width = width;
  }

    
  @JsonProperty("color")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }

    
  @JsonProperty("height")
  public Integer getHeight() {
    return height;
  }
  public void setHeight(Integer height) {
    this.height = height;
  }

    
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

    
  @JsonProperty("src")
  public String getSrc() {
    return src;
  }
  public void setSrc(String src) {
    this.src = src;
  }

    
  @JsonProperty("vertical_offset")
  public Double getVerticalOffset() {
    return verticalOffset;
  }
  public void setVerticalOffset(Double verticalOffset) {
    this.verticalOffset = verticalOffset;
  }

    
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
