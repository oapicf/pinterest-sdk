/*
 * customer_list_upload_response.h
 *
 * 
 */

#ifndef _customer_list_upload_response_H_
#define _customer_list_upload_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct customer_list_upload_response_t customer_list_upload_response_t;

#include "error_detail.h"
#include "record_counts.h"
#include "user_list_operation_type.h"

// Enum STATE for customer_list_upload_response

typedef enum  { pinterest_rest_api_customer_list_upload_response_STATE_NULL = 0, pinterest_rest_api_customer_list_upload_response_STATE_NOT_STARTED, pinterest_rest_api_customer_list_upload_response_STATE_RUNNING, pinterest_rest_api_customer_list_upload_response_STATE_PAUSED, pinterest_rest_api_customer_list_upload_response_STATE_SUCCEEDED, pinterest_rest_api_customer_list_upload_response_STATE_FAILED } pinterest_rest_api_customer_list_upload_response_STATE_e;

char* customer_list_upload_response_state_ToString(pinterest_rest_api_customer_list_upload_response_STATE_e state);

pinterest_rest_api_customer_list_upload_response_STATE_e customer_list_upload_response_state_FromString(char* state);



typedef struct customer_list_upload_response_t {
    char *ad_account_id; // string
    int creation_time; //numeric
    char *customer_list_id; // string
    list_t *error_counts; //nonprimitive container
    char *id; // string
    pinterest_rest_api_user_list_operation_type__e operation; //referenced enum
    struct record_counts_t *record_counts; //model
    pinterest_rest_api_customer_list_upload_response_STATE_e state; //enum
    int updated_time; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} customer_list_upload_response_t;

__attribute__((deprecated)) customer_list_upload_response_t *customer_list_upload_response_create(
    char *ad_account_id,
    int creation_time,
    char *customer_list_id,
    list_t *error_counts,
    char *id,
    pinterest_rest_api_user_list_operation_type__e operation,
    record_counts_t *record_counts,
    pinterest_rest_api_customer_list_upload_response_STATE_e state,
    int updated_time
);

void customer_list_upload_response_free(customer_list_upload_response_t *customer_list_upload_response);

customer_list_upload_response_t *customer_list_upload_response_parseFromJSON(cJSON *customer_list_upload_responseJSON);

cJSON *customer_list_upload_response_convertToJSON(customer_list_upload_response_t *customer_list_upload_response);

#endif /* _customer_list_upload_response_H_ */

