package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Board media.
 */
@ApiModel(description = "Board media.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-03-14T23:02:40.880156196Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
  @ApiModelProperty(example = "https://i.pinimg.com/400x300/fd/cd/d5/fdcdd5a6d8a80824add0d054125cd957.jpg", value = "Board cover image.")
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
  @ApiModelProperty(example = "[\"https://i.pinimg.com/150x150/b4/57/10/b45710f1ede96af55230f4b43935c4af.jpg\",\"https://i.pinimg.com/150x150/dd/ff/46/ddff4616e39c1935cd05738794fa860e.jpg\",\"https://i.pinimg.com/150x150/84/ac/59/84ac59b670ccb5b903dace480a98930c.jpg\",\"https://i.pinimg.com/150x150/4c/54/6f/4c546f521be85e30838fb742bfff6936.jpg\"]", value = "Board pin thumbnail urls.")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

