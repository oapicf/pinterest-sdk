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
import AudienceCommon from './AudienceCommon';
import AudienceRule from './AudienceRule';
import AudienceUpdateOperationType from './AudienceUpdateOperationType';

/**
 * The AudienceUpdateRequest model module.
 * @module model/AudienceUpdateRequest
 * @version 1.1.1-pre.0
 */
class AudienceUpdateRequest {
    /**
     * Constructs a new <code>AudienceUpdateRequest</code>.
     * @alias module:model/AudienceUpdateRequest
     * @implements module:model/AudienceCommon
     */
    constructor() { 
        AudienceCommon.initialize(this);
        AudienceUpdateRequest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AudienceUpdateRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AudienceUpdateRequest} obj Optional instance to populate.
     * @return {module:model/AudienceUpdateRequest} The populated <code>AudienceUpdateRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AudienceUpdateRequest();
            AudienceCommon.constructFromObject(data, obj);

            if (data.hasOwnProperty('ad_account_id')) {
                obj['ad_account_id'] = ApiClient.convertToType(data['ad_account_id'], 'String');
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('rule')) {
                obj['rule'] = AudienceRule.constructFromObject(data['rule']);
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('operation_type')) {
                obj['operation_type'] = AudienceUpdateOperationType.constructFromObject(data['operation_type']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>AudienceUpdateRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>AudienceUpdateRequest</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['ad_account_id'] && !(typeof data['ad_account_id'] === 'string' || data['ad_account_id'] instanceof String)) {
            throw new Error("Expected the field `ad_account_id` to be a primitive type in the JSON string but got " + data['ad_account_id']);
        }
        // ensure the json data is a string
        if (data['name'] && !(typeof data['name'] === 'string' || data['name'] instanceof String)) {
            throw new Error("Expected the field `name` to be a primitive type in the JSON string but got " + data['name']);
        }
        // validate the optional field `rule`
        if (data['rule']) { // data not null
          AudienceRule.validateJSON(data['rule']);
        }
        // ensure the json data is a string
        if (data['description'] && !(typeof data['description'] === 'string' || data['description'] instanceof String)) {
            throw new Error("Expected the field `description` to be a primitive type in the JSON string but got " + data['description']);
        }

        return true;
    }


}



/**
 * Ad account ID.
 * @member {String} ad_account_id
 */
AudienceUpdateRequest.prototype['ad_account_id'] = undefined;

/**
 * Audience name.
 * @member {String} name
 */
AudienceUpdateRequest.prototype['name'] = undefined;

/**
 * @member {module:model/AudienceRule} rule
 */
AudienceUpdateRequest.prototype['rule'] = undefined;

/**
 * Audience description.
 * @member {String} description
 */
AudienceUpdateRequest.prototype['description'] = undefined;

/**
 * @member {module:model/AudienceUpdateOperationType} operation_type
 */
AudienceUpdateRequest.prototype['operation_type'] = undefined;


// Implement AudienceCommon interface:
/**
 * Ad account ID.
 * @member {String} ad_account_id
 */
AudienceCommon.prototype['ad_account_id'] = undefined;
/**
 * Audience name.
 * @member {String} name
 */
AudienceCommon.prototype['name'] = undefined;
/**
 * @member {module:model/AudienceRule} rule
 */
AudienceCommon.prototype['rule'] = undefined;




export default AudienceUpdateRequest;

