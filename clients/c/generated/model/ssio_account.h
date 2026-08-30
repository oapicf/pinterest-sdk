/*
 * ssio_account.h
 *
 * Salesforce account details including bill-to information.
 */

#ifndef _ssio_account_H_
#define _ssio_account_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ssio_account_t ssio_account_t;

#include "ssio_account_item.h"
#include "ssio_account_pmp_name.h"



typedef struct ssio_account_t {
    list_t *billto_infos; //nonprimitive container
    int *can_edit; //boolean
    char *currency; // string
    int *eligible; //boolean
    char *error; // string
    list_t *pmp_names; //nonprimitive container

    int _library_owned; // Is the library responsible for freeing this object?
} ssio_account_t;

__attribute__((deprecated)) ssio_account_t *ssio_account_create(
    list_t *billto_infos,
    int *can_edit,
    char *currency,
    int *eligible,
    char *error,
    list_t *pmp_names
);

void ssio_account_free(ssio_account_t *ssio_account);

ssio_account_t *ssio_account_parseFromJSON(cJSON *ssio_accountJSON);

cJSON *ssio_account_convertToJSON(ssio_account_t *ssio_account);

#endif /* _ssio_account_H_ */

