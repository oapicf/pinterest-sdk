/*
 * lead_forms_create_200_response.h
 *
 * 
 */

#ifndef _lead_forms_create_200_response_H_
#define _lead_forms_create_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_forms_create_200_response_t lead_forms_create_200_response_t;

#include "lead_forms_create_200_response_items_inner.h"



typedef struct lead_forms_create_200_response_t {
    list_t *items; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} lead_forms_create_200_response_t;

__attribute__((deprecated)) lead_forms_create_200_response_t *lead_forms_create_200_response_create(
    list_t *items
);

void lead_forms_create_200_response_free(lead_forms_create_200_response_t *lead_forms_create_200_response);

lead_forms_create_200_response_t *lead_forms_create_200_response_parseFromJSON(cJSON *lead_forms_create_200_responseJSON);

cJSON *lead_forms_create_200_response_convertToJSON(lead_forms_create_200_response_t *lead_forms_create_200_response);

#endif /* _lead_forms_create_200_response_H_ */

