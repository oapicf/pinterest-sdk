/*
 * conversion_tag_create.h
 *
 * 
 */

#ifndef _conversion_tag_create_H_
#define _conversion_tag_create_H_

#include <string.h>
#include "../external/cJSON.h"
#include "../include/list.h"
#include "../include/keyValuePair.h"
#include "../include/binary.h"

typedef struct conversion_tag_create_t conversion_tag_create_t;




typedef struct conversion_tag_create_t {
    char *name; // string
    int aem_enabled; //boolean
    double md_frequency; //numeric
    int aem_fnln_enabled; //boolean
    int aem_ph_enabled; //boolean
    int aem_ge_enabled; //boolean
    int aem_db_enabled; //boolean
    int aem_loc_enabled; //boolean

} conversion_tag_create_t;

conversion_tag_create_t *conversion_tag_create_create(
    char *name,
    int aem_enabled,
    double md_frequency,
    int aem_fnln_enabled,
    int aem_ph_enabled,
    int aem_ge_enabled,
    int aem_db_enabled,
    int aem_loc_enabled
);

void conversion_tag_create_free(conversion_tag_create_t *conversion_tag_create);

conversion_tag_create_t *conversion_tag_create_parseFromJSON(cJSON *conversion_tag_createJSON);

cJSON *conversion_tag_create_convertToJSON(conversion_tag_create_t *conversion_tag_create);

#endif /* _conversion_tag_create_H_ */

