/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface ConversionTagConfigs
 */
export interface ConversionTagConfigs {
    /**
     * Whether Automatic Enhanced Match email is enabled. See <a href="https://help.pinterest.com/en/business/article/enhanced-match" target="_blank">Enhanced match</a> for more information.
     * @type {boolean}
     * @memberof ConversionTagConfigs
     */
    aemEnabled?: boolean | null;
    /**
     * Metadata ingestion frequency.
     * @type {number}
     * @memberof ConversionTagConfigs
     */
    mdFrequency?: number | null;
    /**
     * Whether Automatic Enhanced Match name is enabled. See <a href="https://help.pinterest.com/en/business/article/enhanced-match" target="_blank">Enhanced match</a> for more information.
     * @type {boolean}
     * @memberof ConversionTagConfigs
     */
    aemFnlnEnabled?: boolean | null;
    /**
     * Whether Automatic Enhanced Match phone is enabled. See <a href="https://help.pinterest.com/en/business/article/enhanced-match" target="_blank">Enhanced match</a> for more information.
     * @type {boolean}
     * @memberof ConversionTagConfigs
     */
    aemPhEnabled?: boolean | null;
    /**
     * Whether Automatic Enhanced Match gender is enabled. See <a href="https://help.pinterest.com/en/business/article/enhanced-match" target="_blank">Enhanced match</a> for more information.
     * @type {boolean}
     * @memberof ConversionTagConfigs
     */
    aemGeEnabled?: boolean | null;
    /**
     * Whether Automatic Enhanced Match birthdate is enabled. See <a href="https://help.pinterest.com/en/business/article/enhanced-match" target="_blank">Enhanced match</a> for more information.
     * @type {boolean}
     * @memberof ConversionTagConfigs
     */
    aemDbEnabled?: boolean | null;
    /**
     * Whether Automatic Enhanced Match location is enabled. See <a href="https://help.pinterest.com/en/business/article/enhanced-match" target="_blank">Enhanced match</a> for more information.
     * @type {boolean}
     * @memberof ConversionTagConfigs
     */
    aemLocEnabled?: boolean | null;
}

/**
 * Check if a given object implements the ConversionTagConfigs interface.
 */
export function instanceOfConversionTagConfigs(value: object): value is ConversionTagConfigs {
    return true;
}

export function ConversionTagConfigsFromJSON(json: any): ConversionTagConfigs {
    return ConversionTagConfigsFromJSONTyped(json, false);
}

export function ConversionTagConfigsFromJSONTyped(json: any, ignoreDiscriminator: boolean): ConversionTagConfigs {
    if (json == null) {
        return json;
    }
    return {
        
        'aemEnabled': json['aem_enabled'] == null ? undefined : json['aem_enabled'],
        'mdFrequency': json['md_frequency'] == null ? undefined : json['md_frequency'],
        'aemFnlnEnabled': json['aem_fnln_enabled'] == null ? undefined : json['aem_fnln_enabled'],
        'aemPhEnabled': json['aem_ph_enabled'] == null ? undefined : json['aem_ph_enabled'],
        'aemGeEnabled': json['aem_ge_enabled'] == null ? undefined : json['aem_ge_enabled'],
        'aemDbEnabled': json['aem_db_enabled'] == null ? undefined : json['aem_db_enabled'],
        'aemLocEnabled': json['aem_loc_enabled'] == null ? undefined : json['aem_loc_enabled'],
    };
}

  export function ConversionTagConfigsToJSON(json: any): ConversionTagConfigs {
      return ConversionTagConfigsToJSONTyped(json, false);
  }

  export function ConversionTagConfigsToJSONTyped(value?: ConversionTagConfigs | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'aem_enabled': value['aemEnabled'],
        'md_frequency': value['mdFrequency'],
        'aem_fnln_enabled': value['aemFnlnEnabled'],
        'aem_ph_enabled': value['aemPhEnabled'],
        'aem_ge_enabled': value['aemGeEnabled'],
        'aem_db_enabled': value['aemDbEnabled'],
        'aem_loc_enabled': value['aemLocEnabled'],
    };
}

