package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.PinMediaSourceImageBase64;
import org.openapitools.vertxweb.server.model.PinMediaSourceImageURL;
import org.openapitools.vertxweb.server.model.PinMediaSourceImagesBase64;
import org.openapitools.vertxweb.server.model.PinMediaSourceImagesURL;
import org.openapitools.vertxweb.server.model.PinMediaSourceImagesURLItemsInner;
import org.openapitools.vertxweb.server.model.PinMediaSourcePinURL;
import org.openapitools.vertxweb.server.model.PinMediaSourceVideoID;

/**
 * Pin media source.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PinMediaSource   {
  


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


  public enum ContentTypeEnum {
    JPEG("image/jpeg"),
    PNG("image/png");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private ContentTypeEnum contentType;
  private String data;
  private Boolean isStandard = true;
  private String url;
  private String coverImageUrl;


  public enum CoverImageContentTypeEnum {
    JPEG("image/jpeg"),
    PNG("image/png");

    private String value;

    CoverImageContentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private CoverImageContentTypeEnum coverImageContentType;
  private String coverImageData;
  private String mediaId;
  private List<PinMediaSourceImagesURLItemsInner> items = new ArrayList<>();
  private Integer index;
  private Boolean isAffiliateLink = false;

  public PinMediaSource () {

  }

  public PinMediaSource (SourceTypeEnum sourceType, ContentTypeEnum contentType, String data, Boolean isStandard, String url, String coverImageUrl, CoverImageContentTypeEnum coverImageContentType, String coverImageData, String mediaId, List<PinMediaSourceImagesURLItemsInner> items, Integer index, Boolean isAffiliateLink) {
    this.sourceType = sourceType;
    this.contentType = contentType;
    this.data = data;
    this.isStandard = isStandard;
    this.url = url;
    this.coverImageUrl = coverImageUrl;
    this.coverImageContentType = coverImageContentType;
    this.coverImageData = coverImageData;
    this.mediaId = mediaId;
    this.items = items;
    this.index = index;
    this.isAffiliateLink = isAffiliateLink;
  }

    
  @JsonProperty("source_type")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

    
  @JsonProperty("content_type")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
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

    
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

    
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }
  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

    
  @JsonProperty("cover_image_content_type")
  public CoverImageContentTypeEnum getCoverImageContentType() {
    return coverImageContentType;
  }
  public void setCoverImageContentType(CoverImageContentTypeEnum coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
  }

    
  @JsonProperty("cover_image_data")
  public String getCoverImageData() {
    return coverImageData;
  }
  public void setCoverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
  }

    
  @JsonProperty("media_id")
  public String getMediaId() {
    return mediaId;
  }
  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

    
  @JsonProperty("items")
  public List<PinMediaSourceImagesURLItemsInner> getItems() {
    return items;
  }
  public void setItems(List<PinMediaSourceImagesURLItemsInner> items) {
    this.items = items;
  }

    
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
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
    return Objects.equals(sourceType, pinMediaSource.sourceType) &&
        Objects.equals(contentType, pinMediaSource.contentType) &&
        Objects.equals(data, pinMediaSource.data) &&
        Objects.equals(isStandard, pinMediaSource.isStandard) &&
        Objects.equals(url, pinMediaSource.url) &&
        Objects.equals(coverImageUrl, pinMediaSource.coverImageUrl) &&
        Objects.equals(coverImageContentType, pinMediaSource.coverImageContentType) &&
        Objects.equals(coverImageData, pinMediaSource.coverImageData) &&
        Objects.equals(mediaId, pinMediaSource.mediaId) &&
        Objects.equals(items, pinMediaSource.items) &&
        Objects.equals(index, pinMediaSource.index) &&
        Objects.equals(isAffiliateLink, pinMediaSource.isAffiliateLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, contentType, data, isStandard, url, coverImageUrl, coverImageContentType, coverImageData, mediaId, items, index, isAffiliateLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSource {\n");
    
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    coverImageUrl: ").append(toIndentedString(coverImageUrl)).append("\n");
    sb.append("    coverImageContentType: ").append(toIndentedString(coverImageContentType)).append("\n");
    sb.append("    coverImageData: ").append(toIndentedString(coverImageData)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    isAffiliateLink: ").append(toIndentedString(isAffiliateLink)).append("\n");
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
