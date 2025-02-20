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
import { CatalogsCreativeAssetsProductGroupFilters } from './catalogsCreativeAssetsProductGroupFilters';
import { CatalogsCreativeAssetsProductGroupUpdateRequest } from './catalogsCreativeAssetsProductGroupUpdateRequest';
import { CatalogsHotelProductGroupUpdateRequest } from './catalogsHotelProductGroupUpdateRequest';
import { CatalogsLocale } from './catalogsLocale';
import { CatalogsRetailProductGroupUpdateRequest } from './catalogsRetailProductGroupUpdateRequest';
import { Country } from './country';


/**
 * Request object for updating a catalog based product group.
 */
/**
 * @type CatalogsVerticalProductGroupUpdateRequest
 * Request object for updating a catalog based product group.
 * @export
 */
export type CatalogsVerticalProductGroupUpdateRequest = CatalogsCreativeAssetsProductGroupUpdateRequest | CatalogsHotelProductGroupUpdateRequest | CatalogsRetailProductGroupUpdateRequest;

