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
import { ProductAvailabilityType } from './productAvailabilityType';

/**
* Request object for creating a retail feed.
*/
export class CatalogsRetailFeedsCreateRequest {
    'defaultCurrency'?: NullableCurrency | null;
    /**
    * A human-friendly name associated to a given feed.
    */
    'name': string;
    'format': CatalogsFormat;
    'defaultLocale': CatalogsFeedsCreateRequestDefaultLocale;
    'credentials'?: CatalogsFeedCredentials | null;
    /**
    * The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing.
    */
    'location': string;
    'preferredProcessingSchedule'?: CatalogsFeedProcessingSchedule | null;
    'catalogType': CatalogsType;
    'defaultCountry': Country;
    'defaultAvailability'?: ProductAvailabilityType | null;
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
            "name": "defaultCountry",
            "baseName": "default_country",
            "type": "Country"
        },
        {
            "name": "defaultAvailability",
            "baseName": "default_availability",
            "type": "ProductAvailabilityType"
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "CatalogsStatus"
        }    ];

    static getAttributeTypeMap() {
        return CatalogsRetailFeedsCreateRequest.attributeTypeMap;
    }
}

export namespace CatalogsRetailFeedsCreateRequest {
}
