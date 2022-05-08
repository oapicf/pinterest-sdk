/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';
import { BoardOwner } from './boardOwner';
import { PinMedia } from './pinMedia';
import { PinMediaSource } from './pinMediaSource';

/**
* Pin
*/
export class Pin {
    'id'?: string;
    'createdAt'?: Date;
    'link'?: string | null;
    'title'?: string | null;
    'description'?: string | null;
    'altText'?: string | null;
    /**
    * The board to which this Pin belongs.
    */
    'boardId'?: string;
    /**
    * The board section to which this Pin belongs.
    */
    'boardSectionId'?: string | null;
    'boardOwner'?: BoardOwner;
    'media'?: PinMedia;
    'mediaSource'?: PinMediaSource;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "createdAt",
            "baseName": "created_at",
            "type": "Date"
        },
        {
            "name": "link",
            "baseName": "link",
            "type": "string"
        },
        {
            "name": "title",
            "baseName": "title",
            "type": "string"
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string"
        },
        {
            "name": "altText",
            "baseName": "alt_text",
            "type": "string"
        },
        {
            "name": "boardId",
            "baseName": "board_id",
            "type": "string"
        },
        {
            "name": "boardSectionId",
            "baseName": "board_section_id",
            "type": "string"
        },
        {
            "name": "boardOwner",
            "baseName": "board_owner",
            "type": "BoardOwner"
        },
        {
            "name": "media",
            "baseName": "media",
            "type": "PinMedia"
        },
        {
            "name": "mediaSource",
            "baseName": "media_source",
            "type": "PinMediaSource"
        }    ];

    static getAttributeTypeMap() {
        return Pin.attributeTypeMap;
    }
}
