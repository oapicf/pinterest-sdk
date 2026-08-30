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

#include "customer_list_status.h"
#include "object.h"



typedef struct customer_list_t {
    char *ad_account_id; // string
    double *created_time; //numeric
    object_t *exceptions; //object
    char *id; // string
    int *is_nca; //boolean
    char *name; // string
    double *num_batches; //numeric
    double *num_removed_user_records; //numeric
    double *num_uploaded_user_records; //numeric
    customer_list_status_t *status; // custom
    char *type; // string
    double *updated_time; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} customer_list_t;

__attribute__((deprecated)) customer_list_t *customer_list_create(
    char *ad_account_id,
    double *created_time,
    object_t *exceptions,
    char *id,
    int *is_nca,
    char *name,
    double *num_batches,
    double *num_removed_user_records,
    double *num_uploaded_user_records,
    customer_list_status_t *status,
    char *type,
    double *updated_time
);

void customer_list_free(customer_list_t *customer_list);

customer_list_t *customer_list_parseFromJSON(cJSON *customer_listJSON);

cJSON *customer_list_convertToJSON(customer_list_t *customer_list);

#endif /* _customer_list_H_ */

