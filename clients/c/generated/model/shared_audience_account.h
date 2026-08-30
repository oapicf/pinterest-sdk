/*
 * shared_audience_account.h
 *
 * 
 */

#ifndef _shared_audience_account_H_
#define _shared_audience_account_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct shared_audience_account_t shared_audience_account_t;

#include "audience_account_type.h"



typedef struct shared_audience_account_t {
    char *account_id; // string
    char *account_name; // string
    audience_account_type_t *account_type; // custom
    int *shared_on_timestamp; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} shared_audience_account_t;

__attribute__((deprecated)) shared_audience_account_t *shared_audience_account_create(
    char *account_id,
    char *account_name,
    audience_account_type_t *account_type,
    int *shared_on_timestamp
);

void shared_audience_account_free(shared_audience_account_t *shared_audience_account);

shared_audience_account_t *shared_audience_account_parseFromJSON(cJSON *shared_audience_accountJSON);

cJSON *shared_audience_account_convertToJSON(shared_audience_account_t *shared_audience_account);

#endif /* _shared_audience_account_H_ */

