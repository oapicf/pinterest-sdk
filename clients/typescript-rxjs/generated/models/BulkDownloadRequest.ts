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

import type {
    BulkDownloadRequestCampaignFilter,
    BulkEntityType,
    BulkOutputFormat,
} from './';

/**
 * Ad entities to get in bulk request.
 * @export
 * @interface BulkDownloadRequest
 */
export interface BulkDownloadRequest {
    /**
     * All entity types specified will be downloaded. Fewer types result in faster downloads.
     * @type {Array<BulkEntityType>}
     * @memberof BulkDownloadRequest
     */
    entity_types?: Array<BulkEntityType>;
    /**
     * All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
     * @type {Array<string>}
     * @memberof BulkDownloadRequest
     */
    entity_ids?: Array<string>;
    /**
     * Unix UTC timestamp to retrieve all entities that have changed since this time.
     * @type {string}
     * @memberof BulkDownloadRequest
     */
    updated_since?: string;
    /**
     * @type {BulkDownloadRequestCampaignFilter}
     * @memberof BulkDownloadRequest
     */
    campaign_filter?: BulkDownloadRequestCampaignFilter;
    /**
     * @type {BulkOutputFormat}
     * @memberof BulkDownloadRequest
     */
    output_format?: BulkOutputFormat;
}


