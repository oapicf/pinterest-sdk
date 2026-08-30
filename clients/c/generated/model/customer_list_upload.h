/*
 * customer_list_upload.h
 *
 * 
 */

#ifndef _customer_list_upload_H_
#define _customer_list_upload_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct customer_list_upload_t customer_list_upload_t;

#include "error_detail.h"
#include "record_counts.h"
#include "user_list_operation_type.h"
#include "workload_state.h"



typedef struct customer_list_upload_t {
    char *ad_account_id; // string
    int *creation_time; //numeric
    char *customer_list_id; // string
    list_t *error_counts; //nonprimitive container
    char *id; // string
    pinterest_rest_api_user_list_operation_type__e operation; //referenced enum
    struct record_counts_t *record_counts; //model
    workload_state_t *state; // custom
    int *updated_time; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} customer_list_upload_t;

__attribute__((deprecated)) customer_list_upload_t *customer_list_upload_create(
    char *ad_account_id,
    int *creation_time,
    char *customer_list_id,
    list_t *error_counts,
    char *id,
    pinterest_rest_api_user_list_operation_type__e operation,
    record_counts_t *record_counts,
    workload_state_t *state,
    int *updated_time
);

void customer_list_upload_free(customer_list_upload_t *customer_list_upload);

customer_list_upload_t *customer_list_upload_parseFromJSON(cJSON *customer_list_uploadJSON);

cJSON *customer_list_upload_convertToJSON(customer_list_upload_t *customer_list_upload);

#endif /* _customer_list_upload_H_ */

