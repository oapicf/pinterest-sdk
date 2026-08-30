/*
 * delete_business_membership_200_response.h
 *
 * 
 */

#ifndef _delete_business_membership_200_response_H_
#define _delete_business_membership_200_response_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct delete_business_membership_200_response_t delete_business_membership_200_response_t;




typedef struct delete_business_membership_200_response_t {
    list_t *deleted_members; //primitive container

    int _library_owned; // Is the library responsible for freeing this object?
} delete_business_membership_200_response_t;

__attribute__((deprecated)) delete_business_membership_200_response_t *delete_business_membership_200_response_create(
    list_t *deleted_members
);

void delete_business_membership_200_response_free(delete_business_membership_200_response_t *delete_business_membership_200_response);

delete_business_membership_200_response_t *delete_business_membership_200_response_parseFromJSON(cJSON *delete_business_membership_200_responseJSON);

cJSON *delete_business_membership_200_response_convertToJSON(delete_business_membership_200_response_t *delete_business_membership_200_response);

#endif /* _delete_business_membership_200_response_H_ */

