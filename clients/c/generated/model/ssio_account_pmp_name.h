/*
 * ssio_account_pmp_name.h
 *
 * 
 */

#ifndef _ssio_account_pmp_name_H_
#define _ssio_account_pmp_name_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct ssio_account_pmp_name_t ssio_account_pmp_name_t;




typedef struct ssio_account_pmp_name_t {
    char *name; // string
    char *id; // string

} ssio_account_pmp_name_t;

ssio_account_pmp_name_t *ssio_account_pmp_name_create(
    char *name,
    char *id
);

void ssio_account_pmp_name_free(ssio_account_pmp_name_t *ssio_account_pmp_name);

ssio_account_pmp_name_t *ssio_account_pmp_name_parseFromJSON(cJSON *ssio_account_pmp_nameJSON);

cJSON *ssio_account_pmp_name_convertToJSON(ssio_account_pmp_name_t *ssio_account_pmp_name);

#endif /* _ssio_account_pmp_name_H_ */

