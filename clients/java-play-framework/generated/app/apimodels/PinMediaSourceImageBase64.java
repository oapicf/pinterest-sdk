package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Base64-encoded image media source
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PinMediaSourceImageBase64   {
  /**
   * Gets or Sets sourceType
   */
  public enum SourceTypeEnum {
    IMAGE_BASE64("image_base64");

    private final String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("source_type")
  @NotNull

  private SourceTypeEnum sourceType;

  /**
   * Gets or Sets contentType
   */
  public enum ContentTypeEnum {
    JPEG("image/jpeg"),
    
    PNG("image/png");

    private final String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
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

  @JsonProperty("content_type")
  @NotNull

  private ContentTypeEnum contentType;

  @JsonProperty("data")
  @NotNull
@Pattern(regexp="[a-zA-Z0-9+/=]+")

  private String data;

  @JsonProperty("is_standard")
  
  private Boolean isStandard = true;

  public PinMediaSourceImageBase64 sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }

  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }

  public PinMediaSourceImageBase64 contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  public ContentTypeEnum getContentType() {
    return contentType;
  }

  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }

  public PinMediaSourceImageBase64 data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
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
  **/
  public Boolean getIsStandard() {
    return isStandard;
  }

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
    PinMediaSourceImageBase64 pinMediaSourceImageBase64 = (PinMediaSourceImageBase64) o;
    return Objects.equals(sourceType, pinMediaSourceImageBase64.sourceType) &&
        Objects.equals(contentType, pinMediaSourceImageBase64.contentType) &&
        Objects.equals(data, pinMediaSourceImageBase64.data) &&
        Objects.equals(isStandard, pinMediaSourceImageBase64.isStandard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceType, contentType, data, isStandard);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceImageBase64 {\n");
    
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

