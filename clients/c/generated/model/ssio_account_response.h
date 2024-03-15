/*
 * ssio_account_response.h
 *
 * 
 */

#ifndef _ssio_account_response_H_
#define _ssio_account_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ssio_account_response_t ssio_account_response_t;

#include "ssio_account_item.h"
#include "ssio_account_pmp_name.h"



typedef struct ssio_account_response_t {
    int eligible; //boolean
    int can_edit; //boolean
    list_t *billto_infos; //nonprimitive container
    char *currency; // string
    list_t *pmp_names; //nonprimitive container
    char *error; // string

} ssio_account_response_t;

ssio_account_response_t *ssio_account_response_create(
    int eligible,
    int can_edit,
    list_t *billto_infos,
    char *currency,
    list_t *pmp_names,
    char *error
);

void ssio_account_response_free(ssio_account_response_t *ssio_account_response);

ssio_account_response_t *ssio_account_response_parseFromJSON(cJSON *ssio_account_responseJSON);

cJSON *ssio_account_response_convertToJSON(ssio_account_response_t *ssio_account_response);

#endif /* _ssio_account_response_H_ */

