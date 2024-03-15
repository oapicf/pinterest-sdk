/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.12.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-03-14T23:03:06.281391477Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

  /**
   */
  public PinMediaSource sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("source_type")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  /**
   */
  public PinMediaSource contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("content_type")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  /**
   */
  public PinMediaSource data(String data) {
    this.data = data;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("data")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  /**
   * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
   */
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
   */
  public PinMediaSource url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Cover image url.
   */
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
   */
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
   */
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
   */
  public PinMediaSource mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("media_id")
  public String getMediaId() {
    return mediaId;
  }
  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  /**
   * Array with image objects.
   */
  public PinMediaSource items(List<PinMediaSourceImagesURLItemsInner> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Array with image objects.")
  @JsonProperty("items")
  public List<PinMediaSourceImagesURLItemsInner> getItems() {
    return items;
  }
  public void setItems(List<PinMediaSourceImagesURLItemsInner> items) {
    this.items = items;
  }

  /**
   * minimum: 0
   */
  public PinMediaSource index(Integer index) {
    this.index = index;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("index")
  public Integer getIndex() {
    return index;
  }
  public void setIndex(Integer index) {
    this.index = index;
  }

  /**
   * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
   */
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

