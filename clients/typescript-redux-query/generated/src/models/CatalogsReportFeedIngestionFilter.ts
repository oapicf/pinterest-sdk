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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface CatalogsReportFeedIngestionFilter
 */
export interface CatalogsReportFeedIngestionFilter  {
    /**
     * 
     * @type {string}
     * @memberof CatalogsReportFeedIngestionFilter
     */
    reportType: CatalogsReportFeedIngestionFilterReportTypeEnum;
    /**
     * ID of the feed entity.
     * @type {string}
     * @memberof CatalogsReportFeedIngestionFilter
     */
    feedId: string;
    /**
     * Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
     * @type {string}
     * @memberof CatalogsReportFeedIngestionFilter
     */
    processingResultId?: string;
}

export function CatalogsReportFeedIngestionFilterFromJSON(json: any): CatalogsReportFeedIngestionFilter {
    return {
        'reportType': json['report_type'],
        'feedId': json['feed_id'],
        'processingResultId': !exists(json, 'processing_result_id') ? undefined : json['processing_result_id'],
    };
}

export function CatalogsReportFeedIngestionFilterToJSON(value?: CatalogsReportFeedIngestionFilter): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'report_type': value.reportType,
        'feed_id': value.feedId,
        'processing_result_id': value.processingResultId,
    };
}

/**
* @export
* @enum {string}
*/
export enum CatalogsReportFeedIngestionFilterReportTypeEnum {
    FeedIngestionIssues = 'FEED_INGESTION_ISSUES'
}


