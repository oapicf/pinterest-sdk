package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.AdPreviewCreateFromImage;
import org.openapitools.server.api.model.AdPreviewCreateFromPin;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdPreviewRequest   {
  
  private String imageUrl;
  private String title;
  private String pinId;

  public AdPreviewRequest () {

  }

  public AdPreviewRequest (String imageUrl, String title, String pinId) {
    this.imageUrl = imageUrl;
    this.title = title;
    this.pinId = pinId;
  }

    
  @JsonProperty("image_url")
  public String getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

    
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

    
  @JsonProperty("pin_id")
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
    return Objects.equals(imageUrl, adPreviewRequest.imageUrl) &&
        Objects.equals(title, adPreviewRequest.title) &&
        Objects.equals(pinId, adPreviewRequest.pinId);
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
