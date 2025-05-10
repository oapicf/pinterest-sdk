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

#include "lead_form_common_policy_links_inner.h"
#include "lead_form_question.h"
#include "lead_form_status.h"



typedef struct lead_form_response_t {
    char *name; // string
    char *privacy_policy_link; // string
    int has_accepted_terms; //boolean
    char *completion_message; // string
    pinterest_rest_api_lead_form_status__e status; //referenced enum
    char *disclosure_language; // string
    list_t *questions; //nonprimitive container
    list_t *policy_links; //nonprimitive container
    char *id; // string
    char *ad_account_id; // string
    int created_time; //numeric
    int updated_time; //numeric

    int _library_owned; // Is the library responsible for freeing this object?
} lead_form_response_t;

__attribute__((deprecated)) lead_form_response_t *lead_form_response_create(
    char *name,
    char *privacy_policy_link,
    int has_accepted_terms,
    char *completion_message,
    pinterest_rest_api_lead_form_status__e status,
    char *disclosure_language,
    list_t *questions,
    list_t *policy_links,
    char *id,
    char *ad_account_id,
    int created_time,
    int updated_time
);

void lead_form_response_free(lead_form_response_t *lead_form_response);

lead_form_response_t *lead_form_response_parseFromJSON(cJSON *lead_form_responseJSON);

cJSON *lead_form_response_convertToJSON(lead_form_response_t *lead_form_response);

#endif /* _lead_form_response_H_ */

