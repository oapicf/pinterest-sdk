package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ImageDetails;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ImageMetadataImages  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ImageDetails _150x150;

  @ApiModelProperty(value = "")
  @Valid
  private ImageDetails _400x300;

  @ApiModelProperty(value = "")
  @Valid
  private ImageDetails _600x;

  @ApiModelProperty(value = "")
  @Valid
  private ImageDetails _1200x;
 /**
   * Get _150x150
   * @return _150x150
  **/
  @JsonProperty("150x150")
  public ImageDetails get150x150() {
    return _150x150;
  }

  public void set150x150(ImageDetails _150x150) {
    this._150x150 = _150x150;
  }

  public ImageMetadataImages _150x150(ImageDetails _150x150) {
    this._150x150 = _150x150;
    return this;
  }

 /**
   * Get _400x300
   * @return _400x300
  **/
  @JsonProperty("400x300")
  public ImageDetails get400x300() {
    return _400x300;
  }

  public void set400x300(ImageDetails _400x300) {
    this._400x300 = _400x300;
  }

  public ImageMetadataImages _400x300(ImageDetails _400x300) {
    this._400x300 = _400x300;
    return this;
  }

 /**
   * Get _600x
   * @return _600x
  **/
  @JsonProperty("600x")
  public ImageDetails get600x() {
    return _600x;
  }

  public void set600x(ImageDetails _600x) {
    this._600x = _600x;
  }

  public ImageMetadataImages _600x(ImageDetails _600x) {
    this._600x = _600x;
    return this;
  }

 /**
   * Get _1200x
   * @return _1200x
  **/
  @JsonProperty("1200x")
  public ImageDetails get1200x() {
    return _1200x;
  }

  public void set1200x(ImageDetails _1200x) {
    this._1200x = _1200x;
  }

  public ImageMetadataImages _1200x(ImageDetails _1200x) {
    this._1200x = _1200x;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageMetadataImages imageMetadataImages = (ImageMetadataImages) o;
    return Objects.equals(this._150x150, imageMetadataImages._150x150) &&
        Objects.equals(this._400x300, imageMetadataImages._400x300) &&
        Objects.equals(this._600x, imageMetadataImages._600x) &&
        Objects.equals(this._1200x, imageMetadataImages._1200x);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_150x150, _400x300, _600x, _1200x);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageMetadataImages {\n");
    
    sb.append("    _150x150: ").append(toIndentedString(_150x150)).append("\n");
    sb.append("    _400x300: ").append(toIndentedString(_400x300)).append("\n");
    sb.append("    _600x: ").append(toIndentedString(_600x)).append("\n");
    sb.append("    _1200x: ").append(toIndentedString(_1200x)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

