package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AdPreviewCreateFromImage;
import org.openapitools.model.AdPreviewCreateFromPin;

/**
 * AdPreviewRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AdPreviewRequest   {
  @JsonProperty("image_url")
  private String imageUrl;

  @JsonProperty("title")
  private String title;

  @JsonProperty("pin_id")
  private String pinId;

  public AdPreviewRequest imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Image URL.
   * @return imageUrl
  **/
  @ApiModelProperty(example = "https://somewebsite.com/someimage.jpg", required = true, value = "Image URL.")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public AdPreviewRequest title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title displayed below ad.
   * @return title
  **/
  @ApiModelProperty(example = "My Preview Image", required = true, value = "Title displayed below ad.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AdPreviewRequest pinId(String pinId) {
    this.pinId = pinId;
    return this;
  }

   /**
   * Pin ID.
   * @return pinId
  **/
  @ApiModelProperty(example = "7389479023", required = true, value = "Pin ID.")
  public String getPinId() {
    return pinId;
  }

  public void setPinId(String pinId) {
    this.pinId = pinId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdPreviewRequest adPreviewRequest = (AdPreviewRequest) o;
    return Objects.equals(this.imageUrl, adPreviewRequest.imageUrl) &&
        Objects.equals(this.title, adPreviewRequest.title) &&
        Objects.equals(this.pinId, adPreviewRequest.pinId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUrl, title, pinId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdPreviewRequest {\n");
    
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    pinId: ").append(toIndentedString(pinId)).append("\n");
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

