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

import type {
    Exception,
    ProductGroupPromotionResponseElement,
} from './';

/**
 * @export
 * @interface ProductGroupPromotionResponseItem
 */
export interface ProductGroupPromotionResponseItem {
    /**
     * @type {ProductGroupPromotionResponseElement}
     * @memberof ProductGroupPromotionResponseItem
     */
    data?: ProductGroupPromotionResponseElement;
    /**
     * @type {Array<Exception>}
     * @memberof ProductGroupPromotionResponseItem
     */
    exceptions?: Array<Exception> | null;
}
