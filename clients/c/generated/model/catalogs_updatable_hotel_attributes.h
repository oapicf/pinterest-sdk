/*
 * catalogs_updatable_hotel_attributes.h
 *
 * 
 */

#ifndef _catalogs_updatable_hotel_attributes_H_
#define _catalogs_updatable_hotel_attributes_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_updatable_hotel_attributes_t catalogs_updatable_hotel_attributes_t;

#include "catalogs_hotel_address.h"
#include "catalogs_hotel_guest_ratings.h"



typedef struct catalogs_updatable_hotel_attributes_t {
    char *name; // string
    char *link; // string
    char *description; // string
    char *brand; // string
    double latitude; //numeric
    double longitude; //numeric
    list_t *neighborhood; //primitive container
    struct catalogs_hotel_address_t *address; //model
    char *custom_label_0; // string
    char *custom_label_1; // string
    char *custom_label_2; // string
    char *custom_label_3; // string
    char *custom_label_4; // string
    char *category; // string
    char *base_price; // string
    char *sale_price; // string
    struct catalogs_hotel_guest_ratings_t *guest_ratings; //model

} catalogs_updatable_hotel_attributes_t;

catalogs_updatable_hotel_attributes_t *catalogs_updatable_hotel_attributes_create(
    char *name,
    char *link,
    char *description,
    char *brand,
    double latitude,
    double longitude,
    list_t *neighborhood,
    catalogs_hotel_address_t *address,
    char *custom_label_0,
    char *custom_label_1,
    char *custom_label_2,
    char *custom_label_3,
    char *custom_label_4,
    char *category,
    char *base_price,
    char *sale_price,
    catalogs_hotel_guest_ratings_t *guest_ratings
);

void catalogs_updatable_hotel_attributes_free(catalogs_updatable_hotel_attributes_t *catalogs_updatable_hotel_attributes);

catalogs_updatable_hotel_attributes_t *catalogs_updatable_hotel_attributes_parseFromJSON(cJSON *catalogs_updatable_hotel_attributesJSON);

cJSON *catalogs_updatable_hotel_attributes_convertToJSON(catalogs_updatable_hotel_attributes_t *catalogs_updatable_hotel_attributes);

#endif /* _catalogs_updatable_hotel_attributes_H_ */

