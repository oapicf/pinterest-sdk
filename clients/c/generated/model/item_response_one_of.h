/*
 * item_response_one_of.h
 *
 * Successful item response
 */

#ifndef _item_response_one_of_H_
#define _item_response_one_of_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_response_one_of_t item_response_one_of_t;

#include "catalogs_creative_assets_attributes.h"
#include "catalogs_creative_assets_item_response.h"
#include "catalogs_hotel_item_response.h"
#include "catalogs_retail_item_response.h"
#include "catalogs_type.h"
#include "pin.h"



typedef struct item_response_one_of_t {
    pinterest_rest_api_catalogs_type__e catalog_type; //referenced enum
    struct catalogs_creative_assets_attributes_t *attributes; //model
    char *item_id; // string
    list_t *pins; //nonprimitive container
    char *hotel_id; // string
    char *creative_assets_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} item_response_one_of_t;

__attribute__((deprecated)) item_response_one_of_t *item_response_one_of_create(
    pinterest_rest_api_catalogs_type__e catalog_type,
    catalogs_creative_assets_attributes_t *attributes,
    char *item_id,
    list_t *pins,
    char *hotel_id,
    char *creative_assets_id
);

void item_response_one_of_free(item_response_one_of_t *item_response_one_of);

item_response_one_of_t *item_response_one_of_parseFromJSON(cJSON *item_response_one_ofJSON);

cJSON *item_response_one_of_convertToJSON(item_response_one_of_t *item_response_one_of);

#endif /* _item_response_one_of_H_ */

