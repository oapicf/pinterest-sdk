/*
 * ads_credit_redeem.h
 *
 * Ads credit redemption
 */

#ifndef _ads_credit_redeem_H_
#define _ads_credit_redeem_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ads_credit_redeem_t ads_credit_redeem_t;




typedef struct ads_credit_redeem_t {
    int *error_code; //numeric
    char *error_message; // string
    int *success; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} ads_credit_redeem_t;

__attribute__((deprecated)) ads_credit_redeem_t *ads_credit_redeem_create(
    int *error_code,
    char *error_message,
    int *success
);

void ads_credit_redeem_free(ads_credit_redeem_t *ads_credit_redeem);

ads_credit_redeem_t *ads_credit_redeem_parseFromJSON(cJSON *ads_credit_redeemJSON);

cJSON *ads_credit_redeem_convertToJSON(ads_credit_redeem_t *ads_credit_redeem);

#endif /* _ads_credit_redeem_H_ */

