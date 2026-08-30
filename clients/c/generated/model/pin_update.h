/*
 * pin_update.h
 *
 * Resource create or update operation model.
 */

#ifndef _pin_update_H_
#define _pin_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_update_t pin_update_t;

#include "ai_disclosures_update.h"
#include "carousel_slot.h"



typedef struct pin_update_t {
    struct ai_disclosures_update_t *ai_disclosures; //model
    char *alt_text; // string
    char *board_id; // string
    char *board_section_id; // string
    list_t *carousel_slots; //nonprimitive container
    char *description; // string
    char *link; // string
    char *title; // string

    int _library_owned; // Is the library responsible for freeing this object?
} pin_update_t;

__attribute__((deprecated)) pin_update_t *pin_update_create(
    ai_disclosures_update_t *ai_disclosures,
    char *alt_text,
    char *board_id,
    char *board_section_id,
    list_t *carousel_slots,
    char *description,
    char *link,
    char *title
);

void pin_update_free(pin_update_t *pin_update);

pin_update_t *pin_update_parseFromJSON(cJSON *pin_updateJSON);

cJSON *pin_update_convertToJSON(pin_update_t *pin_update);

#endif /* _pin_update_H_ */

