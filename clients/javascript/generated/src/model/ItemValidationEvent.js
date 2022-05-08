/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The ItemValidationEvent model module.
 * @module model/ItemValidationEvent
 * @version 1.0.0-pre.0
 */
class ItemValidationEvent {
    /**
     * Constructs a new <code>ItemValidationEvent</code>.
     * Object describing an item validation event
     * @alias module:model/ItemValidationEvent
     */
    constructor() { 
        
        ItemValidationEvent.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ItemValidationEvent</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ItemValidationEvent} obj Optional instance to populate.
     * @return {module:model/ItemValidationEvent} The populated <code>ItemValidationEvent</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ItemValidationEvent();

            if (data.hasOwnProperty('attribute')) {
                obj['attribute'] = ApiClient.convertToType(data['attribute'], 'String');
            }
            if (data.hasOwnProperty('code')) {
                obj['code'] = ApiClient.convertToType(data['code'], 'Number');
            }
            if (data.hasOwnProperty('message')) {
                obj['message'] = ApiClient.convertToType(data['message'], 'String');
            }
        }
        return obj;
    }


}

/**
 * The attribute that the item validation event references
 * @member {String} attribute
 */
ItemValidationEvent.prototype['attribute'] = undefined;

/**
 * The event code that the item validation event references
 * @member {Number} code
 */
ItemValidationEvent.prototype['code'] = undefined;

/**
 * Title message describing the item validation event
 * @member {String} message
 */
ItemValidationEvent.prototype['message'] = undefined;






export default ItemValidationEvent;
