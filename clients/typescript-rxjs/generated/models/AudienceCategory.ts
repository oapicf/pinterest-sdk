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
    AudienceSubcategory,
} from './';

/**
 * @export
 * @interface AudienceCategory
 */
export interface AudienceCategory {
    /**
     * Interest unique key (same as ID).
     * @type {string}
     * @memberof AudienceCategory
     */
    key?: string;
    /**
     * Interest name.
     * @type {string}
     * @memberof AudienceCategory
     */
    name?: string;
    /**
     * Interest\'s percent of category\'s total audience.
     * @type {number}
     * @memberof AudienceCategory
     */
    ratio?: number;
    /**
     * Interest affinity index.
     * @type {number}
     * @memberof AudienceCategory
     */
    index?: number;
    /**
     * Interest ID.
     * @type {string}
     * @memberof AudienceCategory
     */
    id?: string;
    /**
     * Subcategory interest distribution
     * @type {Array<AudienceSubcategory>}
     * @memberof AudienceCategory
     */
    subcategories?: Array<AudienceSubcategory>;
}
