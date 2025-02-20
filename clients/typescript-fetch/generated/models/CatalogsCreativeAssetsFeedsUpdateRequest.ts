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
 * Request object for updating a feed.
 * @export
 * @interface CatalogsCreativeAssetsFeedsUpdateRequest
 */
export interface CatalogsCreativeAssetsFeedsUpdateRequest {
    /**
     * 
     * @type {NullableCurrency}
     * @memberof CatalogsCreativeAssetsFeedsUpdateRequest
     */
    defaultCurrency?: NullableCurrency | null;
    /**
     * A human-friendly name associated to a given feed.
     * @type {string}
     * @memberof CatalogsCreativeAssetsFeedsUpdateRequest
     */
    name?: string;
    /**
     * 
     * @type {CatalogsFormat}
     * @memberof CatalogsCreativeAssetsFeedsUpdateRequest
     */
    format?: CatalogsFormat;
    /**
     * 
     * @type {CatalogsFeedCredentials}
     * @memberof CatalogsCreativeAssetsFeedsUpdateRequest
     */
    credentials?: CatalogsFeedCredentials | null;
    /**
     * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
     * @type {string}
     * @memberof CatalogsCreativeAssetsFeedsUpdateRequest
     */
    location?: string;
    /**
     * 
     * @type {CatalogsFeedProcessingSchedule}
     * @memberof CatalogsCreativeAssetsFeedsUpdateRequest
     */
    preferredProcessingSchedule?: CatalogsFeedProcessingSchedule | null;
    /**
     * 
     * @type {CatalogsStatus}
     * @memberof CatalogsCreativeAssetsFeedsUpdateRequest
     */
    status?: CatalogsStatus;
    /**
     * 
     * @type {CatalogsType}
     * @memberof CatalogsCreativeAssetsFeedsUpdateRequest
     */
    catalogType: CatalogsType;
}



/**
 * Check if a given object implements the CatalogsCreativeAssetsFeedsUpdateRequest interface.
 */
export function instanceOfCatalogsCreativeAssetsFeedsUpdateRequest(value: object): value is CatalogsCreativeAssetsFeedsUpdateRequest {
    if (!('catalogType' in value) || value['catalogType'] === undefined) return false;
    return true;
}

export function CatalogsCreativeAssetsFeedsUpdateRequestFromJSON(json: any): CatalogsCreativeAssetsFeedsUpdateRequest {
    return CatalogsCreativeAssetsFeedsUpdateRequestFromJSONTyped(json, false);
}

export function CatalogsCreativeAssetsFeedsUpdateRequestFromJSONTyped(json: any, ignoreDiscriminator: boolean): CatalogsCreativeAssetsFeedsUpdateRequest {
    if (json == null) {
        return json;
    }
    return {
        
        'defaultCurrency': json['default_currency'] == null ? undefined : NullableCurrencyFromJSON(json['default_currency']),
        'name': json['name'] == null ? undefined : json['name'],
        'format': json['format'] == null ? undefined : CatalogsFormatFromJSON(json['format']),
        'credentials': json['credentials'] == null ? undefined : CatalogsFeedCredentialsFromJSON(json['credentials']),
        'location': json['location'] == null ? undefined : json['location'],
        'preferredProcessingSchedule': json['preferred_processing_schedule'] == null ? undefined : CatalogsFeedProcessingScheduleFromJSON(json['preferred_processing_schedule']),
        'status': json['status'] == null ? undefined : CatalogsStatusFromJSON(json['status']),
        'catalogType': CatalogsTypeFromJSON(json['catalog_type']),
    };
}

  export function CatalogsCreativeAssetsFeedsUpdateRequestToJSON(json: any): CatalogsCreativeAssetsFeedsUpdateRequest {
      return CatalogsCreativeAssetsFeedsUpdateRequestToJSONTyped(json, false);
  }

  export function CatalogsCreativeAssetsFeedsUpdateRequestToJSONTyped(value?: CatalogsCreativeAssetsFeedsUpdateRequest | null, ignoreDiscriminator: boolean = false): any {
    if (value == null) {
        return value;
    }

    return {
        
        'default_currency': NullableCurrencyToJSON(value['defaultCurrency']),
        'name': value['name'],
        'format': CatalogsFormatToJSON(value['format']),
        'credentials': CatalogsFeedCredentialsToJSON(value['credentials']),
        'location': value['location'],
        'preferred_processing_schedule': CatalogsFeedProcessingScheduleToJSON(value['preferredProcessingSchedule']),
        'status': CatalogsStatusToJSON(value['status']),
        'catalog_type': CatalogsTypeToJSON(value['catalogType']),
    };
}

