package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.ContentType;
import com.prokarma.pkmst.model.PinMediaSourceImageBase64;
import com.prokarma.pkmst.model.PinMediaSourceImageURL;
import com.prokarma.pkmst.model.PinMediaSourceImagesBase64;
import com.prokarma.pkmst.model.PinMediaSourceImagesURL;
import com.prokarma.pkmst.model.PinMediaSourceImagesURLItem;
import com.prokarma.pkmst.model.PinMediaSourcePinURL;
import com.prokarma.pkmst.model.PinMediaSourceVideoID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Pin media source that can be an image, video, or a mix of both passed in as a request.
 */
@ApiModel(description = "Pin media source that can be an image, video, or a mix of both passed in as a request.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "source_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = PinMediaSourceImageBase64.class, name = "image_base64"),
  @JsonSubTypes.Type(value = PinMediaSourceImageURL.class, name = "image_url"),
  @JsonSubTypes.Type(value = PinMediaSourceImagesBase64.class, name = "multiple_image_base64"),
  @JsonSubTypes.Type(value = PinMediaSourceImagesURL.class, name = "multiple_image_urls"),
  @JsonSubTypes.Type(value = PinMediaSourcePinURL.class, name = "pin_url"),
  @JsonSubTypes.Type(value = PinMediaSourceVideoID.class, name = "video_id"),
})

public class PinMediaSource   {
  @JsonProperty("content_type")
  private ContentType contentType;

  @JsonProperty("data")
  private String data;

  @JsonProperty("is_standard")
  private Boolean isStandard = true;

  /**
   * Gets or Sets sourceType
   */
  public enum SourceTypeEnum {
    PIN_URL("pin_url");

    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SourceTypeEnum fromValue(String text) {
      for (SourceTypeEnum b : SourceTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("source_type")
  private SourceTypeEnum sourceType;

  @JsonProperty("url")
  private String url;

  @JsonProperty("cover_image_content_type")
  private ContentType coverImageContentType;

  @JsonProperty("cover_image_data")
  private String coverImageData;

  @JsonProperty("cover_image_key_frame_time")
  private Integer coverImageKeyFrameTime;

  @JsonProperty("cover_image_url")
  private String coverImageUrl;

  @JsonProperty("media_id")
  private String mediaId;

  @JsonProperty("index")
  private Integer index;

  @JsonProperty("items")
  
  private List<PinMediaSourceImagesURLItem> items = new ArrayList<>();

  @JsonProperty("is_affiliate_link")
  private Boolean isAffiliateLink = false;

  public PinMediaSource contentType(ContentType contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
   */
  @ApiModelProperty(required = true, value = "")
  public ContentType getContentType() {
    return contentType;
  }

  public void setContentType(ContentType contentType) {
    this.contentType = contentType;
  }

  public PinMediaSource data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @ApiModelProperty(required = true, value = "")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public PinMediaSource isStandard(Boolean isStandard) {
    this.isStandard = isStandard;
    return this;
  }

  /**
   * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
   * @return isStandard
   */
  @ApiModelProperty(value = "Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.")
  public Boolean getIsStandard() {
    return isStandard;
  }

  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

  public PinMediaSource sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * Get sourceType
   * @return sourceType
   */
  @ApiModelProperty(required = true, value = "")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  public PinMediaSource url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
   */
  @ApiModelProperty(required = true, value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PinMediaSource coverImageContentType(ContentType coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
    return this;
  }

  /**
   * Content type for cover image Base64.
   * @return coverImageContentType
   */
  @ApiModelProperty(value = "Content type for cover image Base64.")
  public ContentType getCoverImageContentType() {
    return coverImageContentType;
  }

  public void setCoverImageContentType(ContentType coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
  }

  public PinMediaSource coverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
    return this;
  }

  /**
   * Cover image Base64.
   * @return coverImageData
   */
  @ApiModelProperty(value = "Cover image Base64.")
  public String getCoverImageData() {
    return coverImageData;
  }

  public void setCoverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
  }

  public PinMediaSource coverImageKeyFrameTime(Integer coverImageKeyFrameTime) {
    this.coverImageKeyFrameTime = coverImageKeyFrameTime;
    return this;
  }

  /**
   * Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
   * minimum: 0
   * @return coverImageKeyFrameTime
   */
  @ApiModelProperty(value = "Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.")
  public Integer getCoverImageKeyFrameTime() {
    return coverImageKeyFrameTime;
  }

  public void setCoverImageKeyFrameTime(Integer coverImageKeyFrameTime) {
    this.coverImageKeyFrameTime = coverImageKeyFrameTime;
  }

  public PinMediaSource coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

  /**
   * Cover image URL.
   * @return coverImageUrl
   */
  @ApiModelProperty(value = "Cover image URL.")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  public PinMediaSource mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  /**
   * Get mediaId
   * @return mediaId
   */
  @ApiModelProperty(required = true, value = "")
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  public PinMediaSource index(Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Get index
   * minimum: 0
   * @return index
   */
  @ApiModelProperty(value = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public PinMediaSource items(List<PinMediaSourceImagesURLItem> items) {
    this.items = items;
    return this;
  }

  public PinMediaSource addItemsItem(PinMediaSourceImagesURLItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Array with image objects.
   * @return items
   */
  @ApiModelProperty(required = true, value = "Array with image objects.")
  public List<PinMediaSourceImagesURLItem> getItems() {
    return items;
  }

  public void setItems(List<PinMediaSourceImagesURLItem> items) {
    this.items = items;
  }

  public PinMediaSource isAffiliateLink(Boolean isAffiliateLink) {
    this.isAffiliateLink = isAffiliateLink;
    return this;
  }

  /**
   * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
   * @return isAffiliateLink
   */
  @ApiModelProperty(value = "This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.")
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

