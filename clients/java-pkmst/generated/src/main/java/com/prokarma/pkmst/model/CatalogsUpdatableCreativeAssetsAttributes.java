package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * CatalogsUpdatableCreativeAssetsAttributes
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CatalogsUpdatableCreativeAssetsAttributes   {
  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("link")
  private String link;

  @JsonProperty("ios_deep_link")
  private String iosDeepLink;

  @JsonProperty("android_deep_link")
  private String androidDeepLink;

  @JsonProperty("google_product_category")
  private String googleProductCategory;

  @JsonProperty("custom_label_0")
  private String customLabel0;

  @JsonProperty("custom_label_1")
  private String customLabel1;

  @JsonProperty("custom_label_2")
  private String customLabel2;

  @JsonProperty("custom_label_3")
  private String customLabel3;

  @JsonProperty("custom_label_4")
  private String customLabel4;

  @JsonProperty("visibility")
  private String visibility;

  public CatalogsUpdatableCreativeAssetsAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The name of the creative assets.
   * @return title
   */
  @ApiModelProperty(value = "The name of the creative assets.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public CatalogsUpdatableCreativeAssetsAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Brief description of the creative assets.
   * @return description
   */
  @ApiModelProperty(value = "Brief description of the creative assets.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CatalogsUpdatableCreativeAssetsAttributes link(String link) {
    this.link = link;
    return this;
  }

  /**
   * Link to the creative assets page.
   * @return link
   */
  @ApiModelProperty(value = "Link to the creative assets page.")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public CatalogsUpdatableCreativeAssetsAttributes iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
    return this;
  }

  /**
   * IOS deep link to the creative assets page.
   * @return iosDeepLink
   */
  @ApiModelProperty(value = "IOS deep link to the creative assets page.")
  public String getIosDeepLink() {
    return iosDeepLink;
  }

  public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  public CatalogsUpdatableCreativeAssetsAttributes androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
    return this;
  }

  /**
   * Link to the creative assets page.
   * @return androidDeepLink
   */
  @ApiModelProperty(value = "Link to the creative assets page.")
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }

  public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  public CatalogsUpdatableCreativeAssetsAttributes googleProductCategory(String googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
    return this;
  }

  /**
   * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
   * @return googleProductCategory
   */
  @ApiModelProperty(value = "The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.")
  public String getGoogleProductCategory() {
    return googleProductCategory;
  }

  public void setGoogleProductCategory(String googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
  }

  public CatalogsUpdatableCreativeAssetsAttributes customLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

  /**
   * Custom grouping of creative assets.
   * @return customLabel0
   */
  @ApiModelProperty(value = "Custom grouping of creative assets.")
  public String getCustomLabel0() {
    return customLabel0;
  }

  public void setCustomLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
  }

  public CatalogsUpdatableCreativeAssetsAttributes customLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

  /**
   * Custom grouping of creative assets.
   * @return customLabel1
   */
  @ApiModelProperty(value = "Custom grouping of creative assets.")
  public String getCustomLabel1() {
    return customLabel1;
  }

  public void setCustomLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
  }

  public CatalogsUpdatableCreativeAssetsAttributes customLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

  /**
   * Custom grouping of creative assets.
   * @return customLabel2
   */
  @ApiModelProperty(value = "Custom grouping of creative assets.")
  public String getCustomLabel2() {
    return customLabel2;
  }

  public void setCustomLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
  }

  public CatalogsUpdatableCreativeAssetsAttributes customLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

  /**
   * Custom grouping of creative assets.
   * @return customLabel3
   */
  @ApiModelProperty(value = "Custom grouping of creative assets.")
  public String getCustomLabel3() {
    return customLabel3;
  }

  public void setCustomLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
  }

  public CatalogsUpdatableCreativeAssetsAttributes customLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

  /**
   * Custom grouping of creative assets.
   * @return customLabel4
   */
  @ApiModelProperty(value = "Custom grouping of creative assets.")
  public String getCustomLabel4() {
    return customLabel4;
  }

  public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

  public CatalogsUpdatableCreativeAssetsAttributes visibility(String visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
   * @return visibility
   */
  @ApiModelProperty(value = "Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.")
  public String getVisibility() {
    return visibility;
  }

  public void setVisibility(String visibility) {
    this.visibility = visibility;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsUpdatableCreativeAssetsAttributes catalogsUpdatableCreativeAssetsAttributes = (CatalogsUpdatableCreativeAssetsAttributes) o;
    return Objects.equals(this.title, catalogsUpdatableCreativeAssetsAttributes.title) &&
        Objects.equals(this.description, catalogsUpdatableCreativeAssetsAttributes.description) &&
        Objects.equals(this.link, catalogsUpdatableCreativeAssetsAttributes.link) &&
        Objects.equals(this.iosDeepLink, catalogsUpdatableCreativeAssetsAttributes.iosDeepLink) &&
        Objects.equals(this.androidDeepLink, catalogsUpdatableCreativeAssetsAttributes.androidDeepLink) &&
        Objects.equals(this.googleProductCategory, catalogsUpdatableCreativeAssetsAttributes.googleProductCategory) &&
        Objects.equals(this.customLabel0, catalogsUpdatableCreativeAssetsAttributes.customLabel0) &&
        Objects.equals(this.customLabel1, catalogsUpdatableCreativeAssetsAttributes.customLabel1) &&
        Objects.equals(this.customLabel2, catalogsUpdatableCreativeAssetsAttributes.customLabel2) &&
        Objects.equals(this.customLabel3, catalogsUpdatableCreativeAssetsAttributes.customLabel3) &&
        Objects.equals(this.customLabel4, catalogsUpdatableCreativeAssetsAttributes.customLabel4) &&
        Objects.equals(this.visibility, catalogsUpdatableCreativeAssetsAttributes.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, link, iosDeepLink, androidDeepLink, googleProductCategory, customLabel0, customLabel1, customLabel2, customLabel3, customLabel4, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsUpdatableCreativeAssetsAttributes {\n");
    
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

