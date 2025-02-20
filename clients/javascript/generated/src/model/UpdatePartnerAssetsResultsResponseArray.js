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
import UpdatePartnerAssetsResult from './UpdatePartnerAssetsResult';

/**
 * The UpdatePartnerAssetsResultsResponseArray model module.
 * @module model/UpdatePartnerAssetsResultsResponseArray
 * @version 1.1.1-pre.0
 */
class UpdatePartnerAssetsResultsResponseArray {
    /**
     * Constructs a new <code>UpdatePartnerAssetsResultsResponseArray</code>.
     * @alias module:model/UpdatePartnerAssetsResultsResponseArray
     */
    constructor() { 
        
        UpdatePartnerAssetsResultsResponseArray.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UpdatePartnerAssetsResultsResponseArray</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdatePartnerAssetsResultsResponseArray} obj Optional instance to populate.
     * @return {module:model/UpdatePartnerAssetsResultsResponseArray} The populated <code>UpdatePartnerAssetsResultsResponseArray</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdatePartnerAssetsResultsResponseArray();

            if (data.hasOwnProperty('items')) {
                obj['items'] = ApiClient.convertToType(data['items'], [UpdatePartnerAssetsResult]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>UpdatePartnerAssetsResultsResponseArray</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>UpdatePartnerAssetsResultsResponseArray</code>.
     */
    static validateJSON(data) {
        // ensure the json data is an array
        if (!Array.isArray(data['items'])) {
            throw new Error("Expected the field `items` to be an array in the JSON data but got " + data['items']);
        }

        return true;
    }


}



/**
 * List of assigned/updated partner asset access.
 * @member {Array.<module:model/UpdatePartnerAssetsResult>} items
 */
UpdatePartnerAssetsResultsResponseArray.prototype['items'] = undefined;






export default UpdatePartnerAssetsResultsResponseArray;

