/*
 * terms_of_service.h
 *
 * 
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
    char *id; // string
    char *html; // string
    int has_accepted; //boolean
    char *ad_account_id; // string

} terms_of_service_t;

terms_of_service_t *terms_of_service_create(
    char *id,
    char *html,
    int has_accepted,
    char *ad_account_id
);

void terms_of_service_free(terms_of_service_t *terms_of_service);

terms_of_service_t *terms_of_service_parseFromJSON(cJSON *terms_of_serviceJSON);

cJSON *terms_of_service_convertToJSON(terms_of_service_t *terms_of_service);

#endif /* _terms_of_service_H_ */

