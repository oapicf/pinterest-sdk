/*
 * catalogs_product_group_status.h
 *
 * 
 */

#ifndef _catalogs_product_group_status_H_
#define _catalogs_product_group_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct catalogs_product_group_status_t catalogs_product_group_status_t;


// Enum  for catalogs_product_group_status

typedef enum { pinterest_rest_api_catalogs_product_group_status__NULL = 0, pinterest_rest_api_catalogs_product_group_status__ACTIVE, pinterest_rest_api_catalogs_product_group_status__INACTIVE } pinterest_rest_api_catalogs_product_group_status__e;

char* catalogs_product_group_status_catalogs_product_group_status_ToString(pinterest_rest_api_catalogs_product_group_status__e catalogs_product_group_status);

pinterest_rest_api_catalogs_product_group_status__e catalogs_product_group_status_catalogs_product_group_status_FromString(char* catalogs_product_group_status);

//cJSON *catalogs_product_group_status_catalogs_product_group_status_convertToJSON(pinterest_rest_api_catalogs_product_group_status__e catalogs_product_group_status);

//pinterest_rest_api_catalogs_product_group_status__e catalogs_product_group_status_catalogs_product_group_status_parseFromJSON(cJSON *catalogs_product_group_statusJSON);

#endif /* _catalogs_product_group_status_H_ */

