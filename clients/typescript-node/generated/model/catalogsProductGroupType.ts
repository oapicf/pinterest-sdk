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

/**
* <p>Catalog product group type</p> <p>MERCHANT_CREATED: Product groups created by merchants. <br>ALL_PRODUCTS: Consists of every product in your latest successful feed upload. <br>BEST_DEALS: Consists of products with the deepest drop in price. <br>PINNER_FAVORITES: Consists of products that are resonating most with people on Pinterest, based on engagement. <br>TOP_SELLERS: Consists of products with the highest conversion rate, if you have the conversion tag installed. <br>BACK_IN_STOCK: Consists of products that were previously out of stock and are now in stock. <br>NEW_ARRIVALS: Consists of products that are new to your Catalog. <br>SHOPIFY_COLLECTION: Product groups created based on Shopify Product Collections. <br>I2PC: Product groups created based on predicted product category.</p>
*/
export enum CatalogsProductGroupType {
    MerchantCreated = <any> 'MERCHANT_CREATED',
    AllProducts = <any> 'ALL_PRODUCTS',
    BestDeals = <any> 'BEST_DEALS',
    PinnerFavorites = <any> 'PINNER_FAVORITES',
    TopSellers = <any> 'TOP_SELLERS',
    BackInStock = <any> 'BACK_IN_STOCK',
    NewArrivals = <any> 'NEW_ARRIVALS',
    ShopifyCollections = <any> 'SHOPIFY_COLLECTIONS',
    I2Pc = <any> 'I2PC'
}
