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


/**
 * The counts can be null early in the process.
 */
export interface CatalogsFeedProductCounts { 
    /**
     * The number of products in the feed file.
     */
    original?: number;
    /**
     * The number of products successfully ingested from the feed file.
     */
    ingested?: number;
}

