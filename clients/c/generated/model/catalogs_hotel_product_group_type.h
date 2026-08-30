/*
 * catalogs_hotel_product_group_type.h
 *
 * Catalog hotel product group type
 */

#ifndef _catalogs_hotel_product_group_type_H_
#define _catalogs_hotel_product_group_type_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_product_group_type_t catalogs_hotel_product_group_type_t;


// Enum  for catalogs_hotel_product_group_type

typedef enum { pinterest_rest_api_catalogs_hotel_product_group_type__NULL = 0, pinterest_rest_api_catalogs_hotel_product_group_type__MERCHANT_CREATED, pinterest_rest_api_catalogs_hotel_product_group_type__ALL_LISTINGS } pinterest_rest_api_catalogs_hotel_product_group_type__e;

char* catalogs_hotel_product_group_type_catalogs_hotel_product_group_type_ToString(pinterest_rest_api_catalogs_hotel_product_group_type__e catalogs_hotel_product_group_type);

pinterest_rest_api_catalogs_hotel_product_group_type__e catalogs_hotel_product_group_type_catalogs_hotel_product_group_type_FromString(char* catalogs_hotel_product_group_type);

cJSON *catalogs_hotel_product_group_type_convertToJSON(pinterest_rest_api_catalogs_hotel_product_group_type__e catalogs_hotel_product_group_type);

pinterest_rest_api_catalogs_hotel_product_group_type__e catalogs_hotel_product_group_type_parseFromJSON(cJSON *catalogs_hotel_product_group_typeJSON);

#endif /* _catalogs_hotel_product_group_type_H_ */

