/*
 * ad_accounts_country_response_data.h
 *
 * 
 */

#ifndef _ad_accounts_country_response_data_H_
#define _ad_accounts_country_response_data_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_accounts_country_response_data_t ad_accounts_country_response_data_t;

#include "ad_country.h"



typedef struct ad_accounts_country_response_data_t {
    pinterest_rest_api_ad_country__e code; //referenced enum
    char *currency; // string
    double index; //numeric
    char *name; // string

    int _library_owned; // Is the library responsible for freeing this object?
} ad_accounts_country_response_data_t;

__attribute__((deprecated)) ad_accounts_country_response_data_t *ad_accounts_country_response_data_create(
    pinterest_rest_api_ad_country__e code,
    char *currency,
    double index,
    char *name
);

void ad_accounts_country_response_data_free(ad_accounts_country_response_data_t *ad_accounts_country_response_data);

ad_accounts_country_response_data_t *ad_accounts_country_response_data_parseFromJSON(cJSON *ad_accounts_country_response_dataJSON);

cJSON *ad_accounts_country_response_data_convertToJSON(ad_accounts_country_response_data_t *ad_accounts_country_response_data);

#endif /* _ad_accounts_country_response_data_H_ */

