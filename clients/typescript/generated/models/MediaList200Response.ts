/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * OpenAPI spec version: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { MediaUploadDetails } from '../models/MediaUploadDetails';
import { HttpFile } from '../http/http';

export class MediaList200Response {
    /**
    * Media
    */
    'items': Array<MediaUploadDetails>;
    'bookmark'?: string | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "items",
            "baseName": "items",
            "type": "Array<MediaUploadDetails>",
            "format": ""
        },
        {
            "name": "bookmark",
            "baseName": "bookmark",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return MediaList200Response.attributeTypeMap;
    }

    public constructor() {
    }
}
