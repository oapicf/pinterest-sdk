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
import {
    CampaignSummaryStatus,
    CampaignSummaryStatusFromJSON,
    CampaignSummaryStatusToJSON,
    ObjectiveType,
    ObjectiveTypeFromJSON,
    ObjectiveTypeToJSON,
} from './';

/**
 * 
 * @export
 * @interface BulkDownloadRequestCampaignFilter
 */
export interface BulkDownloadRequestCampaignFilter  {
    /**
     * Unix UTC timestamp.
     * @type {string}
     * @memberof BulkDownloadRequestCampaignFilter
     */
    startTime?: string;
    /**
     * Unix UTC timestamp.
     * @type {string}
     * @memberof BulkDownloadRequestCampaignFilter
     */
    endTime?: string;
    /**
     * Campaign name
     * @type {string}
     * @memberof BulkDownloadRequestCampaignFilter
     */
    name?: string;
    /**
     * 
     * @type {Array<CampaignSummaryStatus>}
     * @memberof BulkDownloadRequestCampaignFilter
     */
    campaignStatus?: Array<CampaignSummaryStatus>;
    /**
     * 
     * @type {Array<ObjectiveType>}
     * @memberof BulkDownloadRequestCampaignFilter
     */
    objectiveType?: Array<ObjectiveType>;
}

export function BulkDownloadRequestCampaignFilterFromJSON(json: any): BulkDownloadRequestCampaignFilter {
    return {
        'startTime': !exists(json, 'start_time') ? undefined : json['start_time'],
        'endTime': !exists(json, 'end_time') ? undefined : json['end_time'],
        'name': !exists(json, 'name') ? undefined : json['name'],
        'campaignStatus': !exists(json, 'campaign_status') ? undefined : (json['campaign_status'] as Array<any>).map(CampaignSummaryStatusFromJSON),
        'objectiveType': !exists(json, 'objective_type') ? undefined : (json['objective_type'] as Array<any>).map(ObjectiveTypeFromJSON),
    };
}

export function BulkDownloadRequestCampaignFilterToJSON(value?: BulkDownloadRequestCampaignFilter): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'start_time': value.startTime,
        'end_time': value.endTime,
        'name': value.name,
        'campaign_status': value.campaignStatus === undefined ? undefined : (value.campaignStatus as Array<any>).map(CampaignSummaryStatusToJSON),
        'objective_type': value.objectiveType === undefined ? undefined : (value.objectiveType as Array<any>).map(ObjectiveTypeToJSON),
    };
}


