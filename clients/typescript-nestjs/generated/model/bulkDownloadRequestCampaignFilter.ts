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
import { CampaignSummaryStatus } from './campaignSummaryStatus';
import { ObjectiveType } from './objectiveType';


export interface BulkDownloadRequestCampaignFilter { 
    /**
     * Unix UTC timestamp.
     */
    start_time?: string;
    /**
     * Unix UTC timestamp.
     */
    end_time?: string;
    /**
     * Campaign name
     */
    name?: string;
    campaign_status?: Array<CampaignSummaryStatus>;
    objective_type?: Array<ObjectiveType>;
}

