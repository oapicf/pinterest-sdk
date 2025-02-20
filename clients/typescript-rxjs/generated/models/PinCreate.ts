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

import type {
    BoardOwner,
    PinMedia,
    PinMediaSource,
} from './';

/**
 * Pin
 * @export
 * @interface PinCreate
 */
export interface PinCreate {
    /**
     * @type {string}
     * @memberof PinCreate
     */
    readonly id?: string;
    /**
     * @type {string}
     * @memberof PinCreate
     */
    readonly created_at?: string;
    /**
     * @type {string}
     * @memberof PinCreate
     */
    link?: string | null;
    /**
     * @type {string}
     * @memberof PinCreate
     */
    title?: string | null;
    /**
     * @type {string}
     * @memberof PinCreate
     */
    description?: string | null;
    /**
     * Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
     * @type {string}
     * @memberof PinCreate
     */
    dominant_color?: string | null;
    /**
     * @type {string}
     * @memberof PinCreate
     */
    alt_text?: string | null;
    /**
     * The board to which this Pin belongs.
     * @type {string}
     * @memberof PinCreate
     */
    board_id?: string;
    /**
     * The board section to which this Pin belongs.
     * @type {string}
     * @memberof PinCreate
     */
    board_section_id?: string | null;
    /**
     * @type {BoardOwner}
     * @memberof PinCreate
     */
    readonly board_owner?: BoardOwner;
    /**
     * @type {PinMedia}
     * @memberof PinCreate
     */
    readonly media?: PinMedia;
    /**
     * @type {PinMediaSource}
     * @memberof PinCreate
     */
    media_source?: PinMediaSource;
    /**
     * The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
     * @type {string}
     * @memberof PinCreate
     */
    parent_pin_id?: string | null;
    /**
     * Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
     * @type {string}
     * @memberof PinCreate
     */
    note?: string | null;
}
