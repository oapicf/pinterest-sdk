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


/**
 * <p>Catalog product group type</p> <p>MERCHANT_CREATED: Product groups created by merchants. <br>ALL_PRODUCTS: Consists of every product in your latest successful feed upload. <br>BEST_DEALS: Consists of products with the deepest drop in price. <br>PINNER_FAVORITES: Consists of products that are resonating most with people on Pinterest, based on engagement. <br>TOP_SELLERS: Consists of products with the highest conversion rate, if you have the conversion tag installed. <br>BACK_IN_STOCK: Consists of products that were previously out of stock and are now in stock. <br>NEW_ARRIVALS: Consists of products that are new to your Catalog. <br>SHOPIFY_COLLECTION: Product groups created based on Shopify Product Collections. <br>I2PC: Product groups created based on predicted product category.</p>
 */
export type CatalogsProductGroupType = 'MERCHANT_CREATED' | 'ALL_PRODUCTS' | 'BEST_DEALS' | 'PINNER_FAVORITES' | 'TOP_SELLERS' | 'BACK_IN_STOCK' | 'NEW_ARRIVALS' | 'SHOPIFY_COLLECTIONS' | 'I2PC';

export const CatalogsProductGroupType = {
    MerchantCreated: 'MERCHANT_CREATED' as CatalogsProductGroupType,
    AllProducts: 'ALL_PRODUCTS' as CatalogsProductGroupType,
    BestDeals: 'BEST_DEALS' as CatalogsProductGroupType,
    PinnerFavorites: 'PINNER_FAVORITES' as CatalogsProductGroupType,
    TopSellers: 'TOP_SELLERS' as CatalogsProductGroupType,
    BackInStock: 'BACK_IN_STOCK' as CatalogsProductGroupType,
    NewArrivals: 'NEW_ARRIVALS' as CatalogsProductGroupType,
    ShopifyCollections: 'SHOPIFY_COLLECTIONS' as CatalogsProductGroupType,
    I2Pc: 'I2PC' as CatalogsProductGroupType
};

