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
 * @interface CustomLabel0Filter
 */
export interface CustomLabel0Filter {
    /**
     * 
     * @type {CatalogsProductGroupMultipleStringCriteria}
     * @memberof CustomLabel0Filter
     */
    cUSTOMLABEL0: CatalogsProductGroupMultipleStringCriteria;
}

/**
 * Check if a given object implements the CustomLabel0Filter interface.
 */
export function instanceOfCustomLabel0Filter(value: object): value is CustomLabel0Filter {
    if (!('cUSTOMLABEL0' in value) || value['cUSTOMLABEL0'] === undefined) return false;
    return true;
}

export function CustomLabel0FilterFromJSON(json: any): CustomLabel0Filter {
    return CustomLabel0FilterFromJSONTyped(json, false);
}

export function CustomLabel0FilterFromJSONTyped(json: any, ignoreDiscriminator: boolean): CustomLabel0Filter {
    if (json == null) {
        return json;
    }
    return {
        
        'cUSTOMLABEL0': json['CUSTOM_LABEL_0'],
    };
}

  export function CustomLabel0FilterToJSON(json: any): CustomLabel0Filter {
      return CustomLabel0FilterToJSONTyped(json, false);
  }

  export function CustomLabel0FilterToJSONTyped(value?: CustomLabel0Filter | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'CUSTOM_LABEL_0': value['cUSTOMLABEL0'],
    };
}

