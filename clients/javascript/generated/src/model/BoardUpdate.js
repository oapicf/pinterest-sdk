/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The BoardUpdate model module.
 * @module model/BoardUpdate
 * @version 1.1.1-pre.0
 */
class BoardUpdate {
    /**
     * Constructs a new <code>BoardUpdate</code>.
     * Board fields for updates
     * @alias module:model/BoardUpdate
     */
    constructor() { 
        
        BoardUpdate.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>BoardUpdate</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/BoardUpdate} obj Optional instance to populate.
     * @return {module:model/BoardUpdate} The populated <code>BoardUpdate</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new BoardUpdate();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('privacy')) {
                obj['privacy'] = ApiClient.convertToType(data['privacy'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>BoardUpdate</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>BoardUpdate</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // ensure the json data is a string
        if (data['description'] && !(typeof data['description'] === 'string' || data['description'] instanceof String)) {
            throw new Error("Expected the field `description` to be a primitive type in the JSON string but got " + data['description']);
        }
        // ensure the json data is a string
        if (data['privacy'] && !(typeof data['privacy'] === 'string' || data['privacy'] instanceof String)) {
            throw new Error("Expected the field `privacy` to be a primitive type in the JSON string but got " + data['privacy']);
        }

        return true;
    }


}



/**
 * @member {String} name
 */
BoardUpdate.prototype['name'] = undefined;

/**
 * @member {String} description
 */
BoardUpdate.prototype['description'] = undefined;

/**
 * @member {module:model/BoardUpdate.PrivacyEnum} privacy
 */
BoardUpdate.prototype['privacy'] = undefined;





/**
 * Allowed values for the <code>privacy</code> property.
 * @enum {String}
 * @readonly
 */
BoardUpdate['PrivacyEnum'] = {

    /**
     * value: "PUBLIC"
     * @const
     */
    "PUBLIC": "PUBLIC",

    /**
     * value: "SECRET"
     * @const
     */
    "SECRET": "SECRET"
};



export default BoardUpdate;
