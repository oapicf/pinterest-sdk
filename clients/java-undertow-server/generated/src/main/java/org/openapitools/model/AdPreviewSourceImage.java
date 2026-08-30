/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Ad preview source from an image URL.
 */

@ApiModel(description = "Ad preview source from an image URL.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdPreviewSourceImage   {
  
  private String imageUrl;
  private String promotionId;
  private String title;

  /**
   * Image URL.
   */
  public AdPreviewSourceImage imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  
  @ApiModelProperty(example = "https://somewebsite.com/someimage.jpg", required = true, value = "Image URL.")
  @JsonProperty("image_url")
  public String getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  /**
   * Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
   */
  public AdPreviewSourceImage promotionId(String promotionId) {
    this.promotionId = promotionId;
    return this;
  }

  
  @ApiModelProperty(example = "7834020404549", value = "Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.")
  @JsonProperty("promotion_id")
  public String getPromotionId() {
    return promotionId;
  }
  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }

  /**
   * Title displayed below ad.
   */
  public AdPreviewSourceImage title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(example = "My Preview Image", required = true, value = "Title displayed below ad.")
  @JsonProperty("title")
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

