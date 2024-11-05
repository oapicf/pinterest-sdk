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

// Enum  for catalogs_creative_assets_product_metadata

typedef enum  { pinterest_rest_api_catalogs_creative_assets_product_metadata__NULL = 0, pinterest_rest_api_catalogs_creative_assets_product_metadata__VISIBLE, pinterest_rest_api_catalogs_creative_assets_product_metadata__HIDDEN } pinterest_rest_api_catalogs_creative_assets_product_metadata__e;

char* catalogs_creative_assets_product_metadata_visibility_ToString(pinterest_rest_api_catalogs_creative_assets_product_metadata__e visibility);

pinterest_rest_api_catalogs_creative_assets_product_metadata__e catalogs_creative_assets_product_metadata_visibility_FromString(char* visibility);



typedef struct catalogs_creative_assets_product_metadata_t {
    char *creative_assets_id; // string
    creative_assets_visibility_type_t *visibility; // custom

} catalogs_creative_assets_product_metadata_t;

catalogs_creative_assets_product_metadata_t *catalogs_creative_assets_product_metadata_create(
    char *creative_assets_id,
    creative_assets_visibility_type_t *visibility
);

void catalogs_creative_assets_product_metadata_free(catalogs_creative_assets_product_metadata_t *catalogs_creative_assets_product_metadata);

catalogs_creative_assets_product_metadata_t *catalogs_creative_assets_product_metadata_parseFromJSON(cJSON *catalogs_creative_assets_product_metadataJSON);

cJSON *catalogs_creative_assets_product_metadata_convertToJSON(catalogs_creative_assets_product_metadata_t *catalogs_creative_assets_product_metadata);

#endif /* _catalogs_creative_assets_product_metadata_H_ */

