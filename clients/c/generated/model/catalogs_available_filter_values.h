/*
 * catalogs_available_filter_values.h
 *
 * Object holding available filter values for each filter key
 */

#ifndef _catalogs_available_filter_values_H_
#define _catalogs_available_filter_values_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_available_filter_values_t catalogs_available_filter_values_t;

#include "catalogs_creative_assets_available_filter_values.h"
#include "catalogs_creative_assets_filter_values_map.h"
#include "catalogs_hotel_available_filter_values.h"
#include "catalogs_retail_available_filter_values.h"

// Enum CATALOGTYPE for catalogs_available_filter_values

typedef enum  { pinterest_rest_api_catalogs_available_filter_values_CATALOGTYPE_NULL = 0, pinterest_rest_api_catalogs_available_filter_values_CATALOGTYPE_CREATIVE_ASSETS } pinterest_rest_api_catalogs_available_filter_values_CATALOGTYPE_e;

char* catalogs_available_filter_values_catalog_type_ToString(pinterest_rest_api_catalogs_available_filter_values_CATALOGTYPE_e catalog_type);

pinterest_rest_api_catalogs_available_filter_values_CATALOGTYPE_e catalogs_available_filter_values_catalog_type_FromString(char* catalog_type);



typedef struct catalogs_available_filter_values_t {
    pinterest_rest_api_catalogs_available_filter_values_CATALOGTYPE_e catalog_type; //enum
    struct catalogs_creative_assets_filter_values_map_t *filter_values; //model

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_available_filter_values_t;

__attribute__((deprecated)) catalogs_available_filter_values_t *catalogs_available_filter_values_create(
    pinterest_rest_api_catalogs_available_filter_values_CATALOGTYPE_e catalog_type,
    catalogs_creative_assets_filter_values_map_t *filter_values
);

void catalogs_available_filter_values_free(catalogs_available_filter_values_t *catalogs_available_filter_values);

catalogs_available_filter_values_t *catalogs_available_filter_values_parseFromJSON(cJSON *catalogs_available_filter_valuesJSON);

cJSON *catalogs_available_filter_values_convertToJSON(catalogs_available_filter_values_t *catalogs_available_filter_values);

#endif /* _catalogs_available_filter_values_H_ */

