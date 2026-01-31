/*
 * get_business_assets_response_catalog_info.h
 *
 * An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;.
 */

#ifndef _get_business_assets_response_catalog_info_H_
#define _get_business_assets_response_catalog_info_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct get_business_assets_response_catalog_info_t get_business_assets_response_catalog_info_t;




typedef struct get_business_assets_response_catalog_info_t {
    char *catalog_type; // string
    char *id; // string
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} get_business_assets_response_catalog_info_t;

__attribute__((deprecated)) get_business_assets_response_catalog_info_t *get_business_assets_response_catalog_info_create(
    char *catalog_type,
    char *id,
    char *name
);

void get_business_assets_response_catalog_info_free(get_business_assets_response_catalog_info_t *get_business_assets_response_catalog_info);

get_business_assets_response_catalog_info_t *get_business_assets_response_catalog_info_parseFromJSON(cJSON *get_business_assets_response_catalog_infoJSON);

cJSON *get_business_assets_response_catalog_info_convertToJSON(get_business_assets_response_catalog_info_t *get_business_assets_response_catalog_info);

#endif /* _get_business_assets_response_catalog_info_H_ */

