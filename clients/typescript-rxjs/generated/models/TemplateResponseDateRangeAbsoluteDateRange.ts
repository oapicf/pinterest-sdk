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
 * The absolute date range of the template
 * @export
 * @interface TemplateResponseDateRangeAbsoluteDateRange
 */
export interface TemplateResponseDateRangeAbsoluteDateRange {
    /**
     * The date range type
     * @type {string}
     * @memberof TemplateResponseDateRangeAbsoluteDateRange
     */
    type?: string;
    /**
     * The start date of the date range
     * @type {number}
     * @memberof TemplateResponseDateRangeAbsoluteDateRange
     */
    start_date?: number;
    /**
     * The end date of the date range
     * @type {number}
     * @memberof TemplateResponseDateRangeAbsoluteDateRange
     */
    end_date?: number;
}