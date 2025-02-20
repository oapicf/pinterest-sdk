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

import type {
    TemplateResponseDateRangeAbsoluteDateRange,
    TemplateResponseDateRangeDynamicDateRange,
    TemplateResponseDateRangeRelativeDateRange,
} from './';

/**
 * @export
 * @interface TemplateResponseDateRange
 */
export interface TemplateResponseDateRange {
    /**
     * @type {TemplateResponseDateRangeDynamicDateRange}
     * @memberof TemplateResponseDateRange
     */
    dynamic_date_range?: TemplateResponseDateRangeDynamicDateRange | null;
    /**
     * @type {TemplateResponseDateRangeRelativeDateRange}
     * @memberof TemplateResponseDateRange
     */
    relative_date_range?: TemplateResponseDateRangeRelativeDateRange | null;
    /**
     * @type {TemplateResponseDateRangeAbsoluteDateRange}
     * @memberof TemplateResponseDateRange
     */
    absolute_date_range?: TemplateResponseDateRangeAbsoluteDateRange | null;
}
