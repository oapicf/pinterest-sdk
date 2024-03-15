package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Pin media source.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-03-14T23:04:54.712028318Z[Etc/UTC]", comments = "Generator version: 7.4.0")@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "source_type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = PinMediaSourceImageBase64.class, name = "image_base64"),
  @JsonSubTypes.Type(value = PinMediaSourceImageURL.class, name = "image_url"),
  @JsonSubTypes.Type(value = PinMediaSourceImagesBase64.class, name = "multiple_image_base64"),
  @JsonSubTypes.Type(value = PinMediaSourceImagesURL.class, name = "multiple_image_urls"),
  @JsonSubTypes.Type(value = PinMediaSourcePinURL.class, name = "pin_url"),
  @JsonSubTypes.Type(value = PinMediaSourceVideoID.class, name = "video_id"),
})

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
  }

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
  }

  private ContentTypeEnum contentType;
  private String data;
  private Boolean isStandard = true;
  private String url;
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
  }

  private CoverImageContentTypeEnum coverImageContentType;
  private String coverImageData;
  private String mediaId;
  private List<@Valid PinMediaSourceImagesURLItemsInner> items = new ArrayList<>();
  private Integer index;
  private Boolean isAffiliateLink = false;

  /**
   **/
  
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
  
  @ApiModelProperty(required = true, value = "Array with image objects.")
  @JsonProperty("items")
  @NotNull
 @Size(min=2,max=5)  public List<@Valid PinMediaSourceImagesURLItemsInner> getItems() {
    return items;
  }
  public void setItems(List<@Valid PinMediaSourceImagesURLItemsInner> items) {
    this.items = items;
  }

  /**
   * minimum: 0
   **/
  
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

