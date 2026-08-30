/*
 * terms_of_service.h
 *
 * The ID of the ad account.
 */

#ifndef _terms_of_service_H_
#define _terms_of_service_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct terms_of_service_t terms_of_service_t;




typedef struct terms_of_service_t {
    char *ad_account_id; // string
    int *has_accepted; //boolean
    char *html; // string
    char *id; // string

    int _library_owned; // Is the library responsible for freeing this object?
} terms_of_service_t;

__attribute__((deprecated)) terms_of_service_t *terms_of_service_create(
    char *ad_account_id,
    int *has_accepted,
    char *html,
    char *id
);

void terms_of_service_free(terms_of_service_t *terms_of_service);

terms_of_service_t *terms_of_service_parseFromJSON(cJSON *terms_of_serviceJSON);

cJSON *terms_of_service_convertToJSON(terms_of_service_t *terms_of_service);

#endif /* _terms_of_service_H_ */

