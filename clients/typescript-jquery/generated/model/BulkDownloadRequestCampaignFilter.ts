/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import * as models from './models';

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

    campaign_status?: Array<models.CampaignSummaryStatus>;

    objective_type?: Array<models.ObjectiveType>;

}