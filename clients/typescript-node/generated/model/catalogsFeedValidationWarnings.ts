/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';

export class CatalogsFeedValidationWarnings {
    /**
    * Some items have ad links that are formatted incorrectly.
    */
    'aDLINKFORMATWARNING'?: number;
    /**
    * Some items have ad link URLs that are duplicates of the link URLs for those items.
    */
    'aDLINKSAMEASLINK'?: number;
    /**
    * The title for some items were truncated because they contain too many characters.
    */
    'tITLELENGTHTOOLONG'?: number;
    /**
    * The description for some items were truncated because they contain too many characters.
    */
    'dESCRIPTIONLENGTHTOOLONG'?: number;
    /**
    * Some items have gender values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
    */
    'gENDERINVALID'?: number;
    /**
    * Some items have age group values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
    */
    'aGEGROUPINVALID'?: number;
    /**
    * Some items have size type values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
    */
    'sIZETYPEINVALID'?: number;
    /**
    * Some items have size system values which are not one of the supported size systems.
    */
    'sIZESYSTEMINVALID'?: number;
    /**
    * Some items have an invalid product link which contains invalid UTM tracking paramaters.
    */
    'lINKFORMATWARNING'?: number;
    /**
    * Some items have sale price values that are higher than the original price of the item.
    */
    'sALESPRICEINVALID'?: number;
    /**
    * Some items only have 1 or 2 levels of google_product_category values, which may limit visibility in recommendations, search results and shopping experiences.
    */
    'pRODUCTCATEGORYDEPTHWARNING'?: number;
    /**
    * Some items have adwords_redirect links that are formatted incorrectly.
    */
    'aDWORDSFORMATWARNING'?: number;
    /**
    * Some items have adwords_redirect URLs that are duplicates of the link URLs for those items.
    */
    'aDWORDSSAMEASLINK'?: number;
    /**
    * Your feed contains duplicate headers.
    */
    'dUPLICATEHEADERS'?: number;
    /**
    * Ingestion completed early because there are no changes to your feed since the last successful update.
    */
    'fETCHSAMESIGNATURE'?: CatalogsFeedValidationWarnings.FETCHSAMESIGNATUREEnum;
    /**
    * Some items have additional_image_link URLs that contain too many characters, so those items will not be published.
    */
    'aDDITIONALIMAGELINKLENGTHTOOLONG'?: number;
    /**
    * Some items have additional_image_link URLs that are formatted incorrectly and will not be published with your items.
    */
    'aDDITIONALIMAGELINKWARNING'?: number;
    /**
    * Some items have image_link URLs that are formatted incorrectly and will not be published with those items.
    */
    'iMAGELINKWARNING'?: number;
    /**
    * Some items have shipping values that are formatted incorrectly.
    */
    'sHIPPINGINVALID'?: number;
    /**
    * Some items have tax values that are formatted incorrectly.
    */
    'tAXINVALID'?: number;
    /**
    * Some items have invalid shipping_weight values.
    */
    'sHIPPINGWEIGHTINVALID'?: number;
    /**
    * Some items have expiration_date values that are formatted incorrectly, those items will be published without an expiration date.
    */
    'eXPIRATIONDATEINVALID'?: number;
    /**
    * Some items have availability_date values that are formatted incorrectly, those items will be published without an availability date.
    */
    'aVAILABILITYDATEINVALID'?: number;
    /**
    * Some items have sale_price_effective_date values that are formatted incorrectly, those items will be published without a sale date.
    */
    'sALEDATEINVALID'?: number;
    /**
    * Some items have weight_unit values that are formatted incorrectly, those items will be published without a weight unit.
    */
    'wEIGHTUNITINVALID'?: number;
    /**
    * Some items have is_bundle values that are formatted incorrectly, those items will be published without being bundled with other products.
    */
    'iSBUNDLEINVALID'?: number;
    /**
    * Some items have updated_time values thate are formatted incorrectly, those items will be published without an updated time.
    */
    'uPDATEDTIMEINVALID'?: number;
    /**
    * Some items have custom_label values that are too long, those items will be published without that custom label.
    */
    'cUSTOMLABELLENGTHTOOLONG'?: number;
    /**
    * Some items have product_type values that are too long, those items will be published without that product type.
    */
    'pRODUCTTYPELENGTHTOOLONG'?: number;
    /**
    * Some items have additional_image_link values that exceed the limit for additional images, those items will be published without some of your images.
    */
    'tOOMANYADDITIONALIMAGELINKS'?: number;
    /**
    * Some items have invalid multipack values.
    */
    'mULTIPACKINVALID'?: number;
    /**
    * The product count has increased or decreased significantly compared to the last successful ingestion.
    */
    'iNDEXEDPRODUCTCOUNTLARGEDELTA'?: number;
    /**
    * Some items include additional_image_links that can\'t be found.
    */
    'iTEMADDITIONALIMAGEDOWNLOADFAILURE'?: number;
    /**
    * Some items are missing a google_product_category.
    */
    'oPTIONALPRODUCTCATEGORYMISSING'?: number;
    /**
    * Some items include google_product_category values that are not formatted correctly according to the GPC taxonomy.
    */
    'oPTIONALPRODUCTCATEGORYINVALID'?: number;
    /**
    * Some items are missing a condition value, which may limit visibility in recommendations, search results and shopping experiences.
    */
    'oPTIONALCONDITIONMISSING'?: number;
    /**
    * Some items include condition values that are formatted incorrectly, which may limit visibility in recommendations, search results and shopping experiences.
    */
    'oPTIONALCONDITIONINVALID'?: number;
    /**
    * Some items include invalid ios_deep_link values.
    */
    'iOSDEEPLINKINVALID'?: number;
    /**
    * Some items include invalid android_deep_link.
    */
    'aNDROIDDEEPLINKINVALID'?: number;
    /**
    * Some items include utm_source values that are formatted incorrectly and have been automatically corrected.
    */
    'uTMSOURCEAUTOCORRECTED'?: number;
    /**
    * Some items include a currency that doesn\'t match the usual currency for the location where that product is sold or shipped.
    */
    'cOUNTRYDOESNOTMAPTOCURRENCY'?: number;
    /**
    * Some items include min_ad_price values that are formatted incorrectly.
    */
    'mINADPRICEINVALID'?: number;
    /**
    * Some items include incorrectly formatted GTINs.
    */
    'gTININVALID'?: number;
    /**
    * Some items include inconsistent currencies in price fields.
    */
    'iNCONSISTENTCURRENCYVALUES'?: number;
    /**
    * Some items include sales price that is much lower than the list price.
    */
    'sALESPRICETOOLOW'?: number;
    /**
    * Some items include incorrectly formatted shipping_width.
    */
    'sHIPPINGWIDTHINVALID'?: number;
    /**
    * Some items include incorrectly formatted shipping_height.
    */
    'sHIPPINGHEIGHTINVALID'?: number;
    /**
    * Some items include a sales price that is higher than the list price. The sales price has been defaulted to the list price.
    */
    'sALESPRICETOOHIGH'?: number;
    /**
    * Some items include incorrectly formatted MPNs.
    */
    'mPNINVALID'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "aDLINKFORMATWARNING",
            "baseName": "AD_LINK_FORMAT_WARNING",
            "type": "number"
        },
        {
            "name": "aDLINKSAMEASLINK",
            "baseName": "AD_LINK_SAME_AS_LINK",
            "type": "number"
        },
        {
            "name": "tITLELENGTHTOOLONG",
            "baseName": "TITLE_LENGTH_TOO_LONG",
            "type": "number"
        },
        {
            "name": "dESCRIPTIONLENGTHTOOLONG",
            "baseName": "DESCRIPTION_LENGTH_TOO_LONG",
            "type": "number"
        },
        {
            "name": "gENDERINVALID",
            "baseName": "GENDER_INVALID",
            "type": "number"
        },
        {
            "name": "aGEGROUPINVALID",
            "baseName": "AGE_GROUP_INVALID",
            "type": "number"
        },
        {
            "name": "sIZETYPEINVALID",
            "baseName": "SIZE_TYPE_INVALID",
            "type": "number"
        },
        {
            "name": "sIZESYSTEMINVALID",
            "baseName": "SIZE_SYSTEM_INVALID",
            "type": "number"
        },
        {
            "name": "lINKFORMATWARNING",
            "baseName": "LINK_FORMAT_WARNING",
            "type": "number"
        },
        {
            "name": "sALESPRICEINVALID",
            "baseName": "SALES_PRICE_INVALID",
            "type": "number"
        },
        {
            "name": "pRODUCTCATEGORYDEPTHWARNING",
            "baseName": "PRODUCT_CATEGORY_DEPTH_WARNING",
            "type": "number"
        },
        {
            "name": "aDWORDSFORMATWARNING",
            "baseName": "ADWORDS_FORMAT_WARNING",
            "type": "number"
        },
        {
            "name": "aDWORDSSAMEASLINK",
            "baseName": "ADWORDS_SAME_AS_LINK",
            "type": "number"
        },
        {
            "name": "dUPLICATEHEADERS",
            "baseName": "DUPLICATE_HEADERS",
            "type": "number"
        },
        {
            "name": "fETCHSAMESIGNATURE",
            "baseName": "FETCH_SAME_SIGNATURE",
            "type": "CatalogsFeedValidationWarnings.FETCHSAMESIGNATUREEnum"
        },
        {
            "name": "aDDITIONALIMAGELINKLENGTHTOOLONG",
            "baseName": "ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG",
            "type": "number"
        },
        {
            "name": "aDDITIONALIMAGELINKWARNING",
            "baseName": "ADDITIONAL_IMAGE_LINK_WARNING",
            "type": "number"
        },
        {
            "name": "iMAGELINKWARNING",
            "baseName": "IMAGE_LINK_WARNING",
            "type": "number"
        },
        {
            "name": "sHIPPINGINVALID",
            "baseName": "SHIPPING_INVALID",
            "type": "number"
        },
        {
            "name": "tAXINVALID",
            "baseName": "TAX_INVALID",
            "type": "number"
        },
        {
            "name": "sHIPPINGWEIGHTINVALID",
            "baseName": "SHIPPING_WEIGHT_INVALID",
            "type": "number"
        },
        {
            "name": "eXPIRATIONDATEINVALID",
            "baseName": "EXPIRATION_DATE_INVALID",
            "type": "number"
        },
        {
            "name": "aVAILABILITYDATEINVALID",
            "baseName": "AVAILABILITY_DATE_INVALID",
            "type": "number"
        },
        {
            "name": "sALEDATEINVALID",
            "baseName": "SALE_DATE_INVALID",
            "type": "number"
        },
        {
            "name": "wEIGHTUNITINVALID",
            "baseName": "WEIGHT_UNIT_INVALID",
            "type": "number"
        },
        {
            "name": "iSBUNDLEINVALID",
            "baseName": "IS_BUNDLE_INVALID",
            "type": "number"
        },
        {
            "name": "uPDATEDTIMEINVALID",
            "baseName": "UPDATED_TIME_INVALID",
            "type": "number"
        },
        {
            "name": "cUSTOMLABELLENGTHTOOLONG",
            "baseName": "CUSTOM_LABEL_LENGTH_TOO_LONG",
            "type": "number"
        },
        {
            "name": "pRODUCTTYPELENGTHTOOLONG",
            "baseName": "PRODUCT_TYPE_LENGTH_TOO_LONG",
            "type": "number"
        },
        {
            "name": "tOOMANYADDITIONALIMAGELINKS",
            "baseName": "TOO_MANY_ADDITIONAL_IMAGE_LINKS",
            "type": "number"
        },
        {
            "name": "mULTIPACKINVALID",
            "baseName": "MULTIPACK_INVALID",
            "type": "number"
        },
        {
            "name": "iNDEXEDPRODUCTCOUNTLARGEDELTA",
            "baseName": "INDEXED_PRODUCT_COUNT_LARGE_DELTA",
            "type": "number"
        },
        {
            "name": "iTEMADDITIONALIMAGEDOWNLOADFAILURE",
            "baseName": "ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE",
            "type": "number"
        },
        {
            "name": "oPTIONALPRODUCTCATEGORYMISSING",
            "baseName": "OPTIONAL_PRODUCT_CATEGORY_MISSING",
            "type": "number"
        },
        {
            "name": "oPTIONALPRODUCTCATEGORYINVALID",
            "baseName": "OPTIONAL_PRODUCT_CATEGORY_INVALID",
            "type": "number"
        },
        {
            "name": "oPTIONALCONDITIONMISSING",
            "baseName": "OPTIONAL_CONDITION_MISSING",
            "type": "number"
        },
        {
            "name": "oPTIONALCONDITIONINVALID",
            "baseName": "OPTIONAL_CONDITION_INVALID",
            "type": "number"
        },
        {
            "name": "iOSDEEPLINKINVALID",
            "baseName": "IOS_DEEP_LINK_INVALID",
            "type": "number"
        },
        {
            "name": "aNDROIDDEEPLINKINVALID",
            "baseName": "ANDROID_DEEP_LINK_INVALID",
            "type": "number"
        },
        {
            "name": "uTMSOURCEAUTOCORRECTED",
            "baseName": "UTM_SOURCE_AUTO_CORRECTED",
            "type": "number"
        },
        {
            "name": "cOUNTRYDOESNOTMAPTOCURRENCY",
            "baseName": "COUNTRY_DOES_NOT_MAP_TO_CURRENCY",
            "type": "number"
        },
        {
            "name": "mINADPRICEINVALID",
            "baseName": "MIN_AD_PRICE_INVALID",
            "type": "number"
        },
        {
            "name": "gTININVALID",
            "baseName": "GTIN_INVALID",
            "type": "number"
        },
        {
            "name": "iNCONSISTENTCURRENCYVALUES",
            "baseName": "INCONSISTENT_CURRENCY_VALUES",
            "type": "number"
        },
        {
            "name": "sALESPRICETOOLOW",
            "baseName": "SALES_PRICE_TOO_LOW",
            "type": "number"
        },
        {
            "name": "sHIPPINGWIDTHINVALID",
            "baseName": "SHIPPING_WIDTH_INVALID",
            "type": "number"
        },
        {
            "name": "sHIPPINGHEIGHTINVALID",
            "baseName": "SHIPPING_HEIGHT_INVALID",
            "type": "number"
        },
        {
            "name": "sALESPRICETOOHIGH",
            "baseName": "SALES_PRICE_TOO_HIGH",
            "type": "number"
        },
        {
            "name": "mPNINVALID",
            "baseName": "MPN_INVALID",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CatalogsFeedValidationWarnings.attributeTypeMap;
    }
}

export namespace CatalogsFeedValidationWarnings {
    export enum FETCHSAMESIGNATUREEnum {
        NUMBER_1 = <any> 1
    }
}
