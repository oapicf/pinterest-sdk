/*
 * catalogs_creative_assets_product_metadata.h
 *
 * Creative assets product metadata entity
 */

#ifndef _catalogs_creative_assets_product_metadata_H_
#define _catalogs_creative_assets_product_metadata_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_creative_assets_product_metadata_t catalogs_creative_assets_product_metadata_t;

#include "creative_assets_visibility_type.h"



typedef struct catalogs_creative_assets_product_metadata_t {
    char *creative_assets_id; // string
    pinterest_rest_api_creative_assets_visibility_type__e visibility; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} catalogs_creative_assets_product_metadata_t;

__attribute__((deprecated)) catalogs_creative_assets_product_metadata_t *catalogs_creative_assets_product_metadata_create(
    char *creative_assets_id,
    pinterest_rest_api_creative_assets_visibility_type__e visibility
);

void catalogs_creative_assets_product_metadata_free(catalogs_creative_assets_product_metadata_t *catalogs_creative_assets_product_metadata);

catalogs_creative_assets_product_metadata_t *catalogs_creative_assets_product_metadata_parseFromJSON(cJSON *catalogs_creative_assets_product_metadataJSON);

cJSON *catalogs_creative_assets_product_metadata_convertToJSON(catalogs_creative_assets_product_metadata_t *catalogs_creative_assets_product_metadata);

#endif /* _catalogs_creative_assets_product_metadata_H_ */

