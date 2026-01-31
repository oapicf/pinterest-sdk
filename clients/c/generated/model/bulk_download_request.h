/*
 * bulk_download_request.h
 *
 * Ad entities to get in bulk request.
 */

#ifndef _bulk_download_request_H_
#define _bulk_download_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bulk_download_request_t bulk_download_request_t;

#include "bulk_download_request_campaign_filter.h"
#include "bulk_entity_type.h"
#include "bulk_output_format.h"



typedef struct bulk_download_request_t {
    struct bulk_download_request_campaign_filter_t *campaign_filter; //model
    list_t *entity_ids; //primitive container
    list_t *entity_types; //nonprimitive container
    bulk_output_format_t *output_format; // custom
    char *updated_since; // string

    int _library_owned; // Is the library responsible for freeing this object?
} bulk_download_request_t;

__attribute__((deprecated)) bulk_download_request_t *bulk_download_request_create(
    bulk_download_request_campaign_filter_t *campaign_filter,
    list_t *entity_ids,
    list_t *entity_types,
    bulk_output_format_t *output_format,
    char *updated_since
);

void bulk_download_request_free(bulk_download_request_t *bulk_download_request);

bulk_download_request_t *bulk_download_request_parseFromJSON(cJSON *bulk_download_requestJSON);

cJSON *bulk_download_request_convertToJSON(bulk_download_request_t *bulk_download_request);

#endif /* _bulk_download_request_H_ */

