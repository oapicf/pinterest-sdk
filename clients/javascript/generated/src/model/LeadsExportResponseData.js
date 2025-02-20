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
import LeadsExportStatus from './LeadsExportStatus';

/**
 * The LeadsExportResponseData model module.
 * @module model/LeadsExportResponseData
 * @version 1.1.1-pre.0
 */
class LeadsExportResponseData {
    /**
     * Constructs a new <code>LeadsExportResponseData</code>.
     * @alias module:model/LeadsExportResponseData
     */
    constructor() { 
        
        LeadsExportResponseData.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>LeadsExportResponseData</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/LeadsExportResponseData} obj Optional instance to populate.
     * @return {module:model/LeadsExportResponseData} The populated <code>LeadsExportResponseData</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new LeadsExportResponseData();

            if (data.hasOwnProperty('export_status')) {
                obj['export_status'] = LeadsExportStatus.constructFromObject(data['export_status']);
            }
            if (data.hasOwnProperty('download_url')) {
                obj['download_url'] = ApiClient.convertToType(data['download_url'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>LeadsExportResponseData</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>LeadsExportResponseData</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['download_url'] && !(typeof data['download_url'] === 'string' || data['download_url'] instanceof String)) {
            throw new Error("Expected the field `download_url` to be a primitive type in the JSON string but got " + data['download_url']);
        }

        return true;
    }


}



/**
 * @member {module:model/LeadsExportStatus} export_status
 */
LeadsExportResponseData.prototype['export_status'] = undefined;

/**
 * @member {String} download_url
 */
LeadsExportResponseData.prototype['download_url'] = undefined;






export default LeadsExportResponseData;

