package org.openapitools.model;

import io.swagger.annotations.ApiModel;
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

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Pin media source.
 **/
@ApiModel(description="Pin media source.")

public class PinMediaSource  {
  
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

public enum ContentTypeEnum {

JPEG(String.valueOf("image/jpeg")), PNG(String.valueOf("image/png"));


    private String value;

    ContentTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ContentTypeEnum fromValue(String value) {
        for (ContentTypeEnum b : ContentTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(required = true, value = "")
  private ContentTypeEnum contentType;

  @ApiModelProperty(required = true, value = "")
  private String data;

  @ApiModelProperty(value = "Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.")
 /**
   * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  **/
  private Boolean isStandard = true;

  @ApiModelProperty(required = true, value = "")
  private String url;

  @ApiModelProperty(value = "Cover image url.")
 /**
   * Cover image url.
  **/
  private String coverImageUrl;

public enum CoverImageContentTypeEnum {

JPEG(String.valueOf("image/jpeg")), PNG(String.valueOf("image/png"));


    private String value;

    CoverImageContentTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CoverImageContentTypeEnum fromValue(String value) {
        for (CoverImageContentTypeEnum b : CoverImageContentTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  @ApiModelProperty(value = "Content type for cover image Base64.")
 /**
   * Content type for cover image Base64.
  **/
  private CoverImageContentTypeEnum coverImageContentType;

  @ApiModelProperty(value = "Cover image Base64.")
 /**
   * Cover image Base64.
  **/
  private String coverImageData;

  @ApiModelProperty(required = true, value = "")
  private String mediaId;

  @ApiModelProperty(required = true, value = "Array with image objects.")
 /**
   * Array with image objects.
  **/
  private List<PinMediaSourceImagesURLItemsInner> items = new ArrayList<>();

  @ApiModelProperty(value = "")
  private Integer index;

  @ApiModelProperty(value = "This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.")
 /**
   * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
  **/
  private Boolean isAffiliateLink = false;
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
   * Get contentType
   * @return contentType
  **/
  @JsonProperty("content_type")
  public String getContentType() {
    if (contentType == null) {
      return null;
    }
    return contentType.value();
  }

  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  public PinMediaSource contentType(ContentTypeEnum contentType) {
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
   * Cover image url.
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
   * Content type for cover image Base64.
   * @return coverImageContentType
  **/
  @JsonProperty("cover_image_content_type")
  public String getCoverImageContentType() {
    if (coverImageContentType == null) {
      return null;
    }
    return coverImageContentType.value();
  }

  public void setCoverImageContentType(CoverImageContentTypeEnum coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
  }

  public PinMediaSource coverImageContentType(CoverImageContentTypeEnum coverImageContentType) {
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
   * Array with image objects.
   * @return items
  **/
  @JsonProperty("items")
  public List<PinMediaSourceImagesURLItemsInner> getItems() {
    return items;
  }

  public void setItems(List<PinMediaSourceImagesURLItemsInner> items) {
    this.items = items;
  }

  public PinMediaSource items(List<PinMediaSourceImagesURLItemsInner> items) {
    this.items = items;
    return this;
  }

  public PinMediaSource addItemsItem(PinMediaSourceImagesURLItemsInner itemsItem) {
    this.items.add(itemsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

