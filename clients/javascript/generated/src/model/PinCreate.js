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
import BoardOwner from './BoardOwner';
import PinMedia from './PinMedia';
import PinMediaSource from './PinMediaSource';

/**
 * The PinCreate model module.
 * @module model/PinCreate
 * @version 1.1.1-pre.0
 */
class PinCreate {
    /**
     * Constructs a new <code>PinCreate</code>.
     * Pin
     * @alias module:model/PinCreate
     */
    constructor() { 
        
        PinCreate.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PinCreate</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PinCreate} obj Optional instance to populate.
     * @return {module:model/PinCreate} The populated <code>PinCreate</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PinCreate();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('created_at')) {
                obj['created_at'] = ApiClient.convertToType(data['created_at'], 'Date');
            }
            if (data.hasOwnProperty('link')) {
                obj['link'] = ApiClient.convertToType(data['link'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('dominant_color')) {
                obj['dominant_color'] = ApiClient.convertToType(data['dominant_color'], 'String');
            }
            if (data.hasOwnProperty('alt_text')) {
                obj['alt_text'] = ApiClient.convertToType(data['alt_text'], 'String');
            }
            if (data.hasOwnProperty('board_id')) {
                obj['board_id'] = ApiClient.convertToType(data['board_id'], 'String');
            }
            if (data.hasOwnProperty('board_section_id')) {
                obj['board_section_id'] = ApiClient.convertToType(data['board_section_id'], 'String');
            }
            if (data.hasOwnProperty('board_owner')) {
                obj['board_owner'] = ApiClient.convertToType(data['board_owner'], BoardOwner);
            }
            if (data.hasOwnProperty('media')) {
                obj['media'] = ApiClient.convertToType(data['media'], PinMedia);
            }
            if (data.hasOwnProperty('media_source')) {
                obj['media_source'] = ApiClient.convertToType(data['media_source'], PinMediaSource);
            }
            if (data.hasOwnProperty('parent_pin_id')) {
                obj['parent_pin_id'] = ApiClient.convertToType(data['parent_pin_id'], 'String');
            }
            if (data.hasOwnProperty('note')) {
                obj['note'] = ApiClient.convertToType(data['note'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>PinCreate</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>PinCreate</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['link'] && !(typeof data['link'] === 'string' || data['link'] instanceof String)) {
            throw new Error("Expected the field `link` to be a primitive type in the JSON string but got " + data['link']);
        }
        // ensure the json data is a string
        if (data['title'] && !(typeof data['title'] === 'string' || data['title'] instanceof String)) {
            throw new Error("Expected the field `title` to be a primitive type in the JSON string but got " + data['title']);
        }
        // ensure the json data is a string
        if (data['description'] && !(typeof data['description'] === 'string' || data['description'] instanceof String)) {
            throw new Error("Expected the field `description` to be a primitive type in the JSON string but got " + data['description']);
        }
        // ensure the json data is a string
        if (data['dominant_color'] && !(typeof data['dominant_color'] === 'string' || data['dominant_color'] instanceof String)) {
            throw new Error("Expected the field `dominant_color` to be a primitive type in the JSON string but got " + data['dominant_color']);
        }
        // ensure the json data is a string
        if (data['alt_text'] && !(typeof data['alt_text'] === 'string' || data['alt_text'] instanceof String)) {
            throw new Error("Expected the field `alt_text` to be a primitive type in the JSON string but got " + data['alt_text']);
        }
        // ensure the json data is a string
        if (data['board_id'] && !(typeof data['board_id'] === 'string' || data['board_id'] instanceof String)) {
            throw new Error("Expected the field `board_id` to be a primitive type in the JSON string but got " + data['board_id']);
        }
        // ensure the json data is a string
        if (data['board_section_id'] && !(typeof data['board_section_id'] === 'string' || data['board_section_id'] instanceof String)) {
            throw new Error("Expected the field `board_section_id` to be a primitive type in the JSON string but got " + data['board_section_id']);
        }
        // validate the optional field `board_owner`
        if (data['board_owner']) { // data not null
          BoardOwner.validateJSON(data['board_owner']);
        }
        // validate the optional field `media`
        if (data['media']) { // data not null
          PinMedia.validateJSON(data['media']);
        }
        // validate the optional field `media_source`
        if (data['media_source']) { // data not null
          PinMediaSource.validateJSON(data['media_source']);
        }
        // ensure the json data is a string
        if (data['parent_pin_id'] && !(typeof data['parent_pin_id'] === 'string' || data['parent_pin_id'] instanceof String)) {
            throw new Error("Expected the field `parent_pin_id` to be a primitive type in the JSON string but got " + data['parent_pin_id']);
        }
        // ensure the json data is a string
        if (data['note'] && !(typeof data['note'] === 'string' || data['note'] instanceof String)) {
            throw new Error("Expected the field `note` to be a primitive type in the JSON string but got " + data['note']);
        }

        return true;
    }


}



/**
 * @member {String} id
 */
PinCreate.prototype['id'] = undefined;

/**
 * @member {Date} created_at
 */
PinCreate.prototype['created_at'] = undefined;

/**
 * @member {String} link
 */
PinCreate.prototype['link'] = undefined;

/**
 * @member {String} title
 */
PinCreate.prototype['title'] = undefined;

/**
 * @member {String} description
 */
PinCreate.prototype['description'] = undefined;

/**
 * Dominant pin color. Hex number, e.g. \\\"#6E7874\\\".
 * @member {String} dominant_color
 */
PinCreate.prototype['dominant_color'] = undefined;

/**
 * @member {String} alt_text
 */
PinCreate.prototype['alt_text'] = undefined;

/**
 * The board to which this Pin belongs.
 * @member {String} board_id
 */
PinCreate.prototype['board_id'] = undefined;

/**
 * The board section to which this Pin belongs.
 * @member {String} board_section_id
 */
PinCreate.prototype['board_section_id'] = undefined;

/**
 * @member {module:model/BoardOwner} board_owner
 */
PinCreate.prototype['board_owner'] = undefined;

/**
 * @member {module:model/PinMedia} media
 */
PinCreate.prototype['media'] = undefined;

/**
 * @member {module:model/PinMediaSource} media_source
 */
PinCreate.prototype['media_source'] = undefined;

/**
 * The source pin id if this pin was saved from another pin. <a href=\"https://help.pinterest.com/article/save-pins-on-pinterest\">Learn more</a>.
 * @member {String} parent_pin_id
 */
PinCreate.prototype['parent_pin_id'] = undefined;

/**
 * Private note for this Pin. <a href=\"https://help.pinterest.com/en/article/add-notes-to-your-pins\">Learn more</a>.
 * @member {String} note
 */
PinCreate.prototype['note'] = undefined;






export default PinCreate;

