/*
 * catalogs_hotel_available_filter_values.h
 *
 * 
 */

#ifndef _catalogs_hotel_available_filter_values_H_
#define _catalogs_hotel_available_filter_values_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_available_filter_values_t catalogs_hotel_available_filter_values_t;

#include "catalogs_hotel_filter_values_map.h"

// Enum CATALOGTYPE for catalogs_hotel_available_filter_values

typedef enum  { pinterest_rest_api_catalogs_hotel_available_filter_values_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_hotel_available_filter_values_CATALOGTYPE_HOTEL } pinterest_rest_api_catalogs_hotel_available_filter_values_CATALOGTYPE_e;

char* catalogs_hotel_available_filter_values_catalog_type_ToString(pinterest_rest_api_catalogs_hotel_available_filter_values_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_hotel_available_filter_values_CATALOGTYPE_e catalogs_hotel_available_filter_values_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_hotel_available_filter_values_t {
    pinterest_rest_api_catalogs_hotel_available_filter_values_CATALOGTYPE_e catalog_type; //enum
    struct catalogs_hotel_filter_values_map_t *filter_values; //model

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_hotel_available_filter_values_t;

__attribute__((deprecated)) catalogs_hotel_available_filter_values_t *catalogs_hotel_available_filter_values_create(
    pinterest_rest_api_catalogs_hotel_available_filter_values_CATALOGTYPE_e catalog_type,
    catalogs_hotel_filter_values_map_t *filter_values
);

void catalogs_hotel_available_filter_values_free(catalogs_hotel_available_filter_values_t *catalogs_hotel_available_filter_values);

catalogs_hotel_available_filter_values_t *catalogs_hotel_available_filter_values_parseFromJSON(cJSON *catalogs_hotel_available_filter_valuesJSON);

cJSON *catalogs_hotel_available_filter_values_convertToJSON(catalogs_hotel_available_filter_values_t *catalogs_hotel_available_filter_values);

#endif /* _catalogs_hotel_available_filter_values_H_ */

