// tslint:disable
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

import type {
    MMMReportingColumn,
    MMMReportingTargetingType,
    TargetingAdvertiserCountry,
} from './';

/**
 * @export
 * @interface CreateMMMReportRequest
 */
export interface CreateMMMReportRequest {
    /**
     * Name of the Marketing Mix Modeling (MMM) report
     * @type {string}
     * @memberof CreateMMMReportRequest
     */
    report_name: string;
    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD
     * @type {string}
     * @memberof CreateMMMReportRequest
     */
    start_date: string;
    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD
     * @type {string}
     * @memberof CreateMMMReportRequest
     */
    end_date: string;
    /**
     * DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
     * @type {string}
     * @memberof CreateMMMReportRequest
     */
    granularity: CreateMMMReportRequestGranularityEnum;
    /**
     * Level of the report
     * @type {string}
     * @memberof CreateMMMReportRequest
     */
    level: CreateMMMReportRequestLevelEnum;
    /**
     * List of targeting types
     * @type {Array<MMMReportingTargetingType>}
     * @memberof CreateMMMReportRequest
     */
    targeting_types: Array<MMMReportingTargetingType>;
    /**
     * Metric and entity columns
     * @type {Array<MMMReportingColumn>}
     * @memberof CreateMMMReportRequest
     */
    columns: Array<MMMReportingColumn>;
    /**
     * A List of countries for filtering
     * @type {Array<TargetingAdvertiserCountry>}
     * @memberof CreateMMMReportRequest
     */
    countries?: Array<TargetingAdvertiserCountry>;
}

/**
 * @export
 * @enum {string}
 */
export enum CreateMMMReportRequestGranularityEnum {
    Day = 'DAY',
    Week = 'WEEK'
}
/**
 * @export
 * @enum {string}
 */
export enum CreateMMMReportRequestLevelEnum {
    CampaignTargeting = 'CAMPAIGN_TARGETING',
    AdGroupTargeting = 'AD_GROUP_TARGETING'
}
