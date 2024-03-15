/*
 * customer_list.h
 *
 * 
 */

#ifndef _customer_list_H_
#define _customer_list_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct customer_list_t customer_list_t;

#include "object.h"

// Enum STATUS for customer_list

typedef enum  { pinterest_rest_api_customer_list_STATUS_NULL = 0, pinterest_rest_api_customer_list_STATUS_PROCESSING, pinterest_rest_api_customer_list_STATUS_READY, pinterest_rest_api_customer_list_STATUS_TOO_SMALL, pinterest_rest_api_customer_list_STATUS_UPLOADING } pinterest_rest_api_customer_list_STATUS_e;

char* customer_list_status_ToString(pinterest_rest_api_customer_list_STATUS_e status);

pinterest_rest_api_customer_list_STATUS_e customer_list_status_FromString(char* status);



typedef struct customer_list_t {
    char *ad_account_id; // string
    double created_time; //numeric
    char *id; // string
    char *name; // string
    double num_batches; //numeric
    double num_removed_user_records; //numeric
    double num_uploaded_user_records; //numeric
    pinterest_rest_api_customer_list_STATUS_e status; //enum
    char *type; // string
    double updated_time; //numeric
    object_t *exceptions; //object

} customer_list_t;

customer_list_t *customer_list_create(
    char *ad_account_id,
    double created_time,
    char *id,
    char *name,
    double num_batches,
    double num_removed_user_records,
    double num_uploaded_user_records,
    pinterest_rest_api_customer_list_STATUS_e status,
    char *type,
    double updated_time,
    object_t *exceptions
);

void customer_list_free(customer_list_t *customer_list);

customer_list_t *customer_list_parseFromJSON(cJSON *customer_listJSON);

cJSON *customer_list_convertToJSON(customer_list_t *customer_list);

#endif /* _customer_list_H_ */

