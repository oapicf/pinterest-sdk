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
import MatchTypeResponse from './MatchTypeResponse';

/**
 * The KeywordsCommon model module.
 * @module model/KeywordsCommon
 * @version 1.1.1-pre.0
 */
class KeywordsCommon {
    /**
     * Constructs a new <code>KeywordsCommon</code>.
     * @alias module:model/KeywordsCommon
     * @param matchType {module:model/MatchTypeResponse} 
     * @param value {String} Keyword value (120 chars max).
     */
    constructor(matchType, value) { 
        
        KeywordsCommon.initialize(this, matchType, value);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, matchType, value) { 
        obj['match_type'] = matchType;
        obj['value'] = value;
    }

    /**
     * Constructs a <code>KeywordsCommon</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/KeywordsCommon} obj Optional instance to populate.
     * @return {module:model/KeywordsCommon} The populated <code>KeywordsCommon</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new KeywordsCommon();

            if (data.hasOwnProperty('bid')) {
                obj['bid'] = ApiClient.convertToType(data['bid'], 'Number');
            }
            if (data.hasOwnProperty('match_type')) {
                obj['match_type'] = MatchTypeResponse.constructFromObject(data['match_type']);
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>KeywordsCommon</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>KeywordsCommon</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of KeywordsCommon.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['value'] && !(typeof data['value'] === 'string' || data['value'] instanceof String)) {
            throw new Error("Expected the field `value` to be a primitive type in the JSON string but got " + data['value']);
        }

        return true;
    }


}

KeywordsCommon.RequiredProperties = ["match_type", "value"];

/**
 * </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group.
 * @member {Number} bid
 */
KeywordsCommon.prototype['bid'] = undefined;

/**
 * @member {module:model/MatchTypeResponse} match_type
 */
KeywordsCommon.prototype['match_type'] = undefined;

/**
 * Keyword value (120 chars max).
 * @member {String} value
 */
KeywordsCommon.prototype['value'] = undefined;






export default KeywordsCommon;

