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



typedef struct lead_form_create_request_t {
    char *completion_message; // string
    char *disclosure_language; // string
    int has_accepted_terms; //boolean
    char *name; // string
    list_t *policy_links; //nonprimitive container
    char *privacy_policy_link; // string
    list_t *questions; //nonprimitive container
    pinterest_rest_api_lead_form_status__e status; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} lead_form_create_request_t;

__attribute__((deprecated)) lead_form_create_request_t *lead_form_create_request_create(
    char *completion_message,
    char *disclosure_language,
    int has_accepted_terms,
    char *name,
    list_t *policy_links,
    char *privacy_policy_link,
    list_t *questions,
    pinterest_rest_api_lead_form_status__e status
);

void lead_form_create_request_free(lead_form_create_request_t *lead_form_create_request);

lead_form_create_request_t *lead_form_create_request_parseFromJSON(cJSON *lead_form_create_requestJSON);

cJSON *lead_form_create_request_convertToJSON(lead_form_create_request_t *lead_form_create_request);

#endif /* _lead_form_create_request_H_ */

