/*
 * ad_accounts_country.h
 *
 * 
 */

#ifndef _ad_accounts_country_H_
#define _ad_accounts_country_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_accounts_country_t ad_accounts_country_t;

#include "country.h"



typedef struct ad_accounts_country_t {
    country_t *code; // custom
    char *currency; // string
    double *index; //numeric
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ad_accounts_country_t;

__attribute__((deprecated)) ad_accounts_country_t *ad_accounts_country_create(
    country_t *code,
    char *currency,
    double *index,
    char *name
);

void ad_accounts_country_free(ad_accounts_country_t *ad_accounts_country);

ad_accounts_country_t *ad_accounts_country_parseFromJSON(cJSON *ad_accounts_countryJSON);

cJSON *ad_accounts_country_convertToJSON(ad_accounts_country_t *ad_accounts_country);

#endif /* _ad_accounts_country_H_ */

