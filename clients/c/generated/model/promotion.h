/*
 * promotion.h
 *
 * 
 */

#ifndef _promotion_H_
#define _promotion_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct promotion_t promotion_t;

#include "discount_status.h"
#include "entity_status.h"
#include "promotion_template_value.h"
#include "promotion_type.h"



typedef struct promotion_t {
    char *ad_account_id; // string
    pinterest_rest_api_discount_status__e discount_status; //referenced enum
    int *end_time; //numeric
    char *external_id; // string
    char *id; // string
    char *platform_type; // string
    char *promotion_code; // string
    char *promotion_custom_id; // string
    char *promotion_title; // string
    pinterest_rest_api_promotion_type__e promotion_type; //referenced enum
    int *start_time; //numeric
    entity_status_t *status; // custom
    list_t *template_values; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} promotion_t;

__attribute__((deprecated)) promotion_t *promotion_create(
    char *ad_account_id,
    pinterest_rest_api_discount_status__e discount_status,
    int *end_time,
    char *external_id,
    char *id,
    char *platform_type,
    char *promotion_code,
    char *promotion_custom_id,
    char *promotion_title,
    pinterest_rest_api_promotion_type__e promotion_type,
    int *start_time,
    entity_status_t *status,
    list_t *template_values
);

void promotion_free(promotion_t *promotion);

promotion_t *promotion_parseFromJSON(cJSON *promotionJSON);

cJSON *promotion_convertToJSON(promotion_t *promotion);

#endif /* _promotion_H_ */

