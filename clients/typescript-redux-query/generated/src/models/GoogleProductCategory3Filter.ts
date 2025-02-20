// tslint:disable
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

import { exists, mapValues } from '../runtime';
import {
    CatalogsProductGroupMultipleStringListCriteria,
    CatalogsProductGroupMultipleStringListCriteriaFromJSON,
    CatalogsProductGroupMultipleStringListCriteriaToJSON,
} from './';

/**
 * 
 * @export
 * @interface GoogleProductCategory3Filter
 */
export interface GoogleProductCategory3Filter  {
    /**
     * 
     * @type {CatalogsProductGroupMultipleStringListCriteria}
     * @memberof GoogleProductCategory3Filter
     */
    gOOGLEPRODUCTCATEGORY3: CatalogsProductGroupMultipleStringListCriteria;
}

export function GoogleProductCategory3FilterFromJSON(json: any): GoogleProductCategory3Filter {
    return {
        'gOOGLEPRODUCTCATEGORY3': json['GOOGLE_PRODUCT_CATEGORY_3'],
    };
}

export function GoogleProductCategory3FilterToJSON(value?: GoogleProductCategory3Filter): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'GOOGLE_PRODUCT_CATEGORY_3': value.gOOGLEPRODUCTCATEGORY3,
    };
}


