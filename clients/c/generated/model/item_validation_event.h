/*
 * item_validation_event.h
 *
 * Object describing an item validation event
 */

#ifndef _item_validation_event_H_
#define _item_validation_event_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct item_validation_event_t item_validation_event_t;




typedef struct item_validation_event_t {
    char *attribute; // string
    int *code; //numeric
    char *message; // string

    int _library_owned; // Is the library responsible for freeing this object?
} item_validation_event_t;

__attribute__((deprecated)) item_validation_event_t *item_validation_event_create(
    char *attribute,
    int *code,
    char *message
);

void item_validation_event_free(item_validation_event_t *item_validation_event);

item_validation_event_t *item_validation_event_parseFromJSON(cJSON *item_validation_eventJSON);

cJSON *item_validation_event_convertToJSON(item_validation_event_t *item_validation_event);

#endif /* _item_validation_event_H_ */

