/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { MediaUploadAllOfUploadParameters } from './mediaUploadAllOfUploadParameters';
import { MediaUploadType } from './mediaUploadType';


/**
 * Media upload that has been registered but not uploaded/processed yet.
 */
export interface MediaUpload { 
    /**
     * Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
     */
    media_id?: string;
    media_type?: MediaUploadType;
    /**
     * The URL where you will POST your media file.
     */
    upload_url?: string;
    upload_parameters?: MediaUploadAllOfUploadParameters;
}
export namespace MediaUpload {
}


