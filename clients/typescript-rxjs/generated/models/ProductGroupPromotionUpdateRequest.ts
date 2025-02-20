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
    ProductGroupPromotion,
} from './';

/**
 * @export
 * @interface ProductGroupPromotionUpdateRequest
 */
export interface ProductGroupPromotionUpdateRequest {
    /**
     * ID of the ad group the product group belongs to.
     * @type {string}
     * @memberof ProductGroupPromotionUpdateRequest
     */
    ad_group_id: string;
    /**
     * @type {Array<ProductGroupPromotion>}
     * @memberof ProductGroupPromotionUpdateRequest
     */
    product_group_promotion: Array<ProductGroupPromotion>;
}
