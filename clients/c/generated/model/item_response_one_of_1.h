/*
 * item_response_one_of_1.h
 *
 * Error item response
 */

#ifndef _item_response_one_of_1_H_
#define _item_response_one_of_1_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_response_one_of_1_t item_response_one_of_1_t;

#include "catalogs_creative_assets_item_error_response.h"
#include "catalogs_hotel_item_error_response.h"
#include "catalogs_retail_item_error_response.h"
#include "catalogs_type.h"
#include "item_validation_event.h"



typedef struct item_response_one_of_1_t {
    pinterest_rest_api_catalogs_type__e catalog_type; //referenced enum
    list_t *errors; //nonprimitive container
    char *item_id; // string
    char *hotel_id; // string
    char *creative_assets_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} item_response_one_of_1_t;

__attribute__((deprecated)) item_response_one_of_1_t *item_response_one_of_1_create(
    pinterest_rest_api_catalogs_type__e catalog_type,
    list_t *errors,
    char *item_id,
    char *hotel_id,
    char *creative_assets_id
);

void item_response_one_of_1_free(item_response_one_of_1_t *item_response_one_of_1);

item_response_one_of_1_t *item_response_one_of_1_parseFromJSON(cJSON *item_response_one_of_1JSON);

cJSON *item_response_one_of_1_convertToJSON(item_response_one_of_1_t *item_response_one_of_1);

#endif /* _item_response_one_of_1_H_ */

