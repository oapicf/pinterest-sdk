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
 * The PinMediaSourceImageURL model module.
 * @module model/PinMediaSourceImageURL
 * @version 1.1.1-pre.0
 */
class PinMediaSourceImageURL {
    /**
     * Constructs a new <code>PinMediaSourceImageURL</code>.
     * Image URL-based media source
     * @alias module:model/PinMediaSourceImageURL
     * @param sourceType {module:model/PinMediaSourceImageURL.SourceTypeEnum} 
     * @param url {String} 
     */
    constructor(sourceType, url) { 
        
        PinMediaSourceImageURL.initialize(this, sourceType, url);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, sourceType, url) { 
        obj['source_type'] = sourceType;
        obj['url'] = url;
        obj['is_standard'] = true;
    }

    /**
     * Constructs a <code>PinMediaSourceImageURL</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PinMediaSourceImageURL} obj Optional instance to populate.
     * @return {module:model/PinMediaSourceImageURL} The populated <code>PinMediaSourceImageURL</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PinMediaSourceImageURL();

            if (data.hasOwnProperty('source_type')) {
                obj['source_type'] = ApiClient.convertToType(data['source_type'], 'String');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
            if (data.hasOwnProperty('is_standard')) {
                obj['is_standard'] = ApiClient.convertToType(data['is_standard'], 'Boolean');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>PinMediaSourceImageURL</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>PinMediaSourceImageURL</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of PinMediaSourceImageURL.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['source_type'] && !(typeof data['source_type'] === 'string' || data['source_type'] instanceof String)) {
            throw new Error("Expected the field `source_type` to be a primitive type in the JSON string but got " + data['source_type']);
        }
        // ensure the json data is a string
        if (data['url'] && !(typeof data['url'] === 'string' || data['url'] instanceof String)) {
            throw new Error("Expected the field `url` to be a primitive type in the JSON string but got " + data['url']);
        }

        return true;
    }


}

PinMediaSourceImageURL.RequiredProperties = ["source_type", "url"];

/**
 * @member {module:model/PinMediaSourceImageURL.SourceTypeEnum} source_type
 */
PinMediaSourceImageURL.prototype['source_type'] = undefined;

/**
 * @member {String} url
 */
PinMediaSourceImageURL.prototype['url'] = undefined;

/**
 * Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
 * @member {Boolean} is_standard
 * @default true
 */
PinMediaSourceImageURL.prototype['is_standard'] = true;





/**
 * Allowed values for the <code>source_type</code> property.
 * @enum {String}
 * @readonly
 */
PinMediaSourceImageURL['SourceTypeEnum'] = {

    /**
     * value: "image_url"
     * @const
     */
    "image_url": "image_url"
};



export default PinMediaSourceImageURL;

