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
import type { CatalogsFeedProcessingSchedule } from './CatalogsFeedProcessingSchedule';
import {
    CatalogsFeedProcessingScheduleFromJSON,
    CatalogsFeedProcessingScheduleFromJSONTyped,
    CatalogsFeedProcessingScheduleToJSON,
    CatalogsFeedProcessingScheduleToJSONTyped,
} from './CatalogsFeedProcessingSchedule';
import type { CatalogsStatus } from './CatalogsStatus';
import {
    CatalogsStatusFromJSON,
    CatalogsStatusFromJSONTyped,
    CatalogsStatusToJSON,
    CatalogsStatusToJSONTyped,
} from './CatalogsStatus';
import type { CatalogsFeedsCreateRequestDefaultLocale } from './CatalogsFeedsCreateRequestDefaultLocale';
import {
    CatalogsFeedsCreateRequestDefaultLocaleFromJSON,
    CatalogsFeedsCreateRequestDefaultLocaleFromJSONTyped,
    CatalogsFeedsCreateRequestDefaultLocaleToJSON,
    CatalogsFeedsCreateRequestDefaultLocaleToJSONTyped,
} from './CatalogsFeedsCreateRequestDefaultLocale';
import type { CatalogsFeedCredentials } from './CatalogsFeedCredentials';
import {
    CatalogsFeedCredentialsFromJSON,
    CatalogsFeedCredentialsFromJSONTyped,
    CatalogsFeedCredentialsToJSON,
    CatalogsFeedCredentialsToJSONTyped,
} from './CatalogsFeedCredentials';
import type { CatalogsType } from './CatalogsType';
import {
    CatalogsTypeFromJSON,
    CatalogsTypeFromJSONTyped,
    CatalogsTypeToJSON,
    CatalogsTypeToJSONTyped,
} from './CatalogsType';
import type { CatalogsFormat } from './CatalogsFormat';
import {
    CatalogsFormatFromJSON,
    CatalogsFormatFromJSONTyped,
    CatalogsFormatToJSON,
    CatalogsFormatToJSONTyped,
} from './CatalogsFormat';
import type { NullableCurrency } from './NullableCurrency';
import {
    NullableCurrencyFromJSON,
    NullableCurrencyFromJSONTyped,
    NullableCurrencyToJSON,
    NullableCurrencyToJSONTyped,
} from './NullableCurrency';

/**
 * Request object for creating a feed. Please, be aware that "default_country" and "default_locale" are not required in the spec for forward compatibility but for now the API will not accept requests without those fields.
 * @export
 * @interface CatalogsHotelFeedsCreateRequest
 */
export interface CatalogsHotelFeedsCreateRequest {
    /**
     * 
     * @type {NullableCurrency}
     * @memberof CatalogsHotelFeedsCreateRequest
     */
    defaultCurrency?: NullableCurrency | null;
    /**
     * A human-friendly name associated to a given feed.
     * @type {string}
     * @memberof CatalogsHotelFeedsCreateRequest
     */
    name: string;
    /**
     * 
     * @type {CatalogsFormat}
     * @memberof CatalogsHotelFeedsCreateRequest
     */
    format: CatalogsFormat;
    /**
     * 
     * @type {CatalogsFeedsCreateRequestDefaultLocale}
     * @memberof CatalogsHotelFeedsCreateRequest
     */
    defaultLocale: CatalogsFeedsCreateRequestDefaultLocale;
    /**
     * 
     * @type {CatalogsFeedCredentials}
     * @memberof CatalogsHotelFeedsCreateRequest
     */
    credentials?: CatalogsFeedCredentials | null;
    /**
     * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
     * @type {string}
     * @memberof CatalogsHotelFeedsCreateRequest
     */
    location: string;
    /**
     * 
     * @type {CatalogsFeedProcessingSchedule}
     * @memberof CatalogsHotelFeedsCreateRequest
     */
    preferredProcessingSchedule?: CatalogsFeedProcessingSchedule | null;
    /**
     * 
     * @type {CatalogsType}
     * @memberof CatalogsHotelFeedsCreateRequest
     */
    catalogType: CatalogsType;
    /**
     * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future.
     * @type {string}
     * @memberof CatalogsHotelFeedsCreateRequest
     */
    catalogId?: string | null;
    /**
     * 
     * @type {CatalogsStatus}
     * @memberof CatalogsHotelFeedsCreateRequest
     */
    status?: CatalogsStatus;
}



/**
 * Check if a given object implements the CatalogsHotelFeedsCreateRequest interface.
 */
export function instanceOfCatalogsHotelFeedsCreateRequest(value: object): value is CatalogsHotelFeedsCreateRequest {
    if (!('name' in value) || value['name'] === undefined) return false;
    if (!('format' in value) || value['format'] === undefined) return false;
    if (!('defaultLocale' in value) || value['defaultLocale'] === undefined) return false;
    if (!('location' in value) || value['location'] === undefined) return false;
    if (!('catalogType' in value) || value['catalogType'] === undefined) return false;
    return true;
}

export function CatalogsHotelFeedsCreateRequestFromJSON(json: any): CatalogsHotelFeedsCreateRequest {
    return CatalogsHotelFeedsCreateRequestFromJSONTyped(json, false);
}

export function CatalogsHotelFeedsCreateRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CatalogsHotelFeedsCreateRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'defaultCurrency': json['default_currency'] == null ? undefined : NullableCurrencyFromJSON(json['default_currency']),
        'name': json['name'],
        'format': CatalogsFormatFromJSON(json['format']),
        'defaultLocale': CatalogsFeedsCreateRequestDefaultLocaleFromJSON(json['default_locale']),
        'credentials': json['credentials'] == null ? undefined : CatalogsFeedCredentialsFromJSON(json['credentials']),
        'location': json['location'],
        'preferredProcessingSchedule': json['preferred_processing_schedule'] == null ? undefined : CatalogsFeedProcessingScheduleFromJSON(json['preferred_processing_schedule']),
        'catalogType': CatalogsTypeFromJSON(json['catalog_type']),
        'catalogId': json['catalog_id'] == null ? undefined : json['catalog_id'],
        'status': json['status'] == null ? undefined : CatalogsStatusFromJSON(json['status']),
    };
}

  export function CatalogsHotelFeedsCreateRequestToJSON(json: any): CatalogsHotelFeedsCreateRequest {
      return CatalogsHotelFeedsCreateRequestToJSONTyped(json, false);
  }

  export function CatalogsHotelFeedsCreateRequestToJSONTyped(value?: CatalogsHotelFeedsCreateRequest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'default_currency': NullableCurrencyToJSON(value['defaultCurrency']),
        'name': value['name'],
        'format': CatalogsFormatToJSON(value['format']),
        'default_locale': CatalogsFeedsCreateRequestDefaultLocaleToJSON(value['defaultLocale']),
        'credentials': CatalogsFeedCredentialsToJSON(value['credentials']),
        'location': value['location'],
        'preferred_processing_schedule': CatalogsFeedProcessingScheduleToJSON(value['preferredProcessingSchedule']),
        'catalog_type': CatalogsTypeToJSON(value['catalogType']),
        'catalog_id': value['catalogId'],
        'status': CatalogsStatusToJSON(value['status']),
    };
}

