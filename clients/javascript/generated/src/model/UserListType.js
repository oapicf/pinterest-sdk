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
/**
* Enum class UserListType.
* @enum {}
* @readonly
*/
export default class UserListType {
    
        /**
         * value: "EMAIL"
         * @const
         */
        "EMAIL" = "EMAIL";

    
        /**
         * value: "IDFA"
         * @const
         */
        "IDFA" = "IDFA";

    
        /**
         * value: "MAID"
         * @const
         */
        "MAID" = "MAID";

    
        /**
         * value: "LR_ID"
         * @const
         */
        "LR_ID" = "LR_ID";

    
        /**
         * value: "DLX_ID"
         * @const
         */
        "DLX_ID" = "DLX_ID";

    
        /**
         * value: "HASHED_PINNER_ID"
         * @const
         */
        "HASHED_PINNER_ID" = "HASHED_PINNER_ID";

    

    /**
    * Returns a <code>UserListType</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/UserListType} The enum <code>UserListType</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}

