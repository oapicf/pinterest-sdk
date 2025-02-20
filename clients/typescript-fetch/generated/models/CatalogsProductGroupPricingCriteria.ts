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
 * @interface CatalogsProductGroupPricingCriteria
 */
export interface CatalogsProductGroupPricingCriteria {
    /**
     * 
     * @type {boolean}
     * @memberof CatalogsProductGroupPricingCriteria
     */
    inclusion?: boolean;
    /**
     * 
     * @type {number}
     * @memberof CatalogsProductGroupPricingCriteria
     */
    values: number;
    /**
     * 
     * @type {boolean}
     * @memberof CatalogsProductGroupPricingCriteria
     */
    negated?: boolean;
}

/**
 * Check if a given object implements the CatalogsProductGroupPricingCriteria interface.
 */
export function instanceOfCatalogsProductGroupPricingCriteria(value: object): value is CatalogsProductGroupPricingCriteria {
    if (!('values' in value) || value['values'] === undefined) return false;
    return true;
}

export function CatalogsProductGroupPricingCriteriaFromJSON(json: any): CatalogsProductGroupPricingCriteria {
    return CatalogsProductGroupPricingCriteriaFromJSONTyped(json, false);
}

export function CatalogsProductGroupPricingCriteriaFromJSONTyped(json: any, ignoreDiscriminator: boolean): CatalogsProductGroupPricingCriteria {
    if (json == null) {
        return json;
    }
    return {
        
        'inclusion': json['inclusion'] == null ? undefined : json['inclusion'],
        'values': json['values'],
        'negated': json['negated'] == null ? undefined : json['negated'],
    };
}

  export function CatalogsProductGroupPricingCriteriaToJSON(json: any): CatalogsProductGroupPricingCriteria {
      return CatalogsProductGroupPricingCriteriaToJSONTyped(json, false);
  }

  export function CatalogsProductGroupPricingCriteriaToJSONTyped(value?: CatalogsProductGroupPricingCriteria | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'inclusion': value['inclusion'],
        'values': value['values'],
        'negated': value['negated'],
    };
}

