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

import * as models from './models';

export interface CreateMMMReportRequest {
    /**
     * Name of the Marketing Mix Modeling (MMM) report
     */
    report_name: string;

    /**
     * Metric report start date (UTC). Format: YYYY-MM-DD
     */
    start_date: string;

    /**
     * Metric report end date (UTC). Format: YYYY-MM-DD
     */
    end_date: string;

    /**
     * DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
     */
    granularity: CreateMMMReportRequest.GranularityEnum;

    /**
     * Level of the report
     */
    level: CreateMMMReportRequest.LevelEnum;

    /**
     * List of targeting types
     */
    targeting_types: Array<models.MMMReportingTargetingType>;

    /**
     * Metric and entity columns
     */
    columns: Array<models.MMMReportingColumn>;

    /**
     * A List of countries for filtering
     */
    countries?: Array<models.TargetingAdvertiserCountry>;

}
export namespace CreateMMMReportRequest {
    export enum GranularityEnum {
        Day = <any> 'DAY',
        Week = <any> 'WEEK'
    }
    export enum LevelEnum {
        CampaignTargeting = <any> 'CAMPAIGN_TARGETING',
        AdGroupTargeting = <any> 'AD_GROUP_TARGETING'
    }
}
