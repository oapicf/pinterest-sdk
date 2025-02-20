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
import BusinessRoleForMembers from './BusinessRoleForMembers';

/**
 * The MembersToDeleteBodyMembersInner model module.
 * @module model/MembersToDeleteBodyMembersInner
 * @version 1.1.1-pre.0
 */
class MembersToDeleteBodyMembersInner {
    /**
     * Constructs a new <code>MembersToDeleteBodyMembersInner</code>.
     * @alias module:model/MembersToDeleteBodyMembersInner
     * @param memberId {String} Unique identifier of the member
     * @param businessRole {module:model/BusinessRoleForMembers} 
     */
    constructor(memberId, businessRole) { 
        
        MembersToDeleteBodyMembersInner.initialize(this, memberId, businessRole);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, memberId, businessRole) { 
        obj['member_id'] = memberId;
        obj['business_role'] = businessRole;
    }

    /**
     * Constructs a <code>MembersToDeleteBodyMembersInner</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MembersToDeleteBodyMembersInner} obj Optional instance to populate.
     * @return {module:model/MembersToDeleteBodyMembersInner} The populated <code>MembersToDeleteBodyMembersInner</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MembersToDeleteBodyMembersInner();

            if (data.hasOwnProperty('member_id')) {
                obj['member_id'] = ApiClient.convertToType(data['member_id'], 'String');
            }
            if (data.hasOwnProperty('business_role')) {
                obj['business_role'] = BusinessRoleForMembers.constructFromObject(data['business_role']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>MembersToDeleteBodyMembersInner</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>MembersToDeleteBodyMembersInner</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of MembersToDeleteBodyMembersInner.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['member_id'] && !(typeof data['member_id'] === 'string' || data['member_id'] instanceof String)) {
            throw new Error("Expected the field `member_id` to be a primitive type in the JSON string but got " + data['member_id']);
        }

        return true;
    }


}

MembersToDeleteBodyMembersInner.RequiredProperties = ["member_id", "business_role"];

/**
 * Unique identifier of the member
 * @member {String} member_id
 */
MembersToDeleteBodyMembersInner.prototype['member_id'] = undefined;

/**
 * @member {module:model/BusinessRoleForMembers} business_role
 */
MembersToDeleteBodyMembersInner.prototype['business_role'] = undefined;






export default MembersToDeleteBodyMembersInner;

