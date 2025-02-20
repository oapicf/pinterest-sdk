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
import CreateAssetInvitesRequestItem from './CreateAssetInvitesRequestItem';

/**
 * The CreateAssetInvitesRequest model module.
 * @module model/CreateAssetInvitesRequest
 * @version 1.1.1-pre.0
 */
class CreateAssetInvitesRequest {
    /**
     * Constructs a new <code>CreateAssetInvitesRequest</code>.
     * Request body for updating asset roles for existing invites.
     * @alias module:model/CreateAssetInvitesRequest
     * @param invites {Array.<module:model/CreateAssetInvitesRequestItem>} 
     */
    constructor(invites) { 
        
        CreateAssetInvitesRequest.initialize(this, invites);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, invites) { 
        obj['invites'] = invites;
    }

    /**
     * Constructs a <code>CreateAssetInvitesRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CreateAssetInvitesRequest} obj Optional instance to populate.
     * @return {module:model/CreateAssetInvitesRequest} The populated <code>CreateAssetInvitesRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CreateAssetInvitesRequest();

            if (data.hasOwnProperty('invites')) {
                obj['invites'] = ApiClient.convertToType(data['invites'], [CreateAssetInvitesRequestItem]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CreateAssetInvitesRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CreateAssetInvitesRequest</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CreateAssetInvitesRequest.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        if (data['invites']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['invites'])) {
                throw new Error("Expected the field `invites` to be an array in the JSON data but got " + data['invites']);
            }
            // validate the optional field `invites` (array)
            for (const item of data['invites']) {
                CreateAssetInvitesRequestItem.validateJSON(item);
            };
        }

        return true;
    }


}

CreateAssetInvitesRequest.RequiredProperties = ["invites"];

/**
 * @member {Array.<module:model/CreateAssetInvitesRequestItem>} invites
 */
CreateAssetInvitesRequest.prototype['invites'] = undefined;






export default CreateAssetInvitesRequest;

