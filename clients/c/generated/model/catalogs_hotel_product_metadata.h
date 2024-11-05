/*
 * catalogs_hotel_product_metadata.h
 *
 * Hotel product metadata entity
 */

#ifndef _catalogs_hotel_product_metadata_H_
#define _catalogs_hotel_product_metadata_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_hotel_product_metadata_t catalogs_hotel_product_metadata_t;




typedef struct catalogs_hotel_product_metadata_t {
    char *hotel_id; // string

} catalogs_hotel_product_metadata_t;

catalogs_hotel_product_metadata_t *catalogs_hotel_product_metadata_create(
    char *hotel_id
);

void catalogs_hotel_product_metadata_free(catalogs_hotel_product_metadata_t *catalogs_hotel_product_metadata);

catalogs_hotel_product_metadata_t *catalogs_hotel_product_metadata_parseFromJSON(cJSON *catalogs_hotel_product_metadataJSON);

cJSON *catalogs_hotel_product_metadata_convertToJSON(catalogs_hotel_product_metadata_t *catalogs_hotel_product_metadata);

#endif /* _catalogs_hotel_product_metadata_H_ */

