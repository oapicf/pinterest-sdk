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
import AudienceDataParty from './AudienceDataParty';
import AudienceRule from './AudienceRule';
import AudienceSharingType from './AudienceSharingType';

/**
 * The AudienceCreateCustomRequest model module.
 * @module model/AudienceCreateCustomRequest
 * @version 1.1.1-pre.0
 */
class AudienceCreateCustomRequest {
    /**
     * Constructs a new <code>AudienceCreateCustomRequest</code>.
     * @alias module:model/AudienceCreateCustomRequest
     * @implements module:model/AudienceCommon
     * @param name {String} Audience name.
     * @param rule {module:model/AudienceRule} 
     * @param sharingType {module:model/AudienceSharingType} 
     * @param dataParty {module:model/AudienceDataParty} 
     */
    constructor(name, rule, sharingType, dataParty) { 
        AudienceCommon.initialize(this);
        AudienceCreateCustomRequest.initialize(this, name, rule, sharingType, dataParty);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name, rule, sharingType, dataParty) { 
        obj['name'] = name;
        obj['rule'] = rule;
        obj['sharing_type'] = sharingType;
        obj['data_party'] = dataParty;
    }

    /**
     * Constructs a <code>AudienceCreateCustomRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AudienceCreateCustomRequest} obj Optional instance to populate.
     * @return {module:model/AudienceCreateCustomRequest} The populated <code>AudienceCreateCustomRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AudienceCreateCustomRequest();
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
            if (data.hasOwnProperty('sharing_type')) {
                obj['sharing_type'] = AudienceSharingType.constructFromObject(data['sharing_type']);
            }
            if (data.hasOwnProperty('data_party')) {
                obj['data_party'] = AudienceDataParty.constructFromObject(data['data_party']);
            }
            if (data.hasOwnProperty('category')) {
                obj['category'] = ApiClient.convertToType(data['category'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>AudienceCreateCustomRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>AudienceCreateCustomRequest</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of AudienceCreateCustomRequest.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
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
        if (data['category'] && !(typeof data['category'] === 'string' || data['category'] instanceof String)) {
            throw new Error("Expected the field `category` to be a primitive type in the JSON string but got " + data['category']);
        }

        return true;
    }


}

AudienceCreateCustomRequest.RequiredProperties = ["name", "rule", "sharing_type", "data_party"];

/**
 * Ad account ID.
 * @member {String} ad_account_id
 */
AudienceCreateCustomRequest.prototype['ad_account_id'] = undefined;

/**
 * Audience name.
 * @member {String} name
 */
AudienceCreateCustomRequest.prototype['name'] = undefined;

/**
 * @member {module:model/AudienceRule} rule
 */
AudienceCreateCustomRequest.prototype['rule'] = undefined;

/**
 * @member {module:model/AudienceSharingType} sharing_type
 */
AudienceCreateCustomRequest.prototype['sharing_type'] = undefined;

/**
 * @member {module:model/AudienceDataParty} data_party
 */
AudienceCreateCustomRequest.prototype['data_party'] = undefined;

/**
 * @member {String} category
 */
AudienceCreateCustomRequest.prototype['category'] = undefined;


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




export default AudienceCreateCustomRequest;

