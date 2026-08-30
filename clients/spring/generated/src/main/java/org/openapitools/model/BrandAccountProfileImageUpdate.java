package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Base64-encoded image media source
 */

@Schema(name = "BrandAccountProfileImageUpdate", description = "Base64-encoded image media source")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BrandAccountProfileImageUpdate {

  /**
   * Gets or Sets contentType
   */
  public enum ContentTypeEnum {
    IMAGE_JPEG("image/jpeg"),
    
    IMAGE_PNG("image/png");

    private final String value;

    ContentTypeEnum(String value) {
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
    public static ContentTypeEnum fromValue(String value) {
      for (ContentTypeEnum b : ContentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ContentTypeEnum contentType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String data;

  public BrandAccountProfileImageUpdate contentType(@Nullable ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
   */
  
  @Schema(name = "content_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("content_type")
  public @Nullable ContentTypeEnum getContentType() {
    return contentType;
  }

  @JsonProperty("content_type")
  public void setContentType(@Nullable ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  public BrandAccountProfileImageUpdate data(@Nullable String data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @Pattern(regexp = "[a-zA-Z0-9+/=]+") 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("data")
  public @Nullable String getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(@Nullable String data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAccountProfileImageUpdate brandAccountProfileImageUpdate = (BrandAccountProfileImageUpdate) o;
    return Objects.equals(this.contentType, brandAccountProfileImageUpdate.contentType) &&
        Objects.equals(this.data, brandAccountProfileImageUpdate.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandAccountProfileImageUpdate {\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

