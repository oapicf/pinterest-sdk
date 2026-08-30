package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Pin image data for trending topics
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TrendingPin   {
  @JsonProperty("color")
  @NotNull

  private String color;

  @JsonProperty("height")
  @NotNull

  private Integer height;

  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("src")
  @NotNull

  private String src;

  @JsonProperty("vertical_offset")
  
  private Double verticalOffset;

  @JsonProperty("width")
  @NotNull

  private Integer width;

  public TrendingPin color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Dominant color of the pin image in hex format
   * @return color
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

