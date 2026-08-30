/*
 * entity_label_error.h
 *
 * 
 */

#ifndef _entity_label_error_H_
#define _entity_label_error_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct entity_label_error_t entity_label_error_t;

#include "entity_label.h"



typedef struct entity_label_error_t {
    struct entity_label_t *data; //model
    list_t *error_messages; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} entity_label_error_t;

__attribute__((deprecated)) entity_label_error_t *entity_label_error_create(
    entity_label_t *data,
    list_t *error_messages
);

void entity_label_error_free(entity_label_error_t *entity_label_error);

entity_label_error_t *entity_label_error_parseFromJSON(cJSON *entity_label_errorJSON);

cJSON *entity_label_error_convertToJSON(entity_label_error_t *entity_label_error);

#endif /* _entity_label_error_H_ */

