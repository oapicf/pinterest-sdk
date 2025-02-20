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
import { CatalogsCreativeAssetsFeedsCreateRequest } from './catalogsCreativeAssetsFeedsCreateRequest';
import { CatalogsFeedCredentials } from './catalogsFeedCredentials';
import { CatalogsFeedProcessingSchedule } from './catalogsFeedProcessingSchedule';
import { CatalogsFeedsCreateRequestDefaultLocale } from './catalogsFeedsCreateRequestDefaultLocale';
import { CatalogsFormat } from './catalogsFormat';
import { CatalogsHotelFeedsCreateRequest } from './catalogsHotelFeedsCreateRequest';
import { CatalogsRetailFeedsCreateRequest } from './catalogsRetailFeedsCreateRequest';
import { CatalogsStatus &amp; object } from './catalogsStatus  object';
import { CatalogsType } from './catalogsType';
import { Country } from './country';
import { NullableCurrency } from './nullableCurrency';
import { ProductAvailabilityType } from './productAvailabilityType';


/**
 * Request object for creating a feed.
 */
/**
 * @type CatalogsVerticalFeedsCreateRequest
 * Request object for creating a feed.
 * @export
 */
export type CatalogsVerticalFeedsCreateRequest = CatalogsCreativeAssetsFeedsCreateRequest | CatalogsHotelFeedsCreateRequest | CatalogsRetailFeedsCreateRequest;

