package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CatalogsCreativeAssetsAttributes
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsCreativeAssetsAttributes {

  private String title;

  private String description;

  private String link;

  private JsonNullable<String> iosDeepLink = JsonNullable.<String>undefined();

  private JsonNullable<String> androidDeepLink = JsonNullable.<String>undefined();

  private JsonNullable<String> googleProductCategory = JsonNullable.<String>undefined();

  private JsonNullable<String> customLabel0 = JsonNullable.<String>undefined();

  private JsonNullable<String> customLabel1 = JsonNullable.<String>undefined();

  private JsonNullable<String> customLabel2 = JsonNullable.<String>undefined();

  private JsonNullable<String> customLabel3 = JsonNullable.<String>undefined();

  private JsonNullable<String> customLabel4 = JsonNullable.<String>undefined();

  private JsonNullable<String> visibility = JsonNullable.<String>undefined();

  private String imageLink;

  private String videoLink;

  public CatalogsCreativeAssetsAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The name of the creative assets.
   * @return title
   */
  
  @Schema(name = "title", description = "The name of the creative assets.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CatalogsCreativeAssetsAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Brief description of the creative assets.
   * @return description
   */
  
  @Schema(name = "description", description = "Brief description of the creative assets.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CatalogsCreativeAssetsAttributes link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Link to the creative assets page.
   * @return link
   */
  
  @Schema(name = "link", description = "Link to the creative assets page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public CatalogsCreativeAssetsAttributes iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = JsonNullable.of(iosDeepLink);
    return this;
  }

  /**
   * IOS deep link to the creative assets page.
   * @return iosDeepLink
   */
  
  @Schema(name = "ios_deep_link", description = "IOS deep link to the creative assets page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ios_deep_link")
  public JsonNullable<String> getIosDeepLink() {
    return iosDeepLink;
  }

  public void setIosDeepLink(JsonNullable<String> iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  public CatalogsCreativeAssetsAttributes androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = JsonNullable.of(androidDeepLink);
    return this;
  }

  /**
   * Link to the creative assets page.
   * @return androidDeepLink
   */
  
  @Schema(name = "android_deep_link", description = "Link to the creative assets page.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("android_deep_link")
  public JsonNullable<String> getAndroidDeepLink() {
    return androidDeepLink;
  }

  public void setAndroidDeepLink(JsonNullable<String> androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  public CatalogsCreativeAssetsAttributes googleProductCategory(String googleProductCategory) {
    this.googleProductCategory = JsonNullable.of(googleProductCategory);
    return this;
  }

  /**
   * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
   * @return googleProductCategory
   */
  
  @Schema(name = "google_product_category", description = "The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("google_product_category")
  public JsonNullable<String> getGoogleProductCategory() {
    return googleProductCategory;
  }

  public void setGoogleProductCategory(JsonNullable<String> googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
  }

  public CatalogsCreativeAssetsAttributes customLabel0(String customLabel0) {
    this.customLabel0 = JsonNullable.of(customLabel0);
    return this;
  }

  /**
   * Custom grouping of creative assets.
   * @return customLabel0
   */
  
  @Schema(name = "custom_label_0", description = "Custom grouping of creative assets.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_0")
  public JsonNullable<String> getCustomLabel0() {
    return customLabel0;
  }

  public void setCustomLabel0(JsonNullable<String> customLabel0) {
    this.customLabel0 = customLabel0;
  }

  public CatalogsCreativeAssetsAttributes customLabel1(String customLabel1) {
    this.customLabel1 = JsonNullable.of(customLabel1);
    return this;
  }

  /**
   * Custom grouping of creative assets.
   * @return customLabel1
   */
  
  @Schema(name = "custom_label_1", description = "Custom grouping of creative assets.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_1")
  public JsonNullable<String> getCustomLabel1() {
    return customLabel1;
  }

  public void setCustomLabel1(JsonNullable<String> customLabel1) {
    this.customLabel1 = customLabel1;
  }

  public CatalogsCreativeAssetsAttributes customLabel2(String customLabel2) {
    this.customLabel2 = JsonNullable.of(customLabel2);
    return this;
  }

  /**
   * Custom grouping of creative assets.
   * @return customLabel2
   */
  
  @Schema(name = "custom_label_2", description = "Custom grouping of creative assets.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_2")
  public JsonNullable<String> getCustomLabel2() {
    return customLabel2;
  }

  public void setCustomLabel2(JsonNullable<String> customLabel2) {
    this.customLabel2 = customLabel2;
  }

  public CatalogsCreativeAssetsAttributes customLabel3(String customLabel3) {
    this.customLabel3 = JsonNullable.of(customLabel3);
    return this;
  }

  /**
   * Custom grouping of creative assets.
   * @return customLabel3
   */
  
  @Schema(name = "custom_label_3", description = "Custom grouping of creative assets.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_3")
  public JsonNullable<String> getCustomLabel3() {
    return customLabel3;
  }

  public void setCustomLabel3(JsonNullable<String> customLabel3) {
    this.customLabel3 = customLabel3;
  }

  public CatalogsCreativeAssetsAttributes customLabel4(String customLabel4) {
    this.customLabel4 = JsonNullable.of(customLabel4);
    return this;
  }

  /**
   * Custom grouping of creative assets.
   * @return customLabel4
   */
  
  @Schema(name = "custom_label_4", description = "Custom grouping of creative assets.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_label_4")
  public JsonNullable<String> getCustomLabel4() {
    return customLabel4;
  }

  public void setCustomLabel4(JsonNullable<String> customLabel4) {
    this.customLabel4 = customLabel4;
  }

  public CatalogsCreativeAssetsAttributes visibility(String visibility) {
    this.visibility = JsonNullable.of(visibility);
    return this;
  }

  /**
   * Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
   * @return visibility
   */
  
  @Schema(name = "visibility", description = "Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("visibility")
  public JsonNullable<String> getVisibility() {
    return visibility;
  }

  public void setVisibility(JsonNullable<String> visibility) {
    this.visibility = visibility;
  }

  public CatalogsCreativeAssetsAttributes imageLink(String imageLink) {
    this.imageLink = imageLink;
    return this;
  }

  /**
   * The creative assets image.
   * @return imageLink
   */
  
  @Schema(name = "image_link", example = "https://scene.example.com/image/image_v2.jpg", description = "The creative assets image.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("image_link")
  public String getImageLink() {
    return imageLink;
  }

  public void setImageLink(String imageLink) {
    this.imageLink = imageLink;
  }

  public CatalogsCreativeAssetsAttributes videoLink(String videoLink) {
    this.videoLink = videoLink;
    return this;
  }

  /**
   * The creative assets video.
   * @return videoLink
   */
  
  @Schema(name = "video_link", example = "https://scene.example.com/image/image_v2.mp4", description = "The creative assets video.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("video_link")
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
    return Objects.equals(this.title, catalogsCreativeAssetsAttributes.title) &&
        Objects.equals(this.description, catalogsCreativeAssetsAttributes.description) &&
        Objects.equals(this.link, catalogsCreativeAssetsAttributes.link) &&
        equalsNullable(this.iosDeepLink, catalogsCreativeAssetsAttributes.iosDeepLink) &&
        equalsNullable(this.androidDeepLink, catalogsCreativeAssetsAttributes.androidDeepLink) &&
        equalsNullable(this.googleProductCategory, catalogsCreativeAssetsAttributes.googleProductCategory) &&
        equalsNullable(this.customLabel0, catalogsCreativeAssetsAttributes.customLabel0) &&
        equalsNullable(this.customLabel1, catalogsCreativeAssetsAttributes.customLabel1) &&
        equalsNullable(this.customLabel2, catalogsCreativeAssetsAttributes.customLabel2) &&
        equalsNullable(this.customLabel3, catalogsCreativeAssetsAttributes.customLabel3) &&
        equalsNullable(this.customLabel4, catalogsCreativeAssetsAttributes.customLabel4) &&
        equalsNullable(this.visibility, catalogsCreativeAssetsAttributes.visibility) &&
        Objects.equals(this.imageLink, catalogsCreativeAssetsAttributes.imageLink) &&
        Objects.equals(this.videoLink, catalogsCreativeAssetsAttributes.videoLink);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, link, hashCodeNullable(iosDeepLink), hashCodeNullable(androidDeepLink), hashCodeNullable(googleProductCategory), hashCodeNullable(customLabel0), hashCodeNullable(customLabel1), hashCodeNullable(customLabel2), hashCodeNullable(customLabel3), hashCodeNullable(customLabel4), hashCodeNullable(visibility), imageLink, videoLink);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

