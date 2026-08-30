/*
 * catalogs_product_group_type.h
 *
 * Catalog product group type  - **MERCHANT_CREATED**: Product groups created by merchants. - **ALL_PRODUCTS**: Consists of every product in your latest successful feed upload. - **BEST_DEALS**: Consists of products with the deepest drop in price. - **PINNER_FAVORITES**: Consists of products that are resonating most with people on Pinterest, based on engagement. - **TOP_SELLERS**: Consists of products with the highest conversion rate, if you have the conversion tag installed. - **BACK_IN_STOCK**: Consists of products that were previously out of stock and are now in stock. - **NEW_ARRIVALS**: Consists of products that are new to your Catalog. - **SHOPIFY_COLLECTIONS**: Product groups created based on Shopify Product Collections. - **I2PC**: Product groups created based on predicted product category. - **CATALOG_EXPANSION**: Consists of high-potential, recommended products from your catalog.
 */

#ifndef _catalogs_product_group_type_H_
#define _catalogs_product_group_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_group_type_t catalogs_product_group_type_t;


// Enum  for catalogs_product_group_type

typedef enum { pinterest_rest_api_catalogs_product_group_type__NULL = 0, pinterest_rest_api_catalogs_product_group_type__MERCHANT_CREATED, pinterest_rest_api_catalogs_product_group_type__ALL_PRODUCTS, pinterest_rest_api_catalogs_product_group_type__BEST_DEALS, pinterest_rest_api_catalogs_product_group_type__PINNER_FAVORITES, pinterest_rest_api_catalogs_product_group_type__TOP_SELLERS, pinterest_rest_api_catalogs_product_group_type__BACK_IN_STOCK, pinterest_rest_api_catalogs_product_group_type__NEW_ARRIVALS, pinterest_rest_api_catalogs_product_group_type__SHOPIFY_COLLECTIONS, pinterest_rest_api_catalogs_product_group_type__I2PC, pinterest_rest_api_catalogs_product_group_type__CATALOG_EXPANSION } pinterest_rest_api_catalogs_product_group_type__e;

char* catalogs_product_group_type_catalogs_product_group_type_ToString(pinterest_rest_api_catalogs_product_group_type__e catalogs_product_group_type);

pinterest_rest_api_catalogs_product_group_type__e catalogs_product_group_type_catalogs_product_group_type_FromString(char* catalogs_product_group_type);

cJSON *catalogs_product_group_type_convertToJSON(pinterest_rest_api_catalogs_product_group_type__e catalogs_product_group_type);

pinterest_rest_api_catalogs_product_group_type__e catalogs_product_group_type_parseFromJSON(cJSON *catalogs_product_group_typeJSON);

#endif /* _catalogs_product_group_type_H_ */

