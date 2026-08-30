/*
 * promotion_create.h
 *
 * Resource create operation model.
 */

#ifndef _promotion_create_H_
#define _promotion_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct promotion_create_t promotion_create_t;

#include "discount_status.h"
#include "promotion_template_value.h"
#include "promotion_type.h"



typedef struct promotion_create_t {
    pinterest_rest_api_discount_status__e discount_status; //referenced enum
    int *end_time; //numeric
    char *external_id; // string
    char *platform_type; // string
    char *promotion_code; // string
    char *promotion_custom_id; // string
    char *promotion_title; // string
    pinterest_rest_api_promotion_type__e promotion_type; //referenced enum
    int *start_time; //numeric
    list_t *template_values; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} promotion_create_t;

__attribute__((deprecated)) promotion_create_t *promotion_create_create(
    pinterest_rest_api_discount_status__e discount_status,
    int *end_time,
    char *external_id,
    char *platform_type,
    char *promotion_code,
    char *promotion_custom_id,
    char *promotion_title,
    pinterest_rest_api_promotion_type__e promotion_type,
    int *start_time,
    list_t *template_values
);

void promotion_create_free(promotion_create_t *promotion_create);

promotion_create_t *promotion_create_parseFromJSON(cJSON *promotion_createJSON);

cJSON *promotion_create_convertToJSON(promotion_create_t *promotion_create);

#endif /* _promotion_create_H_ */

