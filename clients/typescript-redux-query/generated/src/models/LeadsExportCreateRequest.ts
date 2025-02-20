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

import { exists, mapValues } from '../runtime';
/**
 * 
 * @export
 * @interface LeadsExportCreateRequest
 */
export interface LeadsExportCreateRequest  {
    /**
     * Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
     * @type {string}
     * @memberof LeadsExportCreateRequest
     */
    startDate: string;
    /**
     * Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
     * @type {string}
     * @memberof LeadsExportCreateRequest
     */
    endDate: string;
    /**
     * ID for the ad collecting leads
     * @type {string}
     * @memberof LeadsExportCreateRequest
     */
    adId: string;
}

export function LeadsExportCreateRequestFromJSON(json: any): LeadsExportCreateRequest {
    return {
        'startDate': json['start_date'],
        'endDate': json['end_date'],
        'adId': json['ad_id'],
    };
}

export function LeadsExportCreateRequestToJSON(value?: LeadsExportCreateRequest): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        'start_date': value.startDate,
        'end_date': value.endDate,
        'ad_id': value.adId,
    };
}


