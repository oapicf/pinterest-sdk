/*
 * lead_subscription_create.h
 *
 * 
 */

#ifndef _lead_subscription_create_H_
#define _lead_subscription_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct lead_subscription_create_t lead_subscription_create_t;




typedef struct lead_subscription_create_t {
    char *lead_form_id; // string
    char *webhook_url; // string

    int _library_owned; // Is the library responsible for freeing this object?
} lead_subscription_create_t;

__attribute__((deprecated)) lead_subscription_create_t *lead_subscription_create_create(
    char *lead_form_id,
    char *webhook_url
);

void lead_subscription_create_free(lead_subscription_create_t *lead_subscription_create);

lead_subscription_create_t *lead_subscription_create_parseFromJSON(cJSON *lead_subscription_createJSON);

cJSON *lead_subscription_create_convertToJSON(lead_subscription_create_t *lead_subscription_create);

#endif /* _lead_subscription_create_H_ */

