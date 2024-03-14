/* tslint:disable */
/* eslint-disable */
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { mapValues } from '../runtime';
import type { CatalogsItemValidationDetails } from './CatalogsItemValidationDetails';
import {
    CatalogsItemValidationDetailsFromJSON,
    CatalogsItemValidationDetailsFromJSONTyped,
    CatalogsItemValidationDetailsToJSON,
} from './CatalogsItemValidationDetails';

/**
 * 
 * @export
 * @interface CatalogsItemValidationWarnings
 */
export interface CatalogsItemValidationWarnings {
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    aDDITIONALIMAGELINKLENGTHTOOLONG?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    aDDITIONALIMAGELINKWARNING?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    aDWORDSFORMATWARNING?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    aDWORDSSAMEASLINK?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    aGEGROUPINVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    sIZESYSTEMINVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    aGEGROUPNORMALIZED?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    aNDROIDDEEPLINKINVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    aVAILABILITYDATEINVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    aVAILABILITYNORMALIZED?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    cONDITIONNORMALIZED?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    cOUNTRYDOESNOTMAPTOCURRENCY?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    cUSTOMLABELLENGTHTOOLONG?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    dESCRIPTIONLENGTHTOOLONG?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    dUPLICATEPRODUCTS?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    eXPIRATIONDATEINVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    gENDERINVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    gENDERNORMALIZED?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    gTININVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    iMAGELINKWARNING?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    iOSDEEPLINKINVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    iSBUNDLEINVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    iTEMADDITIONALIMAGEDOWNLOADFAILURE?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    lINKFORMATWARNING?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    mINADPRICEINVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    mPNINVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    mULTIPACKINVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    oPTIONALCONDITIONINVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    oPTIONALCONDITIONMISSING?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    oPTIONALPRODUCTCATEGORYINVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    oPTIONALPRODUCTCATEGORYMISSING?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    pRODUCTCATEGORYDEPTHWARNING?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    pRODUCTTYPELENGTHTOOLONG?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    sALESPRICEINVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    sALESPRICETOOLOW?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    sALESPRICETOOHIGH?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    sALEDATEINVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    sHIPPINGINVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    sHIPPINGHEIGHTINVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    sHIPPINGWEIGHTINVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    sHIPPINGWIDTHINVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    sIZETYPEINVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    sIZETYPENORMALIZED?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    tAXINVALID?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    tITLELENGTHTOOLONG?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    tOOMANYADDITIONALIMAGELINKS?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    uTMSOURCEAUTOCORRECTED?: CatalogsItemValidationDetails;
    /**
     * 
     * @type {CatalogsItemValidationDetails}
     * @memberof CatalogsItemValidationWarnings
     */
    wEIGHTUNITINVALID?: CatalogsItemValidationDetails;
}

/**
 * Check if a given object implements the CatalogsItemValidationWarnings interface.
 */
export function instanceOfCatalogsItemValidationWarnings(value: object): boolean {
    return true;
}

export function CatalogsItemValidationWarningsFromJSON(json: any): CatalogsItemValidationWarnings {
    return CatalogsItemValidationWarningsFromJSONTyped(json, false);
}

