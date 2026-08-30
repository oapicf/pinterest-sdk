package apimodels;

import apimodels.ContentType;
import apimodels.PinMediaSourceImageBase64;
import apimodels.PinMediaSourceImageURL;
import apimodels.PinMediaSourceImagesBase64;
import apimodels.PinMediaSourceImagesURL;
import apimodels.PinMediaSourceImagesURLItem;
import apimodels.PinMediaSourcePinURL;
import apimodels.PinMediaSourceVideoID;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Pin media source that can be an image, video, or a mix of both passed in as a request.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PinMediaSource   {
  @JsonProperty("content_type")
  @NotNull
@Valid

  private ContentType contentType;

  @JsonProperty("data")
  @NotNull
@Pattern(regexp="^[a-zA-Z0-9+/=]+$")

  private String data;

  @JsonProperty("is_standard")
  
  private Boolean isStandard = true;

  /**
   * Gets or Sets sourceType
   */
  public enum SourceTypeEnum {
    PIN_URL("pin_url");

    private final String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SourceTypeEnum fromValue(String value) {
      for (SourceTypeEnum b : SourceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("source_type")
  @NotNull

  private SourceTypeEnum sourceType;

  @JsonProperty("url")
  @NotNull

  private String url;

  @JsonProperty("cover_image_content_type")
  @Valid

  private ContentType coverImageContentType;

  @JsonProperty("cover_image_data")
  
  private String coverImageData;

  @JsonProperty("cover_image_key_frame_time")
  @Min(0)

  private Integer coverImageKeyFrameTime;

  @JsonProperty("cover_image_url")
  
  private String coverImageUrl;

  @JsonProperty("media_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String mediaId;

  @JsonProperty("index")
  @Min(0)

  private Integer index;

  @JsonProperty("items")
  @NotNull
@Size(min=2,max=5)
@Valid

  private List<@Valid PinMediaSourceImagesURLItem> items = new ArrayList<>();

  @JsonProperty("is_affiliate_link")
  
  private Boolean isAffiliateLink = false;

  public PinMediaSource contentType(ContentType contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public PinMediaSource items(List<@Valid PinMediaSourceImagesURLItem> items) {
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
  **/
  public List<@Valid PinMediaSourceImagesURLItem> getItems() {
    return items;
  }

  public void setItems(List<@Valid PinMediaSourceImagesURLItem> items) {
    this.items = items;
  }

  public PinMediaSource isAffiliateLink(Boolean isAffiliateLink) {
    this.isAffiliateLink = isAffiliateLink;
    return this;
  }

   /**
   * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
   * @return isAffiliateLink
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

