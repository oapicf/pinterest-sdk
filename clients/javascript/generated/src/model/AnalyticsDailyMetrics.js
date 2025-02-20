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
import DataStatus from './DataStatus';

/**
 * The AnalyticsDailyMetrics model module.
 * @module model/AnalyticsDailyMetrics
 * @version 1.1.1-pre.0
 */
class AnalyticsDailyMetrics {
    /**
     * Constructs a new <code>AnalyticsDailyMetrics</code>.
     * @alias module:model/AnalyticsDailyMetrics
     */
    constructor() { 
        
        AnalyticsDailyMetrics.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>AnalyticsDailyMetrics</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/AnalyticsDailyMetrics} obj Optional instance to populate.
     * @return {module:model/AnalyticsDailyMetrics} The populated <code>AnalyticsDailyMetrics</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new AnalyticsDailyMetrics();

            if (data.hasOwnProperty('data_status')) {
                obj['data_status'] = DataStatus.constructFromObject(data['data_status']);
            }
            if (data.hasOwnProperty('date')) {
                obj['date'] = ApiClient.convertToType(data['date'], 'String');
            }
            if (data.hasOwnProperty('metrics')) {
                obj['metrics'] = ApiClient.convertToType(data['metrics'], {'String': 'Number'});
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>AnalyticsDailyMetrics</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>AnalyticsDailyMetrics</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['date'] && !(typeof data['date'] === 'string' || data['date'] instanceof String)) {
            throw new Error("Expected the field `date` to be a primitive type in the JSON string but got " + data['date']);
        }

        return true;
    }


}



/**
 * @member {module:model/DataStatus} data_status
 */
AnalyticsDailyMetrics.prototype['data_status'] = undefined;

/**
 * Metrics date (UTC): YYYY-MM-DD.
 * @member {String} date
 */
AnalyticsDailyMetrics.prototype['date'] = undefined;

/**
 * The metric name and daily value for each requested metric
 * @member {Object.<String, Number>} metrics
 */
AnalyticsDailyMetrics.prototype['metrics'] = undefined;






export default AnalyticsDailyMetrics;

