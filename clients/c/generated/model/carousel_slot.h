/*
 * carousel_slot.h
 *
 * 
 */

#ifndef _carousel_slot_H_
#define _carousel_slot_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct carousel_slot_t carousel_slot_t;




typedef struct carousel_slot_t {
    char *description; // string
    char *link; // string
    char *title; // string

    int _library_owned; // Is the library responsible for freeing this object?
} carousel_slot_t;

__attribute__((deprecated)) carousel_slot_t *carousel_slot_create(
    char *description,
    char *link,
    char *title
);

void carousel_slot_free(carousel_slot_t *carousel_slot);

carousel_slot_t *carousel_slot_parseFromJSON(cJSON *carousel_slotJSON);

cJSON *carousel_slot_convertToJSON(carousel_slot_t *carousel_slot);

#endif /* _carousel_slot_H_ */

