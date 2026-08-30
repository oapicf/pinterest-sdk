package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.AdShoppingPreviewCreativeType;
import org.openapitools.server.model.BasePreferredMediaType;
import org.openapitools.server.model.CustomizableCTAType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ad preview from a catalog product group (shopping).
 */
public class AdPreviewShopping   {

    private String catalogProductGroupId;
    private AdShoppingPreviewCreativeType creativeType;
    private CustomizableCTAType customizableCtaType;
    private String heroImageTitle;
    private String heroImageUrl;
    private String heroPinId;
    private String imageTag;
    private String itemId;
    private BasePreferredMediaType preferredMediaType;
    private Boolean showPromotion;
    private String videoTag;

    /**
     * Default constructor.
     */
    public AdPreviewShopping() {
    // JSON-B / Jackson
    }

    /**
     * Create AdPreviewShopping.
     *
     * @param catalogProductGroupId Catalog Product Group Id.
     * @param creativeType Ad format of the shopping ad preview.
     * @param customizableCtaType Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are &#x60;SHOP_NOW&#x60;, &#x60;BOOK_NOW&#x60;, &#x60;ON_SALE&#x60;, &#x60;GET_DEAL&#x60;, &#x60;BUY_ONLINE_PICKUP_IN_STORE&#x60;
     * @param heroImageTitle Title displayed below ad.
     * @param heroImageUrl Hero image URL.
     * @param heroPinId Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
     * @param imageTag Multi image template tag.
     * @param itemId Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
     * @param preferredMediaType Preferred media type.
     * @param showPromotion Include promotion data in preview when available on catalog item. Defaults to false.
     * @param videoTag Multi video template tag, image_tag and video_tag are mutual exclusive.
     */
    public AdPreviewShopping(
        String catalogProductGroupId, 
        AdShoppingPreviewCreativeType creativeType, 
        CustomizableCTAType customizableCtaType, 
        String heroImageTitle, 
        String heroImageUrl, 
        String heroPinId, 
        String imageTag, 
        String itemId, 
        BasePreferredMediaType preferredMediaType, 
        Boolean showPromotion, 
        String videoTag
    ) {
        this.catalogProductGroupId = catalogProductGroupId;
        this.creativeType = creativeType;
        this.customizableCtaType = customizableCtaType;
        this.heroImageTitle = heroImageTitle;
        this.heroImageUrl = heroImageUrl;
        this.heroPinId = heroPinId;
        this.imageTag = imageTag;
        this.itemId = itemId;
        this.preferredMediaType = preferredMediaType;
        this.showPromotion = showPromotion;
        this.videoTag = videoTag;
    }



    /**
     * Catalog Product Group Id.
     * @return catalogProductGroupId
     */
    public String getCatalogProductGroupId() {
        return catalogProductGroupId;
    }

    public void setCatalogProductGroupId(String catalogProductGroupId) {
        this.catalogProductGroupId = catalogProductGroupId;
    }

    /**
     * Ad format of the shopping ad preview.
     * @return creativeType
     */
    public AdShoppingPreviewCreativeType getCreativeType() {
        return creativeType;
    }

    public void setCreativeType(AdShoppingPreviewCreativeType creativeType) {
        this.creativeType = creativeType;
    }

    /**
     * Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
     * @return customizableCtaType
     */
    public CustomizableCTAType getCustomizableCtaType() {
        return customizableCtaType;
    }

    public void setCustomizableCtaType(CustomizableCTAType customizableCtaType) {
        this.customizableCtaType = customizableCtaType;
    }

    /**
     * Title displayed below ad.
     * @return heroImageTitle
     */
    public String getHeroImageTitle() {
        return heroImageTitle;
    }

    public void setHeroImageTitle(String heroImageTitle) {
        this.heroImageTitle = heroImageTitle;
    }

    /**
     * Hero image URL.
     * @return heroImageUrl
     */
    public String getHeroImageUrl() {
        return heroImageUrl;
    }

    public void setHeroImageUrl(String heroImageUrl) {
        this.heroImageUrl = heroImageUrl;
    }

    /**
     * Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
     * @return heroPinId
     */
    public String getHeroPinId() {
        return heroPinId;
    }

    public void setHeroPinId(String heroPinId) {
        this.heroPinId = heroPinId;
    }

    /**
     * Multi image template tag.
     * @return imageTag
     */
    public String getImageTag() {
        return imageTag;
    }

    public void setImageTag(String imageTag) {
        this.imageTag = imageTag;
    }

    /**
     * Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
     * @return itemId
     */
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * Preferred media type.
     * @return preferredMediaType
     */
    public BasePreferredMediaType getPreferredMediaType() {
        return preferredMediaType;
    }

    public void setPreferredMediaType(BasePreferredMediaType preferredMediaType) {
        this.preferredMediaType = preferredMediaType;
    }

    /**
     * Include promotion data in preview when available on catalog item. Defaults to false.
     * @return showPromotion
     */
    public Boolean getShowPromotion() {
        return showPromotion;
    }

    public void setShowPromotion(Boolean showPromotion) {
        this.showPromotion = showPromotion;
    }

    /**
     * Multi video template tag, image_tag and video_tag are mutual exclusive.
     * @return videoTag
     */
    public String getVideoTag() {
        return videoTag;
    }

    public void setVideoTag(String videoTag) {
        this.videoTag = videoTag;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdPreviewShopping {\n");
        
        sb.append("    catalogProductGroupId: ").append(toIndentedString(catalogProductGroupId)).append("\n");
        sb.append("    creativeType: ").append(toIndentedString(creativeType)).append("\n");
        sb.append("    customizableCtaType: ").append(toIndentedString(customizableCtaType)).append("\n");
        sb.append("    heroImageTitle: ").append(toIndentedString(heroImageTitle)).append("\n");
        sb.append("    heroImageUrl: ").append(toIndentedString(heroImageUrl)).append("\n");
        sb.append("    heroPinId: ").append(toIndentedString(heroPinId)).append("\n");
        sb.append("    imageTag: ").append(toIndentedString(imageTag)).append("\n");
        sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
        sb.append("    preferredMediaType: ").append(toIndentedString(preferredMediaType)).append("\n");
        sb.append("    showPromotion: ").append(toIndentedString(showPromotion)).append("\n");
        sb.append("    videoTag: ").append(toIndentedString(videoTag)).append("\n");
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

