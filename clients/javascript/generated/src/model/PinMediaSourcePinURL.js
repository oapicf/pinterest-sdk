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
 * The PinMediaSourcePinURL model module.
 * @module model/PinMediaSourcePinURL
 * @version 1.1.1-pre.0
 */
class PinMediaSourcePinURL {
    /**
     * Constructs a new <code>PinMediaSourcePinURL</code>.
     * Pin URL-based media source for product pin creation. Currently the field is only available to a list of beta users.
     * @alias module:model/PinMediaSourcePinURL
     * @param sourceType {module:model/PinMediaSourcePinURL.SourceTypeEnum} 
     */
    constructor(sourceType) { 
        
        PinMediaSourcePinURL.initialize(this, sourceType);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, sourceType) { 
        obj['source_type'] = sourceType;
    }

    /**
     * Constructs a <code>PinMediaSourcePinURL</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PinMediaSourcePinURL} obj Optional instance to populate.
     * @return {module:model/PinMediaSourcePinURL} The populated <code>PinMediaSourcePinURL</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PinMediaSourcePinURL();

            if (data.hasOwnProperty('source_type')) {
                obj['source_type'] = ApiClient.convertToType(data['source_type'], 'String');
            }
            if (data.hasOwnProperty('is_affiliate_link')) {
                obj['is_affiliate_link'] = ApiClient.convertToType(data['is_affiliate_link'], 'Boolean');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>PinMediaSourcePinURL</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>PinMediaSourcePinURL</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of PinMediaSourcePinURL.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['source_type'] && !(typeof data['source_type'] === 'string' || data['source_type'] instanceof String)) {
            throw new Error("Expected the field `source_type` to be a primitive type in the JSON string but got " + data['source_type']);
        }

        return true;
    }


}

PinMediaSourcePinURL.RequiredProperties = ["source_type"];

/**
 * @member {module:model/PinMediaSourcePinURL.SourceTypeEnum} source_type
 */
PinMediaSourcePinURL.prototype['source_type'] = undefined;

/**
 * This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
 * @member {Boolean} is_affiliate_link
 * @default false
 */
PinMediaSourcePinURL.prototype['is_affiliate_link'] = false;





/**
 * Allowed values for the <code>source_type</code> property.
 * @enum {String}
 * @readonly
 */
PinMediaSourcePinURL['SourceTypeEnum'] = {

    /**
     * value: "pin_url"
     * @const
     */
    "pin_url": "pin_url"
};



export default PinMediaSourcePinURL;
