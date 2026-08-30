/*
 * lead_form_test.h
 *
 * Lead form test action: submit sample answers and receive the resulting subscription id.
 */

#ifndef _lead_form_test_H_
#define _lead_form_test_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_form_test_t lead_form_test_t;




typedef struct lead_form_test_t {
    char *subscription_id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} lead_form_test_t;

__attribute__((deprecated)) lead_form_test_t *lead_form_test_create(
    char *subscription_id
);

void lead_form_test_free(lead_form_test_t *lead_form_test);

lead_form_test_t *lead_form_test_parseFromJSON(cJSON *lead_form_testJSON);

cJSON *lead_form_test_convertToJSON(lead_form_test_t *lead_form_test);

#endif /* _lead_form_test_H_ */

