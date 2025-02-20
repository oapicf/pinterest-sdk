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
 * The ItemDeleteBatchRecord model module.
 * @module model/ItemDeleteBatchRecord
 * @version 1.1.1-pre.0
 */
class ItemDeleteBatchRecord {
    /**
     * Constructs a new <code>ItemDeleteBatchRecord</code>.
     * Object describing an item batch record to delete items
     * @alias module:model/ItemDeleteBatchRecord
     */
    constructor() { 
        
        ItemDeleteBatchRecord.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ItemDeleteBatchRecord</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ItemDeleteBatchRecord} obj Optional instance to populate.
     * @return {module:model/ItemDeleteBatchRecord} The populated <code>ItemDeleteBatchRecord</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ItemDeleteBatchRecord();

            if (data.hasOwnProperty('item_id')) {
                obj['item_id'] = ApiClient.convertToType(data['item_id'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ItemDeleteBatchRecord</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ItemDeleteBatchRecord</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['item_id'] && !(typeof data['item_id'] === 'string' || data['item_id'] instanceof String)) {
            throw new Error("Expected the field `item_id` to be a primitive type in the JSON string but got " + data['item_id']);
        }

        return true;
    }


}



/**
 * The catalog item id in the merchant namespace
 * @member {String} item_id
 */
ItemDeleteBatchRecord.prototype['item_id'] = undefined;






export default ItemDeleteBatchRecord;

