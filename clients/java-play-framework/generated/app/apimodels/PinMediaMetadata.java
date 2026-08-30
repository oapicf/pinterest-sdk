package apimodels;

import apimodels.ImageMetadata;
import apimodels.ImageSize;
import apimodels.VideoMetadataWithItemType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Per-item entry inside &#x60;PinMedia.items&#x60; for mixed image/video pins. Discriminated by &#x60;item_type&#x60;.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PinMediaMetadata   {
  @JsonProperty("description")
  
  private String description;

  @JsonProperty("images")
  @Valid

  private ImageSize images;

  /**
   * Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
   */
  public enum ItemTypeEnum {
    VIDEO("video");

    private final String value;

    ItemTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ItemTypeEnum fromValue(String value) {
      for (ItemTypeEnum b : ItemTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("item_type")
  @NotNull

  private ItemTypeEnum itemType;

  @JsonProperty("link")
  
  private String link;

  @JsonProperty("title")
  
  private String title;

  @JsonProperty("cover_image_url")
  
  private String coverImageUrl;

  @JsonProperty("duration")
  @Valid

  private BigDecimal duration;

  @JsonProperty("height")
  
  private Integer height;

  @JsonProperty("video_url")
  
  private String videoUrl;

  @JsonProperty("video_url_hls")
  
  private String videoUrlHls;

  @JsonProperty("width")
  
  private Integer width;

  public PinMediaMetadata description(String description) {
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

  public PinMediaMetadata images(ImageSize images) {
    this.images = images;
    return this;
  }

   /**
   * Get images
   * @return images
  **/
  public ImageSize getImages() {
    return images;
  }

  public void setImages(ImageSize images) {
    this.images = images;
  }

  public PinMediaMetadata itemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
    return this;
  }

   /**
   * Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
   * @return itemType
  **/
  public ItemTypeEnum getItemType() {
    return itemType;
  }

  public void setItemType(ItemTypeEnum itemType) {
    this.itemType = itemType;
  }

  public PinMediaMetadata link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public PinMediaMetadata title(String title) {
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

  public PinMediaMetadata coverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
    return this;
  }

   /**
   * Get coverImageUrl
   * @return coverImageUrl
  **/
  public String getCoverImageUrl() {
    return coverImageUrl;
  }

  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }

  public PinMediaMetadata duration(BigDecimal duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Duration (in miliseconds). Field maybe null after creation due to video processing time.
   * @return duration
  **/
  public BigDecimal getDuration() {
    return duration;
  }

  public void setDuration(BigDecimal duration) {
    this.duration = duration;
  }

  public PinMediaMetadata height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * Height (in pixels). Field maybe null after creation due to video processing time.
   * @return height
  **/
  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public PinMediaMetadata videoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * Video url (720p).  **Note:** This field is limited and not available to all apps.
   * @return videoUrl
  **/
  public String getVideoUrl() {
    return videoUrl;
  }

  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }

  public PinMediaMetadata videoUrlHls(String videoUrlHls) {
    this.videoUrlHls = videoUrlHls;
    return this;
  }

   /**
   * Video url (HLS).  **Note:** This field is limited and not available to all apps.
   * @return videoUrlHls
  **/
  public String getVideoUrlHls() {
    return videoUrlHls;
  }

  public void setVideoUrlHls(String videoUrlHls) {
    this.videoUrlHls = videoUrlHls;
  }

  public PinMediaMetadata width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Width (in pixels). Field maybe null after creation due to video processing time.
   * @return width
  **/
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinMediaMetadata pinMediaMetadata = (PinMediaMetadata) o;
    return Objects.equals(description, pinMediaMetadata.description) &&
        Objects.equals(images, pinMediaMetadata.images) &&
        Objects.equals(itemType, pinMediaMetadata.itemType) &&
        Objects.equals(link, pinMediaMetadata.link) &&
        Objects.equals(title, pinMediaMetadata.title) &&
        Objects.equals(coverImageUrl, pinMediaMetadata.coverImageUrl) &&
        Objects.equals(duration, pinMediaMetadata.duration) &&
        Objects.equals(height, pinMediaMetadata.height) &&
        Objects.equals(videoUrl, pinMediaMetadata.videoUrl) &&
        Objects.equals(videoUrlHls, pinMediaMetadata.videoUrlHls) &&
        Objects.equals(width, pinMediaMetadata.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, images, itemType, link, title, coverImageUrl, duration, height, videoUrl, videoUrlHls, width);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinMediaMetadata {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    coverImageUrl: ").append(toIndentedString(coverImageUrl)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
    sb.append("    videoUrlHls: ").append(toIndentedString(videoUrlHls)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

