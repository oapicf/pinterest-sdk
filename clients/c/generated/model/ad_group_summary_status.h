/*
 * ad_group_summary_status.h
 *
 * Summary status for ad group
 */

#ifndef _ad_group_summary_status_H_
#define _ad_group_summary_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_group_summary_status_t ad_group_summary_status_t;


// Enum  for ad_group_summary_status

typedef enum { pinterest_rest_api_ad_group_summary_status__NULL = 0, pinterest_rest_api_ad_group_summary_status__RUNNING, pinterest_rest_api_ad_group_summary_status__PAUSED, pinterest_rest_api_ad_group_summary_status__NOT_STARTED, pinterest_rest_api_ad_group_summary_status__COMPLETED, pinterest_rest_api_ad_group_summary_status__ADVERTISER_DISABLED, pinterest_rest_api_ad_group_summary_status__ARCHIVED, pinterest_rest_api_ad_group_summary_status__DRAFT, pinterest_rest_api_ad_group_summary_status__DELETED_DRAFT } pinterest_rest_api_ad_group_summary_status__e;

char* ad_group_summary_status_ad_group_summary_status_ToString(pinterest_rest_api_ad_group_summary_status__e ad_group_summary_status);

pinterest_rest_api_ad_group_summary_status__e ad_group_summary_status_ad_group_summary_status_FromString(char* ad_group_summary_status);

//cJSON *ad_group_summary_status_ad_group_summary_status_convertToJSON(pinterest_rest_api_ad_group_summary_status__e ad_group_summary_status);

//pinterest_rest_api_ad_group_summary_status__e ad_group_summary_status_ad_group_summary_status_parseFromJSON(cJSON *ad_group_summary_statusJSON);

#endif /* _ad_group_summary_status_H_ */

