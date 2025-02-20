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
import AudienceSubcategory from './AudienceSubcategory';

/**
 * The AudienceCategory model module.
 * @module model/AudienceCategory
 * @version 1.1.1-pre.0
 */
class AudienceCategory {
    /**
     * Constructs a new <code>AudienceCategory</code>.
     * @alias module:model/AudienceCategory
     */
    constructor() { 
        
        AudienceCategory.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AudienceCategory</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AudienceCategory} obj Optional instance to populate.
     * @return {module:model/AudienceCategory} The populated <code>AudienceCategory</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AudienceCategory();

            if (data.hasOwnProperty('key')) {
                obj['key'] = ApiClient.convertToType(data['key'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('ratio')) {
                obj['ratio'] = ApiClient.convertToType(data['ratio'], 'Number');
            }
            if (data.hasOwnProperty('index')) {
                obj['index'] = ApiClient.convertToType(data['index'], 'Number');
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('subcategories')) {
                obj['subcategories'] = ApiClient.convertToType(data['subcategories'], [AudienceSubcategory]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>AudienceCategory</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>AudienceCategory</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['key'] && !(typeof data['key'] === 'string' || data['key'] instanceof String)) {
            throw new Error("Expected the field `key` to be a primitive type in the JSON string but got " + data['key']);
        }
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        if (data['subcategories']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['subcategories'])) {
                throw new Error("Expected the field `subcategories` to be an array in the JSON data but got " + data['subcategories']);
            }
            // validate the optional field `subcategories` (array)
            for (const item of data['subcategories']) {
                AudienceSubcategory.validateJSON(item);
            };
        }

        return true;
    }


}



/**
 * Interest unique key (same as ID).
 * @member {String} key
 */
AudienceCategory.prototype['key'] = undefined;

/**
 * Interest name.
 * @member {String} name
 */
AudienceCategory.prototype['name'] = undefined;

/**
 * Interest's percent of category's total audience.
 * @member {Number} ratio
 */
AudienceCategory.prototype['ratio'] = undefined;

/**
 * Interest affinity index.
 * @member {Number} index
 */
AudienceCategory.prototype['index'] = undefined;

/**
 * Interest ID.
 * @member {String} id
 */
AudienceCategory.prototype['id'] = undefined;

/**
 * Subcategory interest distribution
 * @member {Array.<module:model/AudienceSubcategory>} subcategories
 */
AudienceCategory.prototype['subcategories'] = undefined;






export default AudienceCategory;

