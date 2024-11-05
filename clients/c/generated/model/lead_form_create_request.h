/*
 * lead_form_create_request.h
 *
 * 
 */

#ifndef _lead_form_create_request_H_
#define _lead_form_create_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_form_create_request_t lead_form_create_request_t;

#include "lead_form_common_policy_links_inner.h"
#include "lead_form_question.h"
#include "lead_form_status.h"

// Enum  for lead_form_create_request

typedef enum  { pinterest_rest_api_lead_form_create_request__NULL = 0, pinterest_rest_api_lead_form_create_request__DRAFT, pinterest_rest_api_lead_form_create_request__ACTIVE } pinterest_rest_api_lead_form_create_request__e;

char* lead_form_create_request_status_ToString(pinterest_rest_api_lead_form_create_request__e status);

pinterest_rest_api_lead_form_create_request__e lead_form_create_request_status_FromString(char* status);



typedef struct lead_form_create_request_t {
    char *name; // string
    char *privacy_policy_link; // string
    int has_accepted_terms; //boolean
    char *completion_message; // string
    lead_form_status_t *status; // custom
    char *disclosure_language; // string
    list_t *questions; //nonprimitive container
    list_t *policy_links; //nonprimitive container

} lead_form_create_request_t;

lead_form_create_request_t *lead_form_create_request_create(
    char *name,
    char *privacy_policy_link,
    int has_accepted_terms,
    char *completion_message,
    lead_form_status_t *status,
    char *disclosure_language,
    list_t *questions,
    list_t *policy_links
);

void lead_form_create_request_free(lead_form_create_request_t *lead_form_create_request);

lead_form_create_request_t *lead_form_create_request_parseFromJSON(cJSON *lead_form_create_requestJSON);

cJSON *lead_form_create_request_convertToJSON(lead_form_create_request_t *lead_form_create_request);

#endif /* _lead_form_create_request_H_ */

