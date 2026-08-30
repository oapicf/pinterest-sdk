package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ContentType;
import org.openapitools.vertxweb.server.model.PinMediaSourceImageBase64;
import org.openapitools.vertxweb.server.model.PinMediaSourceImageURL;
import org.openapitools.vertxweb.server.model.PinMediaSourceImagesBase64;
import org.openapitools.vertxweb.server.model.PinMediaSourceImagesURL;
import org.openapitools.vertxweb.server.model.PinMediaSourceImagesURLItem;
import org.openapitools.vertxweb.server.model.PinMediaSourcePinURL;
import org.openapitools.vertxweb.server.model.PinMediaSourceVideoID;

/**
 * Pin media source that can be an image, video, or a mix of both passed in as a request.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PinMediaSource   {
  
  private ContentType contentType;
  private String data;
  private Boolean isStandard = true;


  public enum SourceTypeEnum {
    PIN_URL("pin_url");

    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private SourceTypeEnum sourceType;
  private String url;
  private ContentType coverImageContentType;
  private String coverImageData;
  private Integer coverImageKeyFrameTime;
  private String coverImageUrl;
  private String mediaId;
  private Integer index;
  private List<PinMediaSourceImagesURLItem> items = new ArrayList<>();
  private Boolean isAffiliateLink = false;

  public PinMediaSource () {

  }

  public PinMediaSource (ContentType contentType, String data, Boolean isStandard, SourceTypeEnum sourceType, String url, ContentType coverImageContentType, String coverImageData, Integer coverImageKeyFrameTime, String coverImageUrl, String mediaId, Integer index, List<PinMediaSourceImagesURLItem> items, Boolean isAffiliateLink) {
    this.contentType = contentType;
    this.data = data;
    this.isStandard = isStandard;
    this.sourceType = sourceType;
    this.url = url;
    this.coverImageContentType = coverImageContentType;
    this.coverImageData = coverImageData;
    this.coverImageKeyFrameTime = coverImageKeyFrameTime;
    this.coverImageUrl = coverImageUrl;
    this.mediaId = mediaId;
    this.index = index;
    this.items = items;
    this.isAffiliateLink = isAffiliateLink;
  }

    
  @JsonProperty("content_type")
  public ContentType getContentType() {
    return contentType;
  }
  public void setContentType(ContentType contentType) {
    this.contentType = contentType;
  }

    
  @JsonProperty("data")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

    
  @JsonProperty("is_standard")
  public Boolean getIsStandard() {
    return isStandard;
  }
  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

    
  @JsonProperty("source_type")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

    
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

    
  @JsonProperty("cover_image_content_type")
  public ContentType getCoverImageContentType() {
    return coverImageContentType;
  }
  public void setCoverImageContentType(ContentType coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
  }

    
  @JsonProperty("cover_image_data")
  public String getCoverImageData() {
    return coverImageData;
  }
  public void setCoverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
  }

    
  @JsonProperty("cover_image_key_frame_time")
  public Integer getCoverImageKeyFrameTime() {
    return coverImageKeyFrameTime;
  }
  public void setCoverImageKeyFrameTime(Integer coverImageKeyFrameTime) {
    this.coverImageKeyFrameTime = coverImageKeyFrameTime;
  }

    
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }
  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

    
  @JsonProperty("media_id")
  public String getMediaId() {
    return mediaId;
  }
  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

    
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

    
  @JsonProperty("items")
  public List<PinMediaSourceImagesURLItem> getItems() {
    return items;
  }
  public void setItems(List<PinMediaSourceImagesURLItem> items) {
    this.items = items;
  }

    
  @JsonProperty("is_affiliate_link")
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
    return Objects.equals(contentType, pinMediaSource.contentType) &&
        Objects.equals(data, pinMediaSource.data) &&
        Objects.equals(isStandard, pinMediaSource.isStandard) &&
        Objects.equals(sourceType, pinMediaSource.sourceType) &&
        Objects.equals(url, pinMediaSource.url) &&
        Objects.equals(coverImageContentType, pinMediaSource.coverImageContentType) &&
        Objects.equals(coverImageData, pinMediaSource.coverImageData) &&
        Objects.equals(coverImageKeyFrameTime, pinMediaSource.coverImageKeyFrameTime) &&
        Objects.equals(coverImageUrl, pinMediaSource.coverImageUrl) &&
        Objects.equals(mediaId, pinMediaSource.mediaId) &&
        Objects.equals(index, pinMediaSource.index) &&
        Objects.equals(items, pinMediaSource.items) &&
        Objects.equals(isAffiliateLink, pinMediaSource.isAffiliateLink);
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
