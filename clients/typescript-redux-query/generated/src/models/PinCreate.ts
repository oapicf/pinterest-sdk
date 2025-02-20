// tslint:disable
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

import { exists, mapValues } from '../runtime';
import {
    BoardOwner,
    BoardOwnerFromJSON,
    BoardOwnerToJSON,
    PinMedia,
    PinMediaFromJSON,
    PinMediaToJSON,
    PinMediaSource,
    PinMediaSourceFromJSON,
    PinMediaSourceToJSON,
} from './';

/**
 * Pin
 * @export
 * @interface PinCreate
 */
export interface PinCreate  {
    /**
     * 
     * @type {string}
     * @memberof PinCreate
     */
    readonly id?: string;
    /**
     * 
     * @type {Date}
     * @memberof PinCreate
     */
    readonly createdAt?: Date;
    /**
     * 
     * @type {string}
     * @memberof PinCreate
     */
    link?: string;
    /**
     * 
     * @type {string}
     * @memberof PinCreate
     */
    title?: string;
    /**
     * 
     * @type {string}
     * @memberof PinCreate
     */
    description?: string;
    /**
     * Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
     * @type {string}
     * @memberof PinCreate
     */
    dominantColor?: string;
    /**
     * 
     * @type {string}
     * @memberof PinCreate
     */
    altText?: string;
    /**
     * The board to which this Pin belongs.
     * @type {string}
     * @memberof PinCreate
     */
    boardId?: string;
    /**
     * The board section to which this Pin belongs.
     * @type {string}
     * @memberof PinCreate
     */
    boardSectionId?: string;
    /**
     * 
     * @type {BoardOwner}
     * @memberof PinCreate
     */
    readonly boardOwner?: BoardOwner;
    /**
     * 
     * @type {PinMedia}
     * @memberof PinCreate
     */
    readonly media?: PinMedia;
    /**
     * 
     * @type {PinMediaSource}
     * @memberof PinCreate
     */
    mediaSource?: PinMediaSource;
    /**
     * The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
     * @type {string}
     * @memberof PinCreate
     */
    parentPinId?: string;
    /**
     * Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
     * @type {string}
     * @memberof PinCreate
     */
    note?: string;
}

export function PinCreateFromJSON(json: any): PinCreate {
    return {
        'id': !exists(json, 'id') ? undefined : json['id'],
        'createdAt': !exists(json, 'created_at') ? undefined : new Date(json['created_at']),
        'link': !exists(json, 'link') ? undefined : json['link'],
        'title': !exists(json, 'title') ? undefined : json['title'],
        'description': !exists(json, 'description') ? undefined : json['description'],
        'dominantColor': !exists(json, 'dominant_color') ? undefined : json['dominant_color'],
        'altText': !exists(json, 'alt_text') ? undefined : json['alt_text'],
        'boardId': !exists(json, 'board_id') ? undefined : json['board_id'],
        'boardSectionId': !exists(json, 'board_section_id') ? undefined : json['board_section_id'],
        'boardOwner': !exists(json, 'board_owner') ? undefined : BoardOwnerFromJSON(json['board_owner']),
        'media': !exists(json, 'media') ? undefined : PinMediaFromJSON(json['media']),
        'mediaSource': !exists(json, 'media_source') ? undefined : PinMediaSourceFromJSON(json['media_source']),
        'parentPinId': !exists(json, 'parent_pin_id') ? undefined : json['parent_pin_id'],
        'note': !exists(json, 'note') ? undefined : json['note'],
    };
}

export function PinCreateToJSON(value?: PinCreate): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'link': value.link,
        'title': value.title,
        'description': value.description,
        'dominant_color': value.dominantColor,
        'alt_text': value.altText,
        'board_id': value.boardId,
        'board_section_id': value.boardSectionId,
        'media_source': PinMediaSourceToJSON(value.mediaSource),
        'parent_pin_id': value.parentPinId,
        'note': value.note,
    };
}


