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

import { BoardOwner } from '../models/BoardOwner';
import { PinMediaSource } from '../models/PinMediaSource';
import { SummaryPinMedia } from '../models/SummaryPinMedia';
import { HttpFile } from '../http/http';

/**
* Pin
*/
export class PinCreate {
    'id'?: string;
    'createdAt'?: Date;
    'link'?: string | null;
    'title'?: string | null;
    'description'?: string | null;
    /**
    * Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
    */
    'dominantColor'?: string | null;
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
    'media'?: SummaryPinMedia;
    'mediaSource'?: PinMediaSource;
    /**
    * The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
    */
    'parentPinId'?: string | null;
    /**
    * Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
    */
    'note'?: string | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string",
            "format": ""
        },
        {
            "name": "createdAt",
            "baseName": "created_at",
            "type": "Date",
            "format": "date-time"
        },
        {
            "name": "link",
            "baseName": "link",
            "type": "string",
            "format": ""
        },
        {
            "name": "title",
            "baseName": "title",
            "type": "string",
            "format": ""
        },
        {
            "name": "description",
            "baseName": "description",
            "type": "string",
            "format": ""
        },
        {
            "name": "dominantColor",
            "baseName": "dominant_color",
            "type": "string",
            "format": ""
        },
        {
            "name": "altText",
            "baseName": "alt_text",
            "type": "string",
            "format": ""
        },
        {
            "name": "boardId",
            "baseName": "board_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "boardSectionId",
            "baseName": "board_section_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "boardOwner",
            "baseName": "board_owner",
            "type": "BoardOwner",
            "format": ""
        },
        {
            "name": "media",
            "baseName": "media",
            "type": "SummaryPinMedia",
            "format": ""
        },
        {
            "name": "mediaSource",
            "baseName": "media_source",
            "type": "PinMediaSource",
            "format": ""
        },
        {
            "name": "parentPinId",
            "baseName": "parent_pin_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "note",
            "baseName": "note",
            "type": "string",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return PinCreate.attributeTypeMap;
    }

    public constructor() {
    }
}
