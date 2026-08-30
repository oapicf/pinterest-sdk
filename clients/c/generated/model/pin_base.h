/*
 * pin_base.h
 *
 * 
 */

#ifndef _pin_base_H_
#define _pin_base_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct pin_base_t pin_base_t;

#include "ai_disclosures.h"
#include "board_owner.h"
#include "creative_type.h"
#include "object.h"
#include "pin_media.h"



typedef struct pin_base_t {
    struct ai_disclosures_t *ai_disclosures; //model
    char *board_id; // string
    struct board_owner_t *board_owner; //model
    char *board_section_id; // string
    char *created_at; //date time
    creative_type_t *creative_type; // custom
    char *dominant_color; // string
    int *has_been_promoted; //boolean
    char *id; // string
    int *is_owner; //boolean
    int *is_product; //boolean
    int *is_standard; //boolean
    struct pin_media_t *media; //model
    char *parent_pin_id; // string
    object_t *pin_metrics; //object

    int _library_owned; // Is the library responsible for freeing this object?
} pin_base_t;

__attribute__((deprecated)) pin_base_t *pin_base_create(
    ai_disclosures_t *ai_disclosures,
    char *board_id,
    board_owner_t *board_owner,
    char *board_section_id,
    char *created_at,
    creative_type_t *creative_type,
    char *dominant_color,
    int *has_been_promoted,
    char *id,
    int *is_owner,
    int *is_product,
    int *is_standard,
    pin_media_t *media,
    char *parent_pin_id,
    object_t *pin_metrics
);

void pin_base_free(pin_base_t *pin_base);

pin_base_t *pin_base_parseFromJSON(cJSON *pin_baseJSON);

cJSON *pin_base_convertToJSON(pin_base_t *pin_base);

#endif /* _pin_base_H_ */

