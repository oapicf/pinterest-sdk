/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
/**
* Enum class MediaUploadStatus.
* @enum {}
* @readonly
*/
export default class MediaUploadStatus {
    
        /**
         * value: "registered"
         * @const
         */
        "registered" = "registered";

    
        /**
         * value: "processing"
         * @const
         */
        "processing" = "processing";

    
        /**
         * value: "succeeded"
         * @const
         */
        "succeeded" = "succeeded";

    
        /**
         * value: "failed"
         * @const
         */
        "failed" = "failed";

    

    /**
    * Returns a <code>MediaUploadStatus</code> enum value from a Javascript object name.
    * @param {Object} data The plain JavaScript object containing the name of the enum value.
    * @return {module:model/MediaUploadStatus} The enum <code>MediaUploadStatus</code> value.
    */
    static constructFromObject(object) {
        return object;
    }
}
