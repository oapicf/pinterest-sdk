/*
 * lead_form_test_response.h
 *
 * Response for lead data test API.
 */

#ifndef _lead_form_test_response_H_
#define _lead_form_test_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_form_test_response_t lead_form_test_response_t;




typedef struct lead_form_test_response_t {
    char *subscription_id; // string

} lead_form_test_response_t;

lead_form_test_response_t *lead_form_test_response_create(
    char *subscription_id
);

void lead_form_test_response_free(lead_form_test_response_t *lead_form_test_response);

lead_form_test_response_t *lead_form_test_response_parseFromJSON(cJSON *lead_form_test_responseJSON);

cJSON *lead_form_test_response_convertToJSON(lead_form_test_response_t *lead_form_test_response);

#endif /* _lead_form_test_response_H_ */

