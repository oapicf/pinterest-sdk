package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "source_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = PinMediaSourceImageBase64.class, name = "image_base64"),
  @JsonSubTypes.Type(value = PinMediaSourceImageURL.class, name = "image_url"),
  @JsonSubTypes.Type(value = PinMediaSourceImagesBase64.class, name = "multiple_image_base64"),
  @JsonSubTypes.Type(value = PinMediaSourceImagesURL.class, name = "multiple_image_urls"),
  @JsonSubTypes.Type(value = PinMediaSourcePinURL.class, name = "pin_url"),
  @JsonSubTypes.Type(value = PinMediaSourceVideoID.class, name = "video_id"),
})

/**
 * Pin media source.
 */
@ApiModel(description="Pin media source.")

public class PinMediaSource  {
  
public enum SourceTypeEnum {

    @JsonProperty("pin_url") PIN_URL(String.valueOf("pin_url"));

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

    @JsonProperty("image/jpeg") JPEG(String.valueOf("image/jpeg")),
    @JsonProperty("image/png") PNG(String.valueOf("image/png"));

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

 /**
  * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  */
  @ApiModelProperty(value = "Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.")
  private Boolean isStandard = true;

  @ApiModelProperty(required = true, value = "")
  private String url;

 /**
  * Cover image url.
  */
  @ApiModelProperty(value = "Cover image url.")
  private String coverImageUrl;

public enum CoverImageContentTypeEnum {

    @JsonProperty("image/jpeg") JPEG(String.valueOf("image/jpeg")),
    @JsonProperty("image/png") PNG(String.valueOf("image/png"));

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

 /**
  * Content type for cover image Base64.
  */
  @ApiModelProperty(value = "Content type for cover image Base64.")
  private CoverImageContentTypeEnum coverImageContentType;

 /**
  * Cover image Base64.
  */
  @ApiModelProperty(value = "Cover image Base64.")
  private String coverImageData;

  @ApiModelProperty(required = true, value = "")
  private String mediaId;

 /**
  * Array with image objects.
  */
  @ApiModelProperty(required = true, value = "Array with image objects.")
  @Valid
  private List<@Valid PinMediaSourceImagesURLItemsInner> items = new ArrayList<>();

  @ApiModelProperty(value = "")
  private Integer index;

 /**
  * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
  */
  @ApiModelProperty(value = "This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.")
  private Boolean isAffiliateLink = false;
 /**
  * Get sourceType
  * @return sourceType
  */
  @JsonProperty("source_type")
  @NotNull
  public String getSourceType() {
    return sourceType == null ? null : sourceType.value();
  }

  /**
   * Sets the <code>sourceType</code> property.
   */
 public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  /**
   * Sets the <code>sourceType</code> property.
   */
  public PinMediaSource sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

 /**
  * Get contentType
  * @return contentType
  */
  @JsonProperty("content_type")
  @NotNull
  public String getContentType() {
    return contentType == null ? null : contentType.value();
  }

  /**
   * Sets the <code>contentType</code> property.
   */
 public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  /**
   * Sets the <code>contentType</code> property.
   */
  public PinMediaSource contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

 /**
  * Get data
  * @return data
  */
  @JsonProperty("data")
  @NotNull
 @Pattern(regexp="[a-zA-Z0-9+/=]+")  public String getData() {
    return data;
  }

  /**
   * Sets the <code>data</code> property.
   */
 public void setData(String data) {
    this.data = data;
  }

  /**
   * Sets the <code>data</code> property.
   */
  public PinMediaSource data(String data) {
    this.data = data;
    return this;
  }

 /**
  * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  * @return isStandard
  */
  @JsonProperty("is_standard")
  public Boolean getIsStandard() {
    return isStandard;
  }

  /**
   * Sets the <code>isStandard</code> property.
   */
 public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

  /**
   * Sets the <code>isStandard</code> property.
   */
  public PinMediaSource isStandard(Boolean isStandard) {
    this.isStandard = isStandard;
    return this;
  }

 /**
  * Get url
  * @return url
  */
  @JsonProperty("url")
  @NotNull
  public String getUrl() {
    return url;
  }

  /**
   * Sets the <code>url</code> property.
   */
 public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Sets the <code>url</code> property.
   */
  public PinMediaSource url(String url) {
    this.url = url;
    return this;
  }

 /**
  * Cover image url.
  * @return coverImageUrl
  */
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  /**
   * Sets the <code>coverImageUrl</code> property.
   */
 public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  /**
   * Sets the <code>coverImageUrl</code> property.
   */
  public PinMediaSource coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

 /**
  * Content type for cover image Base64.
  * @return coverImageContentType
  */
  @JsonProperty("cover_image_content_type")
  public String getCoverImageContentType() {
    return coverImageContentType == null ? null : coverImageContentType.value();
  }

  /**
   * Sets the <code>coverImageContentType</code> property.
   */
 public void setCoverImageContentType(CoverImageContentTypeEnum coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
  }

  /**
   * Sets the <code>coverImageContentType</code> property.
   */
  public PinMediaSource coverImageContentType(CoverImageContentTypeEnum coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
    return this;
  }

 /**
  * Cover image Base64.
  * @return coverImageData
  */
  @JsonProperty("cover_image_data")
  public String getCoverImageData() {
    return coverImageData;
  }

  /**
   * Sets the <code>coverImageData</code> property.
   */
 public void setCoverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
  }

  /**
   * Sets the <code>coverImageData</code> property.
   */
  public PinMediaSource coverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
    return this;
  }

 /**
  * Get mediaId
  * @return mediaId
  */
  @JsonProperty("media_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getMediaId() {
    return mediaId;
  }

  /**
   * Sets the <code>mediaId</code> property.
   */
 public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  /**
   * Sets the <code>mediaId</code> property.
   */
  public PinMediaSource mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

 /**
  * Array with image objects.
  * @return items
  */
  @JsonProperty("items")
  @NotNull
 @Size(min=2,max=5)  public List<@Valid PinMediaSourceImagesURLItemsInner> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid PinMediaSourceImagesURLItemsInner> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public PinMediaSource items(List<@Valid PinMediaSourceImagesURLItemsInner> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public PinMediaSource addItemsItem(PinMediaSourceImagesURLItemsInner itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
  * Get index
  * minimum: 0
  * @return index
  */
  @JsonProperty("index")
 @Min(0)  public Integer getIndex() {
    return index;
  }

  /**
   * Sets the <code>index</code> property.
   */
 public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * Sets the <code>index</code> property.
   */
  public PinMediaSource index(Integer index) {
    this.index = index;
    return this;
  }

 /**
  * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
  * @return isAffiliateLink
  */
  @JsonProperty("is_affiliate_link")
  public Boolean getIsAffiliateLink() {
    return isAffiliateLink;
  }

  /**
   * Sets the <code>isAffiliateLink</code> property.
   */
 public void setIsAffiliateLink(Boolean isAffiliateLink) {
    this.isAffiliateLink = isAffiliateLink;
  }

  /**
   * Sets the <code>isAffiliateLink</code> property.
   */
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

