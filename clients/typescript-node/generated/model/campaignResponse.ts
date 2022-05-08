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

import { RequestFile } from './models';
import { CampaignCommon } from './campaignCommon';
import { CampaignResponseAllOf } from './campaignResponseAllOf';
import { CampaignResponseAllOf1 } from './campaignResponseAllOf1';
import { EntityStatus } from './entityStatus';
import { ObjectiveType } from './objectiveType';
import { TrackingUrls } from './trackingUrls';

export class CampaignResponse {
    /**
    * Campaign ID.
    */
    'id': string;
    /**
    * Campaign\'s Advertiser ID.
    */
    'adAccountId': string;
    /**
    * Campaign name.
    */
    'name'?: string;
    'status'?: EntityStatus = 'ACTIVE';
    /**
    * Campaign total spending cap.
    */
    'lifetimeSpendCap'?: number | null;
    /**
    * Campaign daily spending cap.
    */
    'dailySpendCap'?: number | null;
    /**
    * Order line ID that appears on the invoice.
    */
    'orderLineId'?: string | null;
    'trackingUrls'?: TrackingUrls | null;
    /**
    * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
    */
    'startTime'?: number | null;
    /**
    * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
    */
    'endTime'?: number | null;
    'objectiveType'?: ObjectiveType;
    /**
    * Campaign creation time. Unix timestamp in seconds.
    */
    'createdTime'?: number;
    /**
    * UTC timestamp. Last update time.
    */
    'updatedTime'?: number;
    /**
    * Always \"campaign\".
    */
    'type'?: string;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "adAccountId",
            "baseName": "ad_account_id",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "EntityStatus"
        },
        {
            "name": "lifetimeSpendCap",
            "baseName": "lifetime_spend_cap",
            "type": "number"
        },
        {
            "name": "dailySpendCap",
            "baseName": "daily_spend_cap",
            "type": "number"
        },
        {
            "name": "orderLineId",
            "baseName": "order_line_id",
            "type": "string"
        },
        {
            "name": "trackingUrls",
            "baseName": "tracking_urls",
            "type": "TrackingUrls"
        },
        {
            "name": "startTime",
            "baseName": "start_time",
            "type": "number"
        },
        {
            "name": "endTime",
            "baseName": "end_time",
            "type": "number"
        },
        {
            "name": "objectiveType",
            "baseName": "objective_type",
            "type": "ObjectiveType"
        },
        {
            "name": "createdTime",
            "baseName": "created_time",
            "type": "number"
        },
        {
            "name": "updatedTime",
            "baseName": "updated_time",
            "type": "number"
        },
        {
            "name": "type",
            "baseName": "type",
            "type": "string"
        }    ];

    static getAttributeTypeMap() {
        return CampaignResponse.attributeTypeMap;
    }
}
