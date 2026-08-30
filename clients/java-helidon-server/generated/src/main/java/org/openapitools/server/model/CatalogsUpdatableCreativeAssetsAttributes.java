package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CatalogsUpdatableCreativeAssetsAttributes   {

    private String androidDeepLink;
    private String customLabel0;
    private String customLabel1;
    private String customLabel2;
    private String customLabel3;
    private String customLabel4;
    private String description;
    private String googleProductCategory;
    private String iosDeepLink;
    private String link;
    private String title;
    private String visibility;

    /**
     * Default constructor.
     */
    public CatalogsUpdatableCreativeAssetsAttributes() {
    // JSON-B / Jackson
    }

    /**
     * Create CatalogsUpdatableCreativeAssetsAttributes.
     *
     * @param androidDeepLink Link to the creative assets page.
     * @param customLabel0 Custom grouping of creative assets.
     * @param customLabel1 Custom grouping of creative assets.
     * @param customLabel2 Custom grouping of creative assets.
     * @param customLabel3 Custom grouping of creative assets.
     * @param customLabel4 Custom grouping of creative assets.
     * @param description Brief description of the creative assets.
     * @param googleProductCategory The categorization of the product based on the standardized Google Product Taxonomy. This is a set taxonomy. Both the text values and numeric codes are accepted.
     * @param iosDeepLink IOS deep link to the creative assets page.
     * @param link Link to the creative assets page.
     * @param title The name of the creative assets.
     * @param visibility Visibility of the creative assets. Must be one of the following values (upper or lowercase): &#39;visible&#39;, &#39;hidden&#39;.
     */
    public CatalogsUpdatableCreativeAssetsAttributes(
        String androidDeepLink, 
        String customLabel0, 
        String customLabel1, 
        String customLabel2, 
        String customLabel3, 
        String customLabel4, 
        String description, 
        String googleProductCategory, 
        String iosDeepLink, 
        String link, 
        String title, 
        String visibility
    ) {
        this.androidDeepLink = androidDeepLink;
        this.customLabel0 = customLabel0;
        this.customLabel1 = customLabel1;
        this.customLabel2 = customLabel2;
        this.customLabel3 = customLabel3;
        this.customLabel4 = customLabel4;
        this.description = description;
        this.googleProductCategory = googleProductCategory;
        this.iosDeepLink = iosDeepLink;
        this.link = link;
        this.title = title;
        this.visibility = visibility;
    }



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
     * Visibility of the creative assets. Must be one of the following values (upper or lowercase): 'visible', 'hidden'.
     * @return visibility
     */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogsUpdatableCreativeAssetsAttributes {\n");
        
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

