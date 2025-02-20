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
import type { NonNullableCatalogsCurrency } from './NonNullableCatalogsCurrency';
import {
    NonNullableCatalogsCurrencyFromJSON,
    NonNullableCatalogsCurrencyFromJSONTyped,
    NonNullableCatalogsCurrencyToJSON,
    NonNullableCatalogsCurrencyToJSONTyped,
} from './NonNullableCatalogsCurrency';

/**
 * 
 * @export
 * @interface CatalogsProductGroupPricingCurrencyCriteria
 */
export interface CatalogsProductGroupPricingCurrencyCriteria {
    /**
     * 
     * @type {string}
     * @memberof CatalogsProductGroupPricingCurrencyCriteria
     */
    operator: CatalogsProductGroupPricingCurrencyCriteriaOperatorEnum;
    /**
     * 
     * @type {number}
     * @memberof CatalogsProductGroupPricingCurrencyCriteria
     */
    value: number;
    /**
     * 
     * @type {NonNullableCatalogsCurrency}
     * @memberof CatalogsProductGroupPricingCurrencyCriteria
     */
    currency: NonNullableCatalogsCurrency;
    /**
     * 
     * @type {boolean}
     * @memberof CatalogsProductGroupPricingCurrencyCriteria
     */
    negated?: boolean;
}


/**
 * @export
 */
export const CatalogsProductGroupPricingCurrencyCriteriaOperatorEnum = {
    GreaterThan: 'GREATER_THAN',
    GreaterThanOrEquals: 'GREATER_THAN_OR_EQUALS',
    LessThan: 'LESS_THAN',
    LessThanOrEquals: 'LESS_THAN_OR_EQUALS'
} as const;
export type CatalogsProductGroupPricingCurrencyCriteriaOperatorEnum = typeof CatalogsProductGroupPricingCurrencyCriteriaOperatorEnum[keyof typeof CatalogsProductGroupPricingCurrencyCriteriaOperatorEnum];


/**
 * Check if a given object implements the CatalogsProductGroupPricingCurrencyCriteria interface.
 */
export function instanceOfCatalogsProductGroupPricingCurrencyCriteria(value: object): value is CatalogsProductGroupPricingCurrencyCriteria {
    if (!('operator' in value) || value['operator'] === undefined) return false;
    if (!('value' in value) || value['value'] === undefined) return false;
    if (!('currency' in value) || value['currency'] === undefined) return false;
    return true;
}

export function CatalogsProductGroupPricingCurrencyCriteriaFromJSON(json: any): CatalogsProductGroupPricingCurrencyCriteria {
    return CatalogsProductGroupPricingCurrencyCriteriaFromJSONTyped(json, false);
}

export function CatalogsProductGroupPricingCurrencyCriteriaFromJSONTyped(json: any, ignoreDiscriminator: boolean): CatalogsProductGroupPricingCurrencyCriteria {
    if (json == null) {
        return json;
    }
    return {
        
        'operator': json['operator'],
        'value': json['value'],
        'currency': NonNullableCatalogsCurrencyFromJSON(json['currency']),
        'negated': json['negated'] == null ? undefined : json['negated'],
    };
}

  export function CatalogsProductGroupPricingCurrencyCriteriaToJSON(json: any): CatalogsProductGroupPricingCurrencyCriteria {
      return CatalogsProductGroupPricingCurrencyCriteriaToJSONTyped(json, false);
  }

  export function CatalogsProductGroupPricingCurrencyCriteriaToJSONTyped(value?: CatalogsProductGroupPricingCurrencyCriteria | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'operator': value['operator'],
        'value': value['value'],
        'currency': NonNullableCatalogsCurrencyToJSON(value['currency']),
        'negated': value['negated'],
    };
}

