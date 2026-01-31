/*
 * catalogs_hotel_filter_values_map.h
 *
 * A map of filter attributes to their available values.
 */

#ifndef _catalogs_hotel_filter_values_map_H_
#define _catalogs_hotel_filter_values_map_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_filter_values_map_t catalogs_hotel_filter_values_map_t;




typedef struct catalogs_hotel_filter_values_map_t {
    list_t *brand; //primitive container
    list_t *custom_label_0; //primitive container
    list_t *custom_label_1; //primitive container
    list_t *custom_label_2; //primitive container
    list_t *custom_label_3; //primitive container
    list_t *custom_label_4; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_hotel_filter_values_map_t;

__attribute__((deprecated)) catalogs_hotel_filter_values_map_t *catalogs_hotel_filter_values_map_create(
    list_t *brand,
    list_t *custom_label_0,
    list_t *custom_label_1,
    list_t *custom_label_2,
    list_t *custom_label_3,
    list_t *custom_label_4
);

void catalogs_hotel_filter_values_map_free(catalogs_hotel_filter_values_map_t *catalogs_hotel_filter_values_map);

catalogs_hotel_filter_values_map_t *catalogs_hotel_filter_values_map_parseFromJSON(cJSON *catalogs_hotel_filter_values_mapJSON);

cJSON *catalogs_hotel_filter_values_map_convertToJSON(catalogs_hotel_filter_values_map_t *catalogs_hotel_filter_values_map);

#endif /* _catalogs_hotel_filter_values_map_H_ */

