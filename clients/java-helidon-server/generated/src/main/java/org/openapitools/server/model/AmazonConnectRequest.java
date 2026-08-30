package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Request containing OTP and Amazon storefront info called by Amazon
 */
public class AmazonConnectRequest   {

    private String amazonStorefrontId;
    private String amazonStorefrontName;
    private String amazonStorefrontUrl;
    private String amazonUserId;
    private Boolean isAmazonAccountLinked;
    private String oneTimePasscode;
    private String pinterestUserId;

    /**
     * Default constructor.
     */
    public AmazonConnectRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create AmazonConnectRequest.
     *
     * @param amazonStorefrontId The Amazon storefront id
     * @param amazonStorefrontName The Amazon storefront name
     * @param amazonStorefrontUrl The Amazon storefront url
     * @param amazonUserId The Amazon user id
     * @param isAmazonAccountLinked The Amazon account linking status
     * @param oneTimePasscode The one time passcode for Pinterest-initiated linking requests
     * @param pinterestUserId The Pinterest user id for Amazon-initiated linking requests
     */
    public AmazonConnectRequest(
        String amazonStorefrontId, 
        String amazonStorefrontName, 
        String amazonStorefrontUrl, 
        String amazonUserId, 
        Boolean isAmazonAccountLinked, 
        String oneTimePasscode, 
        String pinterestUserId
    ) {
        this.amazonStorefrontId = amazonStorefrontId;
        this.amazonStorefrontName = amazonStorefrontName;
        this.amazonStorefrontUrl = amazonStorefrontUrl;
        this.amazonUserId = amazonUserId;
        this.isAmazonAccountLinked = isAmazonAccountLinked;
        this.oneTimePasscode = oneTimePasscode;
        this.pinterestUserId = pinterestUserId;
    }



    /**
     * The Amazon storefront id
     * @return amazonStorefrontId
     */
    public String getAmazonStorefrontId() {
        return amazonStorefrontId;
    }

    public void setAmazonStorefrontId(String amazonStorefrontId) {
        this.amazonStorefrontId = amazonStorefrontId;
    }

    /**
     * The Amazon storefront name
     * @return amazonStorefrontName
     */
    public String getAmazonStorefrontName() {
        return amazonStorefrontName;
    }

    public void setAmazonStorefrontName(String amazonStorefrontName) {
        this.amazonStorefrontName = amazonStorefrontName;
    }

    /**
     * The Amazon storefront url
     * @return amazonStorefrontUrl
     */
    public String getAmazonStorefrontUrl() {
        return amazonStorefrontUrl;
    }

    public void setAmazonStorefrontUrl(String amazonStorefrontUrl) {
        this.amazonStorefrontUrl = amazonStorefrontUrl;
    }

    /**
     * The Amazon user id
     * @return amazonUserId
     */
    public String getAmazonUserId() {
        return amazonUserId;
    }

    public void setAmazonUserId(String amazonUserId) {
        this.amazonUserId = amazonUserId;
    }

    /**
     * The Amazon account linking status
     * @return isAmazonAccountLinked
     */
    public Boolean getIsAmazonAccountLinked() {
        return isAmazonAccountLinked;
    }

    public void setIsAmazonAccountLinked(Boolean isAmazonAccountLinked) {
        this.isAmazonAccountLinked = isAmazonAccountLinked;
    }

    /**
     * The one time passcode for Pinterest-initiated linking requests
     * @return oneTimePasscode
     */
    public String getOneTimePasscode() {
        return oneTimePasscode;
    }

    public void setOneTimePasscode(String oneTimePasscode) {
        this.oneTimePasscode = oneTimePasscode;
    }

    /**
     * The Pinterest user id for Amazon-initiated linking requests
     * @return pinterestUserId
     */
    public String getPinterestUserId() {
        return pinterestUserId;
    }

    public void setPinterestUserId(String pinterestUserId) {
        this.pinterestUserId = pinterestUserId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AmazonConnectRequest {\n");
        
        sb.append("    amazonStorefrontId: ").append(toIndentedString(amazonStorefrontId)).append("\n");
        sb.append("    amazonStorefrontName: ").append(toIndentedString(amazonStorefrontName)).append("\n");
        sb.append("    amazonStorefrontUrl: ").append(toIndentedString(amazonStorefrontUrl)).append("\n");
        sb.append("    amazonUserId: ").append(toIndentedString(amazonUserId)).append("\n");
        sb.append("    isAmazonAccountLinked: ").append(toIndentedString(isAmazonAccountLinked)).append("\n");
        sb.append("    oneTimePasscode: ").append(toIndentedString(oneTimePasscode)).append("\n");
        sb.append("    pinterestUserId: ").append(toIndentedString(pinterestUserId)).append("\n");
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

