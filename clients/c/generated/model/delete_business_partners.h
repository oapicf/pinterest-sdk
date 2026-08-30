/*
 * delete_business_partners.h
 *
 * 
 */

#ifndef _delete_business_partners_H_
#define _delete_business_partners_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_business_partners_t delete_business_partners_t;




typedef struct delete_business_partners_t {
    list_t *deleted_partners; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} delete_business_partners_t;

__attribute__((deprecated)) delete_business_partners_t *delete_business_partners_create(
    list_t *deleted_partners
);

void delete_business_partners_free(delete_business_partners_t *delete_business_partners);

delete_business_partners_t *delete_business_partners_parseFromJSON(cJSON *delete_business_partnersJSON);

cJSON *delete_business_partners_convertToJSON(delete_business_partners_t *delete_business_partners);

#endif /* _delete_business_partners_H_ */

