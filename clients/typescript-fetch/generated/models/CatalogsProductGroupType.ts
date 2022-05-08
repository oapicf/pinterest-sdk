/* tslint:disable */
/* eslint-disable */
/**
 * Pinterest REST API
 * Pinterest\'s REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/**
 * Catalog product group type
 * @export
 * @enum {string}
 */
export enum CatalogsProductGroupType {
    MerchantCreated = 'MERCHANT_CREATED',
    AllProducts = 'ALL_PRODUCTS',
    BestDeals = 'BEST_DEALS',
    PinnerFavorites = 'PINNER_FAVORITES',
    TopSellers = 'TOP_SELLERS',
    BackInStock = 'BACK_IN_STOCK',
    NewArrivals = 'NEW_ARRIVALS'
}

export function CatalogsProductGroupTypeFromJSON(json: any): CatalogsProductGroupType {
    return CatalogsProductGroupTypeFromJSONTyped(json, false);
}

export function CatalogsProductGroupTypeFromJSONTyped(json: any, ignoreDiscriminator: boolean): CatalogsProductGroupType {
    return json as CatalogsProductGroupType;
}

export function CatalogsProductGroupTypeToJSON(value?: CatalogsProductGroupType | null): any {
    return value as any;
}
