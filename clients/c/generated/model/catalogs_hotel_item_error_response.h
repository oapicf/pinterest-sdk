/*
 * catalogs_hotel_item_error_response.h
 *
 * Object describing a hotel item error
 */

#ifndef _catalogs_hotel_item_error_response_H_
#define _catalogs_hotel_item_error_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_item_error_response_t catalogs_hotel_item_error_response_t;

#include "catalogs_type.h"
#include "item_validation_event.h"



typedef struct catalogs_hotel_item_error_response_t {
    pinterest_rest_api_catalogs_type__e catalog_type; //referenced enum
    list_t *errors; //nonprimitive container
    char *hotel_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_hotel_item_error_response_t;

__attribute__((deprecated)) catalogs_hotel_item_error_response_t *catalogs_hotel_item_error_response_create(
    pinterest_rest_api_catalogs_type__e catalog_type,
    list_t *errors,
    char *hotel_id
);

void catalogs_hotel_item_error_response_free(catalogs_hotel_item_error_response_t *catalogs_hotel_item_error_response);

catalogs_hotel_item_error_response_t *catalogs_hotel_item_error_response_parseFromJSON(cJSON *catalogs_hotel_item_error_responseJSON);

cJSON *catalogs_hotel_item_error_response_convertToJSON(catalogs_hotel_item_error_response_t *catalogs_hotel_item_error_response);

#endif /* _catalogs_hotel_item_error_response_H_ */

