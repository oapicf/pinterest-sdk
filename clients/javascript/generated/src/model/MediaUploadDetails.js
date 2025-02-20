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
import MediaUploadStatus from './MediaUploadStatus';
import MediaUploadType from './MediaUploadType';

/**
 * The MediaUploadDetails model module.
 * @module model/MediaUploadDetails
 * @version 1.1.1-pre.0
 */
class MediaUploadDetails {
    /**
     * Constructs a new <code>MediaUploadDetails</code>.
     * Media upload details
     * @alias module:model/MediaUploadDetails
     */
    constructor() { 
        
        MediaUploadDetails.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>MediaUploadDetails</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MediaUploadDetails} obj Optional instance to populate.
     * @return {module:model/MediaUploadDetails} The populated <code>MediaUploadDetails</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaUploadDetails();

            if (data.hasOwnProperty('media_id')) {
                obj['media_id'] = ApiClient.convertToType(data['media_id'], 'String');
            }
            if (data.hasOwnProperty('media_type')) {
                obj['media_type'] = ApiClient.convertToType(data['media_type'], MediaUploadType);
            }
            if (data.hasOwnProperty('status')) {
                obj['status'] = ApiClient.convertToType(data['status'], MediaUploadStatus);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>MediaUploadDetails</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>MediaUploadDetails</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['media_id'] && !(typeof data['media_id'] === 'string' || data['media_id'] instanceof String)) {
            throw new Error("Expected the field `media_id` to be a primitive type in the JSON string but got " + data['media_id']);
        }

        return true;
    }


}



/**
 * @member {String} media_id
 */
MediaUploadDetails.prototype['media_id'] = undefined;

/**
 * @member {module:model/MediaUploadType} media_type
 */
MediaUploadDetails.prototype['media_type'] = undefined;

/**
 * @member {module:model/MediaUploadStatus} status
 */
MediaUploadDetails.prototype['status'] = undefined;






export default MediaUploadDetails;

