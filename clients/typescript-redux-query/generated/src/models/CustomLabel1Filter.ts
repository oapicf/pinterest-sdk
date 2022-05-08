// tslint:disable
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
    CatalogsProductGroupMultipleStringCriteria,
    CatalogsProductGroupMultipleStringCriteriaFromJSON,
    CatalogsProductGroupMultipleStringCriteriaToJSON,
} from './';

/**
 * 
 * @export
 * @interface CustomLabel1Filter
 */
export interface CustomLabel1Filter  {
    /**
     * 
     * @type {CatalogsProductGroupMultipleStringCriteria}
     * @memberof CustomLabel1Filter
     */
    cUSTOMLABEL1: CatalogsProductGroupMultipleStringCriteria;
}

export function CustomLabel1FilterFromJSON(json: any): CustomLabel1Filter {
    return {
        'cUSTOMLABEL1': json['CUSTOM_LABEL_1'],
    };
}

export function CustomLabel1FilterToJSON(value?: CustomLabel1Filter): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'CUSTOM_LABEL_1': value.cUSTOMLABEL1,
    };
}

