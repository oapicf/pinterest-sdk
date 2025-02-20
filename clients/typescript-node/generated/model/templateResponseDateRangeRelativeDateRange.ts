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

/**
* The relative date range of the template
*/
export class TemplateResponseDateRangeRelativeDateRange {
    /**
    * The date range type
    */
    'type'?: string;
    /**
    * The start date of the date range
    */
    'startDaysInPast'?: number;
    /**
    * The end date of the date range
    */
    'endDaysInPast'?: number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "string"
        },
        {
            "name": "startDaysInPast",
            "baseName": "start_days_in_past",
            "type": "number"
        },
        {
            "name": "endDaysInPast",
            "baseName": "end_days_in_past",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return TemplateResponseDateRangeRelativeDateRange.attributeTypeMap;
    }
}

