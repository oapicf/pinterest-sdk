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
import BusinessAccessUserSummary from './BusinessAccessUserSummary';

/**
 * The UserSingleAssetBinding model module.
 * @module model/UserSingleAssetBinding
 * @version 1.1.1-pre.0
 */
class UserSingleAssetBinding {
    /**
     * Constructs a new <code>UserSingleAssetBinding</code>.
     * An object containing the permissions a business member/partner has on the asset.
     * @alias module:model/UserSingleAssetBinding
     */
    constructor() { 
        
        UserSingleAssetBinding.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>UserSingleAssetBinding</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/UserSingleAssetBinding} obj Optional instance to populate.
     * @return {module:model/UserSingleAssetBinding} The populated <code>UserSingleAssetBinding</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new UserSingleAssetBinding();

            if (data.hasOwnProperty('permissions')) {
                obj['permissions'] = ApiClient.convertToType(data['permissions'], ['String']);
            }
            if (data.hasOwnProperty('user')) {
                obj['user'] = BusinessAccessUserSummary.constructFromObject(data['user']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>UserSingleAssetBinding</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>UserSingleAssetBinding</code>.
     */
    static validateJSON(data) {
        // ensure the json data is an array
        if (!Array.isArray(data['permissions'])) {
            throw new Error("Expected the field `permissions` to be an array in the JSON data but got " + data['permissions']);
        }
        // validate the optional field `user`
        if (data['user']) { // data not null
          BusinessAccessUserSummary.validateJSON(data['user']);
        }

        return true;
    }


}



/**
 * Permission levels member or partner has on an asset.
 * @member {Array.<String>} permissions
 */
UserSingleAssetBinding.prototype['permissions'] = undefined;

/**
 * @member {module:model/BusinessAccessUserSummary} user
 */
UserSingleAssetBinding.prototype['user'] = undefined;






export default UserSingleAssetBinding;

