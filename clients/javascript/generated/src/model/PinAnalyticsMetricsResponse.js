/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import PinAnalyticsMetricsResponseDailyMetricsInner from './PinAnalyticsMetricsResponseDailyMetricsInner';

/**
 * The PinAnalyticsMetricsResponse model module.
 * @module model/PinAnalyticsMetricsResponse
 * @version 1.1.1-pre.0
 */
class PinAnalyticsMetricsResponse {
    /**
     * Constructs a new <code>PinAnalyticsMetricsResponse</code>.
     * @alias module:model/PinAnalyticsMetricsResponse
     */
    constructor() { 
        
        PinAnalyticsMetricsResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>PinAnalyticsMetricsResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/PinAnalyticsMetricsResponse} obj Optional instance to populate.
     * @return {module:model/PinAnalyticsMetricsResponse} The populated <code>PinAnalyticsMetricsResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new PinAnalyticsMetricsResponse();

            if (data.hasOwnProperty('lifetime_metrics')) {
                obj['lifetime_metrics'] = ApiClient.convertToType(data['lifetime_metrics'], {'String': 'Number'});
            }
            if (data.hasOwnProperty('daily_metrics')) {
                obj['daily_metrics'] = ApiClient.convertToType(data['daily_metrics'], [PinAnalyticsMetricsResponseDailyMetricsInner]);
            }
            if (data.hasOwnProperty('summary_metrics')) {
                obj['summary_metrics'] = ApiClient.convertToType(data['summary_metrics'], {'String': 'Number'});
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>PinAnalyticsMetricsResponse</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>PinAnalyticsMetricsResponse</code>.
     */
    static validateJSON(data) {
        if (data['daily_metrics']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['daily_metrics'])) {
                throw new Error("Expected the field `daily_metrics` to be an array in the JSON data but got " + data['daily_metrics']);
            }
            // validate the optional field `daily_metrics` (array)
            for (const item of data['daily_metrics']) {
                PinAnalyticsMetricsResponseDailyMetricsInner.validateJSON(item);
            };
        }

        return true;
    }


}



/**
 * The lifetime metric name and value.
 * @member {Object.<String, Number>} lifetime_metrics
 */
PinAnalyticsMetricsResponse.prototype['lifetime_metrics'] = undefined;

/**
 * Array with the requested daily metric records
 * @member {Array.<module:model/PinAnalyticsMetricsResponseDailyMetricsInner>} daily_metrics
 */
PinAnalyticsMetricsResponse.prototype['daily_metrics'] = undefined;

/**
 * The metric name and value over the requested period for each requested metric
 * @member {Object.<String, Number>} summary_metrics
 */
PinAnalyticsMetricsResponse.prototype['summary_metrics'] = undefined;






export default PinAnalyticsMetricsResponse;
