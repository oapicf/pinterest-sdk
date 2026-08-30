package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class BoardMedia implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Board cover image
   */
  @JsonProperty("image_cover_url")
  private String imageCoverUrl;

  /**
   * Board pin thumbnail urls.
   */
  @JsonProperty("pin_thumbnail_urls")
  private List<String> pinThumbnailUrls = new ArrayList<>();

  /**
   * Board cover image
   * @return imageCoverUrl
   */
  public String getImageCoverUrl() {
    return imageCoverUrl;
  }

  public void setImageCoverUrl(String imageCoverUrl) {
    this.imageCoverUrl = imageCoverUrl;
  }

  /**
   * Board pin thumbnail urls.
   * @return pinThumbnailUrls
   */
  public List<String> getPinThumbnailUrls() {
    return pinThumbnailUrls;
  }

  public void setPinThumbnailUrls(List<String> pinThumbnailUrls) {
    this.pinThumbnailUrls = pinThumbnailUrls;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BoardMedia boardMedia = (BoardMedia) o;
    return Objects.equals(this.imageCoverUrl, boardMedia.imageCoverUrl) &&
        Objects.equals(this.pinThumbnailUrls, boardMedia.pinThumbnailUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageCoverUrl, pinThumbnailUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardMedia {\n");
    
    sb.append("    imageCoverUrl: ").append(toIndentedString(imageCoverUrl)).append("\n");
    sb.append("    pinThumbnailUrls: ").append(toIndentedString(pinThumbnailUrls)).append("\n");
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
