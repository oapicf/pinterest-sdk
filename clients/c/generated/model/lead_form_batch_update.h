/*
 * lead_form_batch_update.h
 *
 * 
 */

#ifndef _lead_form_batch_update_H_
#define _lead_form_batch_update_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_form_batch_update_t lead_form_batch_update_t;

#include "lead_form_policy_link.h"
#include "lead_form_question.h"
#include "lead_form_status.h"



typedef struct lead_form_batch_update_t {
    char *completion_message; // string
    char *disclosure_language; // string
    int *has_accepted_terms; //boolean
    char *id; // string
    char *name; // string
    list_t *policy_links; //nonprimitive container
    char *privacy_policy_link; // string
    list_t *questions; //nonprimitive container
    pinterest_rest_api_lead_form_status__e status; //referenced enum

    int _library_owned; // Is the library responsible for freeing this object?
} lead_form_batch_update_t;

__attribute__((deprecated)) lead_form_batch_update_t *lead_form_batch_update_create(
    char *completion_message,
    char *disclosure_language,
    int *has_accepted_terms,
    char *id,
    char *name,
    list_t *policy_links,
    char *privacy_policy_link,
    list_t *questions,
    pinterest_rest_api_lead_form_status__e status
);

void lead_form_batch_update_free(lead_form_batch_update_t *lead_form_batch_update);

lead_form_batch_update_t *lead_form_batch_update_parseFromJSON(cJSON *lead_form_batch_updateJSON);

cJSON *lead_form_batch_update_convertToJSON(lead_form_batch_update_t *lead_form_batch_update);

#endif /* _lead_form_batch_update_H_ */

