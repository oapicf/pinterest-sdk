/* tslint:disable */
/* eslint-disable */
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.6.0
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
 * @interface LineItem
 */
export interface LineItem {
    /**
     * Product brand. For example, "Parker".
     * @type {string}
     * @memberof LineItem
     */
    productBrand?: string;
    /**
     * Product category. For example, "Shoes".
     * @type {string}
     * @memberof LineItem
     */
    productCategory?: string;
    /**
     * Product ID. For example, 1414.
     * @type {number}
     * @memberof LineItem
     */
    productId?: number;
    /**
     * Product name. For example, "Parker Boots".
     * @type {string}
     * @memberof LineItem
     */
    productName?: string;
    /**
     * Product price. For example, "99.99".
     * @type {string}
     * @memberof LineItem
     */
    productPrice?: string;
    /**
     * Product quantity. For example, 2.
     * @type {number}
     * @memberof LineItem
     */
    productQuantity?: number;
    /**
     * Product variant. For example, "Red".
     * @type {string}
     * @memberof LineItem
     */
    productVariant?: string;
    /**
     * Product variant ID. For example, "1414-34832".
     * @type {string}
     * @memberof LineItem
     */
    productVariantId?: string;
}

/**
 * Check if a given object implements the LineItem interface.
 */
export function instanceOfLineItem(value: object): boolean {
    return true;
}

export function LineItemFromJSON(json: any): LineItem {
    return LineItemFromJSONTyped(json, false);
}

export function LineItemFromJSONTyped(json: any, ignoreDiscriminator: boolean): LineItem {
    if (json == null) {
        return json;
    }
    return {
        
        'productBrand': json['product_brand'] == null ? undefined : json['product_brand'],
        'productCategory': json['product_category'] == null ? undefined : json['product_category'],
        'productId': json['product_id'] == null ? undefined : json['product_id'],
        'productName': json['product_name'] == null ? undefined : json['product_name'],
        'productPrice': json['product_price'] == null ? undefined : json['product_price'],
        'productQuantity': json['product_quantity'] == null ? undefined : json['product_quantity'],
        'productVariant': json['product_variant'] == null ? undefined : json['product_variant'],
        'productVariantId': json['product_variant_id'] == null ? undefined : json['product_variant_id'],
    };
}

export function LineItemToJSON(value?: LineItem | null): any {
    if (value == null) {
        return value;
    }
    return {
        
        'product_brand': value['productBrand'],
        'product_category': value['productCategory'],
        'product_id': value['productId'],
        'product_name': value['productName'],
        'product_price': value['productPrice'],
        'product_quantity': value['productQuantity'],
        'product_variant': value['productVariant'],
        'product_variant_id': value['productVariantId'],
    };
}
