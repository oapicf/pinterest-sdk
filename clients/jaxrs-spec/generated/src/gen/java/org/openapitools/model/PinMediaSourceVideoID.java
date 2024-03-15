package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Video ID-based media source
 **/
@ApiModel(description = "Video ID-based media source")
@JsonTypeName("PinMediaSourceVideoID")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-03-14T23:05:05.545684373Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PinMediaSourceVideoID   {
  public enum SourceTypeEnum {

    VIDEO_ID(String.valueOf("video_id"));


    private String value;

    SourceTypeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static SourceTypeEnum fromString(String s) {
        for (SourceTypeEnum b : SourceTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
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

  private @Valid SourceTypeEnum sourceType;
  private @Valid String coverImageUrl;
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static CoverImageContentTypeEnum fromString(String s) {
        for (CoverImageContentTypeEnum b : CoverImageContentTypeEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static CoverImageContentTypeEnum fromValue(String value) {
        for (CoverImageContentTypeEnum b : CoverImageContentTypeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid CoverImageContentTypeEnum coverImageContentType;
  private @Valid String coverImageData;
  private @Valid String mediaId;
  private @Valid Boolean isStandard = true;

  /**
   **/
  public PinMediaSourceVideoID sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("source_type")
  @NotNull
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }

  @JsonProperty("source_type")
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  /**
   * Cover image url.
   **/
  public PinMediaSourceVideoID coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

  
  @ApiModelProperty(value = "Cover image url.")
  @JsonProperty("cover_image_url")
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  @JsonProperty("cover_image_url")
  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  /**
   * Content type for cover image Base64.
   **/
  public PinMediaSourceVideoID coverImageContentType(CoverImageContentTypeEnum coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
    return this;
  }

  
  @ApiModelProperty(value = "Content type for cover image Base64.")
  @JsonProperty("cover_image_content_type")
  public CoverImageContentTypeEnum getCoverImageContentType() {
    return coverImageContentType;
  }

  @JsonProperty("cover_image_content_type")
  public void setCoverImageContentType(CoverImageContentTypeEnum coverImageContentType) {
    this.coverImageContentType = coverImageContentType;
  }

  /**
   * Cover image Base64.
   **/
  public PinMediaSourceVideoID coverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
    return this;
  }

  
  @ApiModelProperty(value = "Cover image Base64.")
  @JsonProperty("cover_image_data")
  public String getCoverImageData() {
    return coverImageData;
  }

  @JsonProperty("cover_image_data")
  public void setCoverImageData(String coverImageData) {
    this.coverImageData = coverImageData;
  }

  /**
   **/
  public PinMediaSourceVideoID mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("media_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getMediaId() {
    return mediaId;
  }

  @JsonProperty("media_id")
  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }

  /**
   * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
   **/
  public PinMediaSourceVideoID isStandard(Boolean isStandard) {
    this.isStandard = isStandard;
    return this;
  }

  
  @ApiModelProperty(value = "Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.")
  @JsonProperty("is_standard")
  public Boolean getIsStandard() {
    return isStandard;
  }

  @JsonProperty("is_standard")
  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinMediaSourceVideoID pinMediaSourceVideoID = (PinMediaSourceVideoID) o;
    return Objects.equals(this.sourceType, pinMediaSourceVideoID.sourceType) &&
        Objects.equals(this.coverImageUrl, pinMediaSourceVideoID.coverImageUrl) &&
        Objects.equals(this.coverImageContentType, pinMediaSourceVideoID.coverImageContentType) &&
        Objects.equals(this.coverImageData, pinMediaSourceVideoID.coverImageData) &&
        Objects.equals(this.mediaId, pinMediaSourceVideoID.mediaId) &&
        Objects.equals(this.isStandard, pinMediaSourceVideoID.isStandard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, coverImageUrl, coverImageContentType, coverImageData, mediaId, isStandard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceVideoID {\n");
    
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    coverImageUrl: ").append(toIndentedString(coverImageUrl)).append("\n");
    sb.append("    coverImageContentType: ").append(toIndentedString(coverImageContentType)).append("\n");
    sb.append("    coverImageData: ").append(toIndentedString(coverImageData)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
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

