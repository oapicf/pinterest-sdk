/*
 * labeled_entities_create.h
 *
 * Resource create operation model.
 */

#ifndef _labeled_entities_create_H_
#define _labeled_entities_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct labeled_entities_create_t labeled_entities_create_t;




typedef struct labeled_entities_create_t {
    list_t *entity_ids; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} labeled_entities_create_t;

__attribute__((deprecated)) labeled_entities_create_t *labeled_entities_create_create(
    list_t *entity_ids
);

void labeled_entities_create_free(labeled_entities_create_t *labeled_entities_create);

labeled_entities_create_t *labeled_entities_create_parseFromJSON(cJSON *labeled_entities_createJSON);

cJSON *labeled_entities_create_convertToJSON(labeled_entities_create_t *labeled_entities_create);

#endif /* _labeled_entities_create_H_ */

