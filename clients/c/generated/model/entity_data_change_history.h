/*
 * entity_data_change_history.h
 *
 * 
 */

#ifndef _entity_data_change_history_H_
#define _entity_data_change_history_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct entity_data_change_history_t entity_data_change_history_t;

#include "change_history_data_type.h"



typedef struct entity_data_change_history_t {
    char *changed_field_id; // string
    char *changed_field_name; // string
    change_history_data_type_t *data_type; // custom
    char *new_data_value; // string
    char *old_data_value; // string

    int _library_owned; // Is the library responsible for freeing this object?
} entity_data_change_history_t;

__attribute__((deprecated)) entity_data_change_history_t *entity_data_change_history_create(
    char *changed_field_id,
    char *changed_field_name,
    change_history_data_type_t *data_type,
    char *new_data_value,
    char *old_data_value
);

void entity_data_change_history_free(entity_data_change_history_t *entity_data_change_history);

entity_data_change_history_t *entity_data_change_history_parseFromJSON(cJSON *entity_data_change_historyJSON);

cJSON *entity_data_change_history_convertToJSON(entity_data_change_history_t *entity_data_change_history);

#endif /* _entity_data_change_history_H_ */

