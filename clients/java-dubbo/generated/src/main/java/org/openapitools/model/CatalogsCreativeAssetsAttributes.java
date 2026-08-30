package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CatalogsAiContentDisclosure;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class CatalogsCreativeAssetsAttributes implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Link to the creative assets page.
   */
  @JsonProperty("android_deep_link")
  private String androidDeepLink;

  /**
   * Custom grouping of creative assets.
   */
  @JsonProperty("custom_label_0")
  private String customLabel0;

  /**
   * Custom grouping of creative assets.
   */
  @JsonProperty("custom_label_1")
  private String customLabel1;

  /**
   * Custom grouping of creative assets.
   */
  @JsonProperty("custom_label_2")
  private String customLabel2;

  /**
   * Custom grouping of creative assets.
   */
  @JsonProperty("custom_label_3")
  private String customLabel3;

  /**
   * Custom grouping of creative assets.
   */
  @JsonProperty("custom_label_4")
  private String customLabel4;

  /**
   * Brief description of the creative assets.
   */
  @JsonProperty("description")
  private String description;

  /**
   * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
   */
  @JsonProperty("google_product_category")
  private String googleProductCategory;

  /**
   * IOS deep link to the creative assets page.
   */
  @JsonProperty("ios_deep_link")
  private String iosDeepLink;

  /**
   * Link to the creative assets page.
   */
  @JsonProperty("link")
  private String link;

  /**
   * The name of the creative assets.
   */
  @JsonProperty("title")
  private String title;

  /**
   * Visibility of the creative assets. Must be one of the following values (upper or lowercase): &#39;visible&#39;, &#39;hidden&#39;.
   */
  @JsonProperty("visibility")
  private String visibility;

  /**
   * AI content disclosures for individual assets (image_link or video_link) on this creative assets item. Each entry declares which disclosure types apply to a single asset URL.
   */
  @JsonProperty("ai_disclosures")
  private List<CatalogsAiContentDisclosure> aiDisclosures = new ArrayList<>();

  /**
   * The creative assets image.
   */
  @JsonProperty("image_link")
  private String imageLink;

  /**
   * The creative assets video.
   */
  @JsonProperty("video_link")
  private String videoLink;

  /**
   * Link to the creative assets page.
   * @return androidDeepLink
   */
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }

  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  /**
   * Custom grouping of creative assets.
   * @return customLabel0
   */
  public String getCustomLabel0() {
    return customLabel0;
  }

  public void setCustomLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
  }

  /**
   * Custom grouping of creative assets.
   * @return customLabel1
   */
  public String getCustomLabel1() {
    return customLabel1;
  }

  public void setCustomLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
  }

  /**
   * Custom grouping of creative assets.
   * @return customLabel2
   */
  public String getCustomLabel2() {
    return customLabel2;
  }

  public void setCustomLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
  }

  /**
   * Custom grouping of creative assets.
   * @return customLabel3
   */
  public String getCustomLabel3() {
    return customLabel3;
  }

  public void setCustomLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
  }

  /**
   * Custom grouping of creative assets.
   * @return customLabel4
   */
  public String getCustomLabel4() {
    return customLabel4;
  }

  public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

  /**
   * Brief description of the creative assets.
   * @return description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
   * @return googleProductCategory
   */
  public String getGoogleProductCategory() {
    return googleProductCategory;
  }

  public void setGoogleProductCategory(String googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
  }

  /**
   * IOS deep link to the creative assets page.
   * @return iosDeepLink
   */
  public String getIosDeepLink() {
    return iosDeepLink;
  }

  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  /**
   * Link to the creative assets page.
   * @return link
   */
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  /**
   * The name of the creative assets.
   * @return title
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Visibility of the creative assets. Must be one of the following values (upper or lowercase): &#39;visible&#39;, &#39;hidden&#39;.
   * @return visibility
   */
  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  /**
   * AI content disclosures for individual assets (image_link or video_link) on this creative assets item. Each entry declares which disclosure types apply to a single asset URL.
   * @return aiDisclosures
   */
  public List<CatalogsAiContentDisclosure> getAiDisclosures() {
    return aiDisclosures;
  }

  public void setAiDisclosures(List<CatalogsAiContentDisclosure> aiDisclosures) {
    this.aiDisclosures = aiDisclosures;
  }

  /**
   * The creative assets image.
   * @return imageLink
   */
  public String getImageLink() {
    return imageLink;
  }

  public void setImageLink(String imageLink) {
    this.imageLink = imageLink;
  }

  /**
   * The creative assets video.
   * @return videoLink
   */
  public String getVideoLink() {
    return videoLink;
  }

  public void setVideoLink(String videoLink) {
    this.videoLink = videoLink;
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
    return Objects.equals(this.androidDeepLink, catalogsCreativeAssetsAttributes.androidDeepLink) &&
        Objects.equals(this.customLabel0, catalogsCreativeAssetsAttributes.customLabel0) &&
        Objects.equals(this.customLabel1, catalogsCreativeAssetsAttributes.customLabel1) &&
        Objects.equals(this.customLabel2, catalogsCreativeAssetsAttributes.customLabel2) &&
        Objects.equals(this.customLabel3, catalogsCreativeAssetsAttributes.customLabel3) &&
        Objects.equals(this.customLabel4, catalogsCreativeAssetsAttributes.customLabel4) &&
        Objects.equals(this.description, catalogsCreativeAssetsAttributes.description) &&
        Objects.equals(this.googleProductCategory, catalogsCreativeAssetsAttributes.googleProductCategory) &&
        Objects.equals(this.iosDeepLink, catalogsCreativeAssetsAttributes.iosDeepLink) &&
        Objects.equals(this.link, catalogsCreativeAssetsAttributes.link) &&
        Objects.equals(this.title, catalogsCreativeAssetsAttributes.title) &&
        Objects.equals(this.visibility, catalogsCreativeAssetsAttributes.visibility) &&
        Objects.equals(this.aiDisclosures, catalogsCreativeAssetsAttributes.aiDisclosures) &&
        Objects.equals(this.imageLink, catalogsCreativeAssetsAttributes.imageLink) &&
        Objects.equals(this.videoLink, catalogsCreativeAssetsAttributes.videoLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidDeepLink, customLabel0, customLabel1, customLabel2, customLabel3, customLabel4, description, googleProductCategory, iosDeepLink, link, title, visibility, aiDisclosures, imageLink, videoLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsCreativeAssetsAttributes {\n");
    
    sb.append("    androidDeepLink: ").append(toIndentedString(androidDeepLink)).append("\n");
    sb.append("    customLabel0: ").append(toIndentedString(customLabel0)).append("\n");
    sb.append("    customLabel1: ").append(toIndentedString(customLabel1)).append("\n");
    sb.append("    customLabel2: ").append(toIndentedString(customLabel2)).append("\n");
    sb.append("    customLabel3: ").append(toIndentedString(customLabel3)).append("\n");
    sb.append("    customLabel4: ").append(toIndentedString(customLabel4)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    googleProductCategory: ").append(toIndentedString(googleProductCategory)).append("\n");
    sb.append("    iosDeepLink: ").append(toIndentedString(iosDeepLink)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    aiDisclosures: ").append(toIndentedString(aiDisclosures)).append("\n");
    sb.append("    imageLink: ").append(toIndentedString(imageLink)).append("\n");
    sb.append("    videoLink: ").append(toIndentedString(videoLink)).append("\n");
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
