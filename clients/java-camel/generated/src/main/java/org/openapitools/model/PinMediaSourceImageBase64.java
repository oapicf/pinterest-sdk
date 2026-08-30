package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.ContentType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Image Base64-based media source.
 */

@Schema(name = "PinMediaSourceImageBase64", description = "Image Base64-based media source.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinMediaSourceImageBase64 implements PinMediaSource {

  private ContentType contentType;

  private String data;

  private Boolean isStandard = true;

  /**
   * The source type of the media.
   */
  public enum SourceTypeEnum {
    IMAGE_BASE64("image_base64");

    private final String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
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

  private SourceTypeEnum sourceType;

  public PinMediaSourceImageBase64() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PinMediaSourceImageBase64(ContentType contentType, String data, SourceTypeEnum sourceType) {
    this.contentType = contentType;
    this.data = data;
    this.sourceType = sourceType;
  }

  public PinMediaSourceImageBase64 contentType(ContentType contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
   */
  @NotNull @Valid 
  @Schema(name = "content_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content_type")
  public ContentType getContentType() {
    return contentType;
  }

  public void setContentType(ContentType contentType) {
    this.contentType = contentType;
  }

  public PinMediaSourceImageBase64 data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @NotNull @Pattern(regexp = "^[a-zA-Z0-9+/=]+$") 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public PinMediaSourceImageBase64 isStandard(Boolean isStandard) {
    this.isStandard = isStandard;
    return this;
  }

  /**
   * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
   * @return isStandard
   */
  
  @Schema(name = "is_standard", description = "Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_standard")
  public Boolean getIsStandard() {
    return isStandard;
  }

  public void setIsStandard(Boolean isStandard) {
    this.isStandard = isStandard;
  }

  public PinMediaSourceImageBase64 sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  /**
   * The source type of the media.
   * @return sourceType
   */
  @NotNull 
  @Schema(name = "source_type", description = "The source type of the media.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("source_type")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinMediaSourceImageBase64 pinMediaSourceImageBase64 = (PinMediaSourceImageBase64) o;
    return Objects.equals(this.contentType, pinMediaSourceImageBase64.contentType) &&
        Objects.equals(this.data, pinMediaSourceImageBase64.data) &&
        Objects.equals(this.isStandard, pinMediaSourceImageBase64.isStandard) &&
        Objects.equals(this.sourceType, pinMediaSourceImageBase64.sourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, data, isStandard, sourceType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceImageBase64 {\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    isStandard: ").append(toIndentedString(isStandard)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
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

