/*
 * pin_update_carousel_slots_inner.h
 *
 * 
 */

#ifndef _pin_update_carousel_slots_inner_H_
#define _pin_update_carousel_slots_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_update_carousel_slots_inner_t pin_update_carousel_slots_inner_t;




typedef struct pin_update_carousel_slots_inner_t {
    char *title; // string
    char *description; // string
    char *link; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pin_update_carousel_slots_inner_t;

__attribute__((deprecated)) pin_update_carousel_slots_inner_t *pin_update_carousel_slots_inner_create(
    char *title,
    char *description,
    char *link
);

void pin_update_carousel_slots_inner_free(pin_update_carousel_slots_inner_t *pin_update_carousel_slots_inner);

pin_update_carousel_slots_inner_t *pin_update_carousel_slots_inner_parseFromJSON(cJSON *pin_update_carousel_slots_innerJSON);

cJSON *pin_update_carousel_slots_inner_convertToJSON(pin_update_carousel_slots_inner_t *pin_update_carousel_slots_inner);

#endif /* _pin_update_carousel_slots_inner_H_ */

