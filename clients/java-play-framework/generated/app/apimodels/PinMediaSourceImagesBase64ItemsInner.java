package apimodels;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * PinMediaSourceImagesBase64ItemsInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-03-14T23:02:53.026613321Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PinMediaSourceImagesBase64ItemsInner   {
  @JsonProperty("title")
  
  private String title;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("link")
  
  private String link;

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

  public PinMediaSourceImagesBase64ItemsInner title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PinMediaSourceImagesBase64ItemsInner description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PinMediaSourceImagesBase64ItemsInner link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Destination link for the image.
   * @return link
  **/
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public PinMediaSourceImagesBase64ItemsInner contentType(ContentTypeEnum contentType) {
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

  public PinMediaSourceImagesBase64ItemsInner data(String data) {
    this.data = data;
    return this;
  }

   /**
   * Image to upload as base64 string.
   * @return data
  **/
  public String getData() {
    return data;
  }

  public void setData(String data) {
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
    PinMediaSourceImagesBase64ItemsInner pinMediaSourceImagesBase64ItemsInner = (PinMediaSourceImagesBase64ItemsInner) o;
    return Objects.equals(title, pinMediaSourceImagesBase64ItemsInner.title) &&
        Objects.equals(description, pinMediaSourceImagesBase64ItemsInner.description) &&
        Objects.equals(link, pinMediaSourceImagesBase64ItemsInner.link) &&
        Objects.equals(contentType, pinMediaSourceImagesBase64ItemsInner.contentType) &&
        Objects.equals(data, pinMediaSourceImagesBase64ItemsInner.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, link, contentType, data);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaSourceImagesBase64ItemsInner {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

