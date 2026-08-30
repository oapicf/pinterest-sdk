/*
 * ads_credit_redeem_create.h
 *
 * Resource create operation model.
 */

#ifndef _ads_credit_redeem_create_H_
#define _ads_credit_redeem_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ads_credit_redeem_create_t ads_credit_redeem_create_t;




typedef struct ads_credit_redeem_create_t {
    char *offer_code_hash; // string
    int *validate_only; //boolean

    int _library_owned; // Is the library responsible for freeing this object?
} ads_credit_redeem_create_t;

__attribute__((deprecated)) ads_credit_redeem_create_t *ads_credit_redeem_create_create(
    char *offer_code_hash,
    int *validate_only
);

void ads_credit_redeem_create_free(ads_credit_redeem_create_t *ads_credit_redeem_create);

ads_credit_redeem_create_t *ads_credit_redeem_create_parseFromJSON(cJSON *ads_credit_redeem_createJSON);

cJSON *ads_credit_redeem_create_convertToJSON(ads_credit_redeem_create_t *ads_credit_redeem_create);

#endif /* _ads_credit_redeem_create_H_ */

