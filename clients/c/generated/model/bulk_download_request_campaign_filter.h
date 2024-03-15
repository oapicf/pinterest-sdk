/*
 * bulk_download_request_campaign_filter.h
 *
 * 
 */

#ifndef _bulk_download_request_campaign_filter_H_
#define _bulk_download_request_campaign_filter_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct bulk_download_request_campaign_filter_t bulk_download_request_campaign_filter_t;

#include "campaign_summary_status.h"
#include "objective_type.h"

// Enum  for bulk_download_request_campaign_filter

typedef enum  { pinterest_rest_api_bulk_download_request_campaign_filter__NULL = 0, pinterest_rest_api_bulk_download_request_campaign_filter__RUNNING, pinterest_rest_api_bulk_download_request_campaign_filter__PAUSED, pinterest_rest_api_bulk_download_request_campaign_filter__NOT_STARTED, pinterest_rest_api_bulk_download_request_campaign_filter__COMPLETED, pinterest_rest_api_bulk_download_request_campaign_filter__ADVERTISER_DISABLED, pinterest_rest_api_bulk_download_request_campaign_filter__ARCHIVED, pinterest_rest_api_bulk_download_request_campaign_filter__DRAFT, pinterest_rest_api_bulk_download_request_campaign_filter__DELETED_DRAFT } pinterest_rest_api_bulk_download_request_campaign_filter__e;

char* bulk_download_request_campaign_filter_campaign_status_ToString(pinterest_rest_api_bulk_download_request_campaign_filter__e campaign_status);

pinterest_rest_api_bulk_download_request_campaign_filter__e bulk_download_request_campaign_filter_campaign_status_FromString(char* campaign_status);

// Enum  for bulk_download_request_campaign_filter

typedef enum  { pinterest_rest_api_bulk_download_request_campaign_filter__NULL = 0, pinterest_rest_api_bulk_download_request_campaign_filter__AWARENESS, pinterest_rest_api_bulk_download_request_campaign_filter__CONSIDERATION, pinterest_rest_api_bulk_download_request_campaign_filter__VIDEO_VIEW, pinterest_rest_api_bulk_download_request_campaign_filter__WEB_CONVERSION, pinterest_rest_api_bulk_download_request_campaign_filter__CATALOG_SALES, pinterest_rest_api_bulk_download_request_campaign_filter__WEB_SESSIONS } pinterest_rest_api_bulk_download_request_campaign_filter__e;

char* bulk_download_request_campaign_filter_objective_type_ToString(pinterest_rest_api_bulk_download_request_campaign_filter__e objective_type);

pinterest_rest_api_bulk_download_request_campaign_filter__e bulk_download_request_campaign_filter_objective_type_FromString(char* objective_type);



typedef struct bulk_download_request_campaign_filter_t {
    char *start_time; // string
    char *end_time; // string
    char *name; // string
    list_t *campaign_status; //nonprimitive container
    list_t *objective_type; //nonprimitive container

} bulk_download_request_campaign_filter_t;

bulk_download_request_campaign_filter_t *bulk_download_request_campaign_filter_create(
    char *start_time,
    char *end_time,
    char *name,
    list_t *campaign_status,
    list_t *objective_type
);

void bulk_download_request_campaign_filter_free(bulk_download_request_campaign_filter_t *bulk_download_request_campaign_filter);

bulk_download_request_campaign_filter_t *bulk_download_request_campaign_filter_parseFromJSON(cJSON *bulk_download_request_campaign_filterJSON);

cJSON *bulk_download_request_campaign_filter_convertToJSON(bulk_download_request_campaign_filter_t *bulk_download_request_campaign_filter);

#endif /* _bulk_download_request_campaign_filter_H_ */

