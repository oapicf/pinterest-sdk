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
    list_t *entity_types; //nonprimitive container
    list_t *entity_ids; //primitive container
    char *updated_since; // string
    struct bulk_download_request_campaign_filter_t *campaign_filter; //model
    bulk_output_format_t *output_format; // custom

} bulk_download_request_t;

bulk_download_request_t *bulk_download_request_create(
    list_t *entity_types,
    list_t *entity_ids,
    char *updated_since,
    bulk_download_request_campaign_filter_t *campaign_filter,
    bulk_output_format_t *output_format
);

void bulk_download_request_free(bulk_download_request_t *bulk_download_request);

bulk_download_request_t *bulk_download_request_parseFromJSON(cJSON *bulk_download_requestJSON);

cJSON *bulk_download_request_convertToJSON(bulk_download_request_t *bulk_download_request);

#endif /* _bulk_download_request_H_ */

