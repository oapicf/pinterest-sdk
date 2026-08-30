package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Ad preview source from an image URL.
 **/
@ApiModel(description = "Ad preview source from an image URL.")
@JsonTypeName("AdPreviewSourceImage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdPreviewSourceImage   {
  private String imageUrl;
  private String promotionId;
  private String title;

  public AdPreviewSourceImage() {
  }

  @JsonCreator
  public AdPreviewSourceImage(
    @JsonProperty(required = true, value = "image_url") String imageUrl,
    @JsonProperty(required = true, value = "title") String title
  ) {
    this.imageUrl = imageUrl;
    this.title = title;
  }

  /**
   * Image URL.
   **/
  public AdPreviewSourceImage imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  
  @ApiModelProperty(example = "https://somewebsite.com/someimage.jpg", required = true, value = "Image URL.")
  @JsonProperty(required = true, value = "image_url")
  @NotNull public String getImageUrl() {
    return imageUrl;
  }

  @JsonProperty(required = true, value = "image_url")
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  /**
   * Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
   **/
  public AdPreviewSourceImage promotionId(String promotionId) {
    this.promotionId = promotionId;
    return this;
  }

  
  @ApiModelProperty(example = "7834020404549", value = "Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.")
  @JsonProperty("promotion_id")
   @Pattern(regexp="^\\d+$")public String getPromotionId() {
    return promotionId;
  }

  @JsonProperty("promotion_id")
  public void setPromotionId(String promotionId) {
    this.promotionId = promotionId;
  }

  /**
   * Title displayed below ad.
   **/
  public AdPreviewSourceImage title(String title) {
    this.title = title;
    return this;
  }

  
  @ApiModelProperty(example = "My Preview Image", required = true, value = "Title displayed below ad.")
  @JsonProperty(required = true, value = "title")
  @NotNull public String getTitle() {
    return title;
  }

  @JsonProperty(required = true, value = "title")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
