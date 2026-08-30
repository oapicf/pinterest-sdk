/*
 * entity_history.h
 *
 * 
 */

#ifndef _entity_history_H_
#define _entity_history_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct entity_history_t entity_history_t;

#include "change_history_operation_type.h"
#include "entity_data_change_history.h"



typedef struct entity_history_t {
    int *change_timestamp; //numeric
    list_t *data_changes; //nonprimitive container
    char *entity_id; // string
    char *entity_name; // string
    char *ldap; // string
    change_history_operation_type_t *operation; // custom
    char *user_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} entity_history_t;

__attribute__((deprecated)) entity_history_t *entity_history_create(
    int *change_timestamp,
    list_t *data_changes,
    char *entity_id,
    char *entity_name,
    char *ldap,
    change_history_operation_type_t *operation,
    char *user_id
);

void entity_history_free(entity_history_t *entity_history);

entity_history_t *entity_history_parseFromJSON(cJSON *entity_historyJSON);

cJSON *entity_history_convertToJSON(entity_history_t *entity_history);

#endif /* _entity_history_H_ */

