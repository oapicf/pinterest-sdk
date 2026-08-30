/*
 * entity_label.h
 *
 * 
 */

#ifndef _entity_label_H_
#define _entity_label_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct entity_label_t entity_label_t;

#include "entity_label_status.h"
#include "label_parent_type.h"



typedef struct entity_label_t {
    char *entity_id; // string
    label_parent_type_t *entity_type; // custom
    char *label_id; // string
    entity_label_status_t *status; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} entity_label_t;

__attribute__((deprecated)) entity_label_t *entity_label_create(
    char *entity_id,
    label_parent_type_t *entity_type,
    char *label_id,
    entity_label_status_t *status
);

void entity_label_free(entity_label_t *entity_label);

entity_label_t *entity_label_parseFromJSON(cJSON *entity_labelJSON);

cJSON *entity_label_convertToJSON(entity_label_t *entity_label);

#endif /* _entity_label_H_ */

