/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * OpenAPI spec version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { ProductGroupPromotion } from '../models/ProductGroupPromotion';
import { HttpFile } from '../http/http';

export class ProductGroupPromotionUpdateRequest {
    /**
    * ID of the ad group the product group belongs to.
    */
    'adGroupId': string;
    'productGroupPromotion': Array<ProductGroupPromotion>;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "adGroupId",
            "baseName": "ad_group_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "productGroupPromotion",
            "baseName": "product_group_promotion",
            "type": "Array<ProductGroupPromotion>",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return ProductGroupPromotionUpdateRequest.attributeTypeMap;
    }

    public constructor() {
    }
}
