/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * OpenAPI spec version: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

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

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "type",
            "baseName": "type",
            "type": "string",
            "format": ""
        },
        {
            "name": "startDaysInPast",
            "baseName": "start_days_in_past",
            "type": "number",
            "format": ""
        },
        {
            "name": "endDaysInPast",
            "baseName": "end_days_in_past",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return TemplateResponseDateRangeRelativeDateRange.attributeTypeMap;
    }

    public constructor() {
    }
}
