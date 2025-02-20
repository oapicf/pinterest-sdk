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
import TargetingTemplateAudienceSizingReachEstimate from './TargetingTemplateAudienceSizingReachEstimate';

/**
 * The TargetingTemplateAudienceSizing model module.
 * @module model/TargetingTemplateAudienceSizing
 * @version 1.1.1-pre.0
 */
class TargetingTemplateAudienceSizing {
    /**
     * Constructs a new <code>TargetingTemplateAudienceSizing</code>.
     * Gets an audience size estimate for a set of given targeting spec data. &lt;p&gt;Returns:&lt;/p&gt; An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate. 
     * @alias module:model/TargetingTemplateAudienceSizing
     */
    constructor() { 
        
        TargetingTemplateAudienceSizing.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TargetingTemplateAudienceSizing</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TargetingTemplateAudienceSizing} obj Optional instance to populate.
     * @return {module:model/TargetingTemplateAudienceSizing} The populated <code>TargetingTemplateAudienceSizing</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TargetingTemplateAudienceSizing();

            if (data.hasOwnProperty('reach_estimate')) {
                obj['reach_estimate'] = TargetingTemplateAudienceSizingReachEstimate.constructFromObject(data['reach_estimate']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>TargetingTemplateAudienceSizing</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>TargetingTemplateAudienceSizing</code>.
     */
    static validateJSON(data) {
        // validate the optional field `reach_estimate`
        if (data['reach_estimate']) { // data not null
          TargetingTemplateAudienceSizingReachEstimate.validateJSON(data['reach_estimate']);
        }

        return true;
    }


}



/**
 * @member {module:model/TargetingTemplateAudienceSizingReachEstimate} reach_estimate
 */
TargetingTemplateAudienceSizing.prototype['reach_estimate'] = undefined;






export default TargetingTemplateAudienceSizing;

