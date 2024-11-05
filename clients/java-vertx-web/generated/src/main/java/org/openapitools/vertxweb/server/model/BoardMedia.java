package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Board media.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BoardMedia   {
  
  private String imageCoverUrl;
  private List<String> pinThumbnailUrls = new ArrayList<>();

  public BoardMedia () {

  }

  public BoardMedia (String imageCoverUrl, List<String> pinThumbnailUrls) {
    this.imageCoverUrl = imageCoverUrl;
    this.pinThumbnailUrls = pinThumbnailUrls;
  }

    
  @JsonProperty("image_cover_url")
  public String getImageCoverUrl() {
    return imageCoverUrl;
  }
  public void setImageCoverUrl(String imageCoverUrl) {
    this.imageCoverUrl = imageCoverUrl;
  }

    
  @JsonProperty("pin_thumbnail_urls")
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
    return Objects.equals(imageCoverUrl, boardMedia.imageCoverUrl) &&
        Objects.equals(pinThumbnailUrls, boardMedia.pinThumbnailUrls);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
