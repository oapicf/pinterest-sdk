/*
 * lead_forms_create_200_response_items_inner.h
 *
 * 
 */

#ifndef _lead_forms_create_200_response_items_inner_H_
#define _lead_forms_create_200_response_items_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_forms_create_200_response_items_inner_t lead_forms_create_200_response_items_inner_t;

#include "lead_form.h"
#include "pinterest_lib_batch_item_exception.h"



typedef struct lead_forms_create_200_response_items_inner_t {
    struct lead_form_t *data; //model
    list_t *exceptions; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} lead_forms_create_200_response_items_inner_t;

__attribute__((deprecated)) lead_forms_create_200_response_items_inner_t *lead_forms_create_200_response_items_inner_create(
    lead_form_t *data,
    list_t *exceptions
);

void lead_forms_create_200_response_items_inner_free(lead_forms_create_200_response_items_inner_t *lead_forms_create_200_response_items_inner);

lead_forms_create_200_response_items_inner_t *lead_forms_create_200_response_items_inner_parseFromJSON(cJSON *lead_forms_create_200_response_items_innerJSON);

cJSON *lead_forms_create_200_response_items_inner_convertToJSON(lead_forms_create_200_response_items_inner_t *lead_forms_create_200_response_items_inner);

#endif /* _lead_forms_create_200_response_items_inner_H_ */

