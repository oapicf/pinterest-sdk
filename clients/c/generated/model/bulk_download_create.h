/*
 * bulk_download_create.h
 *
 * Resource create operation model.
 */

#ifndef _bulk_download_create_H_
#define _bulk_download_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bulk_download_create_t bulk_download_create_t;

#include "bulk_download_campaign_filter.h"
#include "bulk_entity_type.h"
#include "bulk_output_format.h"

// Enum  for bulk_download_create

typedef enum  { pinterest_rest_api_bulk_download_create__NULL = 0, pinterest_rest_api_bulk_download_create__CAMPAIGN, pinterest_rest_api_bulk_download_create__AD_GROUP, pinterest_rest_api_bulk_download_create__PRODUCT_GROUP, pinterest_rest_api_bulk_download_create__AD, pinterest_rest_api_bulk_download_create__KEYWORD, pinterest_rest_api_bulk_download_create__LABEL, pinterest_rest_api_bulk_download_create__SCHEDULE, pinterest_rest_api_bulk_download_create__ENTITY_HISTORY } pinterest_rest_api_bulk_download_create__e;

char* bulk_download_create_entity_types_ToString(pinterest_rest_api_bulk_download_create__e entity_types);

pinterest_rest_api_bulk_download_create__e bulk_download_create_entity_types_FromString(char* entity_types);



typedef struct bulk_download_create_t {
    struct bulk_download_campaign_filter_t *campaign_filter; //model
    list_t *entity_ids; //primitive container
    list_t *entity_types; //nonprimitive container
    bulk_output_format_t *output_format; // custom
    char *updated_since; // string

    int _library_owned; // Is the library responsible for freeing this object?
} bulk_download_create_t;

__attribute__((deprecated)) bulk_download_create_t *bulk_download_create_create(
    bulk_download_campaign_filter_t *campaign_filter,
    list_t *entity_ids,
    list_t *entity_types,
    bulk_output_format_t *output_format,
    char *updated_since
);

void bulk_download_create_free(bulk_download_create_t *bulk_download_create);

bulk_download_create_t *bulk_download_create_parseFromJSON(cJSON *bulk_download_createJSON);

cJSON *bulk_download_create_convertToJSON(bulk_download_create_t *bulk_download_create);

#endif /* _bulk_download_create_H_ */

