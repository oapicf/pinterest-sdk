/*
 * catalogs_hotel_address.h
 *
 * 
 */

#ifndef _catalogs_hotel_address_H_
#define _catalogs_hotel_address_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_address_t catalogs_hotel_address_t;




typedef struct catalogs_hotel_address_t {
    char *addr1; // string
    char *city; // string
    char *country; // string
    char *postal_code; // string
    char *region; // string

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_hotel_address_t;

__attribute__((deprecated)) catalogs_hotel_address_t *catalogs_hotel_address_create(
    char *addr1,
    char *city,
    char *country,
    char *postal_code,
    char *region
);

void catalogs_hotel_address_free(catalogs_hotel_address_t *catalogs_hotel_address);

catalogs_hotel_address_t *catalogs_hotel_address_parseFromJSON(cJSON *catalogs_hotel_addressJSON);

cJSON *catalogs_hotel_address_convertToJSON(catalogs_hotel_address_t *catalogs_hotel_address);

#endif /* _catalogs_hotel_address_H_ */

