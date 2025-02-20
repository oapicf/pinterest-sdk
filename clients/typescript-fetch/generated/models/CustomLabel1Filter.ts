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
import type { CatalogsProductGroupMultipleStringCriteria } from './CatalogsProductGroupMultipleStringCriteria';
import {
    CatalogsProductGroupMultipleStringCriteriaFromJSON,
    CatalogsProductGroupMultipleStringCriteriaFromJSONTyped,
    CatalogsProductGroupMultipleStringCriteriaToJSON,
    CatalogsProductGroupMultipleStringCriteriaToJSONTyped,
} from './CatalogsProductGroupMultipleStringCriteria';

/**
 * 
 * @export
 * @interface CustomLabel1Filter
 */
export interface CustomLabel1Filter {
    /**
     * 
     * @type {CatalogsProductGroupMultipleStringCriteria}
     * @memberof CustomLabel1Filter
     */
    cUSTOMLABEL1: CatalogsProductGroupMultipleStringCriteria;
}

/**
 * Check if a given object implements the CustomLabel1Filter interface.
 */
export function instanceOfCustomLabel1Filter(value: object): value is CustomLabel1Filter {
    if (!('cUSTOMLABEL1' in value) || value['cUSTOMLABEL1'] === undefined) return false;
    return true;
}

export function CustomLabel1FilterFromJSON(json: any): CustomLabel1Filter {
    return CustomLabel1FilterFromJSONTyped(json, false);
}

export function CustomLabel1FilterFromJSONTyped(json: any, ignoreDiscriminator: boolean): CustomLabel1Filter {
    if (json == null) {
        return json;
    }
    return {
        
        'cUSTOMLABEL1': json['CUSTOM_LABEL_1'],
    };
}

  export function CustomLabel1FilterToJSON(json: any): CustomLabel1Filter {
      return CustomLabel1FilterToJSONTyped(json, false);
  }

  export function CustomLabel1FilterToJSONTyped(value?: CustomLabel1Filter | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'CUSTOM_LABEL_1': value['cUSTOMLABEL1'],
    };
}

