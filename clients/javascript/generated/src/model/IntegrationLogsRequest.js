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
import IntegrationLog from './IntegrationLog';

/**
 * The IntegrationLogsRequest model module.
 * @module model/IntegrationLogsRequest
 * @version 1.1.1-pre.0
 */
class IntegrationLogsRequest {
    /**
     * Constructs a new <code>IntegrationLogsRequest</code>.
     * Batch of logs sent from an integration application.
     * @alias module:model/IntegrationLogsRequest
     * @param logs {Array.<module:model/IntegrationLog>} 
     */
    constructor(logs) { 
        
        IntegrationLogsRequest.initialize(this, logs);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, logs) { 
        obj['logs'] = logs;
    }

    /**
     * Constructs a <code>IntegrationLogsRequest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/IntegrationLogsRequest} obj Optional instance to populate.
     * @return {module:model/IntegrationLogsRequest} The populated <code>IntegrationLogsRequest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new IntegrationLogsRequest();

            if (data.hasOwnProperty('logs')) {
                obj['logs'] = ApiClient.convertToType(data['logs'], [IntegrationLog]);
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>IntegrationLogsRequest</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>IntegrationLogsRequest</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of IntegrationLogsRequest.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        if (data['logs']) { // data not null
            // ensure the json data is an array
            if (!Array.isArray(data['logs'])) {
                throw new Error("Expected the field `logs` to be an array in the JSON data but got " + data['logs']);
            }
            // validate the optional field `logs` (array)
            for (const item of data['logs']) {
                IntegrationLog.validateJSON(item);
            };
        }

        return true;
    }


}

IntegrationLogsRequest.RequiredProperties = ["logs"];

/**
 * @member {Array.<module:model/IntegrationLog>} logs
 */
IntegrationLogsRequest.prototype['logs'] = undefined;






export default IntegrationLogsRequest;
