/*
 * customer_list_create.h
 *
 * Resource create operation model.
 */

#ifndef _customer_list_create_H_
#define _customer_list_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct customer_list_create_t customer_list_create_t;

#include "customer_list_record_row.h"
#include "user_list_type.h"



typedef struct customer_list_create_t {
    int *is_nca; //boolean
    user_list_type_t *list_type; // custom
    char *name; // string
    char *records; // string
    list_t *records_v2; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} customer_list_create_t;

__attribute__((deprecated)) customer_list_create_t *customer_list_create_create(
    int *is_nca,
    user_list_type_t *list_type,
    char *name,
    char *records,
    list_t *records_v2
);

void customer_list_create_free(customer_list_create_t *customer_list_create);

customer_list_create_t *customer_list_create_parseFromJSON(cJSON *customer_list_createJSON);

cJSON *customer_list_create_convertToJSON(customer_list_create_t *customer_list_create);

#endif /* _customer_list_create_H_ */

