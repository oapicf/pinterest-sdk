package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
 */
public class PinMediaSourcePinURL   {

    private Boolean isAffiliateLink = false;

    /**
    * Gets or Sets sourceType
    */
    public enum SourceTypeEnum {
        PIN_URL("pin_url");

        private String value;

        SourceTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static SourceTypeEnum fromValue(String text) {
            for (SourceTypeEnum b : SourceTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private SourceTypeEnum sourceType;

    /**
     * Default constructor.
     */
    public PinMediaSourcePinURL() {
    // JSON-B / Jackson
    }

    /**
     * Create PinMediaSourcePinURL.
     *
     * @param isAffiliateLink This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
     * @param sourceType sourceType
     */
    public PinMediaSourcePinURL(
        Boolean isAffiliateLink, 
        SourceTypeEnum sourceType
    ) {
        this.isAffiliateLink = isAffiliateLink;
        this.sourceType = sourceType;
    }



    /**
     * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
     * @return isAffiliateLink
     */
    public Boolean getIsAffiliateLink() {
        return isAffiliateLink;
    }

    public void setIsAffiliateLink(Boolean isAffiliateLink) {
        this.isAffiliateLink = isAffiliateLink;
    }

    /**
     * Get sourceType
     * @return sourceType
     */
    public SourceTypeEnum getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceTypeEnum sourceType) {
        this.sourceType = sourceType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PinMediaSourcePinURL {\n");
        
        sb.append("    isAffiliateLink: ").append(toIndentedString(isAffiliateLink)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
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

