package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Board media.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class BoardMedia   {
  @JsonProperty("image_cover_url")
  
  private String imageCoverUrl;

  @JsonProperty("pin_thumbnail_urls")
  
  private List<String> pinThumbnailUrls = null;

  public BoardMedia imageCoverUrl(String imageCoverUrl) {
    this.imageCoverUrl = imageCoverUrl;
    return this;
  }

   /**
   * Board cover image.
   * @return imageCoverUrl
  **/
  public String getImageCoverUrl() {
    return imageCoverUrl;
  }

  public void setImageCoverUrl(String imageCoverUrl) {
    this.imageCoverUrl = imageCoverUrl;
  }

  public BoardMedia pinThumbnailUrls(List<String> pinThumbnailUrls) {
    this.pinThumbnailUrls = pinThumbnailUrls;
    return this;
  }

  public BoardMedia addPinThumbnailUrlsItem(String pinThumbnailUrlsItem) {
    if (this.pinThumbnailUrls == null) {
      this.pinThumbnailUrls = new ArrayList<>();
    }
    this.pinThumbnailUrls.add(pinThumbnailUrlsItem);
    return this;
  }

   /**
   * Board pin thumbnail urls.
   * @return pinThumbnailUrls
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

