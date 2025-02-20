/**
 * Pinterest REST API
 *
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export interface BidFloor { 
    /**
     * A list of bid floors in micro currency. For example, [100000, 200000]
     */
    bid_floors?: Array<number>;
    /**
     * Always the string \'bidfloor\'
     */
    type?: string;
}

