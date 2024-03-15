/*
 * product_group_summary_status.h
 *
 * Summary status for product group
 */

#ifndef _product_group_summary_status_H_
#define _product_group_summary_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct product_group_summary_status_t product_group_summary_status_t;


// Enum  for product_group_summary_status

typedef enum { pinterest_rest_api_product_group_summary_status__NULL = 0, pinterest_rest_api_product_group_summary_status__RUNNING, pinterest_rest_api_product_group_summary_status__PAUSED, pinterest_rest_api_product_group_summary_status__EXCLUDED, pinterest_rest_api_product_group_summary_status__ARCHIVED } pinterest_rest_api_product_group_summary_status__e;

char* product_group_summary_status_product_group_summary_status_ToString(pinterest_rest_api_product_group_summary_status__e product_group_summary_status);

pinterest_rest_api_product_group_summary_status__e product_group_summary_status_product_group_summary_status_FromString(char* product_group_summary_status);

//cJSON *product_group_summary_status_product_group_summary_status_convertToJSON(pinterest_rest_api_product_group_summary_status__e product_group_summary_status);

//pinterest_rest_api_product_group_summary_status__e product_group_summary_status_product_group_summary_status_parseFromJSON(cJSON *product_group_summary_statusJSON);

#endif /* _product_group_summary_status_H_ */

