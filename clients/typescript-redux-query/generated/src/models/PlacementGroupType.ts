// tslint:disable
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
 * Campaign placement group type
 * @export
 * @enum {string}
 */
export enum PlacementGroupType {
    All = 'ALL',
    Search = 'SEARCH',
    Browse = 'BROWSE',
    Other = 'OTHER'
}

export function PlacementGroupTypeFromJSON(json: any): PlacementGroupType {
    return json as PlacementGroupType;
}

export function PlacementGroupTypeToJSON(value?: PlacementGroupType): any {
    return value as any;
}

