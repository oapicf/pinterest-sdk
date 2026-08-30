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



@JsonTypeName("ImageDetails")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ImageDetails   {
  private Integer height;
  private String url;
  private Integer width;

  public ImageDetails() {
  }

  @JsonCreator
  public ImageDetails(
    @JsonProperty(required = true, value = "height") Integer height,
    @JsonProperty(required = true, value = "url") String url,
    @JsonProperty(required = true, value = "width") Integer width
  ) {
    this.height = height;
    this.url = url;
    this.width = width;
  }

  /**
   **/
  public ImageDetails height(Integer height) {
    this.height = height;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "height")
  @NotNull public Integer getHeight() {
    return height;
  }

  @JsonProperty(required = true, value = "height")
  public void setHeight(Integer height) {
    this.height = height;
  }

  /**
   **/
  public ImageDetails url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "url")
  @NotNull public String getUrl() {
    return url;
  }

  @JsonProperty(required = true, value = "url")
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   **/
  public ImageDetails width(Integer width) {
    this.width = width;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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
    ImageDetails imageDetails = (ImageDetails) o;
    return Objects.equals(this.height, imageDetails.height) &&
        Objects.equals(this.url, imageDetails.url) &&
        Objects.equals(this.width, imageDetails.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, url, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageDetails {\n");
    
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
