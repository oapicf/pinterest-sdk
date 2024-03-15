/*
 * linked_business.h
 *
 * 
 */

#ifndef _linked_business_H_
#define _linked_business_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct linked_business_t linked_business_t;




typedef struct linked_business_t {
    char *username; // string
    char *image_small_url; // string
    char *image_medium_url; // string
    char *image_large_url; // string
    char *image_xlarge_url; // string

} linked_business_t;

linked_business_t *linked_business_create(
    char *username,
    char *image_small_url,
    char *image_medium_url,
    char *image_large_url,
    char *image_xlarge_url
);

void linked_business_free(linked_business_t *linked_business);

linked_business_t *linked_business_parseFromJSON(cJSON *linked_businessJSON);

cJSON *linked_business_convertToJSON(linked_business_t *linked_business);

#endif /* _linked_business_H_ */

