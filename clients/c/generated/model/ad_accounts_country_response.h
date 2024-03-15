/*
 * ad_accounts_country_response.h
 *
 * 
 */

#ifndef _ad_accounts_country_response_H_
#define _ad_accounts_country_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ad_accounts_country_response_t ad_accounts_country_response_t;

#include "ad_accounts_country_response_data.h"



typedef struct ad_accounts_country_response_t {
    list_t *items; //nonprimitive container

} ad_accounts_country_response_t;

ad_accounts_country_response_t *ad_accounts_country_response_create(
    list_t *items
);

void ad_accounts_country_response_free(ad_accounts_country_response_t *ad_accounts_country_response);

ad_accounts_country_response_t *ad_accounts_country_response_parseFromJSON(cJSON *ad_accounts_country_responseJSON);

cJSON *ad_accounts_country_response_convertToJSON(ad_accounts_country_response_t *ad_accounts_country_response);

#endif /* _ad_accounts_country_response_H_ */

