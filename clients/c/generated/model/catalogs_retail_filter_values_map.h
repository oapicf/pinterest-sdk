/*
 * catalogs_retail_filter_values_map.h
 *
 * A map of filter attributes to their available values.
 */

#ifndef _catalogs_retail_filter_values_map_H_
#define _catalogs_retail_filter_values_map_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_retail_filter_values_map_t catalogs_retail_filter_values_map_t;


// Enum AVAILABILITY for catalogs_retail_filter_values_map

typedef enum  { pinterest_rest_api_catalogs_retail_filter_values_map_AVAILABILITY_NULL = 0, pinterest_rest_api_catalogs_retail_filter_values_map_AVAILABILITY_IN_STOCK, pinterest_rest_api_catalogs_retail_filter_values_map_AVAILABILITY_OUT_OF_STOCK, pinterest_rest_api_catalogs_retail_filter_values_map_AVAILABILITY_PREORDER, pinterest_rest_api_catalogs_retail_filter_values_map_AVAILABILITY_UNAVAILABLE } pinterest_rest_api_catalogs_retail_filter_values_map_AVAILABILITY_e;

char* catalogs_retail_filter_values_map_availability_ToString(pinterest_rest_api_catalogs_retail_filter_values_map_AVAILABILITY_e availability);

pinterest_rest_api_catalogs_retail_filter_values_map_AVAILABILITY_e catalogs_retail_filter_values_map_availability_FromString(char* availability);

// Enum CONDITION for catalogs_retail_filter_values_map

typedef enum  { pinterest_rest_api_catalogs_retail_filter_values_map_CONDITION_NULL = 0, pinterest_rest_api_catalogs_retail_filter_values_map_CONDITION__NEW, pinterest_rest_api_catalogs_retail_filter_values_map_CONDITION_USED, pinterest_rest_api_catalogs_retail_filter_values_map_CONDITION_REFURBISHED } pinterest_rest_api_catalogs_retail_filter_values_map_CONDITION_e;

char* catalogs_retail_filter_values_map_condition_ToString(pinterest_rest_api_catalogs_retail_filter_values_map_CONDITION_e condition);

pinterest_rest_api_catalogs_retail_filter_values_map_CONDITION_e catalogs_retail_filter_values_map_condition_FromString(char* condition);

// Enum GENDER for catalogs_retail_filter_values_map

typedef enum  { pinterest_rest_api_catalogs_retail_filter_values_map_GENDER_NULL = 0, pinterest_rest_api_catalogs_retail_filter_values_map_GENDER_FEMALE, pinterest_rest_api_catalogs_retail_filter_values_map_GENDER_MALE, pinterest_rest_api_catalogs_retail_filter_values_map_GENDER_UNISEX } pinterest_rest_api_catalogs_retail_filter_values_map_GENDER_e;

char* catalogs_retail_filter_values_map_gender_ToString(pinterest_rest_api_catalogs_retail_filter_values_map_GENDER_e gender);

pinterest_rest_api_catalogs_retail_filter_values_map_GENDER_e catalogs_retail_filter_values_map_gender_FromString(char* gender);

// Enum MEDIATYPE for catalogs_retail_filter_values_map

typedef enum  { pinterest_rest_api_catalogs_retail_filter_values_map_MEDIATYPE_NULL = 0, pinterest_rest_api_catalogs_retail_filter_values_map_MEDIATYPE_IMAGE, pinterest_rest_api_catalogs_retail_filter_values_map_MEDIATYPE_VIDEO } pinterest_rest_api_catalogs_retail_filter_values_map_MEDIATYPE_e;

char* catalogs_retail_filter_values_map_media_type_ToString(pinterest_rest_api_catalogs_retail_filter_values_map_MEDIATYPE_e media_type);

pinterest_rest_api_catalogs_retail_filter_values_map_MEDIATYPE_e catalogs_retail_filter_values_map_media_type_FromString(char* media_type);



typedef struct catalogs_retail_filter_values_map_t {
    list_t *ad_image_tags; //primitive container
    list_t *ad_video_tags; //primitive container
    list_t *availability; //primitive container
    list_t *brand; //primitive container
    list_t *condition; //primitive container
    list_t *custom_label_0; //primitive container
    list_t *custom_label_1; //primitive container
    list_t *custom_label_2; //primitive container
    list_t *custom_label_3; //primitive container
    list_t *custom_label_4; //primitive container
    list_t *gender; //primitive container
    list_t *google_product_category_0; //primitive container
    list_t *google_product_category_1; //primitive container
    list_t *google_product_category_2; //primitive container
    list_t *google_product_category_3; //primitive container
    list_t *google_product_category_4; //primitive container
    list_t *google_product_category_5; //primitive container
    list_t *google_product_category_6; //primitive container
    list_t *media_type; //primitive container
    list_t *product_type_0; //primitive container
    list_t *product_type_1; //primitive container
    list_t *product_type_2; //primitive container
    list_t *product_type_3; //primitive container
    list_t *product_type_4; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_retail_filter_values_map_t;

__attribute__((deprecated)) catalogs_retail_filter_values_map_t *catalogs_retail_filter_values_map_create(
    list_t *ad_image_tags,
    list_t *ad_video_tags,
    list_t *availability,
    list_t *brand,
    list_t *condition,
    list_t *custom_label_0,
    list_t *custom_label_1,
    list_t *custom_label_2,
    list_t *custom_label_3,
    list_t *custom_label_4,
    list_t *gender,
    list_t *google_product_category_0,
    list_t *google_product_category_1,
    list_t *google_product_category_2,
    list_t *google_product_category_3,
    list_t *google_product_category_4,
    list_t *google_product_category_5,
    list_t *google_product_category_6,
    list_t *media_type,
    list_t *product_type_0,
    list_t *product_type_1,
    list_t *product_type_2,
    list_t *product_type_3,
    list_t *product_type_4
);

void catalogs_retail_filter_values_map_free(catalogs_retail_filter_values_map_t *catalogs_retail_filter_values_map);

catalogs_retail_filter_values_map_t *catalogs_retail_filter_values_map_parseFromJSON(cJSON *catalogs_retail_filter_values_mapJSON);

cJSON *catalogs_retail_filter_values_map_convertToJSON(catalogs_retail_filter_values_map_t *catalogs_retail_filter_values_map);

#endif /* _catalogs_retail_filter_values_map_H_ */

