package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CatalogsUpdatableCreativeAssetsAttributes  {
  
 /**
  * The name of the creative assets.
  */
  @ApiModelProperty(value = "The name of the creative assets.")
  private String title;

 /**
  * Brief description of the creative assets.
  */
  @ApiModelProperty(value = "Brief description of the creative assets.")
  private String description;

 /**
  * Link to the creative assets page.
  */
  @ApiModelProperty(value = "Link to the creative assets page.")
  private String link;

 /**
  * IOS deep link to the creative assets page.
  */
  @ApiModelProperty(value = "IOS deep link to the creative assets page.")
  private String iosDeepLink;

 /**
  * Link to the creative assets page.
  */
  @ApiModelProperty(value = "Link to the creative assets page.")
  private String androidDeepLink;

 /**
  * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
  */
  @ApiModelProperty(value = "The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.")
  private String googleProductCategory;

 /**
  * Custom grouping of creative assets.
  */
  @ApiModelProperty(value = "Custom grouping of creative assets.")
  private String customLabel0;

 /**
  * Custom grouping of creative assets.
  */
  @ApiModelProperty(value = "Custom grouping of creative assets.")
  private String customLabel1;

 /**
  * Custom grouping of creative assets.
  */
  @ApiModelProperty(value = "Custom grouping of creative assets.")
  private String customLabel2;

 /**
  * Custom grouping of creative assets.
  */
  @ApiModelProperty(value = "Custom grouping of creative assets.")
  private String customLabel3;

 /**
  * Custom grouping of creative assets.
  */
  @ApiModelProperty(value = "Custom grouping of creative assets.")
  private String customLabel4;

 /**
  * Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
  */
  @ApiModelProperty(value = "Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.")
  private String visibility;
 /**
  * The name of the creative assets.
  * @return title
  */
  @JsonProperty("title")
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
  public CatalogsUpdatableCreativeAssetsAttributes title(String title) {
    this.title = title;
    return this;
  }

 /**
  * Brief description of the creative assets.
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public CatalogsUpdatableCreativeAssetsAttributes description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Link to the creative assets page.
  * @return link
  */
  @JsonProperty("link")
  public String getLink() {
    return link;
  }

  /**
   * Sets the <code>link</code> property.
   */
 public void setLink(String link) {
    this.link = link;
  }

  /**
   * Sets the <code>link</code> property.
   */
  public CatalogsUpdatableCreativeAssetsAttributes link(String link) {
    this.link = link;
    return this;
  }

 /**
  * IOS deep link to the creative assets page.
  * @return iosDeepLink
  */
  @JsonProperty("ios_deep_link")
  public String getIosDeepLink() {
    return iosDeepLink;
  }

  /**
   * Sets the <code>iosDeepLink</code> property.
   */
 public void setIosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
  }

  /**
   * Sets the <code>iosDeepLink</code> property.
   */
  public CatalogsUpdatableCreativeAssetsAttributes iosDeepLink(String iosDeepLink) {
    this.iosDeepLink = iosDeepLink;
    return this;
  }

 /**
  * Link to the creative assets page.
  * @return androidDeepLink
  */
  @JsonProperty("android_deep_link")
  public String getAndroidDeepLink() {
    return androidDeepLink;
  }

  /**
   * Sets the <code>androidDeepLink</code> property.
   */
 public void setAndroidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
  }

  /**
   * Sets the <code>androidDeepLink</code> property.
   */
  public CatalogsUpdatableCreativeAssetsAttributes androidDeepLink(String androidDeepLink) {
    this.androidDeepLink = androidDeepLink;
    return this;
  }

 /**
  * The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
  * @return googleProductCategory
  */
  @JsonProperty("google_product_category")
  public String getGoogleProductCategory() {
    return googleProductCategory;
  }

  /**
   * Sets the <code>googleProductCategory</code> property.
   */
 public void setGoogleProductCategory(String googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
  }

  /**
   * Sets the <code>googleProductCategory</code> property.
   */
  public CatalogsUpdatableCreativeAssetsAttributes googleProductCategory(String googleProductCategory) {
    this.googleProductCategory = googleProductCategory;
    return this;
  }

 /**
  * Custom grouping of creative assets.
  * @return customLabel0
  */
  @JsonProperty("custom_label_0")
  public String getCustomLabel0() {
    return customLabel0;
  }

  /**
   * Sets the <code>customLabel0</code> property.
   */
 public void setCustomLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
  }

  /**
   * Sets the <code>customLabel0</code> property.
   */
  public CatalogsUpdatableCreativeAssetsAttributes customLabel0(String customLabel0) {
    this.customLabel0 = customLabel0;
    return this;
  }

 /**
  * Custom grouping of creative assets.
  * @return customLabel1
  */
  @JsonProperty("custom_label_1")
  public String getCustomLabel1() {
    return customLabel1;
  }

  /**
   * Sets the <code>customLabel1</code> property.
   */
 public void setCustomLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
  }

  /**
   * Sets the <code>customLabel1</code> property.
   */
  public CatalogsUpdatableCreativeAssetsAttributes customLabel1(String customLabel1) {
    this.customLabel1 = customLabel1;
    return this;
  }

 /**
  * Custom grouping of creative assets.
  * @return customLabel2
  */
  @JsonProperty("custom_label_2")
  public String getCustomLabel2() {
    return customLabel2;
  }

  /**
   * Sets the <code>customLabel2</code> property.
   */
 public void setCustomLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
  }

  /**
   * Sets the <code>customLabel2</code> property.
   */
  public CatalogsUpdatableCreativeAssetsAttributes customLabel2(String customLabel2) {
    this.customLabel2 = customLabel2;
    return this;
  }

 /**
  * Custom grouping of creative assets.
  * @return customLabel3
  */
  @JsonProperty("custom_label_3")
  public String getCustomLabel3() {
    return customLabel3;
  }

  /**
   * Sets the <code>customLabel3</code> property.
   */
 public void setCustomLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
  }

  /**
   * Sets the <code>customLabel3</code> property.
   */
  public CatalogsUpdatableCreativeAssetsAttributes customLabel3(String customLabel3) {
    this.customLabel3 = customLabel3;
    return this;
  }

 /**
  * Custom grouping of creative assets.
  * @return customLabel4
  */
  @JsonProperty("custom_label_4")
  public String getCustomLabel4() {
    return customLabel4;
  }

  /**
   * Sets the <code>customLabel4</code> property.
   */
 public void setCustomLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
  }

  /**
   * Sets the <code>customLabel4</code> property.
   */
  public CatalogsUpdatableCreativeAssetsAttributes customLabel4(String customLabel4) {
    this.customLabel4 = customLabel4;
    return this;
  }

 /**
  * Visibility of the creative assets. Must be one of the following values (upper or lowercase): ‘visible’, ‘hidden’.
  * @return visibility
  */
  @JsonProperty("visibility")
  public String getVisibility() {
    return visibility;
  }

  /**
   * Sets the <code>visibility</code> property.
   */
 public void setVisibility(String visibility) {
    this.visibility = visibility;
  }

  /**
   * Sets the <code>visibility</code> property.
   */
  public CatalogsUpdatableCreativeAssetsAttributes visibility(String visibility) {
    this.visibility = visibility;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

