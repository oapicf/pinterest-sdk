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

import { RequestFile } from './models';
import { TopPinsAnalyticsResponseDateAvailability } from './topPinsAnalyticsResponseDateAvailability';
import { TopPinsAnalyticsResponsePinsInner } from './topPinsAnalyticsResponsePinsInner';

export class TopPinsAnalyticsResponse {
    'dateAvailability'?: TopPinsAnalyticsResponseDateAvailability;
    'pins'?: Array<TopPinsAnalyticsResponsePinsInner>;
    'sortBy'?: TopPinsAnalyticsResponse.SortByEnum;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "dateAvailability",
            "baseName": "date_availability",
            "type": "TopPinsAnalyticsResponseDateAvailability"
        },
        {
            "name": "pins",
            "baseName": "pins",
            "type": "Array<TopPinsAnalyticsResponsePinsInner>"
        },
        {
            "name": "sortBy",
            "baseName": "sort_by",
            "type": "TopPinsAnalyticsResponse.SortByEnum"
        }    ];

    static getAttributeTypeMap() {
        return TopPinsAnalyticsResponse.attributeTypeMap;
    }
}

export namespace TopPinsAnalyticsResponse {
    export enum SortByEnum {
        Engagement = <any> 'ENGAGEMENT',
        Save = <any> 'SAVE',
        Impression = <any> 'IMPRESSION',
        OutboundClick = <any> 'OUTBOUND_CLICK',
        PinClick = <any> 'PIN_CLICK'
    }
}
