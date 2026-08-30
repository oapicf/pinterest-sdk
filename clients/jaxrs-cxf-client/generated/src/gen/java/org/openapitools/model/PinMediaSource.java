package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ContentType;
import org.openapitools.model.PinMediaSourceImageBase64;
import org.openapitools.model.PinMediaSourceImageURL;
import org.openapitools.model.PinMediaSourceImagesBase64;
import org.openapitools.model.PinMediaSourceImagesURL;
import org.openapitools.model.PinMediaSourceImagesURLItem;
import org.openapitools.model.PinMediaSourcePinURL;
import org.openapitools.model.PinMediaSourceVideoID;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Pin media source that can be an image, video, or a mix of both passed in as a request.
 */
@ApiModel(description="Pin media source that can be an image, video, or a mix of both passed in as a request.")

public class PinMediaSource  {
  
  @ApiModelProperty(required = true, value = "")

  private ContentType contentType;

  @ApiModelProperty(required = true, value = "")

  private String data;

 /**
  * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  */
  @ApiModelProperty(value = "Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.")

  private Boolean isStandard = true;

public enum SourceTypeEnum {

PIN_URL(String.valueOf("pin_url"));


    private String value;

    SourceTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SourceTypeEnum fromValue(String value) {
        for (SourceTypeEnum b : SourceTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")

  private SourceTypeEnum sourceType;

  @ApiModelProperty(required = true, value = "")

  private String url;

 /**
  * Content type for cover image Base64.
  */
  @ApiModelProperty(value = "Content type for cover image Base64.")

  private ContentType coverImageContentType;

 /**
  * Cover image Base64.
  */
  @ApiModelProperty(value = "Cover image Base64.")

  private String coverImageData;

 /**
  * Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
  */
  @ApiModelProperty(value = "Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.")

  private Integer coverImageKeyFrameTime;

 /**
  * Cover image URL.
  */
  @ApiModelProperty(value = "Cover image URL.")

  private String coverImageUrl;

  @ApiModelProperty(required = true, value = "")

  private String mediaId;

  @ApiModelProperty(value = "")

  private Integer index;

 /**
  * Array with image objects.
  */
  @ApiModelProperty(required = true, value = "Array with image objects.")

  private List<PinMediaSourceImagesURLItem> items = new ArrayList<>();

 /**
  * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
  */
  @ApiModelProperty(value = "This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.")

  private Boolean isAffiliateLink = false;
 /**
   * Get contentType
   * @return contentType
  **/
  @JsonProperty("content_type")
  public ContentType getContentType() {
    return contentType;
  }

  public void setContentType(ContentType contentType) {
    this.contentType = contentType;
  }

  public PinMediaSource contentType(ContentType contentType) {
    this.contentType = contentType;
    return this;
  }

 /**
   * Get data
   * @return data
  **/
  @JsonProperty("data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public PinMediaSource data(String data) {
    this.data = data;
    return this;
  }

 /**
   * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
   * @return isStandard
  **/
  @JsonProperty("is_standard")
  public Boolean getIsStandard() {
    return isStandard;
  }

  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

  public PinMediaSource isStandard(Boolean isStandard) {
    this.isStandard = isStandard;
    return this;
  }

 /**
   * Get sourceType
   * @return sourceType
  **/
  @JsonProperty("source_type")
  public String getSourceType() {
    if (sourceType == null) {
      return null;
    }
    return sourceType.value();
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  public PinMediaSource sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

 /**
   * Get url
   * @return url
  **/
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PinMediaSource url(String url) {
    this.url = url;
    return this;
  }

 /**
   * Content type for cover image Base64.
   * @return coverImageContentType
  **/
  @JsonProperty("cover_image_content_type")
  public ContentType getCoverImageContentType() {
    return coverImageContentType;
  }

  public void setCoverImageContentType(ContentType coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
  }

  public PinMediaSource coverImageContentType(ContentType coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
    return this;
  }

 /**
   * Cover image Base64.
   * @return coverImageData
  **/
  @JsonProperty("cover_image_data")
  public String getCoverImageData() {
    return coverImageData;
  }

  public void setCoverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
  }

  public PinMediaSource coverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
    return this;
  }

 /**
   * Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
   * minimum: 0
   * @return coverImageKeyFrameTime
  **/
  @JsonProperty("cover_image_key_frame_time")
  public Integer getCoverImageKeyFrameTime() {
    return coverImageKeyFrameTime;
  }

  public void setCoverImageKeyFrameTime(Integer coverImageKeyFrameTime) {
    this.coverImageKeyFrameTime = coverImageKeyFrameTime;
  }

  public PinMediaSource coverImageKeyFrameTime(Integer coverImageKeyFrameTime) {
    this.coverImageKeyFrameTime = coverImageKeyFrameTime;
    return this;
  }

 /**
   * Cover image URL.
   * @return coverImageUrl
  **/
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  public PinMediaSource coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

 /**
   * Get mediaId
   * @return mediaId
  **/
  @JsonProperty("media_id")
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  public PinMediaSource mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

 /**
   * Get index
   * minimum: 0
   * @return index
  **/
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public PinMediaSource index(Integer index) {
    this.index = index;
    return this;
  }

 /**
   * Array with image objects.
   * @return items
  **/
  @JsonProperty("items")
  public List<PinMediaSourceImagesURLItem> getItems() {
    return items;
  }

  public void setItems(List<PinMediaSourceImagesURLItem> items) {
    this.items = items;
  }

  public PinMediaSource items(List<PinMediaSourceImagesURLItem> items) {
    this.items = items;
    return this;
  }

  public PinMediaSource addItemsItem(PinMediaSourceImagesURLItem itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
   * @return isAffiliateLink
  **/
  @JsonProperty("is_affiliate_link")
  public Boolean getIsAffiliateLink() {
    return isAffiliateLink;
  }

  public void setIsAffiliateLink(Boolean isAffiliateLink) {
    this.isAffiliateLink = isAffiliateLink;
  }

  public PinMediaSource isAffiliateLink(Boolean isAffiliateLink) {
    this.isAffiliateLink = isAffiliateLink;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

