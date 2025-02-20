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

/**
 * The CatalogsReportFeedIngestionFilter model module.
 * @module model/CatalogsReportFeedIngestionFilter
 * @version 1.1.1-pre.0
 */
class CatalogsReportFeedIngestionFilter {
    /**
     * Constructs a new <code>CatalogsReportFeedIngestionFilter</code>.
     * @alias module:model/CatalogsReportFeedIngestionFilter
     * @param reportType {module:model/CatalogsReportFeedIngestionFilter.ReportTypeEnum} 
     * @param feedId {String} ID of the feed entity.
     */
    constructor(reportType, feedId) { 
        
        CatalogsReportFeedIngestionFilter.initialize(this, reportType, feedId);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, reportType, feedId) { 
        obj['report_type'] = reportType;
        obj['feed_id'] = feedId;
    }

    /**
     * Constructs a <code>CatalogsReportFeedIngestionFilter</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CatalogsReportFeedIngestionFilter} obj Optional instance to populate.
     * @return {module:model/CatalogsReportFeedIngestionFilter} The populated <code>CatalogsReportFeedIngestionFilter</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CatalogsReportFeedIngestionFilter();

            if (data.hasOwnProperty('report_type')) {
                obj['report_type'] = ApiClient.convertToType(data['report_type'], 'String');
            }
            if (data.hasOwnProperty('feed_id')) {
                obj['feed_id'] = ApiClient.convertToType(data['feed_id'], 'String');
            }
            if (data.hasOwnProperty('processing_result_id')) {
                obj['processing_result_id'] = ApiClient.convertToType(data['processing_result_id'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>CatalogsReportFeedIngestionFilter</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>CatalogsReportFeedIngestionFilter</code>.
     */
    static validateJSON(data) {
        // check to make sure all required properties are present in the JSON string
        for (const property of CatalogsReportFeedIngestionFilter.RequiredProperties) {
            if (!data.hasOwnProperty(property)) {
                throw new Error("The required field `" + property + "` is not found in the JSON data: " + JSON.stringify(data));
            }
        }
        // ensure the json data is a string
        if (data['report_type'] && !(typeof data['report_type'] === 'string' || data['report_type'] instanceof String)) {
            throw new Error("Expected the field `report_type` to be a primitive type in the JSON string but got " + data['report_type']);
        }
        // ensure the json data is a string
        if (data['feed_id'] && !(typeof data['feed_id'] === 'string' || data['feed_id'] instanceof String)) {
            throw new Error("Expected the field `feed_id` to be a primitive type in the JSON string but got " + data['feed_id']);
        }
        // ensure the json data is a string
        if (data['processing_result_id'] && !(typeof data['processing_result_id'] === 'string' || data['processing_result_id'] instanceof String)) {
            throw new Error("Expected the field `processing_result_id` to be a primitive type in the JSON string but got " + data['processing_result_id']);
        }

        return true;
    }


}

CatalogsReportFeedIngestionFilter.RequiredProperties = ["report_type", "feed_id"];

/**
 * @member {module:model/CatalogsReportFeedIngestionFilter.ReportTypeEnum} report_type
 */
CatalogsReportFeedIngestionFilter.prototype['report_type'] = undefined;

/**
 * ID of the feed entity.
 * @member {String} feed_id
 */
CatalogsReportFeedIngestionFilter.prototype['feed_id'] = undefined;

/**
 * Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
 * @member {String} processing_result_id
 */
CatalogsReportFeedIngestionFilter.prototype['processing_result_id'] = undefined;





/**
 * Allowed values for the <code>report_type</code> property.
 * @enum {String}
 * @readonly
 */
CatalogsReportFeedIngestionFilter['ReportTypeEnum'] = {

    /**
     * value: "FEED_INGESTION_ISSUES"
     * @const
     */
    "FEED_INGESTION_ISSUES": "FEED_INGESTION_ISSUES"
};



export default CatalogsReportFeedIngestionFilter;

