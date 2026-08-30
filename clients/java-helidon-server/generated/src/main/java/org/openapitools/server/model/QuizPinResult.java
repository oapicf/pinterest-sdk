package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The result, and link out, based on the user’s choice.
 */
public class QuizPinResult   {

    private String androidDeepLink;
    private String destinationUrl;
    private String iosDeepLink;
    private String organicPinId;
    private BigDecimal resultId;

    /**
     * Default constructor.
     */
    public QuizPinResult() {
    // JSON-B / Jackson
    }

    /**
     * Create QuizPinResult.
     *
     * @param androidDeepLink androidDeepLink
     * @param destinationUrl destinationUrl
     * @param iosDeepLink iosDeepLink
     * @param organicPinId organicPinId
     * @param resultId resultId
     */
    public QuizPinResult(
        String androidDeepLink, 
        String destinationUrl, 
        String iosDeepLink, 
        String organicPinId, 
        BigDecimal resultId
    ) {
        this.androidDeepLink = androidDeepLink;
        this.destinationUrl = destinationUrl;
        this.iosDeepLink = iosDeepLink;
        this.organicPinId = organicPinId;
        this.resultId = resultId;
    }



    /**
     * Get androidDeepLink
     * @return androidDeepLink
     */
    public String getAndroidDeepLink() {
        return androidDeepLink;
    }

    public void setAndroidDeepLink(String androidDeepLink) {
        this.androidDeepLink = androidDeepLink;
    }

    /**
     * Get destinationUrl
     * @return destinationUrl
     */
    public String getDestinationUrl() {
        return destinationUrl;
    }

    public void setDestinationUrl(String destinationUrl) {
        this.destinationUrl = destinationUrl;
    }

    /**
     * Get iosDeepLink
     * @return iosDeepLink
     */
    public String getIosDeepLink() {
        return iosDeepLink;
    }

    public void setIosDeepLink(String iosDeepLink) {
        this.iosDeepLink = iosDeepLink;
    }

    /**
     * Get organicPinId
     * @return organicPinId
     */
    public String getOrganicPinId() {
        return organicPinId;
    }

    public void setOrganicPinId(String organicPinId) {
        this.organicPinId = organicPinId;
    }

    /**
     * Get resultId
     * @return resultId
     */
    public BigDecimal getResultId() {
        return resultId;
    }

    public void setResultId(BigDecimal resultId) {
        this.resultId = resultId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuizPinResult {\n");
        
        sb.append("    androidDeepLink: ").append(toIndentedString(androidDeepLink)).append("\n");
        sb.append("    destinationUrl: ").append(toIndentedString(destinationUrl)).append("\n");
        sb.append("    iosDeepLink: ").append(toIndentedString(iosDeepLink)).append("\n");
        sb.append("    organicPinId: ").append(toIndentedString(organicPinId)).append("\n");
        sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
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

