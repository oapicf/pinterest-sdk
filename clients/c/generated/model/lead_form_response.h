/*
 * lead_form_response.h
 *
 * 
 */

#ifndef _lead_form_response_H_
#define _lead_form_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_form_response_t lead_form_response_t;

#include "lead_form_question.h"
#include "lead_form_status.h"

// Enum  for lead_form_response

typedef enum  { pinterest_rest_api_lead_form_response__NULL = 0, pinterest_rest_api_lead_form_response__DRAFT, pinterest_rest_api_lead_form_response__ACTIVE } pinterest_rest_api_lead_form_response__e;

char* lead_form_response_status_ToString(pinterest_rest_api_lead_form_response__e status);

pinterest_rest_api_lead_form_response__e lead_form_response_status_FromString(char* status);



typedef struct lead_form_response_t {
    char *name; // string
    char *privacy_policy_link; // string
    int has_accepted_terms; //boolean
    char *completion_message; // string
    lead_form_status_t *status; // custom
    char *disclosure_language; // string
    list_t *questions; //nonprimitive container
    char *id; // string
    char *ad_account_id; // string
    int created_time; //numeric
    int updated_time; //numeric

} lead_form_response_t;

lead_form_response_t *lead_form_response_create(
    char *name,
    char *privacy_policy_link,
    int has_accepted_terms,
    char *completion_message,
    lead_form_status_t *status,
    char *disclosure_language,
    list_t *questions,
    char *id,
    char *ad_account_id,
    int created_time,
    int updated_time
);

void lead_form_response_free(lead_form_response_t *lead_form_response);

lead_form_response_t *lead_form_response_parseFromJSON(cJSON *lead_form_responseJSON);

cJSON *lead_form_response_convertToJSON(lead_form_response_t *lead_form_response);

#endif /* _lead_form_response_H_ */

