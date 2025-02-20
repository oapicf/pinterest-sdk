/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * OpenAPI spec version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { MediaUploadStatus } from '../models/MediaUploadStatus';
import { MediaUploadType } from '../models/MediaUploadType';
import { HttpFile } from '../http/http';

/**
* Media upload details
*/
export class MediaUploadDetails {
    'mediaId'?: string;
    'mediaType'?: MediaUploadType;
    'status'?: MediaUploadStatus;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "mediaId",
            "baseName": "media_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "mediaType",
            "baseName": "media_type",
            "type": "MediaUploadType",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "MediaUploadStatus",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return MediaUploadDetails.attributeTypeMap;
    }

    public constructor() {
    }
}


