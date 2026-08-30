/*
 * lead_form_policy_link.h
 *
 * 
 */

#ifndef _lead_form_policy_link_H_
#define _lead_form_policy_link_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_form_policy_link_t lead_form_policy_link_t;




typedef struct lead_form_policy_link_t {
    char *label; // string
    char *link; // string

    int _library_owned; // Is the library responsible for freeing this object?
} lead_form_policy_link_t;

__attribute__((deprecated)) lead_form_policy_link_t *lead_form_policy_link_create(
    char *label,
    char *link
);

void lead_form_policy_link_free(lead_form_policy_link_t *lead_form_policy_link);

lead_form_policy_link_t *lead_form_policy_link_parseFromJSON(cJSON *lead_form_policy_linkJSON);

cJSON *lead_form_policy_link_convertToJSON(lead_form_policy_link_t *lead_form_policy_link);

#endif /* _lead_form_policy_link_H_ */

