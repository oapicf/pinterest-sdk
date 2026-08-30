/*
 * catalogs_creative_assets_filter_values_map.h
 *
 * A map of filter attributes to their available values.
 */

#ifndef _catalogs_creative_assets_filter_values_map_H_
#define _catalogs_creative_assets_filter_values_map_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_creative_assets_filter_values_map_t catalogs_creative_assets_filter_values_map_t;

#include "media_type.h"

// Enum  for catalogs_creative_assets_filter_values_map

typedef enum  { pinterest_rest_api_catalogs_creative_assets_filter_values_map__NULL = 0, pinterest_rest_api_catalogs_creative_assets_filter_values_map__IMAGE, pinterest_rest_api_catalogs_creative_assets_filter_values_map__VIDEO } pinterest_rest_api_catalogs_creative_assets_filter_values_map__e;

char* catalogs_creative_assets_filter_values_map_media_type_ToString(pinterest_rest_api_catalogs_creative_assets_filter_values_map__e media_type);

pinterest_rest_api_catalogs_creative_assets_filter_values_map__e catalogs_creative_assets_filter_values_map_media_type_FromString(char* media_type);



typedef struct catalogs_creative_assets_filter_values_map_t {
    list_t *custom_label_0; //primitive container
    list_t *custom_label_1; //primitive container
    list_t *custom_label_2; //primitive container
    list_t *custom_label_3; //primitive container
    list_t *custom_label_4; //primitive container
    list_t *google_product_category_0; //primitive container
    list_t *google_product_category_1; //primitive container
    list_t *google_product_category_2; //primitive container
    list_t *google_product_category_3; //primitive container
    list_t *google_product_category_4; //primitive container
    list_t *google_product_category_5; //primitive container
    list_t *google_product_category_6; //primitive container
    list_t *media_type; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_creative_assets_filter_values_map_t;

__attribute__((deprecated)) catalogs_creative_assets_filter_values_map_t *catalogs_creative_assets_filter_values_map_create(
    list_t *custom_label_0,
    list_t *custom_label_1,
    list_t *custom_label_2,
    list_t *custom_label_3,
    list_t *custom_label_4,
    list_t *google_product_category_0,
    list_t *google_product_category_1,
    list_t *google_product_category_2,
    list_t *google_product_category_3,
    list_t *google_product_category_4,
    list_t *google_product_category_5,
    list_t *google_product_category_6,
    list_t *media_type
);

void catalogs_creative_assets_filter_values_map_free(catalogs_creative_assets_filter_values_map_t *catalogs_creative_assets_filter_values_map);

catalogs_creative_assets_filter_values_map_t *catalogs_creative_assets_filter_values_map_parseFromJSON(cJSON *catalogs_creative_assets_filter_values_mapJSON);

cJSON *catalogs_creative_assets_filter_values_map_convertToJSON(catalogs_creative_assets_filter_values_map_t *catalogs_creative_assets_filter_values_map);

#endif /* _catalogs_creative_assets_filter_values_map_H_ */

