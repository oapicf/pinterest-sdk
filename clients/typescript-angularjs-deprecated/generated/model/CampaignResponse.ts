/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import * as models from './models';

export interface CampaignResponse {
    /**
     * Campaign ID.
     */
    "id": string;
    /**
     * Campaign\'s Advertiser ID.
     */
    "ad_account_id": string;
    /**
     * Campaign name.
     */
    "name"?: string;
    "status"?: models.models.EntityStatus;
    /**
     * Campaign total spending cap.
     */
    "lifetime_spend_cap"?: number;
    /**
     * Campaign daily spending cap.
     */
    "daily_spend_cap"?: number;
    /**
     * Order line ID that appears on the invoice.
     */
    "order_line_id"?: string;
    "tracking_urls"?: models.models.TrackingUrls;
    /**
     * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
     */
    "start_time"?: number;
    /**
     * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
     */
    "end_time"?: number;
    "objective_type"?: models.ObjectiveType;
    /**
     * Campaign creation time. Unix timestamp in seconds.
     */
    "created_time"?: number;
    /**
     * UTC timestamp. Last update time.
     */
    "updated_time"?: number;
    /**
     * Always \"campaign\".
     */
    "type"?: string;
}
