/*
 * ads_credit_redeem_response.h
 *
 * 
 */

#ifndef _ads_credit_redeem_response_H_
#define _ads_credit_redeem_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ads_credit_redeem_response_t ads_credit_redeem_response_t;




typedef struct ads_credit_redeem_response_t {
    int success; //boolean
    int error_code; //numeric
    char *error_message; // string

} ads_credit_redeem_response_t;

ads_credit_redeem_response_t *ads_credit_redeem_response_create(
    int success,
    int error_code,
    char *error_message
);

void ads_credit_redeem_response_free(ads_credit_redeem_response_t *ads_credit_redeem_response);

ads_credit_redeem_response_t *ads_credit_redeem_response_parseFromJSON(cJSON *ads_credit_redeem_responseJSON);

cJSON *ads_credit_redeem_response_convertToJSON(ads_credit_redeem_response_t *ads_credit_redeem_response);

#endif /* _ads_credit_redeem_response_H_ */

