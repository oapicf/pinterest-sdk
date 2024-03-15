/*
 * ads_credit_redeem_request.h
 *
 * 
 */

#ifndef _ads_credit_redeem_request_H_
#define _ads_credit_redeem_request_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ads_credit_redeem_request_t ads_credit_redeem_request_t;




typedef struct ads_credit_redeem_request_t {
    char *offer_code_hash; // string
    int validate_only; //boolean

} ads_credit_redeem_request_t;

ads_credit_redeem_request_t *ads_credit_redeem_request_create(
    char *offer_code_hash,
    int validate_only
);

void ads_credit_redeem_request_free(ads_credit_redeem_request_t *ads_credit_redeem_request);

ads_credit_redeem_request_t *ads_credit_redeem_request_parseFromJSON(cJSON *ads_credit_redeem_requestJSON);

cJSON *ads_credit_redeem_request_convertToJSON(ads_credit_redeem_request_t *ads_credit_redeem_request);

#endif /* _ads_credit_redeem_request_H_ */

