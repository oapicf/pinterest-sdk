package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsCreativeAssetsAttributes  {
  
  @ApiModelProperty(value = "The name of the creative assets.")
 /**
   * The name of the creative assets.
  **/
  private String title;

  @ApiModelProperty(value = "Brief description of the creative assets.")
 /**
   * Brief description of the creative assets.
  **/
  private String description;

  @ApiModelProperty(value = "Link to the creative assets page.")
 /**
   * Link to the creative assets page.
  **/
  private String link;

  @ApiModelProperty(value = "IOS deep link to the creative assets page.")
 /**
   * IOS deep link to the creative assets page.
  **/
  private String iosDeepLink;

  @ApiModelProperty(value = "Link to the creative assets page.")
 /**
   * Link to the creative assets page.
  **/
  private String androidDeepLink;

  @ApiModelProperty(value = "The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.")
 /**
   * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
  **/
  private String googleProductCategory;

  @ApiModelProperty(value = "Custom grouping of creative assets.")
 /**
   * Custom grouping of creative assets.
  **/
  private String customLabel0;

  @ApiModelProperty(value = "Custom grouping of creative assets.")
 /**
   * Custom grouping of creative assets.
  **/
  private String customLabel1;

  @ApiModelProperty(value = "Custom grouping of creative assets.")
 /**
   * Custom grouping of creative assets.
  **/
  private String customLabel2;

  @ApiModelProperty(value = "Custom grouping of creative assets.")
 /**
   * Custom grouping of creative assets.
  **/
  private String customLabel3;

  @ApiModelProperty(value = "Custom grouping of creative assets.")
 /**
   * Custom grouping of creative assets.
  **/
  private String customLabel4;

  @ApiModelProperty(value = "Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.")
 /**
   * Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
  **/
  private String visibility;

  @ApiModelProperty(example = "https://scene.example.com/image/image_v2.jpg", value = "The creative assets image.")
 /**
   * The creative assets image.
  **/
  private String imageLink;

  @ApiModelProperty(example = "https://scene.example.com/image/image_v2.mp4", value = "The creative assets video.")
 /**
   * The creative assets video.
  **/
  private String videoLink;
 /**
   * The name of the creative assets.
   * @return title
  **/
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CatalogsCreativeAssetsAttributes title(String title) {
    this.title = title;
    return this;
  }

 /**
   * Brief description of the creative assets.
   * @return description
  **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CatalogsCreativeAssetsAttributes description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Link to the creative assets page.
   * @return link
  **/
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public CatalogsCreativeAssetsAttributes link(String link) {
    this.link = link;
    return this;
  }

 /**
   * IOS deep link to the creative assets page.
   * @return iosDeepLink
  **/
  @JsonProperty("ios_deep_link")
  public String getIosDeepLink() {
    return iosDeepLink;
  }

  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  public CatalogsCreativeAssetsAttributes iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
    return this;
  }

 /**
   * Link to the creative assets page.
   * @return androidDeepLink
  **/
  @JsonProperty("android_deep_link")
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }

  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  public CatalogsCreativeAssetsAttributes androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
    return this;
  }

 /**
   * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
   * @return googleProductCategory
  **/
  @JsonProperty("google_product_category")
  public String getGoogleProductCategory() {
    return googleProductCategory;
  }

  public void setGoogleProductCategory(String googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
  }

  public CatalogsCreativeAssetsAttributes googleProductCategory(String googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
    return this;
  }

 /**
   * Custom grouping of creative assets.
   * @return customLabel0
  **/
  @JsonProperty("custom_label_0")
  public String getCustomLabel0() {
    return customLabel0;
  }

  public void setCustomLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
  }

  public CatalogsCreativeAssetsAttributes customLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

 /**
   * Custom grouping of creative assets.
   * @return customLabel1
  **/
  @JsonProperty("custom_label_1")
  public String getCustomLabel1() {
    return customLabel1;
  }

  public void setCustomLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
  }

  public CatalogsCreativeAssetsAttributes customLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

 /**
   * Custom grouping of creative assets.
   * @return customLabel2
  **/
  @JsonProperty("custom_label_2")
  public String getCustomLabel2() {
    return customLabel2;
  }

  public void setCustomLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
  }

  public CatalogsCreativeAssetsAttributes customLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

 /**
   * Custom grouping of creative assets.
   * @return customLabel3
  **/
  @JsonProperty("custom_label_3")
  public String getCustomLabel3() {
    return customLabel3;
  }

  public void setCustomLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
  }

  public CatalogsCreativeAssetsAttributes customLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

 /**
   * Custom grouping of creative assets.
   * @return customLabel4
  **/
  @JsonProperty("custom_label_4")
  public String getCustomLabel4() {
    return customLabel4;
  }

  public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

  public CatalogsCreativeAssetsAttributes customLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

 /**
   * Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
   * @return visibility
  **/
  @JsonProperty("visibility")
  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  public CatalogsCreativeAssetsAttributes visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

 /**
   * The creative assets image.
   * @return imageLink
  **/
  @JsonProperty("image_link")
  public String getImageLink() {
    return imageLink;
  }

  public void setImageLink(String imageLink) {
    this.imageLink = imageLink;
  }

  public CatalogsCreativeAssetsAttributes imageLink(String imageLink) {
    this.imageLink = imageLink;
    return this;
  }

 /**
   * The creative assets video.
   * @return videoLink
  **/
  @JsonProperty("video_link")
  public String getVideoLink() {
    return videoLink;
  }

  public void setVideoLink(String videoLink) {
    this.videoLink = videoLink;
  }

  public CatalogsCreativeAssetsAttributes videoLink(String videoLink) {
    this.videoLink = videoLink;
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
    CatalogsCreativeAssetsAttributes catalogsCreativeAssetsAttributes = (CatalogsCreativeAssetsAttributes) o;
    return Objects.equals(this.title, catalogsCreativeAssetsAttributes.title) &&
        Objects.equals(this.description, catalogsCreativeAssetsAttributes.description) &&
        Objects.equals(this.link, catalogsCreativeAssetsAttributes.link) &&
        Objects.equals(this.iosDeepLink, catalogsCreativeAssetsAttributes.iosDeepLink) &&
        Objects.equals(this.androidDeepLink, catalogsCreativeAssetsAttributes.androidDeepLink) &&
        Objects.equals(this.googleProductCategory, catalogsCreativeAssetsAttributes.googleProductCategory) &&
        Objects.equals(this.customLabel0, catalogsCreativeAssetsAttributes.customLabel0) &&
        Objects.equals(this.customLabel1, catalogsCreativeAssetsAttributes.customLabel1) &&
        Objects.equals(this.customLabel2, catalogsCreativeAssetsAttributes.customLabel2) &&
        Objects.equals(this.customLabel3, catalogsCreativeAssetsAttributes.customLabel3) &&
        Objects.equals(this.customLabel4, catalogsCreativeAssetsAttributes.customLabel4) &&
        Objects.equals(this.visibility, catalogsCreativeAssetsAttributes.visibility) &&
        Objects.equals(this.imageLink, catalogsCreativeAssetsAttributes.imageLink) &&
        Objects.equals(this.videoLink, catalogsCreativeAssetsAttributes.videoLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, link, iosDeepLink, androidDeepLink, googleProductCategory, customLabel0, customLabel1, customLabel2, customLabel3, customLabel4, visibility, imageLink, videoLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsAttributes {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    iosDeepLink: ").append(toIndentedString(iosDeepLink)).append("\n");
    sb.append("    androidDeepLink: ").append(toIndentedString(androidDeepLink)).append("\n");
    sb.append("    googleProductCategory: ").append(toIndentedString(googleProductCategory)).append("\n");
    sb.append("    customLabel0: ").append(toIndentedString(customLabel0)).append("\n");
    sb.append("    customLabel1: ").append(toIndentedString(customLabel1)).append("\n");
    sb.append("    customLabel2: ").append(toIndentedString(customLabel2)).append("\n");
    sb.append("    customLabel3: ").append(toIndentedString(customLabel3)).append("\n");
    sb.append("    customLabel4: ").append(toIndentedString(customLabel4)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    imageLink: ").append(toIndentedString(imageLink)).append("\n");
    sb.append("    videoLink: ").append(toIndentedString(videoLink)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

