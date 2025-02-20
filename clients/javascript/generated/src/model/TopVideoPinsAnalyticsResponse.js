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
import TopPinsAnalyticsResponseDateAvailability from './TopPinsAnalyticsResponseDateAvailability';
import TopVideoPinsAnalyticsResponsePinsInner from './TopVideoPinsAnalyticsResponsePinsInner';

/**
 * The TopVideoPinsAnalyticsResponse model module.
 * @module model/TopVideoPinsAnalyticsResponse
 * @version 1.1.1-pre.0
 */
class TopVideoPinsAnalyticsResponse {
    /**
     * Constructs a new <code>TopVideoPinsAnalyticsResponse</code>.
     * @alias module:model/TopVideoPinsAnalyticsResponse
     */
    constructor() { 
        
        TopVideoPinsAnalyticsResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>TopVideoPinsAnalyticsResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/TopVideoPinsAnalyticsResponse} obj Optional instance to populate.
     * @return {module:model/TopVideoPinsAnalyticsResponse} The populated <code>TopVideoPinsAnalyticsResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new TopVideoPinsAnalyticsResponse();

            if (data.hasOwnProperty('date_availability')) {
                obj['date_availability'] = TopPinsAnalyticsResponseDateAvailability.constructFromObject(data['date_availability']);
            }
            if (data.hasOwnProperty('pins')) {
                obj['pins'] = ApiClient.convertToType(data['pins'], [TopVideoPinsAnalyticsResponsePinsInner]);
            }
            if (data.hasOwnProperty('sort_by')) {
                obj['sort_by'] = ApiClient.convertToType(data['sort_by'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>TopVideoPinsAnalyticsResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>TopVideoPinsAnalyticsResponse</code>.
     */
    static validateJSON(data) {
        // validate the optional field `date_availability`
        if (data['date_availability']) { // data not null
          TopPinsAnalyticsResponseDateAvailability.validateJSON(data['date_availability']);
        }
        if (data['pins']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['pins'])) {
                throw new Error("Expected the field `pins` to be an array in the JSON data but got " + data['pins']);
            }
            // validate the optional field `pins` (array)
            for (const item of data['pins']) {
                TopVideoPinsAnalyticsResponsePinsInner.validateJSON(item);
            };
        }
        // ensure the json data is a string
        if (data['sort_by'] && !(typeof data['sort_by'] === 'string' || data['sort_by'] instanceof String)) {
            throw new Error("Expected the field `sort_by` to be a primitive type in the JSON string but got " + data['sort_by']);
        }

        return true;
    }


}



/**
 * @member {module:model/TopPinsAnalyticsResponseDateAvailability} date_availability
 */
TopVideoPinsAnalyticsResponse.prototype['date_availability'] = undefined;

/**
 * @member {Array.<module:model/TopVideoPinsAnalyticsResponsePinsInner>} pins
 */
TopVideoPinsAnalyticsResponse.prototype['pins'] = undefined;

/**
 * @member {module:model/TopVideoPinsAnalyticsResponse.SortByEnum} sort_by
 */
TopVideoPinsAnalyticsResponse.prototype['sort_by'] = undefined;





/**
 * Allowed values for the <code>sort_by</code> property.
 * @enum {String}
 * @readonly
 */
TopVideoPinsAnalyticsResponse['SortByEnum'] = {

    /**
     * value: "SAVE"
     * @const
     */
    "SAVE": "SAVE",

    /**
     * value: "IMPRESSION"
     * @const
     */
    "IMPRESSION": "IMPRESSION",

    /**
     * value: "OUTBOUND_CLICK"
     * @const
     */
    "OUTBOUND_CLICK": "OUTBOUND_CLICK",

    /**
     * value: "VIDEO_MRC_VIEW"
     * @const
     */
    "VIDEO_MRC_VIEW": "VIDEO_MRC_VIEW",

    /**
     * value: "VIDEO_AVG_WATCH_TIME"
     * @const
     */
    "VIDEO_AVG_WATCH_TIME": "VIDEO_AVG_WATCH_TIME",

    /**
     * value: "VIDEO_V50_WATCH_TIME"
     * @const
     */
    "VIDEO_V50_WATCH_TIME": "VIDEO_V50_WATCH_TIME",

    /**
     * value: "QUARTILE_95_PERCENT_VIEW"
     * @const
     */
    "QUARTILE_95_PERCENT_VIEW": "QUARTILE_95_PERCENT_VIEW",

    /**
     * value: "VIDEO_10S_VIEW"
     * @const
     */
    "VIDEO_10S_VIEW": "VIDEO_10S_VIEW",

    /**
     * value: "VIDEO_START"
     * @const
     */
    "VIDEO_START": "VIDEO_START"
};



export default TopVideoPinsAnalyticsResponse;

