package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class DeletePartnerAssetAccessItem   {

    private String assetId;
    private String partnerId;

    /**
    * If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
    */
    public enum PartnerTypeEnum {
        INTERNAL("INTERNAL"),
        EXTERNAL("EXTERNAL");

        private String value;

        PartnerTypeEnum(String value) {
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
        public static PartnerTypeEnum fromValue(String text) {
            for (PartnerTypeEnum b : PartnerTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private PartnerTypeEnum partnerType = PartnerTypeEnum.INTERNAL;

    /**
     * Default constructor.
     */
    public DeletePartnerAssetAccessItem() {
    // JSON-B / Jackson
    }

    /**
     * Create DeletePartnerAssetAccessItem.
     *
     * @param assetId Unique identifier of the business asset.
     * @param partnerId Unique identifier of a business partner to update asset access to.
     * @param partnerType If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset.
     */
    public DeletePartnerAssetAccessItem(
        String assetId, 
        String partnerId, 
        PartnerTypeEnum partnerType
    ) {
        this.assetId = assetId;
        this.partnerId = partnerId;
        this.partnerType = partnerType;
    }



    /**
     * Unique identifier of the business asset.
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    /**
     * Unique identifier of a business partner to update asset access to.
     * @return partnerId
     */
    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner's business asset.
     * @return partnerType
     */
    public PartnerTypeEnum getPartnerType() {
        return partnerType;
    }

    public void setPartnerType(PartnerTypeEnum partnerType) {
        this.partnerType = partnerType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePartnerAssetAccessItem {\n");
        
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
        sb.append("    partnerType: ").append(toIndentedString(partnerType)).append("\n");
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

