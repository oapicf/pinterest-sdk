package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ad preview source from an image URL.
 */
public class AdPreviewSourceImage   {

    private String imageUrl;
    private String promotionId;
    private String title;

    /**
     * Default constructor.
     */
    public AdPreviewSourceImage() {
    // JSON-B / Jackson
    }

    /**
     * Create AdPreviewSourceImage.
     *
     * @param imageUrl Image URL.
     * @param promotionId Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
     * @param title Title displayed below ad.
     */
    public AdPreviewSourceImage(
        String imageUrl, 
        String promotionId, 
        String title
    ) {
        this.imageUrl = imageUrl;
        this.promotionId = promotionId;
        this.title = title;
    }



    /**
     * Image URL.
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion.
     * @return promotionId
     */
    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    /**
     * Title displayed below ad.
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

