package apimodels;

import apimodels.ImageDetails;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ImageSize
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ImageSize   {
  @JsonProperty("1200x")
  @Valid

  private ImageDetails _1200x;

  @JsonProperty("150x150")
  @Valid

  private ImageDetails _150x150;

  @JsonProperty("400x300")
  @Valid

  private ImageDetails _400x300;

  @JsonProperty("600x")
  @Valid

  private ImageDetails _600x;

  public ImageSize _1200x(ImageDetails _1200x) {
    this._1200x = _1200x;
    return this;
  }

   /**
   * Get _1200x
   * @return _1200x
  **/
  public ImageDetails get1200x() {
    return _1200x;
  }

  public void set1200x(ImageDetails _1200x) {
    this._1200x = _1200x;
  }

  public ImageSize _150x150(ImageDetails _150x150) {
    this._150x150 = _150x150;
    return this;
  }

   /**
   * Get _150x150
   * @return _150x150
  **/
  public ImageDetails get150x150() {
    return _150x150;
  }

  public void set150x150(ImageDetails _150x150) {
    this._150x150 = _150x150;
  }

  public ImageSize _400x300(ImageDetails _400x300) {
    this._400x300 = _400x300;
    return this;
  }

   /**
   * Get _400x300
   * @return _400x300
  **/
  public ImageDetails get400x300() {
    return _400x300;
  }

  public void set400x300(ImageDetails _400x300) {
    this._400x300 = _400x300;
  }

  public ImageSize _600x(ImageDetails _600x) {
    this._600x = _600x;
    return this;
  }

   /**
   * Get _600x
   * @return _600x
  **/
  public ImageDetails get600x() {
    return _600x;
  }

  public void set600x(ImageDetails _600x) {
    this._600x = _600x;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageSize imageSize = (ImageSize) o;
    return Objects.equals(_1200x, imageSize._1200x) &&
        Objects.equals(_150x150, imageSize._150x150) &&
        Objects.equals(_400x300, imageSize._400x300) &&
        Objects.equals(_600x, imageSize._600x);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_1200x, _150x150, _400x300, _600x);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSize {\n");
    
    sb.append("    _1200x: ").append(toIndentedString(_1200x)).append("\n");
    sb.append("    _150x150: ").append(toIndentedString(_150x150)).append("\n");
    sb.append("    _400x300: ").append(toIndentedString(_400x300)).append("\n");
    sb.append("    _600x: ").append(toIndentedString(_600x)).append("\n");
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

