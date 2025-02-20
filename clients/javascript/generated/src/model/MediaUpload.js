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
import MediaUploadAllOfUploadParameters from './MediaUploadAllOfUploadParameters';
import MediaUploadType from './MediaUploadType';

/**
 * The MediaUpload model module.
 * @module model/MediaUpload
 * @version 1.1.1-pre.0
 */
class MediaUpload {
    /**
     * Constructs a new <code>MediaUpload</code>.
     * Media upload that has been registered but not uploaded/processed yet.
     * @alias module:model/MediaUpload
     */
    constructor() { 
        
        MediaUpload.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>MediaUpload</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MediaUpload} obj Optional instance to populate.
     * @return {module:model/MediaUpload} The populated <code>MediaUpload</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MediaUpload();

            if (data.hasOwnProperty('media_id')) {
                obj['media_id'] = ApiClient.convertToType(data['media_id'], 'String');
            }
            if (data.hasOwnProperty('media_type')) {
                obj['media_type'] = ApiClient.convertToType(data['media_type'], MediaUploadType);
            }
            if (data.hasOwnProperty('upload_url')) {
                obj['upload_url'] = ApiClient.convertToType(data['upload_url'], 'String');
            }
            if (data.hasOwnProperty('upload_parameters')) {
                obj['upload_parameters'] = MediaUploadAllOfUploadParameters.constructFromObject(data['upload_parameters']);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>MediaUpload</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>MediaUpload</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['media_id'] && !(typeof data['media_id'] === 'string' || data['media_id'] instanceof String)) {
            throw new Error("Expected the field `media_id` to be a primitive type in the JSON string but got " + data['media_id']);
        }
        // ensure the json data is a string
        if (data['upload_url'] && !(typeof data['upload_url'] === 'string' || data['upload_url'] instanceof String)) {
            throw new Error("Expected the field `upload_url` to be a primitive type in the JSON string but got " + data['upload_url']);
        }
        // validate the optional field `upload_parameters`
        if (data['upload_parameters']) { // data not null
          MediaUploadAllOfUploadParameters.validateJSON(data['upload_parameters']);
        }

        return true;
    }


}



/**
 * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
 * @member {String} media_id
 */
MediaUpload.prototype['media_id'] = undefined;

/**
 * @member {module:model/MediaUploadType} media_type
 */
MediaUpload.prototype['media_type'] = undefined;

/**
 * The URL where you will POST your media file.
 * @member {String} upload_url
 */
MediaUpload.prototype['upload_url'] = undefined;

/**
 * @member {module:model/MediaUploadAllOfUploadParameters} upload_parameters
 */
MediaUpload.prototype['upload_parameters'] = undefined;






export default MediaUpload;

