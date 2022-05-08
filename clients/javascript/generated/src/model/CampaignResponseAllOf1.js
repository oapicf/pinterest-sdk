/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ObjectiveType from './ObjectiveType';

/**
 * The CampaignResponseAllOf1 model module.
 * @module model/CampaignResponseAllOf1
 * @version 1.0.0-pre.0
 */
class CampaignResponseAllOf1 {
    /**
     * Constructs a new <code>CampaignResponseAllOf1</code>.
     * @alias module:model/CampaignResponseAllOf1
     */
    constructor() { 
        
        CampaignResponseAllOf1.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>CampaignResponseAllOf1</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CampaignResponseAllOf1} obj Optional instance to populate.
     * @return {module:model/CampaignResponseAllOf1} The populated <code>CampaignResponseAllOf1</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CampaignResponseAllOf1();

            if (data.hasOwnProperty('objective_type')) {
                obj['objective_type'] = ObjectiveType.constructFromObject(data['objective_type']);
            }
            if (data.hasOwnProperty('created_time')) {
                obj['created_time'] = ApiClient.convertToType(data['created_time'], 'Number');
            }
            if (data.hasOwnProperty('updated_time')) {
                obj['updated_time'] = ApiClient.convertToType(data['updated_time'], 'Number');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ObjectiveType} objective_type
 */
CampaignResponseAllOf1.prototype['objective_type'] = undefined;

/**
 * Campaign creation time. Unix timestamp in seconds.
 * @member {Number} created_time
 */
CampaignResponseAllOf1.prototype['created_time'] = undefined;

/**
 * UTC timestamp. Last update time.
 * @member {Number} updated_time
 */
CampaignResponseAllOf1.prototype['updated_time'] = undefined;

/**
 * Always \"campaign\".
 * @member {String} type
 */
CampaignResponseAllOf1.prototype['type'] = undefined;






export default CampaignResponseAllOf1;
