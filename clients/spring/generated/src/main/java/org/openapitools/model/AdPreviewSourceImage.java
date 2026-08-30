package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Ad preview source from an image URL.
 */

@Schema(name = "AdPreviewSourceImage", description = "Ad preview source from an image URL.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdPreviewSourceImage implements AdPreviewRequest {

  private String imageUrl;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String promotionId;

  private String title;

  public AdPreviewSourceImage() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AdPreviewSourceImage(String imageUrl, String title) {
    this.imageUrl = imageUrl;
    this.title = title;
  }

  public AdPreviewSourceImage imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Image URL.
   * @return imageUrl
   */
  @NotNull 
  @Schema(name = "image_url", example = "https://somewebsite.com/someimage.jpg", description = "Image URL.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("image_url")
  public String getImageUrl() {
    return imageUrl;
  }

  @JsonProperty("image_url")
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public AdPreviewSourceImage promotionId(@Nullable String promotionId) {
    this.promotionId = promotionId;
    return this;
  }

  /**
   * Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
   * @return promotionId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "promotion_id", example = "7834020404549", description = "Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("promotion_id")
  public @Nullable String getPromotionId() {
    return promotionId;
  }

  @JsonProperty("promotion_id")
  public void setPromotionId(@Nullable String promotionId) {
    this.promotionId = promotionId;
  }

  public AdPreviewSourceImage title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title displayed below ad.
   * @return title
   */
  @NotNull 
  @Schema(name = "title", example = "My Preview Image", description = "Title displayed below ad.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  @JsonProperty("title")
  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdPreviewSourceImage adPreviewSourceImage = (AdPreviewSourceImage) o;
    return Objects.equals(this.imageUrl, adPreviewSourceImage.imageUrl) &&
        Objects.equals(this.promotionId, adPreviewSourceImage.promotionId) &&
        Objects.equals(this.title, adPreviewSourceImage.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUrl, promotionId, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdPreviewSourceImage {\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

