/* tslint:disable */
/* eslint-disable */
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

import { mapValues } from '../runtime';
/**
 * If specified, you must provide all properties
 * @export
 * @interface CatalogsHotelGuestRatings
 */
export interface CatalogsHotelGuestRatings {
    /**
     * Your hotel's rating.
     * @type {number}
     * @memberof CatalogsHotelGuestRatings
     */
    score?: number;
    /**
     * Total number of people who have rated this hotel.
     * @type {number}
     * @memberof CatalogsHotelGuestRatings
     */
    numberOfReviewers?: number;
    /**
     * Max value for the hotel rating score.
     * @type {number}
     * @memberof CatalogsHotelGuestRatings
     */
    maxScore?: number;
    /**
     * System you use for guest reviews.
     * @type {string}
     * @memberof CatalogsHotelGuestRatings
     */
    ratingSystem?: string;
}

/**
 * Check if a given object implements the CatalogsHotelGuestRatings interface.
 */
export function instanceOfCatalogsHotelGuestRatings(value: object): value is CatalogsHotelGuestRatings {
    return true;
}

export function CatalogsHotelGuestRatingsFromJSON(json: any): CatalogsHotelGuestRatings {
    return CatalogsHotelGuestRatingsFromJSONTyped(json, false);
}

export function CatalogsHotelGuestRatingsFromJSONTyped(json: any, ignoreDiscriminator: boolean): CatalogsHotelGuestRatings {
    if (json == null) {
        return json;
    }
    return {
        
        'score': json['score'] == null ? undefined : json['score'],
        'numberOfReviewers': json['number_of_reviewers'] == null ? undefined : json['number_of_reviewers'],
        'maxScore': json['max_score'] == null ? undefined : json['max_score'],
        'ratingSystem': json['rating_system'] == null ? undefined : json['rating_system'],
    };
}

  export function CatalogsHotelGuestRatingsToJSON(json: any): CatalogsHotelGuestRatings {
      return CatalogsHotelGuestRatingsToJSONTyped(json, false);
  }

  export function CatalogsHotelGuestRatingsToJSONTyped(value?: CatalogsHotelGuestRatings | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'score': value['score'],
        'number_of_reviewers': value['numberOfReviewers'],
        'max_score': value['maxScore'],
        'rating_system': value['ratingSystem'],
    };
}

