/* tslint:disable */
/* eslint-disable */
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { exists, mapValues } from '../runtime';
import {
    CatalogsProductGroupMultipleStringListCriteria,
    CatalogsProductGroupMultipleStringListCriteriaFromJSON,
    CatalogsProductGroupMultipleStringListCriteriaFromJSONTyped,
    CatalogsProductGroupMultipleStringListCriteriaToJSON,
} from './CatalogsProductGroupMultipleStringListCriteria';

/**
 * 
 * @export
 * @interface ProductType2Filter
 */
export interface ProductType2Filter {
    /**
     * 
     * @type {CatalogsProductGroupMultipleStringListCriteria}
     * @memberof ProductType2Filter
     */
    pRODUCTTYPE2: CatalogsProductGroupMultipleStringListCriteria;
}

export function ProductType2FilterFromJSON(json: any): ProductType2Filter {
    return ProductType2FilterFromJSONTyped(json, false);
}

export function ProductType2FilterFromJSONTyped(json: any, ignoreDiscriminator: boolean): ProductType2Filter {
    if ((json === undefined) || (json === null)) {
        return json;
    }
    return {
        
        'pRODUCTTYPE2': json['PRODUCT_TYPE_2'],
    };
}

export function ProductType2FilterToJSON(value?: ProductType2Filter | null): any {
    if (value === undefined) {
        return undefined;
    }
    if (value === null) {
        return null;
    }
    return {
        
        'PRODUCT_TYPE_2': value.pRODUCTTYPE2,
    };
}
