package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Ad preview source from an image URL.
 */
@ApiModel(description="Ad preview source from an image URL.")

public class AdPreviewSourceImage  {
  
 /**
  * Image URL.
  */
  @ApiModelProperty(example = "https://somewebsite.com/someimage.jpg", required = true, value = "Image URL.")
  private String imageUrl;

 /**
  * Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
  */
  @ApiModelProperty(example = "7834020404549", value = "Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.")
  private String promotionId;

 /**
  * Title displayed below ad.
  */
  @ApiModelProperty(example = "My Preview Image", required = true, value = "Title displayed below ad.")
  private String title;
 /**
  * Image URL.
  * @return imageUrl
  */
  @JsonProperty("image_url")
  @NotNull
  public String getImageUrl() {
    return imageUrl;
  }

  /**
   * Sets the <code>imageUrl</code> property.
   */
 public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  /**
   * Sets the <code>imageUrl</code> property.
   */
  public AdPreviewSourceImage imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

 /**
  * Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
  * @return promotionId
  */
  @JsonProperty("promotion_id")
 @Pattern(regexp="^\\d+$")  public String getPromotionId() {
    return promotionId;
  }

  /**
   * Sets the <code>promotionId</code> property.
   */
 public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }

  /**
   * Sets the <code>promotionId</code> property.
   */
  public AdPreviewSourceImage promotionId(String promotionId) {
    this.promotionId = promotionId;
    return this;
  }

 /**
  * Title displayed below ad.
  * @return title
  */
  @JsonProperty("title")
  @NotNull
  public String getTitle() {
    return title;
  }

  /**
   * Sets the <code>title</code> property.
   */
 public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Sets the <code>title</code> property.
   */
  public AdPreviewSourceImage title(String title) {
    this.title = title;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

