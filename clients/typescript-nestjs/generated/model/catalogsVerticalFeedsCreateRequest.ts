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
import { CatalogsFeedProcessingSchedule } from './catalogsFeedProcessingSchedule';
import { ProductAvailabilityType } from './productAvailabilityType';
import { CatalogsHotelFeedsCreateRequest } from './catalogsHotelFeedsCreateRequest';
import { CatalogsFeedsCreateRequestDefaultLocale } from './catalogsFeedsCreateRequestDefaultLocale';
import { CatalogsCreativeAssetsFeedsCreateRequest } from './catalogsCreativeAssetsFeedsCreateRequest';
import { CatalogsFeedCredentials } from './catalogsFeedCredentials';
import { CatalogsRetailFeedsCreateRequest } from './catalogsRetailFeedsCreateRequest';
import { CatalogsType } from './catalogsType';
import { Country } from './country';
import { CatalogsFormat } from './catalogsFormat';
import { CatalogsStatus &amp; object } from './catalogsStatusObject';
import { NullableCurrency } from './nullableCurrency';


/**
 * Request object for creating a feed.
 */
/**
 * @type CatalogsVerticalFeedsCreateRequest
 * Request object for creating a feed.
 * @export
 */
export type CatalogsVerticalFeedsCreateRequest = CatalogsCreativeAssetsFeedsCreateRequest | CatalogsHotelFeedsCreateRequest | CatalogsRetailFeedsCreateRequest;

