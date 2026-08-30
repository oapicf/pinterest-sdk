/*
 * customer_list_status.h
 *
 * Customer list status. &#x60;TOO_SMALL&#x60; means the list has fewer than 100 Pinterest users.
 */

#ifndef _customer_list_status_H_
#define _customer_list_status_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct customer_list_status_t customer_list_status_t;


// Enum  for customer_list_status

typedef enum { pinterest_rest_api_customer_list_status__NULL = 0, pinterest_rest_api_customer_list_status__PROCESSING, pinterest_rest_api_customer_list_status__READY, pinterest_rest_api_customer_list_status__TOO_SMALL, pinterest_rest_api_customer_list_status__UPLOADING } pinterest_rest_api_customer_list_status__e;

char* customer_list_status_customer_list_status_ToString(pinterest_rest_api_customer_list_status__e customer_list_status);

pinterest_rest_api_customer_list_status__e customer_list_status_customer_list_status_FromString(char* customer_list_status);

cJSON *customer_list_status_convertToJSON(pinterest_rest_api_customer_list_status__e customer_list_status);

pinterest_rest_api_customer_list_status__e customer_list_status_parseFromJSON(cJSON *customer_list_statusJSON);

#endif /* _customer_list_status_H_ */

