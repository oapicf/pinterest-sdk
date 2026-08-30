/*
 * label_error.h
 *
 * 
 */

#ifndef _label_error_H_
#define _label_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct label_error_t label_error_t;

#include "label_error_data.h"



typedef struct label_error_t {
    struct label_error_data_t *data; //model
    list_t *error_messages; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} label_error_t;

__attribute__((deprecated)) label_error_t *label_error_create(
    label_error_data_t *data,
    list_t *error_messages
);

void label_error_free(label_error_t *label_error);

label_error_t *label_error_parseFromJSON(cJSON *label_errorJSON);

cJSON *label_error_convertToJSON(label_error_t *label_error);

#endif /* _label_error_H_ */

