/*
 * labeled_entities.h
 *
 * 
 */

#ifndef _labeled_entities_H_
#define _labeled_entities_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct labeled_entities_t labeled_entities_t;

#include "entity_label.h"
#include "entity_label_error.h"



typedef struct labeled_entities_t {
    list_t *entities_labels; //nonprimitive container
    list_t *errors; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} labeled_entities_t;

__attribute__((deprecated)) labeled_entities_t *labeled_entities_create(
    list_t *entities_labels,
    list_t *errors
);

void labeled_entities_free(labeled_entities_t *labeled_entities);

labeled_entities_t *labeled_entities_parseFromJSON(cJSON *labeled_entitiesJSON);

cJSON *labeled_entities_convertToJSON(labeled_entities_t *labeled_entities);

#endif /* _labeled_entities_H_ */

