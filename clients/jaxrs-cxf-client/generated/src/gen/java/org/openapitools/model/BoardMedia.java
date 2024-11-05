package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Board media.
 **/
@ApiModel(description="Board media.")

public class BoardMedia  {
  
  @ApiModelProperty(example = "https://i.pinimg.com/400x300/fd/cd/d5/fdcdd5a6d8a80824add0d054125cd957.jpg", value = "Board cover image.")
 /**
   * Board cover image.
  **/
  private String imageCoverUrl;

  @ApiModelProperty(example = "[\"https://i.pinimg.com/150x150/b4/57/10/b45710f1ede96af55230f4b43935c4af.jpg\",\"https://i.pinimg.com/150x150/dd/ff/46/ddff4616e39c1935cd05738794fa860e.jpg\",\"https://i.pinimg.com/150x150/84/ac/59/84ac59b670ccb5b903dace480a98930c.jpg\",\"https://i.pinimg.com/150x150/4c/54/6f/4c546f521be85e30838fb742bfff6936.jpg\"]", value = "Board pin thumbnail urls.")
 /**
   * Board pin thumbnail urls.
  **/
  private List<String> pinThumbnailUrls = new ArrayList<>();
 /**
   * Board cover image.
   * @return imageCoverUrl
  **/
  @JsonProperty("image_cover_url")
  public String getImageCoverUrl() {
    return imageCoverUrl;
  }

  public void setImageCoverUrl(String imageCoverUrl) {
    this.imageCoverUrl = imageCoverUrl;
  }

  public BoardMedia imageCoverUrl(String imageCoverUrl) {
    this.imageCoverUrl = imageCoverUrl;
    return this;
  }

 /**
   * Board pin thumbnail urls.
   * @return pinThumbnailUrls
  **/
  @JsonProperty("pin_thumbnail_urls")
  public List<String> getPinThumbnailUrls() {
    return pinThumbnailUrls;
  }

  public void setPinThumbnailUrls(List<String> pinThumbnailUrls) {
    this.pinThumbnailUrls = pinThumbnailUrls;
  }

  public BoardMedia pinThumbnailUrls(List<String> pinThumbnailUrls) {
    this.pinThumbnailUrls = pinThumbnailUrls;
    return this;
  }

  public BoardMedia addPinThumbnailUrlsItem(String pinThumbnailUrlsItem) {
    this.pinThumbnailUrls.add(pinThumbnailUrlsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

