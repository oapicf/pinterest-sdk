/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The LineItem model module.
 * @module model/LineItem
 * @version 1.1.1-pre.0
 */
class LineItem {
    /**
     * Constructs a new <code>LineItem</code>.
     * @alias module:model/LineItem
     */
    constructor() { 
        
        LineItem.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>LineItem</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/LineItem} obj Optional instance to populate.
     * @return {module:model/LineItem} The populated <code>LineItem</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LineItem();

            if (data.hasOwnProperty('product_brand')) {
                obj['product_brand'] = ApiClient.convertToType(data['product_brand'], 'String');
            }
            if (data.hasOwnProperty('product_category')) {
                obj['product_category'] = ApiClient.convertToType(data['product_category'], 'String');
            }
            if (data.hasOwnProperty('product_id')) {
                obj['product_id'] = ApiClient.convertToType(data['product_id'], 'Number');
            }
            if (data.hasOwnProperty('product_name')) {
                obj['product_name'] = ApiClient.convertToType(data['product_name'], 'String');
            }
            if (data.hasOwnProperty('product_price')) {
                obj['product_price'] = ApiClient.convertToType(data['product_price'], 'String');
            }
            if (data.hasOwnProperty('product_quantity')) {
                obj['product_quantity'] = ApiClient.convertToType(data['product_quantity'], 'Number');
            }
            if (data.hasOwnProperty('product_variant')) {
                obj['product_variant'] = ApiClient.convertToType(data['product_variant'], 'String');
            }
            if (data.hasOwnProperty('product_variant_id')) {
                obj['product_variant_id'] = ApiClient.convertToType(data['product_variant_id'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>LineItem</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>LineItem</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['product_brand'] && !(typeof data['product_brand'] === 'string' || data['product_brand'] instanceof String)) {
            throw new Error("Expected the field `product_brand` to be a primitive type in the JSON string but got " + data['product_brand']);
        }
        // ensure the json data is a string
        if (data['product_category'] && !(typeof data['product_category'] === 'string' || data['product_category'] instanceof String)) {
            throw new Error("Expected the field `product_category` to be a primitive type in the JSON string but got " + data['product_category']);
        }
        // ensure the json data is a string
        if (data['product_name'] && !(typeof data['product_name'] === 'string' || data['product_name'] instanceof String)) {
            throw new Error("Expected the field `product_name` to be a primitive type in the JSON string but got " + data['product_name']);
        }
        // ensure the json data is a string
        if (data['product_price'] && !(typeof data['product_price'] === 'string' || data['product_price'] instanceof String)) {
            throw new Error("Expected the field `product_price` to be a primitive type in the JSON string but got " + data['product_price']);
        }
        // ensure the json data is a string
        if (data['product_variant'] && !(typeof data['product_variant'] === 'string' || data['product_variant'] instanceof String)) {
            throw new Error("Expected the field `product_variant` to be a primitive type in the JSON string but got " + data['product_variant']);
        }
        // ensure the json data is a string
        if (data['product_variant_id'] && !(typeof data['product_variant_id'] === 'string' || data['product_variant_id'] instanceof String)) {
            throw new Error("Expected the field `product_variant_id` to be a primitive type in the JSON string but got " + data['product_variant_id']);
        }

        return true;
    }


}



/**
 * Product brand. For example, \"Parker\".
 * @member {String} product_brand
 */
LineItem.prototype['product_brand'] = undefined;

/**
 * Product category. For example, \"Shoes\".
 * @member {String} product_category
 */
LineItem.prototype['product_category'] = undefined;

/**
 * Product ID. For example, 1414.
 * @member {Number} product_id
 */
LineItem.prototype['product_id'] = undefined;

/**
 * Product name. For example, \"Parker Boots\".
 * @member {String} product_name
 */
LineItem.prototype['product_name'] = undefined;

/**
 * Product price. For example, \"99.99\".
 * @member {String} product_price
 */
LineItem.prototype['product_price'] = undefined;

/**
 * Product quantity. For example, 2.
 * @member {Number} product_quantity
 */
LineItem.prototype['product_quantity'] = undefined;

/**
 * Product variant. For example, \"Red\".
 * @member {String} product_variant
 */
LineItem.prototype['product_variant'] = undefined;

/**
 * Product variant ID. For example, \"1414-34832\".
 * @member {String} product_variant_id
 */
LineItem.prototype['product_variant_id'] = undefined;






export default LineItem;

