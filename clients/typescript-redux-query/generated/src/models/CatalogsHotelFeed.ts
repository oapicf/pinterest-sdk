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

import {
    CatalogsFeedCredentials,
    CatalogsFeedCredentialsFromJSON,
    CatalogsFeedCredentialsToJSON,
    CatalogsFeedProcessingSchedule,
    CatalogsFeedProcessingScheduleFromJSON,
    CatalogsFeedProcessingScheduleToJSON,
    CatalogsFormat,
    CatalogsFormatFromJSON,
    CatalogsFormatToJSON,
    CatalogsStatus,
    CatalogsStatusFromJSON,
    CatalogsStatusToJSON,
    CatalogsType,
    CatalogsTypeFromJSON,
    CatalogsTypeToJSON,
    NullableCurrency,
    NullableCurrencyFromJSON,
    NullableCurrencyToJSON,
} from './';

/**
 * @type CatalogsHotelFeed
 * Catalogs Hotel Feed object
 * @export
 */
export interface CatalogsHotelFeed extends CatalogsDbItem {
}

export function CatalogsHotelFeedFromJSON(json: any): CatalogsHotelFeed {
    return {
        ...CatalogsDbItemFromJSON(json),
    };
}

export function CatalogsHotelFeedToJSON(value?: CatalogsHotelFeed): any {
    if (value === undefined) {
        return undefined;
    }
    return {
        ...CatalogsDbItemToJSON(value),
    };
}
