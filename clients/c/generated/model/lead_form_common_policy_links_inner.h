/*
 * lead_form_common_policy_links_inner.h
 *
 * 
 */

#ifndef _lead_form_common_policy_links_inner_H_
#define _lead_form_common_policy_links_inner_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_form_common_policy_links_inner_t lead_form_common_policy_links_inner_t;




typedef struct lead_form_common_policy_links_inner_t {
    char *label; // string
    char *link; // string

} lead_form_common_policy_links_inner_t;

lead_form_common_policy_links_inner_t *lead_form_common_policy_links_inner_create(
    char *label,
    char *link
);

void lead_form_common_policy_links_inner_free(lead_form_common_policy_links_inner_t *lead_form_common_policy_links_inner);

lead_form_common_policy_links_inner_t *lead_form_common_policy_links_inner_parseFromJSON(cJSON *lead_form_common_policy_links_innerJSON);

cJSON *lead_form_common_policy_links_inner_convertToJSON(lead_form_common_policy_links_inner_t *lead_form_common_policy_links_inner);

#endif /* _lead_form_common_policy_links_inner_H_ */

