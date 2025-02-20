/*
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * OASDeletePartnerAssetAccessBodyAcces
 */
public class OASDeletePartnerAssetAccessBodyAcces implements OAS.MappedProperties {
    /**
     * Unique identifier of a business partner to update asset access to.
     * @return partnerId
     */
    public String partnerId { get; set; }

    /**
     * Unique identifier of the business asset.
     * @return assetId
     */
    public String assetId { get; set; }

    /**
     * If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br>\nIf partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner\'s business asset.
     */
    public enum PartnerTypeEnum {
        INTERNAL,
        EXTERNAL
    }

    /**
     * If partner_type=INTERNAL, the deleted asset access is for the access the partner has to your business asset.<br>\nIf partner_type=EXTERNAL, the deleted asset access is for the access you have to the partner\'s business asset.
     * @return partnerType
     */
    public PartnerTypeEnum partnerType { get; set; }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'partner_id' => 'partnerId',
        'asset_id' => 'assetId',
        'partner_type' => 'partnerType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'partner_id' => 'partnerId',
        'asset_id' => 'assetId',
        'partner_type' => 'partnerType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    private static final Map<String, String> propertyMappings = new Map<String, String>{
        'partner_id' => 'partnerId',
        'asset_id' => 'assetId',
        'partner_type' => 'partnerType'
    };

    public Map<String, String> getPropertyMappings() {
        return propertyMappings;
    }

    public OASDeletePartnerAssetAccessBodyAcces() {
        partnerType = PartnerTypeEnum.INTERNAL;
    }

    public static OASDeletePartnerAssetAccessBodyAcces getExample() {
        OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner = new OASDeletePartnerAssetAccessBodyAcces();
          deletePartnerAssetAccessBodyAccessesInner.partnerId = '1234567890123';
          deletePartnerAssetAccessBodyAccessesInner.assetId = '549755885175';
          deletePartnerAssetAccessBodyAccessesInner.partnerType = PartnerTypeEnum.INTERNAL;
        return deletePartnerAssetAccessBodyAccessesInner;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASDeletePartnerAssetAccessBodyAcces) {           
            OASDeletePartnerAssetAccessBodyAcces deletePartnerAssetAccessBodyAccessesInner = (OASDeletePartnerAssetAccessBodyAcces) obj;
            return this.partnerId == deletePartnerAssetAccessBodyAccessesInner.partnerId
                && this.assetId == deletePartnerAssetAccessBodyAccessesInner.assetId
                && this.partnerType == deletePartnerAssetAccessBodyAccessesInner.partnerType;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (partnerId == null ? 0 : System.hashCode(partnerId));
        hashCode = (17 * hashCode) + (assetId == null ? 0 : System.hashCode(assetId));
        hashCode = (17 * hashCode) + (partnerType == null ? 0 : System.hashCode(partnerType));
        return hashCode;
    }
}

