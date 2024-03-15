/*
 * ssio_account_address.h
 *
 * 
 */

#ifndef _ssio_account_address_H_
#define _ssio_account_address_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ssio_account_address_t ssio_account_address_t;




typedef struct ssio_account_address_t {
    char *display; // string
    char *purpose; // string
    char *address_id; // string
    char *order_legal_entity; // string

} ssio_account_address_t;

ssio_account_address_t *ssio_account_address_create(
    char *display,
    char *purpose,
    char *address_id,
    char *order_legal_entity
);

void ssio_account_address_free(ssio_account_address_t *ssio_account_address);

ssio_account_address_t *ssio_account_address_parseFromJSON(cJSON *ssio_account_addressJSON);

cJSON *ssio_account_address_convertToJSON(ssio_account_address_t *ssio_account_address);

#endif /* _ssio_account_address_H_ */

