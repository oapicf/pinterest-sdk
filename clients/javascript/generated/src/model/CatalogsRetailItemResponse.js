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
import CatalogsType from './CatalogsType';
import ItemAttributes from './ItemAttributes';
import Pin from './Pin';

/**
 * The CatalogsRetailItemResponse model module.
 * @module model/CatalogsRetailItemResponse
 * @version 1.1.1-pre.0
 */
class CatalogsRetailItemResponse {
    /**
     * Constructs a new <code>CatalogsRetailItemResponse</code>.
     * Object describing a retail item record
     * @alias module:model/CatalogsRetailItemResponse
     * @param catalogType {module:model/CatalogsType} 
     */
    constructor(catalogType) { 
        
        CatalogsRetailItemResponse.initialize(this, catalogType);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, catalogType) { 
        obj['catalog_type'] = catalogType;
    }

    /**
     * Constructs a <code>CatalogsRetailItemResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CatalogsRetailItemResponse} obj Optional instance to populate.
     * @return {module:model/CatalogsRetailItemResponse} The populated <code>CatalogsRetailItemResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CatalogsRetailItemResponse();

            if (data.hasOwnProperty('catalog_type')) {
                obj['catalog_type'] = CatalogsType.constructFromObject(data['catalog_type']);
            }
            if (data.hasOwnProperty('item_id')) {
                obj['item_id'] = ApiClient.convertToType(data['item_id'], 'String');
            }
            if (data.hasOwnProperty('pins')) {
                obj['pins'] = ApiClient.convertToType(data['pins'], [Pin]);
            }
            if (data.hasOwnProperty('attributes')) {
                obj['attributes'] = ItemAttributes.constructFromObject(data['attributes']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CatalogsRetailItemResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CatalogsRetailItemResponse</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CatalogsRetailItemResponse.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['item_id'] && !(typeof data['item_id'] === 'string' || data['item_id'] instanceof String)) {
            throw new Error("Expected the field `item_id` to be a primitive type in the JSON string but got " + data['item_id']);
        }
        if (data['pins']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['pins'])) {
                throw new Error("Expected the field `pins` to be an array in the JSON data but got " + data['pins']);
            }
            // validate the optional field `pins` (array)
            for (const item of data['pins']) {
                Pin.validateJSON(item);
            };
        }
        // validate the optional field `attributes`
        if (data['attributes']) { // data not null
          ItemAttributes.validateJSON(data['attributes']);
        }

        return true;
    }


}

CatalogsRetailItemResponse.RequiredProperties = ["catalog_type"];

/**
 * @member {module:model/CatalogsType} catalog_type
 */
CatalogsRetailItemResponse.prototype['catalog_type'] = undefined;

/**
 * The catalog retail item id in the merchant namespace
 * @member {String} item_id
 */
CatalogsRetailItemResponse.prototype['item_id'] = undefined;

/**
 * The pins mapped to the item
 * @member {Array.<module:model/Pin>} pins
 */
CatalogsRetailItemResponse.prototype['pins'] = undefined;

/**
 * @member {module:model/ItemAttributes} attributes
 */
CatalogsRetailItemResponse.prototype['attributes'] = undefined;






export default CatalogsRetailItemResponse;

