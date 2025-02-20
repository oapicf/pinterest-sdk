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
import ConversionTagConfigs from './ConversionTagConfigs';
import EnhancedMatchStatusType from './EnhancedMatchStatusType';
import EntityStatus from './EntityStatus';

/**
 * The ConversionTagCommon model module.
 * @module model/ConversionTagCommon
 * @version 1.1.1-pre.0
 */
class ConversionTagCommon {
    /**
     * Constructs a new <code>ConversionTagCommon</code>.
     * @alias module:model/ConversionTagCommon
     */
    constructor() { 
        
        ConversionTagCommon.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ConversionTagCommon</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ConversionTagCommon} obj Optional instance to populate.
     * @return {module:model/ConversionTagCommon} The populated <code>ConversionTagCommon</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ConversionTagCommon();

            if (data.hasOwnProperty('ad_account_id')) {
                obj['ad_account_id'] = ApiClient.convertToType(data['ad_account_id'], 'String');
            }
            if (data.hasOwnProperty('code_snippet')) {
                obj['code_snippet'] = ApiClient.convertToType(data['code_snippet'], 'String');
            }
            if (data.hasOwnProperty('enhanced_match_status')) {
                obj['enhanced_match_status'] = EnhancedMatchStatusType.constructFromObject(data['enhanced_match_status']);
            }
            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('last_fired_time_ms')) {
                obj['last_fired_time_ms'] = ApiClient.convertToType(data['last_fired_time_ms'], 'Number');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = EntityStatus.constructFromObject(data['status']);
            }
            if (data.hasOwnProperty('version')) {
                obj['version'] = ApiClient.convertToType(data['version'], 'String');
            }
            if (data.hasOwnProperty('configs')) {
                obj['configs'] = ConversionTagConfigs.constructFromObject(data['configs']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>ConversionTagCommon</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>ConversionTagCommon</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['ad_account_id'] && !(typeof data['ad_account_id'] === 'string' || data['ad_account_id'] instanceof String)) {
            throw new Error("Expected the field `ad_account_id` to be a primitive type in the JSON string but got " + data['ad_account_id']);
        }
        // ensure the json data is a string
        if (data['code_snippet'] && !(typeof data['code_snippet'] === 'string' || data['code_snippet'] instanceof String)) {
            throw new Error("Expected the field `code_snippet` to be a primitive type in the JSON string but got " + data['code_snippet']);
        }
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // ensure the json data is a string
        if (data['version'] && !(typeof data['version'] === 'string' || data['version'] instanceof String)) {
            throw new Error("Expected the field `version` to be a primitive type in the JSON string but got " + data['version']);
        }
        // validate the optional field `configs`
        if (data['configs']) { // data not null
          ConversionTagConfigs.validateJSON(data['configs']);
        }

        return true;
    }


}



/**
 * Ad account ID.
 * @member {String} ad_account_id
 */
ConversionTagCommon.prototype['ad_account_id'] = undefined;

/**
 * Tag code snippet.
 * @member {String} code_snippet
 */
ConversionTagCommon.prototype['code_snippet'] = undefined;

/**
 * @member {module:model/EnhancedMatchStatusType} enhanced_match_status
 */
ConversionTagCommon.prototype['enhanced_match_status'] = undefined;

/**
 * Tag ID.
 * @member {String} id
 */
ConversionTagCommon.prototype['id'] = undefined;

/**
 * Time for the last event fired.
 * @member {Number} last_fired_time_ms
 */
ConversionTagCommon.prototype['last_fired_time_ms'] = undefined;

/**
 * Conversion tag name.
 * @member {String} name
 */
ConversionTagCommon.prototype['name'] = undefined;

/**
 * @member {module:model/EntityStatus} status
 */
ConversionTagCommon.prototype['status'] = undefined;

/**
 * Version number.
 * @member {String} version
 */
ConversionTagCommon.prototype['version'] = undefined;

/**
 * @member {module:model/ConversionTagConfigs} configs
 */
ConversionTagCommon.prototype['configs'] = undefined;






export default ConversionTagCommon;

