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
import UpdatePartnerAssetAccessBodyAccessesInner from './UpdatePartnerAssetAccessBodyAccessesInner';

/**
 * The UpdatePartnerAssetAccessBody model module.
 * @module model/UpdatePartnerAssetAccessBody
 * @version 1.1.1-pre.0
 */
class UpdatePartnerAssetAccessBody {
    /**
     * Constructs a new <code>UpdatePartnerAssetAccessBody</code>.
     * @alias module:model/UpdatePartnerAssetAccessBody
     * @param accesses {Array.<module:model/UpdatePartnerAssetAccessBodyAccessesInner>} 
     */
    constructor(accesses) { 
        
        UpdatePartnerAssetAccessBody.initialize(this, accesses);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, accesses) { 
        obj['accesses'] = accesses;
    }

    /**
     * Constructs a <code>UpdatePartnerAssetAccessBody</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdatePartnerAssetAccessBody} obj Optional instance to populate.
     * @return {module:model/UpdatePartnerAssetAccessBody} The populated <code>UpdatePartnerAssetAccessBody</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdatePartnerAssetAccessBody();

            if (data.hasOwnProperty('accesses')) {
                obj['accesses'] = ApiClient.convertToType(data['accesses'], [UpdatePartnerAssetAccessBodyAccessesInner]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>UpdatePartnerAssetAccessBody</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>UpdatePartnerAssetAccessBody</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of UpdatePartnerAssetAccessBody.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        if (data['accesses']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['accesses'])) {
                throw new Error("Expected the field `accesses` to be an array in the JSON data but got " + data['accesses']);
            }
            // validate the optional field `accesses` (array)
            for (const item of data['accesses']) {
                UpdatePartnerAssetAccessBodyAccessesInner.validateJSON(item);
            };
        }

        return true;
    }


}

UpdatePartnerAssetAccessBody.RequiredProperties = ["accesses"];

/**
 * @member {Array.<module:model/UpdatePartnerAssetAccessBodyAccessesInner>} accesses
 */
UpdatePartnerAssetAccessBody.prototype['accesses'] = undefined;






export default UpdatePartnerAssetAccessBody;