export function CatalogsItemValidationWarningsFromJSONTyped(json: any, ignoreDiscriminator: boolean): CatalogsItemValidationWarnings {
    if (json == null) {
        return json;
    }
    return {
        
        'aDDITIONALIMAGELINKLENGTHTOOLONG': json['ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG']),
        'aDDITIONALIMAGELINKWARNING': json['ADDITIONAL_IMAGE_LINK_WARNING'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['ADDITIONAL_IMAGE_LINK_WARNING']),
        'aDWORDSFORMATWARNING': json['ADWORDS_FORMAT_WARNING'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['ADWORDS_FORMAT_WARNING']),
        'aDWORDSSAMEASLINK': json['ADWORDS_SAME_AS_LINK'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['ADWORDS_SAME_AS_LINK']),
        'aGEGROUPINVALID': json['AGE_GROUP_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['AGE_GROUP_INVALID']),
        'sIZESYSTEMINVALID': json['SIZE_SYSTEM_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['SIZE_SYSTEM_INVALID']),
        'aGEGROUPNORMALIZED': json['AGE_GROUP_NORMALIZED'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['AGE_GROUP_NORMALIZED']),
        'aNDROIDDEEPLINKINVALID': json['ANDROID_DEEP_LINK_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['ANDROID_DEEP_LINK_INVALID']),
        'aVAILABILITYDATEINVALID': json['AVAILABILITY_DATE_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['AVAILABILITY_DATE_INVALID']),
        'aVAILABILITYNORMALIZED': json['AVAILABILITY_NORMALIZED'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['AVAILABILITY_NORMALIZED']),
        'cONDITIONNORMALIZED': json['CONDITION_NORMALIZED'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['CONDITION_NORMALIZED']),
        'cOUNTRYDOESNOTMAPTOCURRENCY': json['COUNTRY_DOES_NOT_MAP_TO_CURRENCY'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['COUNTRY_DOES_NOT_MAP_TO_CURRENCY']),
        'cUSTOMLABELLENGTHTOOLONG': json['CUSTOM_LABEL_LENGTH_TOO_LONG'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['CUSTOM_LABEL_LENGTH_TOO_LONG']),
        'dESCRIPTIONLENGTHTOOLONG': json['DESCRIPTION_LENGTH_TOO_LONG'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['DESCRIPTION_LENGTH_TOO_LONG']),
        'dUPLICATEPRODUCTS': json['DUPLICATE_PRODUCTS'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['DUPLICATE_PRODUCTS']),
        'eXPIRATIONDATEINVALID': json['EXPIRATION_DATE_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['EXPIRATION_DATE_INVALID']),
        'gENDERINVALID': json['GENDER_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['GENDER_INVALID']),
        'gENDERNORMALIZED': json['GENDER_NORMALIZED'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['GENDER_NORMALIZED']),
        'gTININVALID': json['GTIN_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['GTIN_INVALID']),
        'iMAGELINKWARNING': json['IMAGE_LINK_WARNING'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['IMAGE_LINK_WARNING']),
        'iOSDEEPLINKINVALID': json['IOS_DEEP_LINK_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['IOS_DEEP_LINK_INVALID']),
        'iSBUNDLEINVALID': json['IS_BUNDLE_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['IS_BUNDLE_INVALID']),
        'iTEMADDITIONALIMAGEDOWNLOADFAILURE': json['ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE']),
        'lINKFORMATWARNING': json['LINK_FORMAT_WARNING'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['LINK_FORMAT_WARNING']),
        'mINADPRICEINVALID': json['MIN_AD_PRICE_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['MIN_AD_PRICE_INVALID']),
        'mPNINVALID': json['MPN_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['MPN_INVALID']),
        'mULTIPACKINVALID': json['MULTIPACK_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['MULTIPACK_INVALID']),
        'oPTIONALCONDITIONINVALID': json['OPTIONAL_CONDITION_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['OPTIONAL_CONDITION_INVALID']),
        'oPTIONALCONDITIONMISSING': json['OPTIONAL_CONDITION_MISSING'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['OPTIONAL_CONDITION_MISSING']),
        'oPTIONALPRODUCTCATEGORYINVALID': json['OPTIONAL_PRODUCT_CATEGORY_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['OPTIONAL_PRODUCT_CATEGORY_INVALID']),
        'oPTIONALPRODUCTCATEGORYMISSING': json['OPTIONAL_PRODUCT_CATEGORY_MISSING'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['OPTIONAL_PRODUCT_CATEGORY_MISSING']),
        'pRODUCTCATEGORYDEPTHWARNING': json['PRODUCT_CATEGORY_DEPTH_WARNING'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['PRODUCT_CATEGORY_DEPTH_WARNING']),
        'pRODUCTTYPELENGTHTOOLONG': json['PRODUCT_TYPE_LENGTH_TOO_LONG'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['PRODUCT_TYPE_LENGTH_TOO_LONG']),
        'sALESPRICEINVALID': json['SALES_PRICE_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['SALES_PRICE_INVALID']),
        'sALESPRICETOOLOW': json['SALES_PRICE_TOO_LOW'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['SALES_PRICE_TOO_LOW']),
        'sALESPRICETOOHIGH': json['SALES_PRICE_TOO_HIGH'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['SALES_PRICE_TOO_HIGH']),
        'sALEDATEINVALID': json['SALE_DATE_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['SALE_DATE_INVALID']),
        'sHIPPINGINVALID': json['SHIPPING_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['SHIPPING_INVALID']),
        'sHIPPINGHEIGHTINVALID': json['SHIPPING_HEIGHT_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['SHIPPING_HEIGHT_INVALID']),
        'sHIPPINGWEIGHTINVALID': json['SHIPPING_WEIGHT_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['SHIPPING_WEIGHT_INVALID']),
        'sHIPPINGWIDTHINVALID': json['SHIPPING_WIDTH_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['SHIPPING_WIDTH_INVALID']),
        'sIZETYPEINVALID': json['SIZE_TYPE_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['SIZE_TYPE_INVALID']),
        'sIZETYPENORMALIZED': json['SIZE_TYPE_NORMALIZED'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['SIZE_TYPE_NORMALIZED']),
        'tAXINVALID': json['TAX_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['TAX_INVALID']),
        'tITLELENGTHTOOLONG': json['TITLE_LENGTH_TOO_LONG'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['TITLE_LENGTH_TOO_LONG']),
        'tOOMANYADDITIONALIMAGELINKS': json['TOO_MANY_ADDITIONAL_IMAGE_LINKS'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['TOO_MANY_ADDITIONAL_IMAGE_LINKS']),
        'uTMSOURCEAUTOCORRECTED': json['UTM_SOURCE_AUTO_CORRECTED'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['UTM_SOURCE_AUTO_CORRECTED']),
        'wEIGHTUNITINVALID': json['WEIGHT_UNIT_INVALID'] == null ? undefined : CatalogsItemValidationDetailsFromJSON(json['WEIGHT_UNIT_INVALID']),
    };
}

export function CatalogsItemValidationWarningsToJSON(value?: CatalogsItemValidationWarnings | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'ADDITIONAL_IMAGE_LINK_LENGTH_TOO_LONG': CatalogsItemValidationDetailsToJSON(value['aDDITIONALIMAGELINKLENGTHTOOLONG']),
        'ADDITIONAL_IMAGE_LINK_WARNING': CatalogsItemValidationDetailsToJSON(value['aDDITIONALIMAGELINKWARNING']),
        'ADWORDS_FORMAT_WARNING': CatalogsItemValidationDetailsToJSON(value['aDWORDSFORMATWARNING']),
        'ADWORDS_SAME_AS_LINK': CatalogsItemValidationDetailsToJSON(value['aDWORDSSAMEASLINK']),
        'AGE_GROUP_INVALID': CatalogsItemValidationDetailsToJSON(value['aGEGROUPINVALID']),
        'SIZE_SYSTEM_INVALID': CatalogsItemValidationDetailsToJSON(value['sIZESYSTEMINVALID']),
        'AGE_GROUP_NORMALIZED': CatalogsItemValidationDetailsToJSON(value['aGEGROUPNORMALIZED']),
        'ANDROID_DEEP_LINK_INVALID': CatalogsItemValidationDetailsToJSON(value['aNDROIDDEEPLINKINVALID']),
        'AVAILABILITY_DATE_INVALID': CatalogsItemValidationDetailsToJSON(value['aVAILABILITYDATEINVALID']),
        'AVAILABILITY_NORMALIZED': CatalogsItemValidationDetailsToJSON(value['aVAILABILITYNORMALIZED']),
        'CONDITION_NORMALIZED': CatalogsItemValidationDetailsToJSON(value['cONDITIONNORMALIZED']),
        'COUNTRY_DOES_NOT_MAP_TO_CURRENCY': CatalogsItemValidationDetailsToJSON(value['cOUNTRYDOESNOTMAPTOCURRENCY']),
        'CUSTOM_LABEL_LENGTH_TOO_LONG': CatalogsItemValidationDetailsToJSON(value['cUSTOMLABELLENGTHTOOLONG']),
        'DESCRIPTION_LENGTH_TOO_LONG': CatalogsItemValidationDetailsToJSON(value['dESCRIPTIONLENGTHTOOLONG']),
        'DUPLICATE_PRODUCTS': CatalogsItemValidationDetailsToJSON(value['dUPLICATEPRODUCTS']),
        'EXPIRATION_DATE_INVALID': CatalogsItemValidationDetailsToJSON(value['eXPIRATIONDATEINVALID']),
        'GENDER_INVALID': CatalogsItemValidationDetailsToJSON(value['gENDERINVALID']),
        'GENDER_NORMALIZED': CatalogsItemValidationDetailsToJSON(value['gENDERNORMALIZED']),
        'GTIN_INVALID': CatalogsItemValidationDetailsToJSON(value['gTININVALID']),
        'IMAGE_LINK_WARNING': CatalogsItemValidationDetailsToJSON(value['iMAGELINKWARNING']),
        'IOS_DEEP_LINK_INVALID': CatalogsItemValidationDetailsToJSON(value['iOSDEEPLINKINVALID']),
        'IS_BUNDLE_INVALID': CatalogsItemValidationDetailsToJSON(value['iSBUNDLEINVALID']),
        'ITEM_ADDITIONAL_IMAGE_DOWNLOAD_FAILURE': CatalogsItemValidationDetailsToJSON(value['iTEMADDITIONALIMAGEDOWNLOADFAILURE']),
        'LINK_FORMAT_WARNING': CatalogsItemValidationDetailsToJSON(value['lINKFORMATWARNING']),
        'MIN_AD_PRICE_INVALID': CatalogsItemValidationDetailsToJSON(value['mINADPRICEINVALID']),
        'MPN_INVALID': CatalogsItemValidationDetailsToJSON(value['mPNINVALID']),
        'MULTIPACK_INVALID': CatalogsItemValidationDetailsToJSON(value['mULTIPACKINVALID']),
        'OPTIONAL_CONDITION_INVALID': CatalogsItemValidationDetailsToJSON(value['oPTIONALCONDITIONINVALID']),
        'OPTIONAL_CONDITION_MISSING': CatalogsItemValidationDetailsToJSON(value['oPTIONALCONDITIONMISSING']),
        'OPTIONAL_PRODUCT_CATEGORY_INVALID': CatalogsItemValidationDetailsToJSON(value['oPTIONALPRODUCTCATEGORYINVALID']),
        'OPTIONAL_PRODUCT_CATEGORY_MISSING': CatalogsItemValidationDetailsToJSON(value['oPTIONALPRODUCTCATEGORYMISSING']),
        'PRODUCT_CATEGORY_DEPTH_WARNING': CatalogsItemValidationDetailsToJSON(value['pRODUCTCATEGORYDEPTHWARNING']),
        'PRODUCT_TYPE_LENGTH_TOO_LONG': CatalogsItemValidationDetailsToJSON(value['pRODUCTTYPELENGTHTOOLONG']),
        'SALES_PRICE_INVALID': CatalogsItemValidationDetailsToJSON(value['sALESPRICEINVALID']),
        'SALES_PRICE_TOO_LOW': CatalogsItemValidationDetailsToJSON(value['sALESPRICETOOLOW']),
        'SALES_PRICE_TOO_HIGH': CatalogsItemValidationDetailsToJSON(value['sALESPRICETOOHIGH']),
        'SALE_DATE_INVALID': CatalogsItemValidationDetailsToJSON(value['sALEDATEINVALID']),
        'SHIPPING_INVALID': CatalogsItemValidationDetailsToJSON(value['sHIPPINGINVALID']),
        'SHIPPING_HEIGHT_INVALID': CatalogsItemValidationDetailsToJSON(value['sHIPPINGHEIGHTINVALID']),
        'SHIPPING_WEIGHT_INVALID': CatalogsItemValidationDetailsToJSON(value['sHIPPINGWEIGHTINVALID']),
        'SHIPPING_WIDTH_INVALID': CatalogsItemValidationDetailsToJSON(value['sHIPPINGWIDTHINVALID']),
        'SIZE_TYPE_INVALID': CatalogsItemValidationDetailsToJSON(value['sIZETYPEINVALID']),
        'SIZE_TYPE_NORMALIZED': CatalogsItemValidationDetailsToJSON(value['sIZETYPENORMALIZED']),
        'TAX_INVALID': CatalogsItemValidationDetailsToJSON(value['tAXINVALID']),
        'TITLE_LENGTH_TOO_LONG': CatalogsItemValidationDetailsToJSON(value['tITLELENGTHTOOLONG']),
        'TOO_MANY_ADDITIONAL_IMAGE_LINKS': CatalogsItemValidationDetailsToJSON(value['tOOMANYADDITIONALIMAGELINKS']),
        'UTM_SOURCE_AUTO_CORRECTED': CatalogsItemValidationDetailsToJSON(value['uTMSOURCEAUTOCORRECTED']),
        'WEIGHT_UNIT_INVALID': CatalogsItemValidationDetailsToJSON(value['wEIGHTUNITINVALID']),
    };
}
