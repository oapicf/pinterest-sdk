/* tslint:disable */
/* eslint-disable */
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


/**
 * Reporting targeting type for ads
 * @export
 */
export const AdsAnalyticsAdTargetingType = {
    Keyword: 'KEYWORD',
    Apptype: 'APPTYPE',
    Gender: 'GENDER',
    Location: 'LOCATION',
    Placement: 'PLACEMENT',
    Country: 'COUNTRY',
    TargetedInterest: 'TARGETED_INTEREST',
    PinnerInterest: 'PINNER_INTEREST',
    AudienceInclude: 'AUDIENCE_INCLUDE',
    Geo: 'GEO',
    AgeBucket: 'AGE_BUCKET',
    Region: 'REGION',
    QuizResult: 'QUIZ_RESULT',
    AgeBucketAndGender: 'AGE_BUCKET_AND_GENDER'
} as const;
export type AdsAnalyticsAdTargetingType = typeof AdsAnalyticsAdTargetingType[keyof typeof AdsAnalyticsAdTargetingType];


export function instanceOfAdsAnalyticsAdTargetingType(value: any): boolean {
    for (const key in AdsAnalyticsAdTargetingType) {
        if (Object.prototype.hasOwnProperty.call(AdsAnalyticsAdTargetingType, key)) {
            if (AdsAnalyticsAdTargetingType[key as keyof typeof AdsAnalyticsAdTargetingType] === value) {
                return true;
            }
        }
    }
    return false;
}

export function AdsAnalyticsAdTargetingTypeFromJSON(json: any): AdsAnalyticsAdTargetingType {
    return AdsAnalyticsAdTargetingTypeFromJSONTyped(json, false);
}

export function AdsAnalyticsAdTargetingTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): AdsAnalyticsAdTargetingType {
    return json as AdsAnalyticsAdTargetingType;
}

export function AdsAnalyticsAdTargetingTypeToJSON(value?: AdsAnalyticsAdTargetingType | null): any {
    return value as any;
}

export function AdsAnalyticsAdTargetingTypeToJSONTyped(value: any, ignoreDiscriminator: boolean): AdsAnalyticsAdTargetingType {
    return value as AdsAnalyticsAdTargetingType;
}

