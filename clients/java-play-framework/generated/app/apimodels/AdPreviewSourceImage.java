package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Ad preview source from an image URL.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdPreviewSourceImage   {
  @JsonProperty("image_url")
  @NotNull

  private String imageUrl;

  @JsonProperty("promotion_id")
  @Pattern(regexp="^\\d+$")

  private String promotionId;

  @JsonProperty("title")
  @NotNull

  private String title;

  public AdPreviewSourceImage imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Image URL.
   * @return imageUrl
  **/
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public AdPreviewSourceImage promotionId(String promotionId) {
    this.promotionId = promotionId;
    return this;
  }

   /**
   * Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
   * @return promotionId
  **/
  public String getPromotionId() {
    return promotionId;
  }

  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }

  public AdPreviewSourceImage title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title displayed below ad.
   * @return title
  **/
  public String getTitle() {
    return title;
  }

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
    return Objects.equals(imageUrl, adPreviewSourceImage.imageUrl) &&
        Objects.equals(promotionId, adPreviewSourceImage.promotionId) &&
        Objects.equals(title, adPreviewSourceImage.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageUrl, promotionId, title);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

