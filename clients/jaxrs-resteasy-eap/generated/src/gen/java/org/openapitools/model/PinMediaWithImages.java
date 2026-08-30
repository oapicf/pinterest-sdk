package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ImageMetadata;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Pin with multiple images.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-08-30T09:54:43.403996865Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PinMediaWithImages   {
  
  private List<@Valid ImageMetadata> items = new ArrayList<>();

  /**
   * Gets or Sets mediaType
   */
  public enum MediaTypeEnum {
    MULTIPLE_IMAGES("multiple_images");
    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private MediaTypeEnum mediaType;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("items")
  public List<@Valid ImageMetadata> getItems() {
    return items;
  }
  public void setItems(List<@Valid ImageMetadata> items) {
    this.items = items;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("media_type")
  @NotNull
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinMediaWithImages pinMediaWithImages = (PinMediaWithImages) o;
    return Objects.equals(this.items, pinMediaWithImages.items) &&
        Objects.equals(this.mediaType, pinMediaWithImages.mediaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, mediaType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaWithImages {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
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

