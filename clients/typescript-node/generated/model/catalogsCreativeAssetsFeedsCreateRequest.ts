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

import { RequestFile } from './models';
import { CatalogsFeedCredentials } from './catalogsFeedCredentials';
import { CatalogsFeedProcessingSchedule } from './catalogsFeedProcessingSchedule';
import { CatalogsFeedsCreateRequestDefaultLocale } from './catalogsFeedsCreateRequestDefaultLocale';
import { CatalogsFormat } from './catalogsFormat';
import { CatalogsStatus } from './catalogsStatus';
import { CatalogsType } from './catalogsType';
import { Country } from './country';
import { NullableCurrency } from './nullableCurrency';

/**
* Request object for creating a feed.
*/
export class CatalogsCreativeAssetsFeedsCreateRequest {
    'defaultCurrency'?: NullableCurrency | null;
    /**
    * A human-friendly name associated to a given feed.
    */
    'name': string;
    'format': CatalogsFormat;
    'defaultLocale': CatalogsFeedsCreateRequestDefaultLocale;
    'defaultCountry': Country;
    'credentials'?: CatalogsFeedCredentials | null;
    /**
    * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
    */
    'location': string;
    'preferredProcessingSchedule'?: CatalogsFeedProcessingSchedule | null;
    'catalogType': CatalogsType;
    /**
    * Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future.
    */
    'catalogId'?: string | null;
    'status'?: CatalogsStatus;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "defaultCurrency",
            "baseName": "default_currency",
            "type": "NullableCurrency"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "format",
            "baseName": "format",
            "type": "CatalogsFormat"
        },
        {
            "name": "defaultLocale",
            "baseName": "default_locale",
            "type": "CatalogsFeedsCreateRequestDefaultLocale"
        },
        {
            "name": "defaultCountry",
            "baseName": "default_country",
            "type": "Country"
        },
        {
            "name": "credentials",
            "baseName": "credentials",
            "type": "CatalogsFeedCredentials"
        },
        {
            "name": "location",
            "baseName": "location",
            "type": "string"
        },
        {
            "name": "preferredProcessingSchedule",
            "baseName": "preferred_processing_schedule",
            "type": "CatalogsFeedProcessingSchedule"
        },
        {
            "name": "catalogType",
            "baseName": "catalog_type",
            "type": "CatalogsType"
        },
        {
            "name": "catalogId",
            "baseName": "catalog_id",
            "type": "string"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "CatalogsStatus"
        }    ];

    static getAttributeTypeMap() {
        return CatalogsCreativeAssetsFeedsCreateRequest.attributeTypeMap;
    }
}

export namespace CatalogsCreativeAssetsFeedsCreateRequest {
}
