/*
 * item_response_any_of_1.h
 *
 * 
 */

#ifndef _item_response_any_of_1_H_
#define _item_response_any_of_1_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_response_any_of_1_t item_response_any_of_1_t;

#include "catalogs_creative_assets_item_error_response.h"
#include "catalogs_hotel_item_error_response.h"
#include "catalogs_retail_item_error_response.h"
#include "catalogs_type.h"
#include "item_validation_event.h"

// Enum  for item_response_any_of_1

typedef enum  { pinterest_rest_api_item_response_any_of_1__NULL = 0, pinterest_rest_api_item_response_any_of_1__RETAIL, pinterest_rest_api_item_response_any_of_1__HOTEL, pinterest_rest_api_item_response_any_of_1__CREATIVE_ASSETS } pinterest_rest_api_item_response_any_of_1__e;

char* item_response_any_of_1_catalog_type_ToString(pinterest_rest_api_item_response_any_of_1__e catalog_type);

pinterest_rest_api_item_response_any_of_1__e item_response_any_of_1_catalog_type_FromString(char* catalog_type);



typedef struct item_response_any_of_1_t {
    catalogs_type_t *catalog_type; // custom
    char *item_id; // string
    list_t *errors; //nonprimitive container
    char *hotel_id; // string
    char *creative_assets_id; // string

} item_response_any_of_1_t;

item_response_any_of_1_t *item_response_any_of_1_create(
    catalogs_type_t *catalog_type,
    char *item_id,
    list_t *errors,
    char *hotel_id,
    char *creative_assets_id
);

void item_response_any_of_1_free(item_response_any_of_1_t *item_response_any_of_1);

item_response_any_of_1_t *item_response_any_of_1_parseFromJSON(cJSON *item_response_any_of_1JSON);

cJSON *item_response_any_of_1_convertToJSON(item_response_any_of_1_t *item_response_any_of_1);

#endif /* _item_response_any_of_1_H_ */

