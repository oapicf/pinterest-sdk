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

/**
 * @export
 * @interface LineItem
 */
export interface LineItem {
    /**
     * Product brand. For example, \"Parker\".
     * @type {string}
     * @memberof LineItem
     */
    product_brand?: string;
    /**
     * Product category. For example, \"Shoes\".
     * @type {string}
     * @memberof LineItem
     */
    product_category?: string;
    /**
     * Product ID. For example, 1414.
     * @type {number}
     * @memberof LineItem
     */
    product_id?: number;
    /**
     * Product name. For example, \"Parker Boots\".
     * @type {string}
     * @memberof LineItem
     */
    product_name?: string;
    /**
     * Product price. For example, \"99.99\".
     * @type {string}
     * @memberof LineItem
     */
    product_price?: string;
    /**
     * Product quantity. For example, 2.
     * @type {number}
     * @memberof LineItem
     */
    product_quantity?: number;
    /**
     * Product variant. For example, \"Red\".
     * @type {string}
     * @memberof LineItem
     */
    product_variant?: string;
    /**
     * Product variant ID. For example, \"1414-34832\".
     * @type {string}
     * @memberof LineItem
     */
    product_variant_id?: string;
}
