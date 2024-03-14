/* tslint:disable */
/* eslint-disable */
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.6.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


/**
 * Summary status for ad group
 * @export
 */
export const AdGroupSummaryStatus = {
    Running: 'RUNNING',
    Paused: 'PAUSED',
    NotStarted: 'NOT_STARTED',
    Completed: 'COMPLETED',
    AdvertiserDisabled: 'ADVERTISER_DISABLED',
    Archived: 'ARCHIVED'
} as const;
export type AdGroupSummaryStatus = typeof AdGroupSummaryStatus[keyof typeof AdGroupSummaryStatus];


export function AdGroupSummaryStatusFromJSON(json: any): AdGroupSummaryStatus {
    return AdGroupSummaryStatusFromJSONTyped(json, false);
}

export function AdGroupSummaryStatusFromJSONTyped(json: any, ignoreDiscriminator: boolean): AdGroupSummaryStatus {
    return json as AdGroupSummaryStatus;
}

export function AdGroupSummaryStatusToJSON(value?: AdGroupSummaryStatus | null): any {
    return value as any;
}
