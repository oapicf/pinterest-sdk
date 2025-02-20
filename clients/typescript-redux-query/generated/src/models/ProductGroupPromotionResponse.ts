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
    ProductGroupPromotionResponseItem,
    ProductGroupPromotionResponseItemFromJSON,
    ProductGroupPromotionResponseItemToJSON,
} from './';

/**
 * 
 * @export
 * @interface ProductGroupPromotionResponse
 */
export interface ProductGroupPromotionResponse  {
    /**
     * 
     * @type {Array<ProductGroupPromotionResponseItem>}
     * @memberof ProductGroupPromotionResponse
     */
    items?: Array<ProductGroupPromotionResponseItem>;
}

export function ProductGroupPromotionResponseFromJSON(json: any): ProductGroupPromotionResponse {
    return {
        'items': !exists(json, 'items') ? undefined : (json['items'] as Array<any>).map(ProductGroupPromotionResponseItemFromJSON),
    };
}

export function ProductGroupPromotionResponseToJSON(value?: ProductGroupPromotionResponse): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'items': value.items === undefined ? undefined : (value.items as Array<any>).map(ProductGroupPromotionResponseItemToJSON),
    };
}


