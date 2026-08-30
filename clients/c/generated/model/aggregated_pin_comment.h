/*
 * aggregated_pin_comment.h
 *
 * 
 */

#ifndef _aggregated_pin_comment_H_
#define _aggregated_pin_comment_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct aggregated_pin_comment_t aggregated_pin_comment_t;

#include "ai_disclosures.h"
#include "board_owner.h"
#include "creative_type.h"
#include "object.h"
#include "pin_media.h"



typedef struct aggregated_pin_comment_t {
    struct ai_disclosures_t *ai_disclosures; //model
    char *alt_text; // string
    char *board_id; // string
    struct board_owner_t *board_owner; //model
    char *board_section_id; // string
    char *created_at; //date time
    creative_type_t *creative_type; // custom
    char *description; // string
    char *dominant_color; // string
    int *has_been_promoted; //boolean
    char *id; // string
    int *is_owner; //boolean
    int *is_product; //boolean
    int *is_standard; //boolean
    char *link; // string
    struct pin_media_t *media; //model
    char *parent_pin_id; // string
    object_t *pin_metrics; //object
    char *title; // string

    int _library_owned; // Is the library responsible for freeing this object?
} aggregated_pin_comment_t;

__attribute__((deprecated)) aggregated_pin_comment_t *aggregated_pin_comment_create(
    ai_disclosures_t *ai_disclosures,
    char *alt_text,
    char *board_id,
    board_owner_t *board_owner,
    char *board_section_id,
    char *created_at,
    creative_type_t *creative_type,
    char *description,
    char *dominant_color,
    int *has_been_promoted,
    char *id,
    int *is_owner,
    int *is_product,
    int *is_standard,
    char *link,
    pin_media_t *media,
    char *parent_pin_id,
    object_t *pin_metrics,
    char *title
);

void aggregated_pin_comment_free(aggregated_pin_comment_t *aggregated_pin_comment);

aggregated_pin_comment_t *aggregated_pin_comment_parseFromJSON(cJSON *aggregated_pin_commentJSON);

cJSON *aggregated_pin_comment_convertToJSON(aggregated_pin_comment_t *aggregated_pin_comment);

#endif /* _aggregated_pin_comment_H_ */

