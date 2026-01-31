/*
 * promotion_create_request.h
 *
 * 
 */

#ifndef _promotion_create_request_H_
#define _promotion_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct promotion_create_request_t promotion_create_request_t;

#include "promotion_template_value.h"
#include "promotion_type.h"

// Enum DISCOUNTSTATUS for promotion_create_request

typedef enum  { pinterest_rest_api_promotion_create_request_DISCOUNTSTATUS_NULL = 0, pinterest_rest_api_promotion_create_request_DISCOUNTSTATUS_OTHER, pinterest_rest_api_promotion_create_request_DISCOUNTSTATUS_ACTIVE, pinterest_rest_api_promotion_create_request_DISCOUNTSTATUS_PAUSED, pinterest_rest_api_promotion_create_request_DISCOUNTSTATUS_SCHEDULED, pinterest_rest_api_promotion_create_request_DISCOUNTSTATUS_EXPIRED } pinterest_rest_api_promotion_create_request_DISCOUNTSTATUS_e;

char* promotion_create_request_discount_status_ToString(pinterest_rest_api_promotion_create_request_DISCOUNTSTATUS_e discount_status);

pinterest_rest_api_promotion_create_request_DISCOUNTSTATUS_e promotion_create_request_discount_status_FromString(char* discount_status);



typedef struct promotion_create_request_t {
    pinterest_rest_api_promotion_create_request_DISCOUNTSTATUS_e discount_status; //enum
    int end_time; //numeric
    char *external_id; // string
    char *platform_type; // string
    char *promotion_code; // string
    char *promotion_custom_id; // string
    char *promotion_title; // string
    pinterest_rest_api_promotion_type__e promotion_type; //referenced enum
    int start_time; //numeric
    list_t *template_values; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} promotion_create_request_t;

__attribute__((deprecated)) promotion_create_request_t *promotion_create_request_create(
    pinterest_rest_api_promotion_create_request_DISCOUNTSTATUS_e discount_status,
    int end_time,
    char *external_id,
    char *platform_type,
    char *promotion_code,
    char *promotion_custom_id,
    char *promotion_title,
    pinterest_rest_api_promotion_type__e promotion_type,
    int start_time,
    list_t *template_values
);

void promotion_create_request_free(promotion_create_request_t *promotion_create_request);

promotion_create_request_t *promotion_create_request_parseFromJSON(cJSON *promotion_create_requestJSON);

cJSON *promotion_create_request_convertToJSON(promotion_create_request_t *promotion_create_request);

#endif /* _promotion_create_request_H_ */

