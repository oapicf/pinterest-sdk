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
import { PinUpdateCarouselSlotsInner } from './pinUpdateCarouselSlotsInner';


/**
 * Pin fields for updates
 */
export interface PinUpdate { 
    /**
     * Pin\'s alternative text.
     */
    alt_text?: string | null;
    /**
     * The id of the board to move the Pin onto.
     */
    board_id?: string | null;
    /**
     * <a href=\"https://help.pinterest.com/en/article/create-a-board-section\">Board section</a> ID.
     */
    board_section_id?: string | null;
    /**
     * Pin description - 800 characters maximum.
     */
    description?: string | null;
    /**
     * URL viewer is taken to when they click pin.
     */
    link?: string | null;
    /**
     * The native pin title that creators explicitly prefer to display.
     */
    title?: string | null;
    /**
     * Carousel Pin slots data.
     */
    carousel_slots?: Array<PinUpdateCarouselSlotsInner>;
    /**
     * Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
     */
    note?: string | null;
}

