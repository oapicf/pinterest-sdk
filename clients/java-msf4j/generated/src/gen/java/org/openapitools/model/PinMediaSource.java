package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PinMediaSourceImageBase64;
import org.openapitools.model.PinMediaSourceImageURL;
import org.openapitools.model.PinMediaSourceImagesBase64;
import org.openapitools.model.PinMediaSourceImagesURL;
import org.openapitools.model.PinMediaSourceImagesURLItemsInner;
import org.openapitools.model.PinMediaSourcePinURL;
import org.openapitools.model.PinMediaSourceVideoID;

/**
 * Pin media source.
 */
@ApiModel(description = "Pin media source.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-03-14T23:02:29.393275857Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinMediaSource   {
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

  /**
   * Gets or Sets contentType
   */
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
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContentTypeEnum fromValue(String text) {
      for (ContentTypeEnum b : ContentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("content_type")
  private ContentTypeEnum contentType;

  @JsonProperty("data")
  private String data;

  @JsonProperty("is_standard")
  private Boolean isStandard = true;

  @JsonProperty("url")
  private String url;

  @JsonProperty("cover_image_url")
  private String coverImageUrl;

  /**
   * Content type for cover image Base64.
   */
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
      return String.valueOf(value);
    }

    @JsonCreator
    public static CoverImageContentTypeEnum fromValue(String text) {
      for (CoverImageContentTypeEnum b : CoverImageContentTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
  }

  @JsonProperty("cover_image_content_type")
  private CoverImageContentTypeEnum coverImageContentType;

  @JsonProperty("cover_image_data")
  private String coverImageData;

  @JsonProperty("media_id")
  private String mediaId;

  @JsonProperty("items")
  private List<@Valid PinMediaSourceImagesURLItemsInner> items = new ArrayList<>();

  @JsonProperty("index")
  private Integer index;

  @JsonProperty("is_affiliate_link")
  private Boolean isAffiliateLink = false;

  public PinMediaSource sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @ApiModelProperty(required = true, value = "")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  public PinMediaSource contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @ApiModelProperty(required = true, value = "")
  public ContentTypeEnum getContentType() {
    return contentType;
  }

  public void setContentType(ContentTypeEnum contentType) {
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
  **/
  @ApiModelProperty(value = "Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.")
  public Boolean getIsStandard() {
    return isStandard;
  }

  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

  public PinMediaSource url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PinMediaSource coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

   /**
   * Cover image url.
   * @return coverImageUrl
  **/
  @ApiModelProperty(value = "Cover image url.")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  public PinMediaSource coverImageContentType(CoverImageContentTypeEnum coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
    return this;
  }

   /**
   * Content type for cover image Base64.
   * @return coverImageContentType
  **/
  @ApiModelProperty(value = "Content type for cover image Base64.")
  public CoverImageContentTypeEnum getCoverImageContentType() {
    return coverImageContentType;
  }

  public void setCoverImageContentType(CoverImageContentTypeEnum coverImageContentType) {
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
  @ApiModelProperty(value = "Cover image Base64.")
  public String getCoverImageData() {
    return coverImageData;
  }

  public void setCoverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
  }

  public PinMediaSource mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

   /**
   * Get mediaId
   * @return mediaId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  public PinMediaSource items(List<@Valid PinMediaSourceImagesURLItemsInner> items) {
    this.items = items;
    return this;
  }

  public PinMediaSource addItemsItem(PinMediaSourceImagesURLItemsInner itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Array with image objects.
   * @return items
  **/
  @ApiModelProperty(required = true, value = "Array with image objects.")
  public List<@Valid PinMediaSourceImagesURLItemsInner> getItems() {
    return items;
  }

  public void setItems(List<@Valid PinMediaSourceImagesURLItemsInner> items) {
    this.items = items;
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
  @ApiModelProperty(value = "")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public PinMediaSource isAffiliateLink(Boolean isAffiliateLink) {
    this.isAffiliateLink = isAffiliateLink;
    return this;
  }

   /**
   * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
   * @return isAffiliateLink
  **/
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
    return Objects.equals(this.sourceType, pinMediaSource.sourceType) &&
        Objects.equals(this.contentType, pinMediaSource.contentType) &&
        Objects.equals(this.data, pinMediaSource.data) &&
        Objects.equals(this.isStandard, pinMediaSource.isStandard) &&
        Objects.equals(this.url, pinMediaSource.url) &&
        Objects.equals(this.coverImageUrl, pinMediaSource.coverImageUrl) &&
        Objects.equals(this.coverImageContentType, pinMediaSource.coverImageContentType) &&
        Objects.equals(this.coverImageData, pinMediaSource.coverImageData) &&
        Objects.equals(this.mediaId, pinMediaSource.mediaId) &&
        Objects.equals(this.items, pinMediaSource.items) &&
        Objects.equals(this.index, pinMediaSource.index) &&
        Objects.equals(this.isAffiliateLink, pinMediaSource.isAffiliateLink);
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

