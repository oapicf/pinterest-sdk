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

import * as models from './models';

/**
 * The relative date range of the template
 */
export interface TemplateResponseDateRangeRelativeDateRange {
    /**
     * The date range type
     */
    type?: string;

    /**
     * The start date of the date range
     */
    start_days_in_past?: number;

    /**
     * The end date of the date range
     */
    end_days_in_past?: number;

}