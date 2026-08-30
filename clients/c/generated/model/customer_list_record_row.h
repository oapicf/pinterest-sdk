/*
 * customer_list_record_row.h
 *
 * A single row in a multi-field customer list (v2 format).
 */

#ifndef _customer_list_record_row_H_
#define _customer_list_record_row_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct customer_list_record_row_t customer_list_record_row_t;




typedef struct customer_list_record_row_t {
    char *email; // string
    char *external_id; // string
    char *hashed_phone_number; // string
    char *hashed_pinner_id; // string
    char *ip_address; // string
    char *liveramp_envelope; // string
    char *maid; // string
    char *user_agent; // string

    int _library_owned; // Is the library responsible for freeing this object?
} customer_list_record_row_t;

__attribute__((deprecated)) customer_list_record_row_t *customer_list_record_row_create(
    char *email,
    char *external_id,
    char *hashed_phone_number,
    char *hashed_pinner_id,
    char *ip_address,
    char *liveramp_envelope,
    char *maid,
    char *user_agent
);

void customer_list_record_row_free(customer_list_record_row_t *customer_list_record_row);

customer_list_record_row_t *customer_list_record_row_parseFromJSON(cJSON *customer_list_record_rowJSON);

cJSON *customer_list_record_row_convertToJSON(customer_list_record_row_t *customer_list_record_row);

#endif /* _customer_list_record_row_H_ */

