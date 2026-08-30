/*
 * label_error_data.h
 *
 * 
 */

#ifndef _label_error_data_H_
#define _label_error_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct label_error_data_t label_error_data_t;

#include "nullable_label_status.h"
#include "nullable_label_type.h"



typedef struct label_error_data_t {
    char *id; // string
    pinterest_rest_api_nullable_label_type__e label_type; //referenced enum
    pinterest_rest_api_nullable_label_status__e status; //referenced enum
    char *value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} label_error_data_t;

__attribute__((deprecated)) label_error_data_t *label_error_data_create(
    char *id,
    pinterest_rest_api_nullable_label_type__e label_type,
    pinterest_rest_api_nullable_label_status__e status,
    char *value
);

void label_error_data_free(label_error_data_t *label_error_data);

label_error_data_t *label_error_data_parseFromJSON(cJSON *label_error_dataJSON);

cJSON *label_error_data_convertToJSON(label_error_data_t *label_error_data);

#endif /* _label_error_data_H_ */

