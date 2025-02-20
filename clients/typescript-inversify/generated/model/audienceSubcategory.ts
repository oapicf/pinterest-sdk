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


export interface AudienceSubcategory { 
    /**
     * Interest unique key (same as ID).
     */
    key?: string;
    /**
     * Subinterest name.
     */
    name?: string;
    /**
     * Subinterest\'s percent of category\'s total audience.
     */
    ratio?: number;
    /**
     * Subinterest affinity index.
     */
    index?: number;
    /**
     * Subinterest ID.
     */
    id?: string;
}
