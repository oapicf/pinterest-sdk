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
import UpdateInvitesResultsResponseArrayItemsInner from './UpdateInvitesResultsResponseArrayItemsInner';

/**
 * The UpdateInvitesResultsResponseArray model module.
 * @module model/UpdateInvitesResultsResponseArray
 * @version 1.1.1-pre.0
 */
class UpdateInvitesResultsResponseArray {
    /**
     * Constructs a new <code>UpdateInvitesResultsResponseArray</code>.
     * @alias module:model/UpdateInvitesResultsResponseArray
     */
    constructor() { 
        
        UpdateInvitesResultsResponseArray.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UpdateInvitesResultsResponseArray</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UpdateInvitesResultsResponseArray} obj Optional instance to populate.
     * @return {module:model/UpdateInvitesResultsResponseArray} The populated <code>UpdateInvitesResultsResponseArray</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UpdateInvitesResultsResponseArray();

            if (data.hasOwnProperty('items')) {
                obj['items'] = ApiClient.convertToType(data['items'], [UpdateInvitesResultsResponseArrayItemsInner]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>UpdateInvitesResultsResponseArray</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>UpdateInvitesResultsResponseArray</code>.
     */
    static validateJSON(data) {
        if (data['items']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['items'])) {
                throw new Error("Expected the field `items` to be an array in the JSON data but got " + data['items']);
            }
            // validate the optional field `items` (array)
            for (const item of data['items']) {
                UpdateInvitesResultsResponseArrayItemsInner.validateJSON(item);
            };
        }

        return true;
    }


}



/**
 * List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
 * @member {Array.<module:model/UpdateInvitesResultsResponseArrayItemsInner>} items
 */
UpdateInvitesResultsResponseArray.prototype['items'] = undefined;






export default UpdateInvitesResultsResponseArray;

