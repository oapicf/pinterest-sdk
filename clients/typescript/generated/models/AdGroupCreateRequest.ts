/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * OpenAPI spec version: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { ActionType } from '../models/ActionType';
import { AdGroupCommonOptimizationGoalMetadata } from '../models/AdGroupCommonOptimizationGoalMetadata';
import { AdGroupCommonTrackingUrls } from '../models/AdGroupCommonTrackingUrls';
import { BudgetType } from '../models/BudgetType';
import { EntityStatus } from '../models/EntityStatus';
import { PacingDeliveryType } from '../models/PacingDeliveryType';
import { PlacementGroupType } from '../models/PlacementGroupType';
import { TargetingSpec } from '../models/TargetingSpec';
import { HttpFile } from '../http/http';

export class AdGroupCreateRequest {
    /**
    * Ad group name.
    */
    'name': string;
    /**
    * Ad group/entity status.
    */
    'status'?: EntityStatus;
    /**
    * Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
    */
    'budgetInMicroCurrency'?: number | null;
    /**
    * Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
    */
    'bidInMicroCurrency'?: number | null;
    'optimizationGoalMetadata'?: AdGroupCommonOptimizationGoalMetadata | null;
    'budgetType'?: BudgetType;
    /**
    * Ad group start time. Unix timestamp in seconds. Defaults to current time.
    */
    'startTime'?: number | null;
    /**
    * Ad group end time. Unix timestamp in seconds.
    */
    'endTime'?: number | null;
    'targetingSpec'?: TargetingSpec;
    /**
    * Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
    */
    'lifetimeFrequencyCap'?: number;
    'trackingUrls'?: AdGroupCommonTrackingUrls | null;
    /**
    * Enable auto-targeting for ad group.Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
    */
    'autoTargetingEnabled'?: boolean;
    /**
    * <a href=\"https://developers.pinterest.com/docs/redoc/#section/Placement-group\">Placement group</a>.
    */
    'placementGroup'?: PlacementGroupType;
    'pacingDeliveryType'?: PacingDeliveryType;
    /**
    * Campaign ID of the ad group.
    */
    'campaignId': string;
    'billableEvent': ActionType;
    /**
    * Bid strategy type
    */
    'bidStrategyType'?: AdGroupCreateRequestBidStrategyTypeEnum | null;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "EntityStatus",
            "format": ""
        },
        {
            "name": "budgetInMicroCurrency",
            "baseName": "budget_in_micro_currency",
            "type": "number",
            "format": ""
        },
        {
            "name": "bidInMicroCurrency",
            "baseName": "bid_in_micro_currency",
            "type": "number",
            "format": ""
        },
        {
            "name": "optimizationGoalMetadata",
            "baseName": "optimization_goal_metadata",
            "type": "AdGroupCommonOptimizationGoalMetadata",
            "format": ""
        },
        {
            "name": "budgetType",
            "baseName": "budget_type",
            "type": "BudgetType",
            "format": ""
        },
        {
            "name": "startTime",
            "baseName": "start_time",
            "type": "number",
            "format": ""
        },
        {
            "name": "endTime",
            "baseName": "end_time",
            "type": "number",
            "format": ""
        },
        {
            "name": "targetingSpec",
            "baseName": "targeting_spec",
            "type": "TargetingSpec",
            "format": ""
        },
        {
            "name": "lifetimeFrequencyCap",
            "baseName": "lifetime_frequency_cap",
            "type": "number",
            "format": ""
        },
        {
            "name": "trackingUrls",
            "baseName": "tracking_urls",
            "type": "AdGroupCommonTrackingUrls",
            "format": ""
        },
        {
            "name": "autoTargetingEnabled",
            "baseName": "auto_targeting_enabled",
            "type": "boolean",
            "format": ""
        },
        {
            "name": "placementGroup",
            "baseName": "placement_group",
            "type": "PlacementGroupType",
            "format": ""
        },
        {
            "name": "pacingDeliveryType",
            "baseName": "pacing_delivery_type",
            "type": "PacingDeliveryType",
            "format": ""
        },
        {
            "name": "campaignId",
            "baseName": "campaign_id",
            "type": "string",
            "format": ""
        },
        {
            "name": "billableEvent",
            "baseName": "billable_event",
            "type": "ActionType",
            "format": ""
        },
        {
            "name": "bidStrategyType",
            "baseName": "bid_strategy_type",
            "type": "AdGroupCreateRequestBidStrategyTypeEnum",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return AdGroupCreateRequest.attributeTypeMap;
    }

    public constructor() {
    }
}


export enum AdGroupCreateRequestBidStrategyTypeEnum {
    AutomaticBid = 'AUTOMATIC_BID',
    MaxBid = 'MAX_BID',
    TargetAvg = 'TARGET_AVG',
    Null = 'null'
}
