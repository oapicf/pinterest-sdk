package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Pin media source.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Pin media source.")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "source_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = PinMediaSourceImageBase64.class, name = "image_base64"),
  @JsonSubTypes.Type(value = PinMediaSourceImageURL.class, name = "image_url"),
  @JsonSubTypes.Type(value = PinMediaSourceImagesBase64.class, name = "multiple_image_base64"),
  @JsonSubTypes.Type(value = PinMediaSourceImagesURL.class, name = "multiple_image_urls"),
  @JsonSubTypes.Type(value = PinMediaSourcePinURL.class, name = "pin_url"),
  @JsonSubTypes.Type(value = PinMediaSourceVideoID.class, name = "video_id"),
})

public class PinMediaSource   {
  

public enum SourceTypeEnum {

    @JsonProperty("pin_url") PIN_URL(String.valueOf("pin_url"));


    private String value;

    SourceTypeEnum(String v) {
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

  private SourceTypeEnum sourceType;


public enum ContentTypeEnum {

    @JsonProperty("image/jpeg") JPEG(String.valueOf("image/jpeg")), @JsonProperty("image/png") PNG(String.valueOf("image/png"));


    private String value;

    ContentTypeEnum(String v) {
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

  private ContentTypeEnum contentType;

  private String data;

  private Boolean isStandard = true;

  private String url;

  private String coverImageUrl;


public enum CoverImageContentTypeEnum {

    @JsonProperty("image/jpeg") JPEG(String.valueOf("image/jpeg")), @JsonProperty("image/png") PNG(String.valueOf("image/png"));


    private String value;

    CoverImageContentTypeEnum(String v) {
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

  private CoverImageContentTypeEnum coverImageContentType;

  private String coverImageData;

  private String mediaId;

  private List<@Valid PinMediaSourceImagesURLItemsInner> items = new ArrayList<>();

  private Integer index;

  private Boolean isAffiliateLink = false;

  /**
   **/
  public PinMediaSource sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("source_type")
  @NotNull
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }


  /**
   **/
  public PinMediaSource contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("content_type")
  @NotNull
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }


  /**
   **/
  public PinMediaSource data(String data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  @NotNull
 @Pattern(regexp="[a-zA-Z0-9+/=]+")  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }


  /**
   * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
   **/
  public PinMediaSource isStandard(Boolean isStandard) {
    this.isStandard = isStandard;
    return this;
  }

  
  @ApiModelProperty(value = "Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.")
  @JsonProperty("is_standard")
  public Boolean getIsStandard() {
    return isStandard;
  }
  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }


  /**
   **/
  public PinMediaSource url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("url")
  @NotNull
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Cover image url.
   **/
  public PinMediaSource coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

  
  @ApiModelProperty(value = "Cover image url.")
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }
  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }


  /**
   * Content type for cover image Base64.
   **/
  public PinMediaSource coverImageContentType(CoverImageContentTypeEnum coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
    return this;
  }

  
  @ApiModelProperty(value = "Content type for cover image Base64.")
  @JsonProperty("cover_image_content_type")
  public CoverImageContentTypeEnum getCoverImageContentType() {
    return coverImageContentType;
  }
  public void setCoverImageContentType(CoverImageContentTypeEnum coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
  }


  /**
   * Cover image Base64.
   **/
  public PinMediaSource coverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
    return this;
  }

  
  @ApiModelProperty(value = "Cover image Base64.")
  @JsonProperty("cover_image_data")
  public String getCoverImageData() {
    return coverImageData;
  }
  public void setCoverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
  }


  /**
   **/
  public PinMediaSource mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("media_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getMediaId() {
    return mediaId;
  }
  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }


  /**
   * Array with image objects.
   **/
  public PinMediaSource items(List<@Valid PinMediaSourceImagesURLItemsInner> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array with image objects.")
  @JsonProperty("items")
  @NotNull
 @Size(min=2,max=5)  public List<@Valid PinMediaSourceImagesURLItemsInner> getItems() {
    return items;
  }
  public void setItems(List<@Valid PinMediaSourceImagesURLItemsInner> items) {
    this.items = items;
  }

  public PinMediaSource addItemsItem(PinMediaSourceImagesURLItemsInner itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }


  /**
   * minimum: 0
   **/
  public PinMediaSource index(Integer index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("index")
 @Min(0)  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }


  /**
   * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
   **/
  public PinMediaSource isAffiliateLink(Boolean isAffiliateLink) {
    this.isAffiliateLink = isAffiliateLink;
    return this;
  }

  
  @ApiModelProperty(value = "This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.")
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

