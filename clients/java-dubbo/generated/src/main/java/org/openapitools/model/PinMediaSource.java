package org.openapitools.model;

import org.openapitools.model.ContentType;
import org.openapitools.model.PinMediaSourceImageBase64;
import org.openapitools.model.PinMediaSourceImageURL;
import org.openapitools.model.PinMediaSourceImagesBase64;
import org.openapitools.model.PinMediaSourceImagesURL;
import org.openapitools.model.PinMediaSourceImagesURLItem;
import org.openapitools.model.PinMediaSourcePinURL;
import org.openapitools.model.PinMediaSourceVideoID;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Pin media source that can be an image, video, or a mix of both passed in as a request.
 */
public class PinMediaSource implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("content_type")
  private ContentType contentType;

  @JsonProperty("data")
  private String data;

  /**
   * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
   */
  @JsonProperty("is_standard")
  private Boolean isStandard = true;

  @JsonProperty("source_type")
  private String sourceType;

  @JsonProperty("url")
  private String url;

  /**
   * Content type for cover image Base64.
   */
  @JsonProperty("cover_image_content_type")
  private ContentType coverImageContentType;

  /**
   * Cover image Base64.
   */
  @JsonProperty("cover_image_data")
  private String coverImageData;

  /**
   * Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
   */
  @JsonProperty("cover_image_key_frame_time")
  private Integer coverImageKeyFrameTime;

  /**
   * Cover image URL.
   */
  @JsonProperty("cover_image_url")
  private String coverImageUrl;

  @JsonProperty("media_id")
  private String mediaId;

  @JsonProperty("index")
  private Integer index;

  /**
   * Array with image objects.
   */
  @JsonProperty("items")
  private List<PinMediaSourceImagesURLItem> items = new ArrayList<>();

  /**
   * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
   */
  @JsonProperty("is_affiliate_link")
  private Boolean isAffiliateLink = false;

  /**
   * 
   * @return contentType
   */
  public ContentType getContentType() {
    return contentType;
  }

  public void setContentType(ContentType contentType) {
    this.contentType = contentType;
  }

  /**
   * 
   * @return data
   */
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  /**
   * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
   * @return isStandard
   */
  public Boolean getIsStandard() {
    return isStandard;
  }

  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

  /**
   * 
   * @return sourceType
   */
  public String getSourceType() {
    return sourceType;
  }

  public void setSourceType(String sourceType) {
    this.sourceType = sourceType;
  }

  /**
   * 
   * @return url
   */
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Content type for cover image Base64.
   * @return coverImageContentType
   */
  public ContentType getCoverImageContentType() {
    return coverImageContentType;
  }

  public void setCoverImageContentType(ContentType coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
  }

  /**
   * Cover image Base64.
   * @return coverImageData
   */
  public String getCoverImageData() {
    return coverImageData;
  }

  public void setCoverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
  }

  /**
   * Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
   * @return coverImageKeyFrameTime
   */
  public Integer getCoverImageKeyFrameTime() {
    return coverImageKeyFrameTime;
  }

  public void setCoverImageKeyFrameTime(Integer coverImageKeyFrameTime) {
    this.coverImageKeyFrameTime = coverImageKeyFrameTime;
  }

  /**
   * Cover image URL.
   * @return coverImageUrl
   */
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  /**
   * 
   * @return mediaId
   */
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  /**
   * 
   * @return index
   */
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Array with image objects.
   * @return items
   */
  public List<PinMediaSourceImagesURLItem> getItems() {
    return items;
  }

  public void setItems(List<PinMediaSourceImagesURLItem> items) {
    this.items = items;
  }

  /**
   * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
   * @return isAffiliateLink
   */
  public Boolean getIsAffiliateLink() {
    return isAffiliateLink;
  }

  public void setIsAffiliateLink(Boolean isAffiliateLink) {
    this.isAffiliateLink = isAffiliateLink;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinMediaSource pinMediaSource = (PinMediaSource) o;
    return Objects.equals(this.contentType, pinMediaSource.contentType) &&
        Objects.equals(this.data, pinMediaSource.data) &&
        Objects.equals(this.isStandard, pinMediaSource.isStandard) &&
        Objects.equals(this.sourceType, pinMediaSource.sourceType) &&
        Objects.equals(this.url, pinMediaSource.url) &&
        Objects.equals(this.coverImageContentType, pinMediaSource.coverImageContentType) &&
        Objects.equals(this.coverImageData, pinMediaSource.coverImageData) &&
        Objects.equals(this.coverImageKeyFrameTime, pinMediaSource.coverImageKeyFrameTime) &&
        Objects.equals(this.coverImageUrl, pinMediaSource.coverImageUrl) &&
        Objects.equals(this.mediaId, pinMediaSource.mediaId) &&
        Objects.equals(this.index, pinMediaSource.index) &&
        Objects.equals(this.items, pinMediaSource.items) &&
        Objects.equals(this.isAffiliateLink, pinMediaSource.isAffiliateLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, data, isStandard, sourceType, url, coverImageContentType, coverImageData, coverImageKeyFrameTime, coverImageUrl, mediaId, index, items, isAffiliateLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSource {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    coverImageContentType: ").append(toIndentedString(coverImageContentType)).append("\n");
    sb.append("    coverImageData: ").append(toIndentedString(coverImageData)).append("\n");
    sb.append("    coverImageKeyFrameTime: ").append(toIndentedString(coverImageKeyFrameTime)).append("\n");
    sb.append("    coverImageUrl: ").append(toIndentedString(coverImageUrl)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    isAffiliateLink: ").append(toIndentedString(isAffiliateLink)).append("\n");
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
