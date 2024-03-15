/*
 * lead_form_common.h
 *
 * Creation fields
 */

#ifndef _lead_form_common_H_
#define _lead_form_common_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_form_common_t lead_form_common_t;

#include "lead_form_question.h"
#include "lead_form_status.h"

// Enum  for lead_form_common

typedef enum  { pinterest_rest_api_lead_form_common__NULL = 0, pinterest_rest_api_lead_form_common__DRAFT, pinterest_rest_api_lead_form_common__ACTIVE } pinterest_rest_api_lead_form_common__e;

char* lead_form_common_status_ToString(pinterest_rest_api_lead_form_common__e status);

pinterest_rest_api_lead_form_common__e lead_form_common_status_FromString(char* status);



typedef struct lead_form_common_t {
    char *name; // string
    char *privacy_policy_link; // string
    int has_accepted_terms; //boolean
    char *completion_message; // string
    lead_form_status_t *status; // custom
    char *disclosure_language; // string
    list_t *questions; //nonprimitive container

} lead_form_common_t;

lead_form_common_t *lead_form_common_create(
    char *name,
    char *privacy_policy_link,
    int has_accepted_terms,
    char *completion_message,
    lead_form_status_t *status,
    char *disclosure_language,
    list_t *questions
);

void lead_form_common_free(lead_form_common_t *lead_form_common);

lead_form_common_t *lead_form_common_parseFromJSON(cJSON *lead_form_commonJSON);

cJSON *lead_form_common_convertToJSON(lead_form_common_t *lead_form_common);

#endif /* _lead_form_common_H_ */

