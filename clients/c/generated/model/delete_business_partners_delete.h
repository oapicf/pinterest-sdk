/*
 * delete_business_partners_delete.h
 *
 * 
 */

#ifndef _delete_business_partners_delete_H_
#define _delete_business_partners_delete_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_business_partners_delete_t delete_business_partners_delete_t;

#include "nullable_partner_type.h"



typedef struct delete_business_partners_delete_t {
    list_t *partner_ids; //primitive container
    nullable_partner_type_t *partner_type; // custom

    int _library_owned; // Is the library responsible for freeing this object?
} delete_business_partners_delete_t;

__attribute__((deprecated)) delete_business_partners_delete_t *delete_business_partners_delete_create(
    list_t *partner_ids,
    nullable_partner_type_t *partner_type
);

void delete_business_partners_delete_free(delete_business_partners_delete_t *delete_business_partners_delete);

delete_business_partners_delete_t *delete_business_partners_delete_parseFromJSON(cJSON *delete_business_partners_deleteJSON);

cJSON *delete_business_partners_delete_convertToJSON(delete_business_partners_delete_t *delete_business_partners_delete);

#endif /* _delete_business_partners_delete_H_ */

