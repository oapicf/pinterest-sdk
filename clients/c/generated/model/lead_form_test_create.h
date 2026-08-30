/*
 * lead_form_test_create.h
 *
 * Resource create operation model.
 */

#ifndef _lead_form_test_create_H_
#define _lead_form_test_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_form_test_create_t lead_form_test_create_t;




typedef struct lead_form_test_create_t {
    list_t *answers; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} lead_form_test_create_t;

__attribute__((deprecated)) lead_form_test_create_t *lead_form_test_create_create(
    list_t *answers
);

void lead_form_test_create_free(lead_form_test_create_t *lead_form_test_create);

lead_form_test_create_t *lead_form_test_create_parseFromJSON(cJSON *lead_form_test_createJSON);

cJSON *lead_form_test_create_convertToJSON(lead_form_test_create_t *lead_form_test_create);

#endif /* _lead_form_test_create_H_ */

