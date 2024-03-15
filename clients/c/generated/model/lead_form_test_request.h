/*
 * lead_form_test_request.h
 *
 * Request to create test data for lead data test API.
 */

#ifndef _lead_form_test_request_H_
#define _lead_form_test_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_form_test_request_t lead_form_test_request_t;




typedef struct lead_form_test_request_t {
    list_t *answers; //primitive container

} lead_form_test_request_t;

lead_form_test_request_t *lead_form_test_request_create(
    list_t *answers
);

void lead_form_test_request_free(lead_form_test_request_t *lead_form_test_request);

lead_form_test_request_t *lead_form_test_request_parseFromJSON(cJSON *lead_form_test_requestJSON);

cJSON *lead_form_test_request_convertToJSON(lead_form_test_request_t *lead_form_test_request);

#endif /* _lead_form_test_request_H_ */

