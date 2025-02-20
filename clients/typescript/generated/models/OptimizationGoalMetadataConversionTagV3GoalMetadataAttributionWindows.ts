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

export class OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows {
    'clickWindowDays'?: number;
    'engagementWindowDays'?: number;
    'viewWindowDays'?: number;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "clickWindowDays",
            "baseName": "click_window_days",
            "type": "number",
            "format": ""
        },
        {
            "name": "engagementWindowDays",
            "baseName": "engagement_window_days",
            "type": "number",
            "format": ""
        },
        {
            "name": "viewWindowDays",
            "baseName": "view_window_days",
            "type": "number",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.attributeTypeMap;
    }

    public constructor() {
    }
}
