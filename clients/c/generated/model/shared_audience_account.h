/*
 * shared_audience_account.h
 *
 * 
 */

#ifndef _shared_audience_account_H_
#define _shared_audience_account_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct shared_audience_account_t shared_audience_account_t;


// Enum ACCOUNTTYPE for shared_audience_account

typedef enum  { pinterest_rest_api_shared_audience_account_ACCOUNTTYPE_NULL = 0, pinterest_rest_api_shared_audience_account_ACCOUNTTYPE_AD_ACCOUNT, pinterest_rest_api_shared_audience_account_ACCOUNTTYPE_BUSINESS_ACCOUNT } pinterest_rest_api_shared_audience_account_ACCOUNTTYPE_e;

char* shared_audience_account_account_type_ToString(pinterest_rest_api_shared_audience_account_ACCOUNTTYPE_e account_type);

pinterest_rest_api_shared_audience_account_ACCOUNTTYPE_e shared_audience_account_account_type_FromString(char* account_type);



typedef struct shared_audience_account_t {
    char *account_id; // string
    char *account_name; // string
    pinterest_rest_api_shared_audience_account_ACCOUNTTYPE_e account_type; //enum
    int shared_on_timestamp; //numeric

} shared_audience_account_t;

shared_audience_account_t *shared_audience_account_create(
    char *account_id,
    char *account_name,
    pinterest_rest_api_shared_audience_account_ACCOUNTTYPE_e account_type,
    int shared_on_timestamp
);

void shared_audience_account_free(shared_audience_account_t *shared_audience_account);

shared_audience_account_t *shared_audience_account_parseFromJSON(cJSON *shared_audience_accountJSON);

cJSON *shared_audience_account_convertToJSON(shared_audience_account_t *shared_audience_account);

#endif /* _shared_audience_account_H_ */

