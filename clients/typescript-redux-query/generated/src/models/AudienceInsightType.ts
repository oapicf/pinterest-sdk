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

/**
 * 
 * @export
 * @enum {string}
 */
export enum AudienceInsightType {
    YourTotalAudience = 'YOUR_TOTAL_AUDIENCE',
    YourEngagedAudience = 'YOUR_ENGAGED_AUDIENCE',
    PinterestTotalAudience = 'PINTEREST_TOTAL_AUDIENCE'
}

export function AudienceInsightTypeFromJSON(json: any): AudienceInsightType {
    return json as AudienceInsightType;
}

export function AudienceInsightTypeToJSON(value?: AudienceInsightType): any {
    return value as any;
}
