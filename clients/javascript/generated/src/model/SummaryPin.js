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
import SummaryPinMedia from './SummaryPinMedia';

/**
 * The SummaryPin model module.
 * @module model/SummaryPin
 * @version 1.1.1-pre.0
 */
class SummaryPin {
    /**
     * Constructs a new <code>SummaryPin</code>.
     * Summarized pin information
     * @alias module:model/SummaryPin
     */
    constructor() { 
        
        SummaryPin.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>SummaryPin</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/SummaryPin} obj Optional instance to populate.
     * @return {module:model/SummaryPin} The populated <code>SummaryPin</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new SummaryPin();

            if (data.hasOwnProperty('media')) {
                obj['media'] = SummaryPinMedia.constructFromObject(data['media']);
            }
            if (data.hasOwnProperty('alt_text')) {
                obj['alt_text'] = ApiClient.convertToType(data['alt_text'], 'String');
            }
            if (data.hasOwnProperty('link')) {
                obj['link'] = ApiClient.convertToType(data['link'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>SummaryPin</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>SummaryPin</code>.
     */
    static validateJSON(data) {
        // validate the optional field `media`
        if (data['media']) { // data not null
          SummaryPinMedia.validateJSON(data['media']);
        }
        // ensure the json data is a string
        if (data['alt_text'] && !(typeof data['alt_text'] === 'string' || data['alt_text'] instanceof String)) {
            throw new Error("Expected the field `alt_text` to be a primitive type in the JSON string but got " + data['alt_text']);
        }
        // ensure the json data is a string
        if (data['link'] && !(typeof data['link'] === 'string' || data['link'] instanceof String)) {
            throw new Error("Expected the field `link` to be a primitive type in the JSON string but got " + data['link']);
        }
        // ensure the json data is a string
        if (data['title'] && !(typeof data['title'] === 'string' || data['title'] instanceof String)) {
            throw new Error("Expected the field `title` to be a primitive type in the JSON string but got " + data['title']);
        }
        // ensure the json data is a string
        if (data['description'] && !(typeof data['description'] === 'string' || data['description'] instanceof String)) {
            throw new Error("Expected the field `description` to be a primitive type in the JSON string but got " + data['description']);
        }

        return true;
    }


}



/**
 * @member {module:model/SummaryPinMedia} media
 */
SummaryPin.prototype['media'] = undefined;

/**
 * @member {String} alt_text
 */
SummaryPin.prototype['alt_text'] = undefined;

/**
 * @member {String} link
 */
SummaryPin.prototype['link'] = undefined;

/**
 * @member {String} title
 */
SummaryPin.prototype['title'] = undefined;

/**
 * @member {String} description
 */
SummaryPin.prototype['description'] = undefined;






export default SummaryPin;
