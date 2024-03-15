/*
 * catalogs_hotel_attributes_all_of_main_image.h
 *
 * The main hotel image
 */

#ifndef _catalogs_hotel_attributes_all_of_main_image_H_
#define _catalogs_hotel_attributes_all_of_main_image_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_attributes_all_of_main_image_t catalogs_hotel_attributes_all_of_main_image_t;




typedef struct catalogs_hotel_attributes_all_of_main_image_t {
    char *link; // string
    list_t *tag; //primitive container

} catalogs_hotel_attributes_all_of_main_image_t;

catalogs_hotel_attributes_all_of_main_image_t *catalogs_hotel_attributes_all_of_main_image_create(
    char *link,
    list_t *tag
);

void catalogs_hotel_attributes_all_of_main_image_free(catalogs_hotel_attributes_all_of_main_image_t *catalogs_hotel_attributes_all_of_main_image);

catalogs_hotel_attributes_all_of_main_image_t *catalogs_hotel_attributes_all_of_main_image_parseFromJSON(cJSON *catalogs_hotel_attributes_all_of_main_imageJSON);

cJSON *catalogs_hotel_attributes_all_of_main_image_convertToJSON(catalogs_hotel_attributes_all_of_main_image_t *catalogs_hotel_attributes_all_of_main_image);

#endif /* _catalogs_hotel_attributes_all_of_main_image_H_ */

