/*
 * supplemental_item_validation_event.h
 *
 * Item validation event
 */

#ifndef _supplemental_item_validation_event_H_
#define _supplemental_item_validation_event_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct supplemental_item_validation_event_t supplemental_item_validation_event_t;




typedef struct supplemental_item_validation_event_t {
    char *attribute; // string
    int *code; //numeric
    char *message; // string

    int _library_owned; // Is the library responsible for freeing this object?
} supplemental_item_validation_event_t;

__attribute__((deprecated)) supplemental_item_validation_event_t *supplemental_item_validation_event_create(
    char *attribute,
    int *code,
    char *message
);

void supplemental_item_validation_event_free(supplemental_item_validation_event_t *supplemental_item_validation_event);

supplemental_item_validation_event_t *supplemental_item_validation_event_parseFromJSON(cJSON *supplemental_item_validation_eventJSON);

cJSON *supplemental_item_validation_event_convertToJSON(supplemental_item_validation_event_t *supplemental_item_validation_event);

#endif /* _supplemental_item_validation_event_H_ */

