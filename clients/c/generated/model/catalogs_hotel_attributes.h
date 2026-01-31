/*
 * catalogs_hotel_attributes.h
 *
 * 
 */

#ifndef _catalogs_hotel_attributes_H_
#define _catalogs_hotel_attributes_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_attributes_t catalogs_hotel_attributes_t;

#include "catalogs_hotel_address.h"
#include "catalogs_hotel_attributes_all_of_main_image.h"
#include "catalogs_hotel_guest_ratings.h"



typedef struct catalogs_hotel_attributes_t {
    struct catalogs_hotel_address_t *address; //model
    char *base_price; // string
    char *brand; // string
    char *category; // string
    char *custom_label_0; // string
    char *custom_label_1; // string
    char *custom_label_2; // string
    char *custom_label_3; // string
    char *custom_label_4; // string
    char *description; // string
    struct catalogs_hotel_guest_ratings_t *guest_ratings; //model
    double latitude; //numeric
    char *link; // string
    double longitude; //numeric
    char *name; // string
    list_t *neighborhood; //primitive container
    char *sale_price; // string
    list_t *additional_image_link; //primitive container
    struct catalogs_hotel_attributes_all_of_main_image_t *main_image; //model

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_hotel_attributes_t;

__attribute__((deprecated)) catalogs_hotel_attributes_t *catalogs_hotel_attributes_create(
    catalogs_hotel_address_t *address,
    char *base_price,
    char *brand,
    char *category,
    char *custom_label_0,
    char *custom_label_1,
    char *custom_label_2,
    char *custom_label_3,
    char *custom_label_4,
    char *description,
    catalogs_hotel_guest_ratings_t *guest_ratings,
    double latitude,
    char *link,
    double longitude,
    char *name,
    list_t *neighborhood,
    char *sale_price,
    list_t *additional_image_link,
    catalogs_hotel_attributes_all_of_main_image_t *main_image
);

void catalogs_hotel_attributes_free(catalogs_hotel_attributes_t *catalogs_hotel_attributes);

catalogs_hotel_attributes_t *catalogs_hotel_attributes_parseFromJSON(cJSON *catalogs_hotel_attributesJSON);

cJSON *catalogs_hotel_attributes_convertToJSON(catalogs_hotel_attributes_t *catalogs_hotel_attributes);

#endif /* _catalogs_hotel_attributes_H_ */

