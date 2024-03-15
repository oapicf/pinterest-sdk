/*
 * ssio_account_item.h
 *
 * 
 */

#ifndef _ssio_account_item_H_
#define _ssio_account_item_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ssio_account_item_t ssio_account_item_t;

#include "ssio_account_address.h"



typedef struct ssio_account_item_t {
    char *id; // string
    char *io_terms_id; // string
    char *io_terms; // string
    char *us_terms_id; // string
    char *us_terms; // string
    char *row_terms_id; // string
    char *row_terms; // string
    char *io_type; // string
    list_t *addresses; //nonprimitive container

} ssio_account_item_t;

ssio_account_item_t *ssio_account_item_create(
    char *id,
    char *io_terms_id,
    char *io_terms,
    char *us_terms_id,
    char *us_terms,
    char *row_terms_id,
    char *row_terms,
    char *io_type,
    list_t *addresses
);

void ssio_account_item_free(ssio_account_item_t *ssio_account_item);

ssio_account_item_t *ssio_account_item_parseFromJSON(cJSON *ssio_account_itemJSON);

cJSON *ssio_account_item_convertToJSON(ssio_account_item_t *ssio_account_item);

#endif /* _ssio_account_item_H_ */

