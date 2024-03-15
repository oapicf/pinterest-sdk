/*
 * pin_update.h
 *
 * Pin fields for updates
 */

#ifndef _pin_update_H_
#define _pin_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_update_t pin_update_t;

#include "pin_update_carousel_slots_inner.h"



typedef struct pin_update_t {
    char *alt_text; // string
    char *board_id; // string
    char *board_section_id; // string
    char *description; // string
    char *link; // string
    char *title; // string
    list_t *carousel_slots; //nonprimitive container
    char *note; // string

} pin_update_t;

pin_update_t *pin_update_create(
    char *alt_text,
    char *board_id,
    char *board_section_id,
    char *description,
    char *link,
    char *title,
    list_t *carousel_slots,
    char *note
);

void pin_update_free(pin_update_t *pin_update);

pin_update_t *pin_update_parseFromJSON(cJSON *pin_updateJSON);

cJSON *pin_update_convertToJSON(pin_update_t *pin_update);

#endif /* _pin_update_H_ */

