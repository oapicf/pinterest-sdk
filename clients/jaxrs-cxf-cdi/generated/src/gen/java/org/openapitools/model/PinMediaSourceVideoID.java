package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * Video ID-based media source
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Video ID-based media source")
public class PinMediaSourceVideoID   {
  

public enum SourceTypeEnum {

    VIDEO_ID(String.valueOf("video_id"));


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

  private String coverImageUrl;

  private String mediaId;


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
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }


  /**
   **/
  public PinMediaSourceVideoID coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("cover_image_url")
  @NotNull
  public String getCoverImageUrl() {
    return coverImageUrl;
  }
  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
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
  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
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
    return Objects.equals(sourceType, pinMediaSourceVideoID.sourceType) &&
        Objects.equals(coverImageUrl, pinMediaSourceVideoID.coverImageUrl) &&
        Objects.equals(mediaId, pinMediaSourceVideoID.mediaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, coverImageUrl, mediaId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceVideoID {\n");
    
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    coverImageUrl: ").append(toIndentedString(coverImageUrl)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
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

